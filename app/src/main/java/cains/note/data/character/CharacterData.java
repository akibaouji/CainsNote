package cains.note.data.character;

import cains.note.service.character.*;
import cains.note.service.character.Character;
import cains.note.view.R;

public final class CharacterData
{
	private CharacterData()
	{
	}

	public static void generate(CharacterService srv)
	{
		CharacterBox box = new CharacterBox();
		box.category = new CharacterCategory("character", "角色", 0);

		Character chr = new Character(box.category.id, "amazon", "亚马逊", Rsc.RES_AMA_1, Rsc.RES_AMA_2, Rsc.RES_AMA_3, Rsc.RES_AMA_4, Rsc.RES_AMA_5, Rsc.RES_AMA_6, Rsc.RES_AMA_7, R.drawable.amazon);
		box.items.add(chr);
		chr = new Character(box.category.id, "assassin", "刺客", Rsc.RES_ASS_1, Rsc.RES_ASS_2, Rsc.RES_ASS_3, Rsc.RES_ASS_4, Rsc.RES_ASS_5, Rsc.RES_ASS_6, Rsc.RES_ASS_7, R.drawable.assassin);
		box.items.add(chr);
		chr = new Character(box.category.id, "necromancer", "死灵法师", Rsc.RES_NEC_1, Rsc.RES_NEC_2, Rsc.RES_NEC_3, Rsc.RES_NEC_4, Rsc.RES_NEC_5, Rsc.RES_NEC_6, Rsc.RES_NEC_7, R.drawable.necromancer);
		box.items.add(chr);
		chr = new Character(box.category.id, "barbarian", "野蛮人", Rsc.RES_BAR_1, Rsc.RES_BAR_2, Rsc.RES_BAR_3, Rsc.RES_BAR_4, Rsc.RES_BAR_5, Rsc.RES_BAR_6, Rsc.RES_BAR_7, R.drawable.barbarian);
		box.items.add(chr);
		chr = new Character(box.category.id, "paladin", "圣骑士", Rsc.RES_PAL_1, Rsc.RES_PAL_2, Rsc.RES_PAL_3, Rsc.RES_PAL_4, Rsc.RES_PAL_5, Rsc.RES_PAL_6, Rsc.RES_PAL_7, R.drawable.paladin);
		box.items.add(chr);
		chr = new Character(box.category.id, "sorceress", "法师", Rsc.RES_SOR_1, Rsc.RES_SOR_2, Rsc.RES_SOR_3, Rsc.RES_SOR_4, Rsc.RES_SOR_5, Rsc.RES_SOR_6, Rsc.RES_SOR_7, R.drawable.sorceress);
		box.items.add(chr);
		chr = new Character(box.category.id, "druid", "德鲁伊", Rsc.RES_DRU_1, Rsc.RES_DRU_2, Rsc.RES_DRU_3, Rsc.RES_DRU_4, Rsc.RES_DRU_5, Rsc.RES_DRU_6, Rsc.RES_DRU_7, R.drawable.druid);
		box.items.add(chr);


		srv.addItemBox(box);
	}
}
