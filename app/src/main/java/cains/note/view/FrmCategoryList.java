package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cains.note.view.R;
import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.base.*;

public class FrmCategoryList extends ListActivityBase
{ 
	private List<AbstractCategory> categories;
	
	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		AbstractCategory selectedCtg = categories.get(position);
		Global.category = selectedCtg.id;
		
		if (Global.mode.equals(Constant.GOLD_MODE)
        		|| Global.mode.equals(Constant.GREEN_MODE)
        		|| Global.mode.equals(Constant.CRAFTED_MODE)
        		|| Global.mode.equals(Constant.MONSTER_MODE)
        		|| Global.mode.equals(Constant.NPC_MODE)
        		|| Global.mode.equals(Constant.TASK_MODE)
        		|| Global.mode.equals(Constant.STORY_MODE))
		{
			navigate(FrmNameList.class);
		}
		else if(Global.mode.equals(Constant.AFFIX_MODE))
		{
			navigate(FrmAffixList.class);
		}
		else if (Global.mode.equals(Constant.RUNE_MODE)) //Rune doesn't have a name list level menu
		{
			navigate(FrmRuneWordView.class);
		}
		else if (Global.mode.equals(Constant.MERCENARY_MODE)) //Mercenary doesn't have a name list level menu
		{
			navigate(FrmMercenaryView.class);
		}
		else if (Global.mode.equals(Constant.FORMULA_MODE))
		{
			navigate(FrmFormulaList.class);
		}
	}

	@Override
	protected void assignResouce()
	{
		if (Global.mode.equals(Constant.GOLD_MODE)
        		|| Global.mode.equals(Constant.MONSTER_MODE)
        		|| Global.mode.equals(Constant.MERCENARY_MODE))
        {
        	layOutId = R.layout.list_item2; //gold
        }
		else if (Global.mode.equals(Constant.NPC_MODE))
        {
        	layOutId = R.layout.list_item10; //grey
        }
		else if (Global.mode.equals(Constant.TASK_MODE))
        {
        	layOutId = R.layout.list_item7; //orange2
        }
        else if (Global.mode.equals(Constant.GREEN_MODE))
        {
        	layOutId = R.layout.list_item3; //green
        }
        else if (Global.mode.equals(Constant.RUNE_MODE)
        			|| Global.mode.equals(Constant.STORY_MODE))
        {
        	layOutId = R.layout.list_item4; //white
        }
        else if (Global.mode.equals(Constant.AFFIX_MODE))
        {
        	layOutId = R.layout.list_item12; //yellow
        }
        else if (Global.mode.equals(Constant.FORMULA_MODE))
        {
        	layOutId = R.layout.list_item13; //blue
        }
        else if (Global.mode.equals(Constant.CRAFTED_MODE))
        {
        	layOutId = R.layout.list_item14; //orange4
        }
		
		from = new String[]{"img_pre", "text"};
		to = new int[]{R.id.img_pre, R.id.text};
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		AbstractService srv = ServiceFactory.getInstance().getCurrentService();
		categories = srv.getCategories();
		for (AbstractCategory category : categories)
		{
			HashMap<String,Object> cat = new HashMap<String,Object>();
			cat.put("img_pre", category.imgId);
			cat.put("text", category.name);
			list.add(cat);
		}
	
		return list;
	} 
}
