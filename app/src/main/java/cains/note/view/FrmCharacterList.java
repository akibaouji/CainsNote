package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.AbstractService;
import cains.note.service.base.ServiceFactory;
import cains.note.service.character.Character;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class FrmCharacterList extends ListActivityBase
{
	List<AbstractItem> itms;
	
	@Override
	protected BaseAdapter getAdapter()
	{
		return new MySimpleAdapter(this,
				getData(),
				layOutId,
				from,
				to);
	}
	
	@Override
	protected void assignResouce()
	{
		Global.mode = Constant.CHAR_MODE;
		
		layOutId = R.layout.list_item5;
		from = new String[]{"img_pre", "text", "text2"};
		to = new int[]{R.id.img_pre, R.id.text, R.id.text2};
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		AbstractService srv = ServiceFactory.getInstance().getCurrentService();
		itms = srv.getItems("character");
		Character chr;
		HashMap<String,Object> hm;
		for (AbstractItem itm : itms)
		{
			chr = (Character)itm;
			hm = new HashMap<String,Object>();
			hm.put("text", chr.name);
			hm.put("text2", chr.type);
			hm.put("img_pre", chr.imgId);
			list.add(hm);
		}
		return list;
	}

	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		AbstractItem itm = itms.get(position);
		Global.id = itm.id;
		navigate(FrmCharacterView.class);
	}
	
	private class MySimpleAdapter extends SimpleAdapter
	{
		public MySimpleAdapter(Context context, List data, int resource, String[] from, int[] to)
		{
			super(context, data, resource, from, to);
		}
		
		@Override
		public View getView(int position, View convertView, android.view.ViewGroup parent)
		{
			View v = super.getView(position, convertView, parent);
			TextView tv = (TextView)v.findViewById(R.id.text);
            TextView tv2 = (TextView)v.findViewById(R.id.text2);
            setTextColor(tv, R.color.gold);
        	setTextColor(tv2, R.color.blue);
			return v;
		}
	}
}
