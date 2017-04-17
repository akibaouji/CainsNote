package cains.note.view;

import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
//import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import cains.note.global.MyApplication;

public abstract class ListActivityBase extends ListActivity
{
	protected int layOutId;
	protected String[] from;
	protected int[] to;
	
	@Override  
    public void onCreate(Bundle savedInstanceState) 
	{  
        super.onCreate(savedInstanceState);  
        assignResouce();
        setListAdapter(getAdapter());  
        
        //Log.d("on create", "on create: " + this.getClass().getName());
	}
	
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
	
	protected BaseAdapter getAdapter()
	{
		return new SimpleAdapter(this,
				getData(),
				layOutId,
				from,
				to);
	}
	
	protected void navigate(Class<?> cls)
	{
		Intent intent = new Intent(this, cls);
		intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		this.startActivity(intent);
	}
	
	protected void setTextColor(TextView v, int colorId)
	{
		Resources resource = (Resources)getBaseContext().getResources();
		ColorStateList csl= (ColorStateList)resource.getColorStateList(colorId);  
		v.setTextColor(csl);
	}
	
	protected abstract void assignResouce();
	protected abstract List<Map<String, Object>> getData();
	
}
