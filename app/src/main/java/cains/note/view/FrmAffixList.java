package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.AbstractService;
import cains.note.service.base.ServiceFactory;
import cains.note.utility.StringUtility;


public class FrmAffixList extends ListActivityBase
{
	@Override
	protected void assignResouce()
	{
		layOutId = R.layout.frmaffixlist;
		from = new String[]{"affixName", "affixAttribute", "affixFunction", "affixComment"};
		to = new int[]{R.id.affixName, R.id.affixAttribute, R.id.affixFunction, R.id.affixComment};
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

		AbstractService srv = ServiceFactory.getInstance().getCurrentService();
		List<AbstractItem> items = srv.getItems(Global.category);

		for (AbstractItem itm : items)
		{
			HashMap<String,Object> hm = new HashMap<String,Object>();
			hm.put("affixName", itm.name);
			hm.put("affixAttribute", itm.cls);
			hm.put("affixFunction", itm.comment1);
			hm.put("affixComment", StringUtility.isNullOrEmpty(itm.comment2)?"无":itm.comment2);
			list.add(hm);
		}
		return list;
	}

}
