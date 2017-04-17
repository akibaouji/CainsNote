package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import cains.note.global.Constant;
import cains.note.global.Global;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class FrmItemModeList extends ListActivityBase
{
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
		layOutId = R.layout.list_item5;
		from = new String[]{"img_pre", "text", "text2"};
		to = new int[]{R.id.img_pre, R.id.text, R.id.text2};
	}

	@Override
	protected List<Map<String, Object>> getData()
	{
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		HashMap<String,Object> hm = new HashMap<String,Object>();
		hm.put("text", "暗金装备");
		hm.put("text2", "在很久前, 人们在一个勇猛的冒险家身上发现了一件传说中的具有神奇力量的独一无二的物品. 暗金物品拥有唯一的名字和特殊的属性. 暗金物品比杰出物品和套装物品更加杰出. ");
		hm.put("img_pre", R.drawable.gold);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "绿色套装");
		hm.put("text2", "据说, 这些杰出的整套装备曾经属于过去的伟大英雄们. 当被整套的装备上时, 它们会产生额外的魔法效果. 套装的名字是绿色的, 一旦鉴定过, 每件套装都能显示出该套装备中其它几件装备的名字. ");
		hm.put("img_pre", R.drawable.green);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "符文之语");
		hm.put("text2", "当你按一定的顺序, 将正确的符文放入符合要求的凹槽物品后, 就会得到很多附加属性, 物品的名称也会变为暗金色, 并且会有特殊的名字, 拥有强大的力量. 这就是 \"符文之语\" . ");
		hm.put("img_pre", R.drawable.rune);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "合成公式");
		hm.put("text2", "赫拉迪克方块可以通过完成第II场景任务获得,并且帮助你完成后面的一些任务. 同时它还提供了额外的储物空间和合成装备等新的功能. ");
		hm.put("img_pre", R.drawable.cube);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "手工艺品");
		hm.put("text2", "手工艺品和稀有物品相似, 但是不能通过赌博得到, 只能在战斗中寻找. 当然了也可以通过箱子合成得到. 手工艺品只有等级高的玩家或者喜欢合成的玩家才能得到. 但是每次合成的物品是不一样的. 它的某些属性超过了其他的任何物品. 你也可以在手工艺品上打孔---通过打孔的任务或者是箱子合成, 在上面加上宝石或者是符文可以得到更好的属性.");
		hm.put("img_pre", R.drawable.crafted);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "任务道具");
		hm.put("text2", "大多数任务道具无任何属性，是完成特定任务的必要条件，部分任务需要英雄拥有任务道具才可执行.");
		hm.put("img_pre", R.drawable.questitem);
		list.add(hm);
		hm = new HashMap<String,Object>();
		hm.put("text", "魔法词缀");
		hm.put("text2", "词缀是指在一定的规则下随怪物掉落的魔法装备而随机出现在属性上并对其进行修正的一种游戏物品属性机制,表现在物品在掉落时会按照一定规则随机的被很多不同的词汇进行命名,具有这些名称的物品属性会按照一定规则产生相对应的随机的变化,最终看到的物品属性则是这一机制运行的最终结果.");
		hm.put("img_pre", R.drawable.affix);
		list.add(hm);

		return list;
	}

	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		switch (position)
		{
			case 0:
				Global.mode = Constant.GOLD_MODE;
				navigate(FrmCategoryList.class);
				break;
			case 1:
				Global.mode = Constant.GREEN_MODE;
				navigate(FrmCategoryList.class);
				break;
			case 2:
				Global.mode = Constant.RUNE_MODE;
				navigate(FrmCategoryList.class);
				break;
			case 3:
				Global.mode = Constant.FORMULA_MODE;
				navigate(FrmCategoryList.class);
				break;
			case 4:
				Global.mode = Constant.CRAFTED_MODE;
				navigate(FrmCategoryList.class);
				break;
			case 5:
				Global.mode = Constant.QUESTITEM_MODE;
				Global.category = "questitem"; //fixed category
				navigate(FrmNameList.class);
				break;
			case 6:
				Global.mode = Constant.AFFIX_MODE;
				navigate(FrmCategoryList.class);
				break;
			default:
				break;
		}


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
			if (tv.getText().equals("暗金装备"))
			{
				setTextColor(tv, R.color.gold);
				setTextColor(tv2, R.color.gold);
			}
			else if (tv.getText().equals("绿色套装"))
			{
				setTextColor(tv, R.color.green);
				setTextColor(tv2, R.color.green);
			}
			else if (tv.getText().equals("符文之语"))
			{
				setTextColor(tv, R.color.white);
				setTextColor(tv2, R.color.white);
			}
			else if (tv.getText().equals("合成公式"))
			{
				setTextColor(tv, R.color.blue);
				setTextColor(tv2, R.color.blue);
			}
			else if (tv.getText().equals("手工艺品"))
			{
				setTextColor(tv, R.color.orange4);
				setTextColor(tv2, R.color.orange4);
			}
			else if (tv.getText().equals("任务道具"))
			{
				setTextColor(tv, R.color.orange2);
				setTextColor(tv2, R.color.orange2);
			}
			else if (tv.getText().equals("魔法词缀"))
			{
				setTextColor(tv, R.color.yellow);
				setTextColor(tv2, R.color.yellow);
			}
			return v;
		}
	}
}
