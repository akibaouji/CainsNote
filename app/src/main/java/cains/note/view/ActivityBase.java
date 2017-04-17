package cains.note.view;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences; 
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.*;
//import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.DatePicker.OnDateChangedListener;

import cains.note.global.MyApplication;

public abstract class ActivityBase extends Activity
{   
	public static final int VIEW_ID_NULL = 0;
	
	@Override
	protected void onStart()
	{
		super.onStart(); 
		
		//Log.d("on start", "on start: " + this.getClass().getName());
		
		MyApplication mApp = (MyApplication)getApplication(); 
		if (mApp.isExit()) 
		{  
			finish(); 
		} 
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
		
		//Log.d("on resume", "on resume: " + this.getClass().getName());
		
		MyApplication mApp = (MyApplication)getApplication(); 
		if (mApp.isExit()) 
		{  
			finish(); 
		} 
	}
	
	protected void exit()
	{
		//android.os.Process.killProcess(android.os.Process.myPid());
		MyApplication mApp = (MyApplication)getApplication(); 
		mApp.setExit(true); //set the exit flag
		finish(); 
	}
	
	protected void initView()
	{
	}
	
	protected void bindClickEvent(int viewId)
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
	
	protected void bindClickEvent(int[] viewIdList)
	{
		for (int viewId : viewIdList)
		{
			if (viewId != VIEW_ID_NULL)
			{
				bindClickEvent(viewId);
			}
		}
	}
	
