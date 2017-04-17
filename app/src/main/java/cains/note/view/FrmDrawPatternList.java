package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cains.note.view.R;
import cains.note.global.Constant;
import cains.note.global.Global;


public class FrmDrawPatternList extends ListActivityBase
{
	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		if (position == 0)
		{
			Global.drawpattern = Constant.IMG_PATTERN_GIF;
		}
		else
		{
			Global.drawpattern = Constant.IMG_PATTERN_PNG;
		}

		navigate(FrmCategoryList.class);
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HashMap<String,Object> cat = new HashMap<String,Object>();
		cat.put("img_pre", R.drawable.dynamicgif);
		cat.put("text", "使用动态怪物图片");
		list.add(cat);
		cat = new HashMap<String,Object>();
		cat.put("img_pre", R.drawable.staticpng);
		cat.put("text", "使用静态怪物图片");
		list.add(cat);

		return list;
	}

	@Override
	protected void assignResouce()
	{
		layOutId = R.layout.list_item2;
		from = new String[]{"img_pre", "text"};
		to = new int[]{R.id.img_pre, R.id.text};
	}
}
