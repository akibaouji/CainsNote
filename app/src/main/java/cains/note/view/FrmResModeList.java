package cains.note.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import cains.note.global.Constant;
import cains.note.global.Global;

public class FrmResModeList extends ListActivityBase
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
		hm.put("text", "超级暗金怪物");
		hm.put("text2", "超级暗金怪物会出现在每个游戏中的相同地方. 类似暗金怪物, 超级暗金怪物也有特殊魔法技能 - 但是不同于暗金怪物, 它们并不都有仆从. 在噩梦难度, 超级暗金怪物会有一项额外的魔法技能, 地狱难度会有两项. ");
		hm.put("img_pre", R.drawable.m1);
		list.add(hm);

		hm = new HashMap<String,Object>();
		hm.put("text", "城镇居民");
		hm.put("text2", "有些城镇居民可以免费恢复你的生命, 法力, 耐力. 另一些则提供交易服务,比如武器装备, 书本, 卷轴, 钥匙和药水. 此外, 每一幕都有一个NPC让你赌博.");
		hm.put("img_pre", R.drawable.m2);
		list.add(hm);

		hm = new HashMap<String,Object>();
		hm.put("text", "雇佣兵");
		hm.put("text2", "任何人都可能在危急关头与恶魔做斗争,但是只有最强壮最勇敢的人才可以跟随如你一样的狂热掠夺者去驰骋地狱.");
		hm.put("img_pre", R.drawable.m6);
		list.add(hm);

		hm = new HashMap<String,Object>();
		hm.put("text", "任务一览");
		hm.put("text2", "任务并不是随机触发.英雄需要按照故事的发展去解决一个个谜题和故事.随着故事的进展，英雄变得越来越强而故事背后的秘密也逐渐呈现在面前.");
		hm.put("img_pre", R.drawable.m4);
		list.add(hm);

		hm = new HashMap<String,Object>();
		hm.put("text", "背景故事");
		hm.put("text2", "到底是誰創造了這個宇宙？而天使與惡魔古早衝突的原因是什麼？我們目前無法得知，我們只知道從恆古年代開始，沒人能夠記得的久遠時間，高等天堂以及燃燒地獄雙方展開的善惡大戰就已經爆發，這場永恆的決戰也是聖修亞瑞大陸（Sanctuary）產生的主因，同時也是《暗黑破壞神》遊戲的重要背景。 ");
		hm.put("img_pre", R.drawable.m5);
		list.add(hm);

		hm = new HashMap<String,Object>();
		hm.put("text", "世界地图");
		hm.put("text2", "罗格营地位于恩特斯德格，由目盲之眼姐妹会的幸存者建造。被称为“沙漠明珠”的鲁高因是阿兰诺克最主要的贸易站，并且是西部王国和柯基斯坦的贸易纽带。库拉斯特是柯基斯坦的首都，毗邻双子海。哈洛加斯则位于亚瑞特山脉，是野蛮人的故乡。");
		hm.put("img_pre", R.drawable.m3);
		list.add(hm);

		return list;
	}

	@Override
	protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id)
	{
		if (position == 0)
		{
			Global.mode = Constant.MONSTER_MODE;
			navigate(FrmDrawPatternList.class);
		}
		else if (position == 1)
		{
			Global.mode = Constant.NPC_MODE;
			navigate(FrmCategoryList.class);
		}
		else if (position == 2)
		{
			Global.mode = Constant.MERCENARY_MODE;
			navigate(FrmCategoryList.class);
		}
		else if (position == 3)
		{
			Global.mode = Constant.TASK_MODE;
			navigate(FrmCategoryList.class);
		}
		else if (position == 4)
		{
			Global.mode = Constant.STORY_MODE;
			navigate(FrmCategoryList.class);
		}
		else if (position == 5)
		{
			Global.mode = Constant.MAP_MODE;
			navigate(FrmMapView.class);
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
			if (tv.getText().equals("超级暗金怪物"))
			{
				setTextColor(tv, R.color.gold);
				setTextColor(tv2, R.color.gold);
			}
			else if (tv.getText().equals("城镇居民"))
			{
				setTextColor(tv, R.color.grey);
				setTextColor(tv2, R.color.grey);
			}
			else if (tv.getText().equals("任务一览"))
			{
				setTextColor(tv, R.color.orange2);
				setTextColor(tv2, R.color.orange2);
			}
			else if (tv.getText().equals("背景故事"))
			{
				setTextColor(tv, R.color.white);
				setTextColor(tv2, R.color.white);
			}
			else if (tv.getText().equals("世界地图"))
			{
				setTextColor(tv, R.color.green);
				setTextColor(tv2, R.color.green);
			}
			return v;
		}
	}
}
