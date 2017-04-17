package cains.note.view;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;

public abstract class SimpleActivityBase extends ActivityBase  implements OnTouchListener, OnClickListener
{
	protected int frmId = VIEW_ID_NULL;
	protected int quitBtnId = VIEW_ID_NULL;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		assignViewIds();

		setContentView(frmId);

		initView();

		bindEvents();
	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		try
		{
			int id1;
			int id2;

			int id = v.getId();

			if (id == quitBtnId)
			{
				id1 = R.drawable.buttonquit;
				id2 = R.drawable.buttonquit2;
			}
			else
			{
				return false;
			}

			ImageButton btn = (ImageButton)findViewById(v.getId());
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
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public void onClick(View v)
	{
		try
		{
			if (v.getId() == quitBtnId)
			{
				navigate(FrmMain.class);
			}
			else
			{
				onCtrlClick(v);
			}
		}
		catch (Exception ex)
		{
			return;
		}
	}

	protected void onCtrlClick(View v)
	{
	}

	protected void bindEvents()
	{
		if (quitBtnId != VIEW_ID_NULL)
		{
			bindOnTouchEvent(quitBtnId);
			bindClickEvent(quitBtnId);
		}
	}

	protected abstract void showContent();
	protected abstract void assignViewIds();
	protected abstract void initViewSpecial();

	@Override
	protected final void initView()
	{
		initViewSpecial();

		if (quitBtnId != VIEW_ID_NULL)
		{
			setTransparentButtonBackground(quitBtnId);
			setBackgroundResource(quitBtnId, R.drawable.buttonquit);
		}

		showContent();
	}
}
