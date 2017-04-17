package cains.note.view;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cains.note.service.skill.Skill;
import cains.note.utility.DebugLog;
import cains.note.global.Constant;
import cains.note.pattern.*;

public class CtrlSkillButton extends RelativeLayout implements OnClickListener, OnTouchListener, IObservable
{
	private Skill bindSkill;
	private ImageButton btnSkill;
	private TextView txtSkillPoint;
	private TextView txtSkillName;
	private int upMode = Constant.SKILL_UP_MODE_UP;
	private int upValue = 1;

	private List<IObserver> observers = new ArrayList<IObserver>();

	public CtrlSkillButton(Context context)
	{
		super(context);
		initCtrl(context);
	}

	public CtrlSkillButton(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initCtrl(context);
	}

	public CtrlSkillButton(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		initCtrl(context);
	}

	public void setUpMode(int mode)
	{
		upMode = mode;
	}

	public void setUpValue(int value)
	{
		upValue = value;
	}

	public void bind(Skill skill)
	{
		txtSkillPoint.setText("");
		txtSkillName.setText("");

		this.bindSkill = skill;
		if (bindSkill == null)
		{
			//set the fake image
			setBackgroundResource(R.id.btnSkill, R.drawable.skillfake);
			return;
		}

		setBackgroundResource(R.id.btnSkill, skill.imgId);

		setPointText(String.valueOf(bindSkill.point));
		txtSkillName.setText(String.valueOf(bindSkill.name));
	}

	public void setPointText(String value)
	{
		txtSkillPoint.setText(" " + value);
	}

	private void setTransparentButtonBackground(int buttonId)
	{
		ImageButton imgbt=(ImageButton)findViewById(buttonId);
		imgbt.getBackground().setAlpha(0);
	}

	private void setBackgroundResource(int buttonId, int imgId)
	{
		ImageButton imgbt=(ImageButton)findViewById(buttonId);
		imgbt.setBackgroundResource(imgId);
	}

	@Override
	public void setEnabled(boolean value)
	{
		this.btnSkill.setEnabled(value);
		super.setEnabled(value);
	}

	@Override
	public void onClick(View v)
	{
		try
		{
			if (bindSkill == null)
			{
				return;
			}
			else
			{
				if (v.getId() == R.id.btnSkill)
				{
					if (upMode == Constant.SKILL_UP_MODE_UP)
					{
						bindSkill.increasePoint(upValue);
					}
					else if (upMode == Constant.SKILL_UP_MODE_DOWN)
					{
						bindSkill.decreasePoint(upValue);
					}
					else if (upMode == Constant.SKILL_UP_MODE_VIEW)
					{
						;//do nothing
					}
					setPointText(String.valueOf(bindSkill.point));
				}

				doNotify();
			}
		}
		catch (Exception ex)
		{
			DebugLog.e(ex);
		}
	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		ImageButton btn = null;
		int id1 = 0, id2 = 0;

		if (bindSkill == null)
		{
			return false;
		}

		if (v.getId() == R.id.btnSkill)
		{
			btn = btnSkill;
			id1 = bindSkill.imgId;
			id2 = bindSkill.imgIdShadow;
		}

		if(event.getAction() == MotionEvent.ACTION_UP)
		{
			//松开
			btn.setBackgroundResource(id1);
		}
		else if(event.getAction() == MotionEvent.ACTION_DOWN)
		{
			//按下
			btn.setBackgroundResource(id2);
		}
		return false;
	}

	private void bindClickEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		if (v instanceof Button)
		{
			Button btn = (Button)v;
			btn.setOnClickListener((OnClickListener)this);
		}
		else if (v instanceof ImageButton)
		{
			ImageButton imgBtn = (ImageButton)v;
			imgBtn.setOnClickListener((OnClickListener)this);
		}
	}

	private void bindClickEvent(int[] viewIdList)
	{
		for (int viewId : viewIdList)
		{
			bindClickEvent(viewId);
		}
	}

	private void bindOnTouchEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		if (v instanceof ImageButton)
		{
			ImageButton imgBtn = (ImageButton)v;
			imgBtn.setOnTouchListener((OnTouchListener)this);
		}
	}

	private void bindOnTouchEvent(int[] viewIdList)
	{
		for (int viewId : viewIdList)
		{
			bindOnTouchEvent(viewId);
		}
	}

	private void initCtrl(Context context)
	{
		//assign resource
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.ctrlskillbutton, this);
		btnSkill = (ImageButton)findViewById(R.id.btnSkill);
		txtSkillPoint = (TextView)findViewById(R.id.txtSkillPoint);
		txtSkillName = (TextView)findViewById(R.id.txtSkillName);
		setTransparentButtonBackground(R.id.btnSkill);

		//bind events
		bindClickEvent(new int[]{R.id.btnSkill});
		bindOnTouchEvent(new int[]{R.id.btnSkill});

	}


	@Override
	public void addObserver(IObserver obj)
	{
		observers.remove(obj);
		observers.add(obj);
	}

	@Override
	public void doNotify()
	{
		for (IObserver obj : observers)
		{
			obj.update(bindSkill);
		}
	}

	@Override
	public void removeObserver(IObserver obj)
	{
		observers.remove(obj);
	}

}
