package cains.note.data.gold;

import cains.note.view.R;
import cains.note.service.gold.GoldItem;
import cains.note.service.gold.GoldItemBox;
import cains.note.service.gold.GoldItemCategory;
import cains.note.service.gold.GoldItemService;

public class GoldData3
{
	private GoldData3()
	{
	}

	public static void generate(GoldItemService srv)
	{
		GoldItemBox box = new GoldItemBox();
		box.category = new GoldItemCategory("ass", "刺客专用装备", R.drawable.ass);


		/* 巴特克的猛击 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_BARTUCS_CUT_THROAT_1,Rsc3.RES_BARTUCS_CUT_THROAT_2,Rsc3.RES_BARTUCS_CUT_THROAT_3,Rsc3.RES_BARTUCS_CUT_THROAT_4,Rsc3.RES_BARTUCS_CUT_THROAT_5,Rsc3.RES_BARTUCS_CUT_THROAT_6,Rsc3.RES_BARTUCS_CUT_THROAT_7));
		/* 碧玉爪 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_JADE_TALON_1,Rsc3.RES_JADE_TALON_2,Rsc3.RES_JADE_TALON_3,Rsc3.RES_JADE_TALON_4,Rsc3.RES_JADE_TALON_5,Rsc3.RES_JADE_TALON_6,Rsc3.RES_JADE_TALON_7));
		/* 影杀者 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_SHADOW_KILLER_1,Rsc3.RES_SHADOW_KILLER_2,Rsc3.RES_SHADOW_KILLER_3,Rsc3.RES_SHADOW_KILLER_4,Rsc3.RES_SHADOW_KILLER_5,Rsc3.RES_SHADOW_KILLER_6,Rsc3.RES_SHADOW_KILLER_7));
		/* 火蜥蜴之爪 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_FIRELIZARDS_TALONS_1,Rsc3.RES_FIRELIZARDS_TALONS_2,Rsc3.RES_FIRELIZARDS_TALONS_3,Rsc3.RES_FIRELIZARDS_TALONS_4,Rsc3.RES_FIRELIZARDS_TALONS_5,Rsc3.RES_FIRELIZARDS_TALONS_6,Rsc3.RES_FIRELIZARDS_TALONS_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("dru", "德鲁伊专用装备", R.drawable.dru);


		/* 加尔的长发 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_JALALS_MANE_1,Rsc3.RES_JALALS_MANE_2,Rsc3.RES_JALALS_MANE_3,Rsc3.RES_JALALS_MANE_4,Rsc3.RES_JALALS_MANE_5,Rsc3.RES_JALALS_MANE_6,Rsc3.RES_JALALS_MANE_7));
		/* 地狱之吻 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_CEREBUS_BITE_1,Rsc3.RES_CEREBUS_BITE_2,Rsc3.RES_CEREBUS_BITE_3,Rsc3.RES_CEREBUS_BITE_4,Rsc3.RES_CEREBUS_BITE_5,Rsc3.RES_CEREBUS_BITE_6,Rsc3.RES_CEREBUS_BITE_7));
		/* 灵魂看守者 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_SPIRIT_KEEPER_1,Rsc3.RES_SPIRIT_KEEPER_2,Rsc3.RES_SPIRIT_KEEPER_3,Rsc3.RES_SPIRIT_KEEPER_4,Rsc3.RES_SPIRIT_KEEPER_5,Rsc3.RES_SPIRIT_KEEPER_6,Rsc3.RES_SPIRIT_KEEPER_7));
		/* 乌鸦之王 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_RAVENLORE_1,Rsc3.RES_RAVENLORE_2,Rsc3.RES_RAVENLORE_3,Rsc3.RES_RAVENLORE_4,Rsc3.RES_RAVENLORE_5,Rsc3.RES_RAVENLORE_6,Rsc3.RES_RAVENLORE_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("nec", "死灵法师专用装备", R.drawable.nec);


		/* 侏儒 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_HOMUNCULUS_1,Rsc3.RES_HOMUNCULUS_2,Rsc3.RES_HOMUNCULUS_3,Rsc3.RES_HOMUNCULUS_4,Rsc3.RES_HOMUNCULUS_5,Rsc3.RES_HOMUNCULUS_6,Rsc3.RES_HOMUNCULUS_7));
		/* 骨焰 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_BONEFLAME_1,Rsc3.RES_BONEFLAME_2,Rsc3.RES_BONEFLAME_3,Rsc3.RES_BONEFLAME_4,Rsc3.RES_BONEFLAME_5,Rsc3.RES_BONEFLAME_6,Rsc3.RES_BONEFLAME_7));
		/* 魔力重生 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_DARKFORCE_SPAWN_1,Rsc3.RES_DARKFORCE_SPAWN_2,Rsc3.RES_DARKFORCE_SPAWN_3,Rsc3.RES_DARKFORCE_SPAWN_4,Rsc3.RES_DARKFORCE_SPAWN_5,Rsc3.RES_DARKFORCE_SPAWN_6,Rsc3.RES_DARKFORCE_SPAWN_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("sor", "女巫专用装备", R.drawable.sor);


		/* 眼球 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_THE_OCULUS_1,Rsc3.RES_THE_OCULUS_2,Rsc3.RES_THE_OCULUS_3,Rsc3.RES_THE_OCULUS_4,Rsc3.RES_THE_OCULUS_5,Rsc3.RES_THE_OCULUS_6,Rsc3.RES_THE_OCULUS_7));
		/* 艾丝屈塔的脾气 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_ESCHUTAS_TEMPER_1,Rsc3.RES_ESCHUTAS_TEMPER_2,Rsc3.RES_ESCHUTAS_TEMPER_3,Rsc3.RES_ESCHUTAS_TEMPER_4,Rsc3.RES_ESCHUTAS_TEMPER_5,Rsc3.RES_ESCHUTAS_TEMPER_6,Rsc3.RES_ESCHUTAS_TEMPER_7));
		/* 死亡深度 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_DEATHS_FATHOM_1,Rsc3.RES_DEATHS_FATHOM_2,Rsc3.RES_DEATHS_FATHOM_3,Rsc3.RES_DEATHS_FATHOM_4,Rsc3.RES_DEATHS_FATHOM_5,Rsc3.RES_DEATHS_FATHOM_6,Rsc3.RES_DEATHS_FATHOM_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("ama", "亚玛逊专用装备", R.drawable.ama);


		/* 雷山德的指标 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_LYCANDERS_AIM_1,Rsc3.RES_LYCANDERS_AIM_2,Rsc3.RES_LYCANDERS_AIM_3,Rsc3.RES_LYCANDERS_AIM_4,Rsc3.RES_LYCANDERS_AIM_5,Rsc3.RES_LYCANDERS_AIM_6,Rsc3.RES_LYCANDERS_AIM_7));
		/* 血乌的袭击 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_BLOOD_RAVENS_CHARGE_1,Rsc3.RES_BLOOD_RAVENS_CHARGE_2,Rsc3.RES_BLOOD_RAVENS_CHARGE_3,Rsc3.RES_BLOOD_RAVENS_CHARGE_4,Rsc3.RES_BLOOD_RAVENS_CHARGE_5,Rsc3.RES_BLOOD_RAVENS_CHARGE_6,Rsc3.RES_BLOOD_RAVENS_CHARGE_7));
		/* 雷山德的侧腹 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_LYCANDERS_FLANK_1,Rsc3.RES_LYCANDERS_FLANK_2,Rsc3.RES_LYCANDERS_FLANK_3,Rsc3.RES_LYCANDERS_FLANK_4,Rsc3.RES_LYCANDERS_FLANK_5,Rsc3.RES_LYCANDERS_FLANK_6,Rsc3.RES_LYCANDERS_FLANK_7));
		/* 石乌鸦 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_STONERAVEN_1,Rsc3.RES_STONERAVEN_2,Rsc3.RES_STONERAVEN_3,Rsc3.RES_STONERAVEN_4,Rsc3.RES_STONERAVEN_5,Rsc3.RES_STONERAVEN_6,Rsc3.RES_STONERAVEN_7));
		/* 泰坦的复仇 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_TITANS_REVENGE_1,Rsc3.RES_TITANS_REVENGE_2,Rsc3.RES_TITANS_REVENGE_3,Rsc3.RES_TITANS_REVENGE_4,Rsc3.RES_TITANS_REVENGE_5,Rsc3.RES_TITANS_REVENGE_6,Rsc3.RES_TITANS_REVENGE_7));
		/* 雷击 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_THUNDERSTROKE_1,Rsc3.RES_THUNDERSTROKE_2,Rsc3.RES_THUNDERSTROKE_3,Rsc3.RES_THUNDERSTROKE_4,Rsc3.RES_THUNDERSTROKE_5,Rsc3.RES_THUNDERSTROKE_6,Rsc3.RES_THUNDERSTROKE_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("bar", "野蛮人专用装备", R.drawable.bar);


		/* 亚瑞特的面容 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_ARREATS_FACE_1,Rsc3.RES_ARREATS_FACE_2,Rsc3.RES_ARREATS_FACE_3,Rsc3.RES_ARREATS_FACE_4,Rsc3.RES_ARREATS_FACE_5,Rsc3.RES_ARREATS_FACE_6,Rsc3.RES_ARREATS_FACE_7));
		/* 狼嚎 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_WOLFHOWL_1,Rsc3.RES_WOLFHOWL_2,Rsc3.RES_WOLFHOWL_3,Rsc3.RES_WOLFHOWL_4,Rsc3.RES_WOLFHOWL_5,Rsc3.RES_WOLFHOWL_6,Rsc3.RES_WOLFHOWL_7));
		/* 恶魔号角的边缘 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_DEMONHORNS_EDGE_1,Rsc3.RES_DEMONHORNS_EDGE_2,Rsc3.RES_DEMONHORNS_EDGE_3,Rsc3.RES_DEMONHORNS_EDGE_4,Rsc3.RES_DEMONHORNS_EDGE_5,Rsc3.RES_DEMONHORNS_EDGE_6,Rsc3.RES_DEMONHORNS_EDGE_7));
		/* 海拉伯得的国度 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_HALABERDS_REIGN_1,Rsc3.RES_HALABERDS_REIGN_2,Rsc3.RES_HALABERDS_REIGN_3,Rsc3.RES_HALABERDS_REIGN_4,Rsc3.RES_HALABERDS_REIGN_5,Rsc3.RES_HALABERDS_REIGN_6,Rsc3.RES_HALABERDS_REIGN_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("pal", "圣骑士专用装备", R.drawable.pal);


		/* 撒卡兰姆使者 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_HERALD_OF_ZAKARUM_1,Rsc3.RES_HERALD_OF_ZAKARUM_2,Rsc3.RES_HERALD_OF_ZAKARUM_3,Rsc3.RES_HERALD_OF_ZAKARUM_4,Rsc3.RES_HERALD_OF_ZAKARUM_5,Rsc3.RES_HERALD_OF_ZAKARUM_6,Rsc3.RES_HERALD_OF_ZAKARUM_7));
		/* 阿而玛-尼格拉 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_ALMA_NEGRA_1,Rsc3.RES_ALMA_NEGRA_2,Rsc3.RES_ALMA_NEGRA_3,Rsc3.RES_ALMA_NEGRA_4,Rsc3.RES_ALMA_NEGRA_5,Rsc3.RES_ALMA_NEGRA_6,Rsc3.RES_ALMA_NEGRA_7));
		/* 龙鳞 */
		box.items.add(new GoldItem(box.category.id, Rsc3.RES_DRAGONSCALE_1,Rsc3.RES_DRAGONSCALE_2,Rsc3.RES_DRAGONSCALE_3,Rsc3.RES_DRAGONSCALE_4,Rsc3.RES_DRAGONSCALE_5,Rsc3.RES_DRAGONSCALE_6,Rsc3.RES_DRAGONSCALE_7));

		srv.addItemBox(box);

	}
}
