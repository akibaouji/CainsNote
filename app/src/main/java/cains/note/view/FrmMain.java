package cains.note.view;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.ImageView;

import cains.note.view.R;
import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.global.MyApplication;
import cains.note.service.base.ServiceFactory;

public class FrmMain extends ActivityBase implements OnTouchListener, OnClickListener
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		MyApplication mApp = (MyApplication)getApplication();
		mApp.setExit(false); //reset the exit flag

		setContentView(R.layout.frmmain);

		initView();

		bindEvents();

		//generate all data
		ServiceFactory.getInstance();

	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		int id1;
		int id2;

		switch (v.getId())
		{
			case R.id.btnItem:
				id1 = R.drawable.buttonitem;
				id2 = R.drawable.buttonitem2;
				break;
			case R.id.btnRes:
				id1 = R.drawable.buttonres;
				id2 = R.drawable.buttonres2;
				break;
			case R.id.btnChar:
				id1 = R.drawable.buttoncharacter;
				id2 = R.drawable.buttoncharacter2;
				break;
			case R.id.btnAbout:
				id1 = R.drawable.buttonabout;
				id2 = R.drawable.buttonabout2;
				break;
			default:
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

	@Override
	public void onClick(View v)
	{
		if (v.getId() == R.id.btnItem)
		{
			Global.mode = Constant.UNKNOWN_MODE;
			navigate(FrmItemModeList.class);
			return;
		}
		else if (v.getId() == R.id.btnRes)
		{
			Global.mode = Constant.UNKNOWN_MODE;
			navigate(FrmResModeList.class);
			return;
		}
		else if (v.getId() == R.id.btnChar)
		{
			Global.mode = Constant.CHAR_MODE;
			Global.category = "character";
			navigate(FrmCharacterList.class);
			return;
		}
		else if (v.getId() == R.id.btnAbout)
		{
			Global.mode = Constant.ABOUT_MODE;
			navigate(FrmAboutView.class);
			return;
		}
		else if (v.getId() == R.id.btnExit)
		{
			exit();
			return;
		}

		navigate(FrmCategoryList.class);
	}

	protected void bindEvents()
	{
		bindOnTouchEvent(new int[]{R.id.btnItem,
				R.id.btnRes,
				R.id.btnChar,
				R.id.btnAbout,
				R.id.btnExit});

		bindClickEvent(new int[]{R.id.btnItem,
				R.id.btnRes,
				R.id.btnChar,
				R.id.btnAbout,
				R.id.btnExit});

	}

	@Override
	protected void initView()
	{
		ImageView opener = (ImageView) findViewById(R.id.ImageLogo);
		opener.setImageBitmap(getImageFromAssetsFile("main.png"));

		setTransparentButtonBackground(R.id.btnItem);
		setBackgroundResource(R.id.btnItem, R.drawable.buttonitem);

		setTransparentButtonBackground(R.id.btnRes);
		setBackgroundResource(R.id.btnRes, R.drawable.buttonres);

		setTransparentButtonBackground(R.id.btnChar);
		setBackgroundResource(R.id.btnChar, R.drawable.buttoncharacter);

		setTransparentButtonBackground(R.id.btnAbout);
		setBackgroundResource(R.id.btnAbout, R.drawable.buttonabout);

		setTransparentButtonBackground(R.id.btnExit);
		setBackgroundResource(R.id.btnExit, R.drawable.buttonexit);
	}
}