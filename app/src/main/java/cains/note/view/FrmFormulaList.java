package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.AbstractService;
import cains.note.service.base.ServiceFactory;
import cains.note.service.formula.Formula;
import cains.note.utility.StringUtility;


public class FrmFormulaList extends ListActivityBase
{
	private List<AbstractItem> items;
	private static int[] fromImgId = new int[]{R.id.formulaFromImg1,R.id.formulaFromImg2,R.id.formulaFromImg3,R.id.formulaFromImg4,
			R.id.formulaFromImg5,R.id.formulaFromImg6,R.id.formulaFromImg7};

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
		layOutId = R.layout.frmformulalist;
		from = new String[]{"formulaName", "formulaType", "formulaCls"};
		to = new int[]{R.id.formulaName, R.id.formulaType, R.id.formulaCls};
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		AbstractService srv = ServiceFactory.getInstance().getCurrentService();
		items = srv.getItems(Global.category);

		for (AbstractItem itm : items)
		{
			HashMap<String,Object> hm = new HashMap<String,Object>();
			hm.put("formulaName", itm.name);
			hm.put("formulaType", itm.type);
			hm.put("formulaCls", StringUtility.isNullOrEmpty(itm.cls)?"无":itm.cls);
			list.add(hm);
		}
		return list;
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
			Formula formula = (Formula)items.get(position);
			int i = 0;
			ImageView imgV;
			for (int vId : fromImgId)
			{
				imgV = (ImageView)v.findViewById(vId);
				imgV.setBackgroundResource(0);
			}
			for (int imgId : formula.fromImgId)
			{
				imgV = (ImageView)v.findViewById(fromImgId[i++]);
				imgV.setBackgroundResource(imgId);
			}
			imgV = (ImageView)v.findViewById(R.id.formulaToImg1);
			imgV.setBackgroundResource(formula.toImgId);

			return v;
		}
	}

}