	protected void bindOnTouchEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		if (v instanceof ImageButton)
		{
			ImageButton imgBtn = (ImageButton)v;
			imgBtn.setOnTouchListener((OnTouchListener)this);
		}
	}
	
	protected void bindOnTouchEvent(int[] viewIdList)
	{
		for (int viewId : viewIdList)
		{
			if (viewId != VIEW_ID_NULL)
			{
				bindOnTouchEvent(viewId);
			}
		}
	}
	
	protected void bindItemSelectedEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		if (v instanceof Spinner)
		{
			Spinner spn = (Spinner)v;
			spn.setOnItemSelectedListener((OnItemSelectedListener)this);
		}
		else if (v instanceof ListView)
		{
			ListView lvw = (ListView)v;
			lvw.setOnItemSelectedListener((OnItemSelectedListener)this);
		}
	}
	
	protected void bindItemClickEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		ListView lvw = (ListView)v;
		lvw.setOnItemClickListener((OnItemClickListener)this);
	}
	
	protected void bindOnOnCheckedChangeEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		CheckBox chk = (CheckBox)v;
		chk.setOnCheckedChangeListener((OnCheckedChangeListener)this);
	}
	
	protected void bindDateChangedEvent(int viewId)
	{
		View v = this.findViewById(viewId);
		DatePicker dpk = (DatePicker)v;
		dpk.init(Calendar.getInstance().get(Calendar.YEAR), 
				 Calendar.getInstance().get(Calendar.MONTH), 
				 Calendar.getInstance().get(Calendar.DAY_OF_MONTH), 
				 (OnDateChangedListener)this);
	}
	
	protected String getInputText(int textBoxId)
	{
		EditText edit = (EditText)this.findViewById(textBoxId);
		return edit.getText().toString();
	}
	
	protected void listDataBind(int lstViewId, String[] src)
	{
		ListView lstDebut = (ListView)this.findViewById(lstViewId);
		ArrayAdapter<String> data = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,src);
		lstDebut.setAdapter(data);
		lstDebut.setSelection(0);
	}
	
	protected void spinnerDataBind(int lstViewId, String[] src)
	{
		Spinner lstType = (Spinner)this.findViewById(lstViewId);
		ArrayAdapter<String> data = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,src);
		lstType.setAdapter(data);
		lstType.setSelection(0);
		//lstType.setBackgroundColor(Color.TRANSPARENT);
	}
	
	protected void navigate(Class<?> cls)
	{
		Intent intent = new Intent(this, cls);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		this.startActivity(intent);
	}
	
	protected String getStrData(String name)
	{
		SharedPreferences ref = this.getSharedPreferences("Text", 0);
		return ref.getString(name, null);
	}
	
	protected void setStrData(String name, String value)
	{
		SharedPreferences ref = this.getSharedPreferences("Text", 0);
		SharedPreferences.Editor editor = ref.edit();
		editor.putString(name, value);
		editor.commit();
	}
	
	protected int getIntData(String name)
	{
		SharedPreferences ref = this.getSharedPreferences("Integer", 0);
		return ref.getInt(name, -1);
	}
	
	protected void setIntData(String name, int value)
	{
		SharedPreferences ref = this.getSharedPreferences("Integer", 0);
		SharedPreferences.Editor editor = ref.edit();
		editor.putInt(name, value);
		editor.commit();
	}
	
	protected float getFloatData(String name)
	{
		SharedPreferences ref = this.getSharedPreferences("Float", 0);
		return ref.getFloat(name, 0);
	}
	
	protected void setFloatData(String name, float value)
	{
		SharedPreferences ref = this.getSharedPreferences("Float", 0);
		SharedPreferences.Editor editor = ref.edit();
		editor.putFloat(name, value);
		editor.commit();
	}
	
	protected String getInputDate(int DatePickerId)
	{
		DatePicker pck = (DatePicker)this.findViewById(DatePickerId);
        Calendar calendar = Calendar.getInstance();
        calendar.set(pck.getYear(), pck.getMonth(), pck.getDayOfMonth());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(calendar.getTime());
	}
	
	protected int getInputMonth(int DatePickerId)
	{
		DatePicker pck = (DatePicker)this.findViewById(DatePickerId);
        return pck.getMonth() + 1;
	}
	
	protected int getInputYear(int DatePickerId)
	{
		DatePicker pck = (DatePicker)this.findViewById(DatePickerId);
        return pck.getYear();
	}
	
	protected Bitmap getImageFromAssetsFile(String fileName)  
    {  
        Bitmap image = null;  
        AssetManager am = getResources().getAssets();  
        try  
        {  
            InputStream is = am.open(fileName);  
            image = BitmapFactory.decodeStream(is);  
            is.close();  
        }  
        catch (IOException e)  
        {  
            e.printStackTrace();  
        }  
    
        return image;  
    }  
	
	protected void setTransparentButtonBackground(int buttonId)
	{
		ImageButton imgbt=(ImageButton)findViewById(buttonId);
        imgbt.getBackground().setAlpha(0);
	}
	
	protected void setBackgroundResource(int buttonId, int imgId)
	{
		View v = findViewById(buttonId);
		if (v instanceof ImageButton)
		{
			ImageButton imgbt=(ImageButton)v;
			imgbt.setBackgroundResource(imgId);
		}
		else if (v instanceof Button)
		{
			Button btn = (Button)v;
			btn.setBackgroundResource(imgId);
		}
	}
	
	protected void loadImage(int imageViewId, String path)
	{
		ImageView opener = (ImageView)findViewById(imageViewId);
        opener.setImageBitmap(getImageFromAssetsFile(path));
	}
	
	protected void loadGif(int gifViewId, String path)
	{
		GifView opener = (GifView)findViewById(gifViewId);
		opener.setSrc(path);
		//Here we load a static image to trigger the fucking onDraw event
		//The reason why invalidate() will not trigger this event is still unknown
		loadImage(gifViewId, path.replace(".gif", ".png"));
	}
	
	protected void setText(int textViewId, String content)
	{
		TextView lbl = (TextView)findViewById(textViewId);
		lbl.setText(content);
	}
	
	protected void setTextColor(TextView v, int colorId)
	{
		Resources resource = (Resources)getBaseContext().getResources();
		ColorStateList csl = null;
		csl = (ColorStateList)resource.getColorStateList(colorId);  
		v.setTextColor(csl);
	}
	
	protected void setTextColor(Button v, int colorId)
	{
		Resources resource = (Resources)getBaseContext().getResources();
		ColorStateList csl = null;
		csl = (ColorStateList)resource.getColorStateList(colorId);  
		v.setTextColor(csl);
	}

}
