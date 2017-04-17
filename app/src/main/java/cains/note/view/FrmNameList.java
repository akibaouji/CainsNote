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

public class FrmNameList extends ListActivityBase
{
	private List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	
	protected void assignResouce()
	{
		if (Global.mode.equals(Constant.GOLD_MODE)
        	|| Global.mode.equals(Constant.MONSTER_MODE))
		{
			layOutId = R.layout.list_item0; //gold fore color
		}
		else if (Global.mode.equals(Constant.NPC_MODE))
		{
			layOutId = R.layout.list_item9; //grey fore color
		}
		else if (Global.mode.equals(Constant.TASK_MODE))
		{
			layOutId = R.layout.list_item6; //orange2 fore color
		}
		else if (Global.mode.equals(Constant.STORY_MODE))
		{
			layOutId = R.layout.list_item8; //white fore color
		}
		else if (Global.mode.equals(Constant.QUESTITEM_MODE))
		{
			layOutId = R.layout.list_item11; //orange2 fore color
		}
		else if (Global.mode.equals(Constant.GREEN_MODE))
		{
			layOutId = R.layout.list_item1; //green fore color
		}
		else if (Global.mode.equals(Constant.CRAFTED_MODE))
		{
			layOutId = R.layout.list_item14; //orange4 fore color
		}
		else
		{
			layOutId = R.layout.list_item0; //gold fore color
		}
		from = new String[]{"text"};
		to = new int[]{R.id.text};
	}

	protected List<Map<String, Object>> getData()
	{
		AbstractService srv = ServiceFactory.getInstance().getCurrentService();
        List<AbstractItem> items = srv.getItems(Global.category);
        for (AbstractItem itm : items)
		{
        	HashMap<String,Object> hm = new HashMap<String,Object>();
			hm.put("text", itm.getDisplayName());
			hm.put("id", itm.id);
			list.add(hm);
		}
		return list;
	}
	
	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		HashMap<String,Object> hm = (HashMap<String, Object>)list.get(position);
		Global.id = (String)hm.get("id"); //save the current selected id
		
		if (Global.mode.equals(Constant.GOLD_MODE)
			|| Global.mode.equals(Constant.GREEN_MODE))
		{
			navigate(FrmItemView.class);
		}
		else if (Global.mode.equals(Constant.MONSTER_MODE))
		{
			navigate(FrmMonsterView.class);
		}
		else if (Global.mode.equals(Constant.NPC_MODE))
		{
			navigate(FrmNpcView.class);
		}
		else if (Global.mode.equals(Constant.TASK_MODE))
		{
			navigate(FrmTaskView.class);
		}
		else if (Global.mode.equals(Constant.STORY_MODE))
		{
			navigate(FrmStoryView.class);
		}
		else if (Global.mode.equals(Constant.QUESTITEM_MODE))
		{
			navigate(FrmQuestItemView.class);
		}
		else if (Global.mode.equals(Constant.CRAFTED_MODE))
		{
			navigate(FrmCraftedItemView.class);
		}
	}

}
