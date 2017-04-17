package cains.note.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import cains.note.service.skill.Skill;
import cains.note.utility.DebugLog;

public class CtrlSkillBar extends RelativeLayout
{
	public CtrlSkillBar(Context context)
	{
		super(context);
		initCtrl(context);
	}

	public CtrlSkillBar(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		initCtrl(context);
	}

	public CtrlSkillBar(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		initCtrl(context);
	}

	private void initCtrl(Context context)
	{
		//assign resource
		LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.ctrlskillbar, this);
	}

	public void bind(Skill skill)
	{
		try
		{
			TextView txt = (TextView)findViewById(R.id.txtSingleSkillName);
			txt.setText(skill.name);
			txt = (TextView)findViewById(R.id.txtSingleSkillLevel);
			txt.setText("需要等级: " + String.valueOf(skill.level));
			txt = (TextView)findViewById(R.id.txtSingleSkillComment2);
			txt.setText(skill.comment2);
			txt = (TextView)findViewById(R.id.txtSingleSkillEffect);
			txt.setText(skill.effect);
			ImageView img = (ImageView)findViewById(R.id.imgSingleSkill);
			img.setBackgroundResource(skill.imgId);
		}
		catch (Exception ex)
		{
			DebugLog.e(ex);
		}
	}
}
