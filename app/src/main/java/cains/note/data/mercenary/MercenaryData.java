package cains.note.data.mercenary;

import cains.note.service.mercenary.*;
import cains.note.view.R;

public final class MercenaryData
{
	private MercenaryData()
	{
	}

	public static void generate(MercenaryService srv)
	{
		MercenaryBox box = new MercenaryBox();
		box.category = new MercenaryCategory("episode1", "第一幕\r\n罗格营地", R.drawable.episode1_npc);
		box.items.add(new Mercenary(box.category.id, Rsc.RES_ROGUE_1,Rsc.RES_ROGUE_2,Rsc.RES_ROGUE_3,Rsc.RES_ROGUE_4,Rsc.RES_ROGUE_5,Rsc.RES_ROGUE_6,Rsc.RES_ROGUE_7,Rsc.RES_ROGUE_8));
		srv.addItemBox(box);

		box = new MercenaryBox();
		box.category = new MercenaryCategory("episode2", "第二幕\r\n鲁·高因", R.drawable.episode2_npc);
		box.items.add(new Mercenary(box.category.id, Rsc.RES_GUARDIAN_1,Rsc.RES_GUARDIAN_2,Rsc.RES_GUARDIAN_3,Rsc.RES_GUARDIAN_4,Rsc.RES_GUARDIAN_5,Rsc.RES_GUARDIAN_6,Rsc.RES_GUARDIAN_7,Rsc.RES_GUARDIAN_8));
		srv.addItemBox(box);

		box = new MercenaryBox();
		box.category = new MercenaryCategory("episode3", "第三幕\r\n库拉斯特海港", R.drawable.episode3_npc);
		box.items.add(new Mercenary(box.category.id, Rsc.RES_IRONWOLF_1,Rsc.RES_IRONWOLF_2,Rsc.RES_IRONWOLF_3,Rsc.RES_IRONWOLF_4,Rsc.RES_IRONWOLF_5,Rsc.RES_IRONWOLF_6,Rsc.RES_IRONWOLF_7,Rsc.RES_IRONWOLF_8));
		srv.addItemBox(box);

		box = new MercenaryBox();
		box.category = new MercenaryCategory("episode5", "第五幕\r\n哈洛加斯", R.drawable.episode5_npc);
		box.items.add(new Mercenary(box.category.id, Rsc.RES_BARBARIAN_1,Rsc.RES_BARBARIAN_2,Rsc.RES_BARBARIAN_3,Rsc.RES_BARBARIAN_4,Rsc.RES_BARBARIAN_5,Rsc.RES_BARBARIAN_6,Rsc.RES_BARBARIAN_7,Rsc.RES_BARBARIAN_8));
		srv.addItemBox(box);
	}
}
