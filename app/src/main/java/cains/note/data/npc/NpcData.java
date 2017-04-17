package cains.note.data.npc;

import cains.note.service.npc.*;
import cains.note.view.R;

public final class NpcData
{
	private NpcData()
	{
	}

	public static void generate(NpcService srv)
	{
		NpcBox box = new NpcBox();
		box.category = new NpcCategory("episode1", "第一幕\r\n罗格营地", R.drawable.episode1_npc);
		/* 阿卡拉 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A1_1, Rsc.RES_A1_2, Rsc.RES_A1_3, Rsc.RES_A1_4, Rsc.RES_A1_5, Rsc.RES_A1_6));
		/* 恰西 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A2_1, Rsc.RES_A2_2, Rsc.RES_A2_3, Rsc.RES_A2_4, Rsc.RES_A2_5, Rsc.RES_A2_6));
		/* 迪卡.凯恩 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A3_1, Rsc.RES_A3_2, Rsc.RES_A3_3, Rsc.RES_A3_4, Rsc.RES_A3_5, Rsc.RES_A3_6));
		/* 基得 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A5_1, Rsc.RES_A5_2, Rsc.RES_A5_3, Rsc.RES_A5_4, Rsc.RES_A5_5, Rsc.RES_A5_6));
		/* 卡夏 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A6_1, Rsc.RES_A6_2, Rsc.RES_A6_3, Rsc.RES_A6_4, Rsc.RES_A6_5, Rsc.RES_A6_6));
		/* 瓦瑞夫 */
		box.items.add(new Npc(box.category.id, Rsc.RES_A7_1, Rsc.RES_A7_2, Rsc.RES_A7_3, Rsc.RES_A7_4, Rsc.RES_A7_5, Rsc.RES_A7_6));
		srv.addItemBox(box);

		box = new NpcBox();
		box.category = new NpcCategory("episode2", "第二幕\r\n鲁·高因", R.drawable.episode2_npc);
		/* 亚特玛 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B1_1, Rsc.RES_B1_2, Rsc.RES_B1_3, Rsc.RES_B1_4, Rsc.RES_B1_5, Rsc.RES_B1_6));
		/* 卓格南 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B2_1, Rsc.RES_B2_2, Rsc.RES_B2_3, Rsc.RES_B2_4, Rsc.RES_B2_5, Rsc.RES_B2_6));
		/* 艾吉斯 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B3_1, Rsc.RES_B3_2, Rsc.RES_B3_3, Rsc.RES_B3_4, Rsc.RES_B3_5, Rsc.RES_B3_6));
		/* 法拉 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B4_1, Rsc.RES_B4_2, Rsc.RES_B4_3, Rsc.RES_B4_4, Rsc.RES_B4_5, Rsc.RES_B4_6));
		/* 基格列斯 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B5_1, Rsc.RES_B5_2, Rsc.RES_B5_3, Rsc.RES_B5_4, Rsc.RES_B5_5, Rsc.RES_B5_6));
		/* 格雷兹 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B6_1, Rsc.RES_B6_2, Rsc.RES_B6_3, Rsc.RES_B6_4, Rsc.RES_B6_5, Rsc.RES_B6_6));
		/* 杰海因 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B7_1, Rsc.RES_B7_2, Rsc.RES_B7_3, Rsc.RES_B7_4, Rsc.RES_B7_5, Rsc.RES_B7_6));
		/* 凯伦 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B8_1, Rsc.RES_B8_2, Rsc.RES_B8_3, Rsc.RES_B8_4, Rsc.RES_B8_5, Rsc.RES_B8_6));
		/* 雷山德 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B9_1, Rsc.RES_B9_2, Rsc.RES_B9_3, Rsc.RES_B9_4, Rsc.RES_B9_5, Rsc.RES_B9_6));
		/* 马席夫 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B10_1, Rsc.RES_B10_2, Rsc.RES_B10_3, Rsc.RES_B10_4, Rsc.RES_B10_5, Rsc.RES_B10_6));
		/* 瓦瑞夫 */
		box.items.add(new Npc(box.category.id, Rsc.RES_B11_1, Rsc.RES_B11_2, Rsc.RES_B11_3, Rsc.RES_B11_4, Rsc.RES_B11_5, Rsc.RES_B11_6));
		srv.addItemBox(box);

		box = new NpcBox();
		box.category = new NpcCategory("episode3", "第三幕\r\n库拉斯特海港", R.drawable.episode3_npc);
		/* 艾柯 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C1_1, Rsc.RES_C1_2, Rsc.RES_C1_3, Rsc.RES_C1_4, Rsc.RES_C1_5, Rsc.RES_C1_6));
		/* 艾席拉 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C2_1, Rsc.RES_C2_2, Rsc.RES_C2_3, Rsc.RES_C2_4, Rsc.RES_C2_5, Rsc.RES_C2_6));
		/* 赫拉铁力 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C3_1, Rsc.RES_C3_2, Rsc.RES_C3_3, Rsc.RES_C3_4, Rsc.RES_C3_5, Rsc.RES_C3_6));
		/* 马席夫 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C4_1, Rsc.RES_C4_2, Rsc.RES_C4_3, Rsc.RES_C4_4, Rsc.RES_C4_5, Rsc.RES_C4_6));
		/* 娜塔亚 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C5_1, Rsc.RES_C5_2, Rsc.RES_C5_3, Rsc.RES_C5_4, Rsc.RES_C5_5, Rsc.RES_C5_6));
		/* 奥玛斯 */
		box.items.add(new Npc(box.category.id, Rsc.RES_C6_1, Rsc.RES_C6_2, Rsc.RES_C6_3, Rsc.RES_C6_4, Rsc.RES_C6_5, Rsc.RES_C6_6));
		srv.addItemBox(box);

		box = new NpcBox();
		box.category = new NpcCategory("episode4", "第四幕\r\n群魔堡垒", R.drawable.episode4_npc);
		/* 海尔布 */
		box.items.add(new Npc(box.category.id, Rsc.RES_D1_1, Rsc.RES_D1_2, Rsc.RES_D1_3, Rsc.RES_D1_4, Rsc.RES_D1_5, Rsc.RES_D1_6));
		/* 贾梅拉 */
		box.items.add(new Npc(box.category.id, Rsc.RES_D2_1, Rsc.RES_D2_2, Rsc.RES_D2_3, Rsc.RES_D2_4, Rsc.RES_D2_5, Rsc.RES_D2_6));
		/* 泰瑞尔 */
		box.items.add(new Npc(box.category.id, Rsc.RES_D3_1, Rsc.RES_D3_2, Rsc.RES_D3_3, Rsc.RES_D3_4, Rsc.RES_D3_5, Rsc.RES_D3_6));
		srv.addItemBox(box);

		box = new NpcBox();
		box.category = new NpcCategory("episode5", "第五幕\r\n哈洛加斯", R.drawable.episode5_npc);
		/* 拉苏克 */
		box.items.add(new Npc(box.category.id, Rsc.RES_E1_1, Rsc.RES_E1_2, Rsc.RES_E1_3, Rsc.RES_E1_4, Rsc.RES_E1_5, Rsc.RES_E1_6));
		/* 马拉 */
		box.items.add(new Npc(box.category.id, Rsc.RES_E2_1, Rsc.RES_E2_2, Rsc.RES_E2_3, Rsc.RES_E2_4, Rsc.RES_E2_5, Rsc.RES_E2_6));
		/* 尼拉塞克 */
		box.items.add(new Npc(box.category.id, Rsc.RES_E3_1, Rsc.RES_E3_2, Rsc.RES_E3_3, Rsc.RES_E3_4, Rsc.RES_E3_5, Rsc.RES_E3_6));
		/* 安亚 */
		box.items.add(new Npc(box.category.id, Rsc.RES_E4_1, Rsc.RES_E4_2, Rsc.RES_E4_3, Rsc.RES_E4_4, Rsc.RES_E4_5, Rsc.RES_E4_6));
		/* 夸尔凯克 */
		box.items.add(new Npc(box.category.id, Rsc.RES_E5_1, Rsc.RES_E5_2, Rsc.RES_E5_3, Rsc.RES_E5_4, Rsc.RES_E5_5, Rsc.RES_E5_6));
		srv.addItemBox(box);
	}
}
