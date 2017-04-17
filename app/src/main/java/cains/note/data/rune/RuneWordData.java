package cains.note.data.rune;

import cains.note.service.rune.*;
import cains.note.view.R;

public final class RuneWordData
{
	private RuneWordData()
	{
	}

	public static void generate(RuneWordService srv)
	{
		/* 谜团 */
		RuneWordItemBox box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ENIGMA_1, Rsc.RES_ENIGMA_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_ENIGMA_1, Rsc.RES_ENIGMA_3, Rsc.RES_ENIGMA_4, Rsc.RES_ENIGMA_5, Rsc.RES_ENIGMA_6, Rsc.RES_ENIGMA_7));
		srv.addItemBox(box);

		/* 无限 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_INFINITY_1, Rsc.RES_INFINITY_2, R.drawable.ber);
		box.items.add(new RuneWordItem(Rsc.RES_INFINITY_1, Rsc.RES_INFINITY_3, Rsc.RES_INFINITY_4, Rsc.RES_INFINITY_5, Rsc.RES_INFINITY_6, Rsc.RES_INFINITY_7));
		srv.addItemBox(box);

		/* 悔恨 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_GRIEF_1, Rsc.RES_GRIEF_2, R.drawable.lo);
		box.items.add(new RuneWordItem(Rsc.RES_GRIEF_1, Rsc.RES_GRIEF_3, Rsc.RES_GRIEF_4, Rsc.RES_GRIEF_5, Rsc.RES_GRIEF_6, Rsc.RES_GRIEF_7));
		srv.addItemBox(box);

		/* 刚毅 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_FORTITUDE_1, Rsc.RES_FORTITUDE_2, R.drawable.lo);
		box.items.add(new RuneWordItem(Rsc.RES_FORTITUDE_1, Rsc.RES_FORTITUDE_3, Rsc.RES_FORTITUDE_4, Rsc.RES_FORTITUDE_5, Rsc.RES_FORTITUDE_6, Rsc.RES_FORTITUDE_7));
		srv.addItemBox(box);

		/* 精神 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_SPIRIT_1, Rsc.RES_SPIRIT_2, R.drawable.amn);
		box.items.add(new RuneWordItem(Rsc.RES_SPIRIT_1, Rsc.RES_SPIRIT_3, Rsc.RES_SPIRIT_4, Rsc.RES_SPIRIT_5, Rsc.RES_SPIRIT_6, Rsc.RES_SPIRIT_7));
		srv.addItemBox(box);

		/* 战争召唤 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_CALL_TO_ARMS_1, Rsc.RES_CALL_TO_ARMS_2, R.drawable.ohm);
		box.items.add(new RuneWordItem(Rsc.RES_CALL_TO_ARMS_1, Rsc.RES_CALL_TO_ARMS_3, Rsc.RES_CALL_TO_ARMS_4, Rsc.RES_CALL_TO_ARMS_5, Rsc.RES_CALL_TO_ARMS_6, Rsc.RES_CALL_TO_ARMS_7));
		srv.addItemBox(box);

		/* 死亡呼吸 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BREATH_OF_THE_DYING_1, Rsc.RES_BREATH_OF_THE_DYING_2, R.drawable.zod);
		box.items.add(new RuneWordItem(Rsc.RES_BREATH_OF_THE_DYING_1, Rsc.RES_BREATH_OF_THE_DYING_3, Rsc.RES_BREATH_OF_THE_DYING_4, Rsc.RES_BREATH_OF_THE_DYING_5, Rsc.RES_BREATH_OF_THE_DYING_6, Rsc.RES_BREATH_OF_THE_DYING_7));
		srv.addItemBox(box);

		/* 信心 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_FAITH_1, Rsc.RES_FAITH_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_FAITH_1, Rsc.RES_FAITH_3, Rsc.RES_FAITH_4, Rsc.RES_FAITH_5, Rsc.RES_FAITH_6, Rsc.RES_FAITH_7));
		srv.addItemBox(box);

		/* 强制 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DURESS_1, Rsc.RES_DURESS_2, R.drawable.um);
		box.items.add(new RuneWordItem(Rsc.RES_DURESS_1, Rsc.RES_DURESS_3, Rsc.RES_DURESS_4, Rsc.RES_DURESS_5, Rsc.RES_DURESS_6, Rsc.RES_DURESS_7));
		srv.addItemBox(box);

		/* 橡树之心 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_HEART_OF_THE_OAK_1, Rsc.RES_HEART_OF_THE_OAK_2, R.drawable.vex);
		box.items.add(new RuneWordItem(Rsc.RES_HEART_OF_THE_OAK_1, Rsc.RES_HEART_OF_THE_OAK_3, Rsc.RES_HEART_OF_THE_OAK_4, Rsc.RES_HEART_OF_THE_OAK_5, Rsc.RES_HEART_OF_THE_OAK_6, Rsc.RES_HEART_OF_THE_OAK_7));
		srv.addItemBox(box);

		/* 死神 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DEATH_1, Rsc.RES_DEATH_2, R.drawable.vex);
		box.items.add(new RuneWordItem(Rsc.RES_DEATH_1, Rsc.RES_DEATH_3, Rsc.RES_DEATH_4, Rsc.RES_DEATH_5, Rsc.RES_DEATH_6, Rsc.RES_DEATH_7));
		srv.addItemBox(box);

		/* 誓约 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_OATH_1, Rsc.RES_OATH_2, R.drawable.mal);
		box.items.add(new RuneWordItem(Rsc.RES_OATH_1, Rsc.RES_OATH_3, Rsc.RES_OATH_4, Rsc.RES_OATH_5, Rsc.RES_OATH_6, Rsc.RES_OATH_7));
		srv.addItemBox(box);

		/* 眼光 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_INSIGHT_1, Rsc.RES_INSIGHT_2, R.drawable.sol);
		box.items.add(new RuneWordItem(Rsc.RES_INSIGHT_1, Rsc.RES_INSIGHT_3, Rsc.RES_INSIGHT_4, Rsc.RES_INSIGHT_5, Rsc.RES_INSIGHT_6, Rsc.RES_INSIGHT_7));
		srv.addItemBox(box);

		/* 遵从 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_OBEDIENCE_1, Rsc.RES_OBEDIENCE_2, R.drawable.fal);
		box.items.add(new RuneWordItem(Rsc.RES_OBEDIENCE_1, Rsc.RES_OBEDIENCE_3, Rsc.RES_OBEDIENCE_4, Rsc.RES_OBEDIENCE_5, Rsc.RES_OBEDIENCE_6, Rsc.RES_OBEDIENCE_7));
		srv.addItemBox(box);

		/* 荣耀之链 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_CHAINS_OF_HONOR_1, Rsc.RES_CHAINS_OF_HONOR_2, R.drawable.ber);
		box.items.add(new RuneWordItem(Rsc.RES_CHAINS_OF_HONOR_1, Rsc.RES_CHAINS_OF_HONOR_3, Rsc.RES_CHAINS_OF_HONOR_4, Rsc.RES_CHAINS_OF_HONOR_5, Rsc.RES_CHAINS_OF_HONOR_6, Rsc.RES_CHAINS_OF_HONOR_7));
		srv.addItemBox(box);

		/* 背信 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_TREACHERY_1, Rsc.RES_TREACHERY_2, R.drawable.lem);
		box.items.add(new RuneWordItem(Rsc.RES_TREACHERY_1, Rsc.RES_TREACHERY_3, Rsc.RES_TREACHERY_4, Rsc.RES_TREACHERY_5, Rsc.RES_TREACHERY_6, Rsc.RES_TREACHERY_7));
		srv.addItemBox(box);

		/* 边缘 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_EDGE_1, Rsc.RES_EDGE_2, R.drawable.amn);
		box.items.add(new RuneWordItem(Rsc.RES_EDGE_1, Rsc.RES_EDGE_3, Rsc.RES_EDGE_4, Rsc.RES_EDGE_5, Rsc.RES_EDGE_6, Rsc.RES_EDGE_7));
		srv.addItemBox(box);

		/* 隐秘 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_STEALTH_1, Rsc.RES_STEALTH_2, R.drawable.tal);
		box.items.add(new RuneWordItem(Rsc.RES_STEALTH_1, Rsc.RES_STEALTH_3, Rsc.RES_STEALTH_4, Rsc.RES_STEALTH_5, Rsc.RES_STEALTH_6, Rsc.RES_STEALTH_7));
		srv.addItemBox(box);

		/* 力量 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_STRENGTH_1, Rsc.RES_STRENGTH_2, R.drawable.amn);
		box.items.add(new RuneWordItem(Rsc.RES_STRENGTH_1, Rsc.RES_STRENGTH_3, Rsc.RES_STRENGTH_4, Rsc.RES_STRENGTH_5, Rsc.RES_STRENGTH_6, Rsc.RES_STRENGTH_7));
		srv.addItemBox(box);

		/* 钢铁 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_STEEL_1, Rsc.RES_STEEL_2, R.drawable.tir);
		box.items.add(new RuneWordItem(Rsc.RES_STEEL_1, Rsc.RES_STEEL_3, Rsc.RES_STEEL_4, Rsc.RES_STEEL_5, Rsc.RES_STEEL_6, Rsc.RES_STEEL_7));
		srv.addItemBox(box);

		/* 天底 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_NADIR_1, Rsc.RES_NADIR_2, R.drawable.nef);
		box.items.add(new RuneWordItem(Rsc.RES_NADIR_1, Rsc.RES_NADIR_3, Rsc.RES_NADIR_4, Rsc.RES_NADIR_5, Rsc.RES_NADIR_6, Rsc.RES_NADIR_7));
		srv.addItemBox(box);

		/* 远古誓言 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ANCIENTS_PLEDGE_1, Rsc.RES_ANCIENTS_PLEDGE_2, R.drawable.ort);
		box.items.add(new RuneWordItem(Rsc.RES_ANCIENTS_PLEDGE_1, Rsc.RES_ANCIENTS_PLEDGE_3, Rsc.RES_ANCIENTS_PLEDGE_4, Rsc.RES_ANCIENTS_PLEDGE_5, Rsc.RES_ANCIENTS_PLEDGE_6, Rsc.RES_ANCIENTS_PLEDGE_7));
		srv.addItemBox(box);

		/* 和谐 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_HARMONY_1, Rsc.RES_HARMONY_2, R.drawable.ko);
		box.items.add(new RuneWordItem(Rsc.RES_HARMONY_1, Rsc.RES_HARMONY_3, Rsc.RES_HARMONY_4, Rsc.RES_HARMONY_5, Rsc.RES_HARMONY_6, Rsc.RES_HARMONY_7));
		srv.addItemBox(box);

		/* 知识 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_LORE_1, Rsc.RES_LORE_2, R.drawable.sol);
		box.items.add(new RuneWordItem(Rsc.RES_LORE_1, Rsc.RES_LORE_3, Rsc.RES_LORE_4, Rsc.RES_LORE_5, Rsc.RES_LORE_6, Rsc.RES_LORE_7));
		srv.addItemBox(box);

		/* 韵律 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_RHYME_1, Rsc.RES_RHYME_2, R.drawable.shael);
		box.items.add(new RuneWordItem(Rsc.RES_RHYME_1, Rsc.RES_RHYME_3, Rsc.RES_RHYME_4, Rsc.RES_RHYME_5, Rsc.RES_RHYME_6, Rsc.RES_RHYME_7));
		srv.addItemBox(box);

		/* 野兽 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BEAST_1, Rsc.RES_BEAST_2, R.drawable.ber);
		box.items.add(new RuneWordItem(Rsc.RES_BEAST_1, Rsc.RES_BEAST_3, Rsc.RES_BEAST_4, Rsc.RES_BEAST_5, Rsc.RES_BEAST_6, Rsc.RES_BEAST_7));
		srv.addItemBox(box);

		/* 执法者 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_LAWBRINGER_1, Rsc.RES_LAWBRINGER_2, R.drawable.lem);
		box.items.add(new RuneWordItem(Rsc.RES_LAWBRINGER_1, Rsc.RES_LAWBRINGER_3, Rsc.RES_LAWBRINGER_4, Rsc.RES_LAWBRINGER_5, Rsc.RES_LAWBRINGER_6, Rsc.RES_LAWBRINGER_7));
		srv.addItemBox(box);

		/* 石块 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_STONE_1, Rsc.RES_STONE_2, R.drawable.um);
		box.items.add(new RuneWordItem(Rsc.RES_STONE_1, Rsc.RES_STONE_3, Rsc.RES_STONE_4, Rsc.RES_STONE_5, Rsc.RES_STONE_6, Rsc.RES_STONE_7));
		srv.addItemBox(box);

		/* 迪勒瑞姆 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DELIRIUM_1, Rsc.RES_DELIRIUM_2, R.drawable.ist);
		box.items.add(new RuneWordItem(Rsc.RES_DELIRIUM_1, Rsc.RES_DELIRIUM_3, Rsc.RES_DELIRIUM_4, Rsc.RES_DELIRIUM_5, Rsc.RES_DELIRIUM_6, Rsc.RES_DELIRIUM_7));
		srv.addItemBox(box);

		/* 圣堂 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_SANCTUARY_1, Rsc.RES_SANCTUARY_2, R.drawable.mal);
		box.items.add(new RuneWordItem(Rsc.RES_SANCTUARY_1, Rsc.RES_SANCTUARY_3, Rsc.RES_SANCTUARY_4, Rsc.RES_SANCTUARY_5, Rsc.RES_SANCTUARY_6, Rsc.RES_SANCTUARY_7));
		srv.addItemBox(box);

		/* 弑君者 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_KINGSLAYER_1, Rsc.RES_KINGSLAYER_2, R.drawable.gul);
		box.items.add(new RuneWordItem(Rsc.RES_KINGSLAYER_1, Rsc.RES_KINGSLAYER_3, Rsc.RES_KINGSLAYER_4, Rsc.RES_KINGSLAYER_5, Rsc.RES_KINGSLAYER_6, Rsc.RES_KINGSLAYER_7));
		srv.addItemBox(box);

		/* 热情 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PASSION_1, Rsc.RES_PASSION_2, R.drawable.lem);
		box.items.add(new RuneWordItem(Rsc.RES_PASSION_1, Rsc.RES_PASSION_3, Rsc.RES_PASSION_4, Rsc.RES_PASSION_5, Rsc.RES_PASSION_6, Rsc.RES_PASSION_7));
		srv.addItemBox(box);

		/* 白色 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_WHITE_1, Rsc.RES_WHITE_2, R.drawable.io);
		box.items.add(new RuneWordItem(Rsc.RES_WHITE_1, Rsc.RES_WHITE_3, Rsc.RES_WHITE_4, Rsc.RES_WHITE_5, Rsc.RES_WHITE_6, Rsc.RES_WHITE_7));
		srv.addItemBox(box);

		/* 新月 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_CRESCENT_MOON_1, Rsc.RES_CRESCENT_MOON_2, R.drawable.um);
		box.items.add(new RuneWordItem(Rsc.RES_CRESCENT_MOON_1, Rsc.RES_CRESCENT_MOON_3, Rsc.RES_CRESCENT_MOON_4, Rsc.RES_CRESCENT_MOON_5, Rsc.RES_CRESCENT_MOON_6, Rsc.RES_CRESCENT_MOON_7));
		srv.addItemBox(box);

		/* 流亡 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_EXILE_1, Rsc.RES_EXILE_2, R.drawable.ohm);
		box.items.add(new RuneWordItem(Rsc.RES_EXILE_1, Rsc.RES_EXILE_3, Rsc.RES_EXILE_4, Rsc.RES_EXILE_5, Rsc.RES_EXILE_6, Rsc.RES_EXILE_7));
		srv.addItemBox(box);

		/* 骄傲 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PRIDE_1, Rsc.RES_PRIDE_2, R.drawable.cham);
		box.items.add(new RuneWordItem(Rsc.RES_PRIDE_1, Rsc.RES_PRIDE_3, Rsc.RES_PRIDE_4, Rsc.RES_PRIDE_5, Rsc.RES_PRIDE_6, Rsc.RES_PRIDE_7));
		srv.addItemBox(box);

		/* 末日 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DOOM_1, Rsc.RES_DOOM_2, R.drawable.cham);
		box.items.add(new RuneWordItem(Rsc.RES_DOOM_1, Rsc.RES_DOOM_3, Rsc.RES_DOOM_4, Rsc.RES_DOOM_5, Rsc.RES_DOOM_6, Rsc.RES_DOOM_7));
		srv.addItemBox(box);

		/* 财富 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_WEALTH_1, Rsc.RES_WEALTH_2, R.drawable.lem);
		box.items.add(new RuneWordItem(Rsc.RES_WEALTH_1, Rsc.RES_WEALTH_3, Rsc.RES_WEALTH_4, Rsc.RES_WEALTH_5, Rsc.RES_WEALTH_6, Rsc.RES_WEALTH_7));
		srv.addItemBox(box);

		/* 冰冻 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ICE_1, Rsc.RES_ICE_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_ICE_1, Rsc.RES_ICE_3, Rsc.RES_ICE_4, Rsc.RES_ICE_5, Rsc.RES_ICE_6, Rsc.RES_ICE_7));
		srv.addItemBox(box);

		/* 凤凰 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PHOENIX_1, Rsc.RES_PHOENIX_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_PHOENIX_1, Rsc.RES_PHOENIX_3, Rsc.RES_PHOENIX_4, Rsc.RES_PHOENIX_5, Rsc.RES_PHOENIX_6, Rsc.RES_PHOENIX_7));
		srv.addItemBox(box);

		/* 梦境 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DREAM_1, Rsc.RES_DREAM_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_DREAM_1, Rsc.RES_DREAM_3, Rsc.RES_DREAM_4, Rsc.RES_DREAM_5, Rsc.RES_DREAM_6, Rsc.RES_DREAM_7));
		srv.addItemBox(box);

		/* 最后希望 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_LAST_WISH_1, Rsc.RES_LAST_WISH_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_LAST_WISH_1, Rsc.RES_LAST_WISH_3, Rsc.RES_LAST_WISH_4, Rsc.RES_LAST_WISH_5, Rsc.RES_LAST_WISH_6, Rsc.RES_LAST_WISH_7));
		srv.addItemBox(box);

		/* 混沌 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_CHAOS_1, Rsc.RES_CHAOS_2, R.drawable.ohm);
		box.items.add(new RuneWordItem(Rsc.RES_CHAOS_1, Rsc.RES_CHAOS_3, Rsc.RES_CHAOS_4, Rsc.RES_CHAOS_5, Rsc.RES_CHAOS_6, Rsc.RES_CHAOS_7));
		srv.addItemBox(box);

		/* 狂暴 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_FURY_1, Rsc.RES_FURY_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_FURY_1, Rsc.RES_FURY_3, Rsc.RES_FURY_4, Rsc.RES_FURY_5, Rsc.RES_FURY_6, Rsc.RES_FURY_7));
		srv.addItemBox(box);

		/* 怨恨 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_MALICE_1, Rsc.RES_MALICE_2, R.drawable.ith);
		box.items.add(new RuneWordItem(Rsc.RES_MALICE_1, Rsc.RES_MALICE_3, Rsc.RES_MALICE_4, Rsc.RES_MALICE_5, Rsc.RES_MALICE_6, Rsc.RES_MALICE_7));
		srv.addItemBox(box);

		/* 狮心 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_LIONHEART_1, Rsc.RES_LIONHEART_2, R.drawable.fal);
		box.items.add(new RuneWordItem(Rsc.RES_LIONHEART_1, Rsc.RES_LIONHEART_3, Rsc.RES_LIONHEART_4, Rsc.RES_LIONHEART_5, Rsc.RES_LIONHEART_6, Rsc.RES_LIONHEART_7));
		srv.addItemBox(box);

		/* 灿烂 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_SPLENDOR_1, Rsc.RES_SPLENDOR_2, R.drawable.lum);
		box.items.add(new RuneWordItem(Rsc.RES_SPLENDOR_1, Rsc.RES_SPLENDOR_3, Rsc.RES_SPLENDOR_4, Rsc.RES_SPLENDOR_5, Rsc.RES_SPLENDOR_6, Rsc.RES_SPLENDOR_7));
		srv.addItemBox(box);

		/* 黑色 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BLACK_1, Rsc.RES_BLACK_2, R.drawable.io);
		box.items.add(new RuneWordItem(Rsc.RES_BLACK_1, Rsc.RES_BLACK_3, Rsc.RES_BLACK_4, Rsc.RES_BLACK_5, Rsc.RES_BLACK_6, Rsc.RES_BLACK_7));
		srv.addItemBox(box);

		/* 野蔷薇 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BRAMBLE_1, Rsc.RES_BRAMBLE_2, R.drawable.sur);
		box.items.add(new RuneWordItem(Rsc.RES_BRAMBLE_1, Rsc.RES_BRAMBLE_3, Rsc.RES_BRAMBLE_4, Rsc.RES_BRAMBLE_5, Rsc.RES_BRAMBLE_6, Rsc.RES_BRAMBLE_7));
		srv.addItemBox(box);

		/* 烙印 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BRAND_1, Rsc.RES_BRAND_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_BRAND_1, Rsc.RES_BRAND_3, Rsc.RES_BRAND_4, Rsc.RES_BRAND_5, Rsc.RES_BRAND_6, Rsc.RES_BRAND_7));
		srv.addItemBox(box);

		/* 正义之手 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_HAND_OF_JUSTICE_1, Rsc.RES_HAND_OF_JUSTICE_2, R.drawable.cham);
		box.items.add(new RuneWordItem(Rsc.RES_HAND_OF_JUSTICE_1, Rsc.RES_HAND_OF_JUSTICE_3, Rsc.RES_HAND_OF_JUSTICE_4, Rsc.RES_HAND_OF_JUSTICE_5, Rsc.RES_HAND_OF_JUSTICE_6, Rsc.RES_HAND_OF_JUSTICE_7));
		srv.addItemBox(box);

		/* 飞龙 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DRAGON_1, Rsc.RES_DRAGON_2, R.drawable.sur);
		box.items.add(new RuneWordItem(Rsc.RES_DRAGON_1, Rsc.RES_DRAGON_3, Rsc.RES_DRAGON_4, Rsc.RES_DRAGON_5, Rsc.RES_DRAGON_6, Rsc.RES_DRAGON_7));
		srv.addItemBox(box);

		/* 愤怒 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_WRATH_1, Rsc.RES_WRATH_2, R.drawable.ber);
		box.items.add(new RuneWordItem(Rsc.RES_WRATH_1, Rsc.RES_WRATH_3, Rsc.RES_WRATH_4, Rsc.RES_WRATH_5, Rsc.RES_WRATH_6, Rsc.RES_WRATH_7));
		srv.addItemBox(box);

		/* 回忆 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_MEMORY_1, Rsc.RES_MEMORY_2, R.drawable.lum);
		box.items.add(new RuneWordItem(Rsc.RES_MEMORY_1, Rsc.RES_MEMORY_3, Rsc.RES_MEMORY_4, Rsc.RES_MEMORY_5, Rsc.RES_MEMORY_6, Rsc.RES_MEMORY_7));
		srv.addItemBox(box);

		/* 寂静 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_SILENCE_1, Rsc.RES_SILENCE_2, R.drawable.vex);
		box.items.add(new RuneWordItem(Rsc.RES_SILENCE_1, Rsc.RES_SILENCE_3, Rsc.RES_SILENCE_4, Rsc.RES_SILENCE_5, Rsc.RES_SILENCE_6, Rsc.RES_SILENCE_7));
		srv.addItemBox(box);

		/* 和平 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PEACE_1, Rsc.RES_PEACE_2, R.drawable.shael);
		box.items.add(new RuneWordItem(Rsc.RES_PEACE_1, Rsc.RES_PEACE_3, Rsc.RES_PEACE_4, Rsc.RES_PEACE_5, Rsc.RES_PEACE_6, Rsc.RES_PEACE_7));
		srv.addItemBox(box);

		/* 烟尘 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_SMOKE_1, Rsc.RES_SMOKE_2, R.drawable.lum);
		box.items.add(new RuneWordItem(Rsc.RES_SMOKE_1, Rsc.RES_SMOKE_3, Rsc.RES_SMOKE_4, Rsc.RES_SMOKE_5, Rsc.RES_SMOKE_6, Rsc.RES_SMOKE_7));
		srv.addItemBox(box);

		/* 荣耀 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_HONOR_1, Rsc.RES_HONOR_2, R.drawable.sol);
		box.items.add(new RuneWordItem(Rsc.RES_HONOR_1, Rsc.RES_HONOR_3, Rsc.RES_HONOR_4, Rsc.RES_HONOR_5, Rsc.RES_HONOR_6, Rsc.RES_HONOR_7));
		srv.addItemBox(box);

		/* 叶 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_LEAF_1, Rsc.RES_LEAF_2, R.drawable.ral);
		box.items.add(new RuneWordItem(Rsc.RES_LEAF_1, Rsc.RES_LEAF_3, Rsc.RES_LEAF_4, Rsc.RES_LEAF_5, Rsc.RES_LEAF_6, Rsc.RES_LEAF_7));
		srv.addItemBox(box);

		/* 圣雷 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_HOLY_THUNDER_1, Rsc.RES_HOLY_THUNDER_2, R.drawable.ort);
		box.items.add(new RuneWordItem(Rsc.RES_HOLY_THUNDER_1, Rsc.RES_HOLY_THUNDER_3, Rsc.RES_HOLY_THUNDER_4, Rsc.RES_HOLY_THUNDER_5, Rsc.RES_HOLY_THUNDER_6, Rsc.RES_HOLY_THUNDER_7));
		srv.addItemBox(box);

		/* 和风 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ZEPHYR_1, Rsc.RES_ZEPHYR_2, R.drawable.ort);
		box.items.add(new RuneWordItem(Rsc.RES_ZEPHYR_1, Rsc.RES_ZEPHYR_3, Rsc.RES_ZEPHYR_4, Rsc.RES_ZEPHYR_5, Rsc.RES_ZEPHYR_6, Rsc.RES_ZEPHYR_7));
		srv.addItemBox(box);

		/* 慎重 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PRUDENCE_1, Rsc.RES_PRUDENCE_2, R.drawable.mal);
		box.items.add(new RuneWordItem(Rsc.RES_PRUDENCE_1, Rsc.RES_PRUDENCE_3, Rsc.RES_PRUDENCE_4, Rsc.RES_PRUDENCE_5, Rsc.RES_PRUDENCE_6, Rsc.RES_PRUDENCE_7));
		srv.addItemBox(box);

		/* 神话 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_MYTH_1, Rsc.RES_MYTH_2, R.drawable.hel);
		box.items.add(new RuneWordItem(Rsc.RES_MYTH_1, Rsc.RES_MYTH_3, Rsc.RES_MYTH_4, Rsc.RES_MYTH_5, Rsc.RES_MYTH_6, Rsc.RES_MYTH_7));
		srv.addItemBox(box);

		/* 永恒 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ETERNITY_1, Rsc.RES_ETERNITY_2, R.drawable.ber);
		box.items.add(new RuneWordItem(Rsc.RES_ETERNITY_1, Rsc.RES_ETERNITY_3, Rsc.RES_ETERNITY_4, Rsc.RES_ETERNITY_5, Rsc.RES_ETERNITY_6, Rsc.RES_ETERNITY_7));
		srv.addItemBox(box);

		/* 幽暗 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_GLOOM_1, Rsc.RES_GLOOM_2, R.drawable.um);
		box.items.add(new RuneWordItem(Rsc.RES_GLOOM_1, Rsc.RES_GLOOM_3, Rsc.RES_GLOOM_4, Rsc.RES_GLOOM_5, Rsc.RES_GLOOM_6, Rsc.RES_GLOOM_7));
		srv.addItemBox(box);

		/* 白骨 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_BONE_1, Rsc.RES_BONE_2, R.drawable.um);
		box.items.add(new RuneWordItem(Rsc.RES_BONE_1, Rsc.RES_BONE_3, Rsc.RES_BONE_4, Rsc.RES_BONE_5, Rsc.RES_BONE_6, Rsc.RES_BONE_7));
		srv.addItemBox(box);

		/* 国王之恩典 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_KINGS_GRACE_1, Rsc.RES_KINGS_GRACE_2, R.drawable.amn);
		box.items.add(new RuneWordItem(Rsc.RES_KINGS_GRACE_1, Rsc.RES_KINGS_GRACE_3, Rsc.RES_KINGS_GRACE_4, Rsc.RES_KINGS_GRACE_5, Rsc.RES_KINGS_GRACE_6, Rsc.RES_KINGS_GRACE_7));
		srv.addItemBox(box);

		/* 原则 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_PRINCIPLE_1, Rsc.RES_PRINCIPLE_2, R.drawable.gul);
		box.items.add(new RuneWordItem(Rsc.RES_PRINCIPLE_1, Rsc.RES_PRINCIPLE_3, Rsc.RES_PRINCIPLE_4, Rsc.RES_PRINCIPLE_5, Rsc.RES_PRINCIPLE_6, Rsc.RES_PRINCIPLE_7));
		srv.addItemBox(box);

		/* 雨 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_RAIN_1, Rsc.RES_RAIN_2, R.drawable.mal);
		box.items.add(new RuneWordItem(Rsc.RES_RAIN_1, Rsc.RES_RAIN_3, Rsc.RES_RAIN_4, Rsc.RES_RAIN_5, Rsc.RES_RAIN_6, Rsc.RES_RAIN_7));
		srv.addItemBox(box);

		/* 启迪 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_ENLIGHTENMENT_1, Rsc.RES_ENLIGHTENMENT_2, R.drawable.pul);
		box.items.add(new RuneWordItem(Rsc.RES_ENLIGHTENMENT_1, Rsc.RES_ENLIGHTENMENT_3, Rsc.RES_ENLIGHTENMENT_4, Rsc.RES_ENLIGHTENMENT_5, Rsc.RES_ENLIGHTENMENT_6, Rsc.RES_ENLIGHTENMENT_7));
		srv.addItemBox(box);

		/* 轻风 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_WIND_1, Rsc.RES_WIND_2, R.drawable.sur);
		box.items.add(new RuneWordItem(Rsc.RES_WIND_1, Rsc.RES_WIND_3, Rsc.RES_WIND_4, Rsc.RES_WIND_5, Rsc.RES_WIND_6, Rsc.RES_WIND_7));
		srv.addItemBox(box);

		/* 思考之声 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_VOICE_OF_REASON_1, Rsc.RES_VOICE_OF_REASON_2, R.drawable.lem);
		box.items.add(new RuneWordItem(Rsc.RES_VOICE_OF_REASON_1, Rsc.RES_VOICE_OF_REASON_3, Rsc.RES_VOICE_OF_REASON_4, Rsc.RES_VOICE_OF_REASON_5, Rsc.RES_VOICE_OF_REASON_6, Rsc.RES_VOICE_OF_REASON_7));
		srv.addItemBox(box);

		/* 裂缝 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_RIFT_1, Rsc.RES_RIFT_2, R.drawable.gul);
		box.items.add(new RuneWordItem(Rsc.RES_RIFT_1, Rsc.RES_RIFT_3, Rsc.RES_RIFT_4, Rsc.RES_RIFT_5, Rsc.RES_RIFT_6, Rsc.RES_RIFT_7));
		srv.addItemBox(box);

		/* 光辉 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_RADIANCE_1, Rsc.RES_RADIANCE_2, R.drawable.sol);
		box.items.add(new RuneWordItem(Rsc.RES_RADIANCE_1, Rsc.RES_RADIANCE_3, Rsc.RES_RADIANCE_4, Rsc.RES_RADIANCE_5, Rsc.RES_RADIANCE_6, Rsc.RES_RADIANCE_7));
		srv.addItemBox(box);

		/* 毒液 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_VENOM_1, Rsc.RES_VENOM_2, R.drawable.mal);
		box.items.add(new RuneWordItem(Rsc.RES_VENOM_1, Rsc.RES_VENOM_3, Rsc.RES_VENOM_4, Rsc.RES_VENOM_5, Rsc.RES_VENOM_6, Rsc.RES_VENOM_7));
		srv.addItemBox(box);

		/* 优雅旋律 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_MELODY_1, Rsc.RES_MELODY_2, R.drawable.ko);
		box.items.add(new RuneWordItem(Rsc.RES_MELODY_1, Rsc.RES_MELODY_3, Rsc.RES_MELODY_4, Rsc.RES_MELODY_5, Rsc.RES_MELODY_6, Rsc.RES_MELODY_7));
		srv.addItemBox(box);

		/* 饥荒 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_FAMINE_1, Rsc.RES_FAMINE_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_FAMINE_1, Rsc.RES_FAMINE_3, Rsc.RES_FAMINE_4, Rsc.RES_FAMINE_5, Rsc.RES_FAMINE_6, Rsc.RES_FAMINE_7));
		srv.addItemBox(box);

		/* 毁灭 */
		box = new RuneWordItemBox();
		box.category = new RuneWordCategory(Rsc.RES_DESTRUCTION_1, Rsc.RES_DESTRUCTION_2, R.drawable.jah);
		box.items.add(new RuneWordItem(Rsc.RES_DESTRUCTION_1, Rsc.RES_DESTRUCTION_3, Rsc.RES_DESTRUCTION_4, Rsc.RES_DESTRUCTION_5, Rsc.RES_DESTRUCTION_6, Rsc.RES_DESTRUCTION_7));
		srv.addItemBox(box);

	}
}
