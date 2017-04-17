package cains.note.data.monster;

import cains.note.service.monster.*;
import cains.note.view.R;

public final class MonsterData
{
	private MonsterData()
	{
	}

	public static void generate(MonsterService srv)
	{
		MonsterBox box = new MonsterBox();
		box.category = new MonsterCategory("episode1", "第一幕\r\n修女的悲恸", R.drawable.episode1);
		/* 尸体发火(corpsefire) */
		box.items.add(new Monster(box.category.id, Rsc.RES_CORPSEFIRE_1, Rsc.RES_CORPSEFIRE_2, Rsc.RES_CORPSEFIRE_3, Rsc.RES_CORPSEFIRE_4, Rsc.RES_CORPSEFIRE_5, Rsc.RES_CORPSEFIRE_6, Rsc.RES_CORPSEFIRE_7, Rsc.RES_CORPSEFIRE_8, Rsc.RES_CORPSEFIRE_9, Rsc.RES_CORPSEFIRE_10, Rsc.RES_CORPSEFIRE_11, Rsc.RES_CORPSEFIRE_12, Rsc.RES_CORPSEFIRE_13));
		/* 毕须博须(Bishibosh) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BISHIBOSH_1, Rsc.RES_BISHIBOSH_2, Rsc.RES_BISHIBOSH_3, Rsc.RES_BISHIBOSH_4, Rsc.RES_BISHIBOSH_5, Rsc.RES_BISHIBOSH_6, Rsc.RES_BISHIBOSH_7, Rsc.RES_BISHIBOSH_8, Rsc.RES_BISHIBOSH_9, Rsc.RES_BISHIBOSH_10, Rsc.RES_BISHIBOSH_11, Rsc.RES_BISHIBOSH_12, Rsc.RES_BISHIBOSH_13));
		/* 血鸟(BloodRaven) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BLOOD_RAVEN_1, Rsc.RES_BLOOD_RAVEN_2, Rsc.RES_BLOOD_RAVEN_3, Rsc.RES_BLOOD_RAVEN_4, Rsc.RES_BLOOD_RAVEN_5, Rsc.RES_BLOOD_RAVEN_6, Rsc.RES_BLOOD_RAVEN_7, Rsc.RES_BLOOD_RAVEN_8, Rsc.RES_BLOOD_RAVEN_9, Rsc.RES_BLOOD_RAVEN_10, Rsc.RES_BLOOD_RAVEN_11, Rsc.RES_BLOOD_RAVEN_12, Rsc.RES_BLOOD_RAVEN_13));
		/* 碎骨者(Bonebreaker) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BONEBREAKER_1, Rsc.RES_BONEBREAKER_2, Rsc.RES_BONEBREAKER_3, Rsc.RES_BONEBREAKER_4, Rsc.RES_BONEBREAKER_5, Rsc.RES_BONEBREAKER_6, Rsc.RES_BONEBREAKER_7, Rsc.RES_BONEBREAKER_8, Rsc.RES_BONEBREAKER_9, Rsc.RES_BONEBREAKER_10, Rsc.RES_BONEBREAKER_11, Rsc.RES_BONEBREAKER_12, Rsc.RES_BONEBREAKER_13));
		/* 冰冷乌鸦(Coldcrow) */
		box.items.add(new Monster(box.category.id, Rsc.RES_COLDCROW_1, Rsc.RES_COLDCROW_2, Rsc.RES_COLDCROW_3, Rsc.RES_COLDCROW_4, Rsc.RES_COLDCROW_5, Rsc.RES_COLDCROW_6, Rsc.RES_COLDCROW_7, Rsc.RES_COLDCROW_8, Rsc.RES_COLDCROW_9, Rsc.RES_COLDCROW_10, Rsc.RES_COLDCROW_11, Rsc.RES_COLDCROW_12, Rsc.RES_COLDCROW_13));
		/* 拉卡尼休(Rakanishu) */
		box.items.add(new Monster(box.category.id, Rsc.RES_RAKANISHU_1, Rsc.RES_RAKANISHU_2, Rsc.RES_RAKANISHU_3, Rsc.RES_RAKANISHU_4, Rsc.RES_RAKANISHU_5, Rsc.RES_RAKANISHU_6, Rsc.RES_RAKANISHU_7, Rsc.RES_RAKANISHU_8, Rsc.RES_RAKANISHU_9, Rsc.RES_RAKANISHU_10, Rsc.RES_RAKANISHU_11, Rsc.RES_RAKANISHU_12, Rsc.RES_RAKANISHU_13));
		/* 树头木拳(TreeheadWoodfist) */
		box.items.add(new Monster(box.category.id, Rsc.RES_TREEHEAD_WOODFIST_1, Rsc.RES_TREEHEAD_WOODFIST_2, Rsc.RES_TREEHEAD_WOODFIST_3, Rsc.RES_TREEHEAD_WOODFIST_4, Rsc.RES_TREEHEAD_WOODFIST_5, Rsc.RES_TREEHEAD_WOODFIST_6, Rsc.RES_TREEHEAD_WOODFIST_7, Rsc.RES_TREEHEAD_WOODFIST_8, Rsc.RES_TREEHEAD_WOODFIST_9, Rsc.RES_TREEHEAD_WOODFIST_10, Rsc.RES_TREEHEAD_WOODFIST_11, Rsc.RES_TREEHEAD_WOODFIST_12, Rsc.RES_TREEHEAD_WOODFIST_13));
		/* 格瑞斯华尔德(Griswold) */
		box.items.add(new Monster(box.category.id, Rsc.RES_GRISWOLD_1, Rsc.RES_GRISWOLD_2, Rsc.RES_GRISWOLD_3, Rsc.RES_GRISWOLD_4, Rsc.RES_GRISWOLD_5, Rsc.RES_GRISWOLD_6, Rsc.RES_GRISWOLD_7, Rsc.RES_GRISWOLD_8, Rsc.RES_GRISWOLD_9, Rsc.RES_GRISWOLD_10, Rsc.RES_GRISWOLD_11, Rsc.RES_GRISWOLD_12, Rsc.RES_GRISWOLD_13));
		/* 女伯爵(TheCountess) */
		box.items.add(new Monster(box.category.id, Rsc.RES_THE_COUNTESS_1, Rsc.RES_THE_COUNTESS_2, Rsc.RES_THE_COUNTESS_3, Rsc.RES_THE_COUNTESS_4, Rsc.RES_THE_COUNTESS_5, Rsc.RES_THE_COUNTESS_6, Rsc.RES_THE_COUNTESS_7, Rsc.RES_THE_COUNTESS_8, Rsc.RES_THE_COUNTESS_9, Rsc.RES_THE_COUNTESS_10, Rsc.RES_THE_COUNTESS_11, Rsc.RES_THE_COUNTESS_12, Rsc.RES_THE_COUNTESS_13));
		/* 洞穴重生的邪恶之犬(PitspawnFouldog) */
		box.items.add(new Monster(box.category.id, Rsc.RES_PITSPAWN_FOULDOG_1, Rsc.RES_PITSPAWN_FOULDOG_2, Rsc.RES_PITSPAWN_FOULDOG_3, Rsc.RES_PITSPAWN_FOULDOG_4, Rsc.RES_PITSPAWN_FOULDOG_5, Rsc.RES_PITSPAWN_FOULDOG_6, Rsc.RES_PITSPAWN_FOULDOG_7, Rsc.RES_PITSPAWN_FOULDOG_8, Rsc.RES_PITSPAWN_FOULDOG_9, Rsc.RES_PITSPAWN_FOULDOG_10, Rsc.RES_PITSPAWN_FOULDOG_11, Rsc.RES_PITSPAWN_FOULDOG_12, Rsc.RES_PITSPAWN_FOULDOG_13));
		/* 骨灰(BoneAsh) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BONE_ASH_1, Rsc.RES_BONE_ASH_2, Rsc.RES_BONE_ASH_3, Rsc.RES_BONE_ASH_4, Rsc.RES_BONE_ASH_5, Rsc.RES_BONE_ASH_6, Rsc.RES_BONE_ASH_7, Rsc.RES_BONE_ASH_8, Rsc.RES_BONE_ASH_9, Rsc.RES_BONE_ASH_10, Rsc.RES_BONE_ASH_11, Rsc.RES_BONE_ASH_12, Rsc.RES_BONE_ASH_13));
		/* 铁匠(TheSmith) */
		box.items.add(new Monster(box.category.id, Rsc.RES_THE_SMITH_1, Rsc.RES_THE_SMITH_2, Rsc.RES_THE_SMITH_3, Rsc.RES_THE_SMITH_4, Rsc.RES_THE_SMITH_5, Rsc.RES_THE_SMITH_6, Rsc.RES_THE_SMITH_7, Rsc.RES_THE_SMITH_8, Rsc.RES_THE_SMITH_9, Rsc.RES_THE_SMITH_10, Rsc.RES_THE_SMITH_11, Rsc.RES_THE_SMITH_12, Rsc.RES_THE_SMITH_13));
		/* 母牛之王(TheCowKing) */
		box.items.add(new Monster(box.category.id, Rsc.RES_THE_COW_KING_1, Rsc.RES_THE_COW_KING_2, Rsc.RES_THE_COW_KING_3, Rsc.RES_THE_COW_KING_4, Rsc.RES_THE_COW_KING_5, Rsc.RES_THE_COW_KING_6, Rsc.RES_THE_COW_KING_7, Rsc.RES_THE_COW_KING_8, Rsc.RES_THE_COW_KING_9, Rsc.RES_THE_COW_KING_10, Rsc.RES_THE_COW_KING_11, Rsc.RES_THE_COW_KING_12, Rsc.RES_THE_COW_KING_13));
		/* 安达利尔(Andariel) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ANDARIEL_1, Rsc.RES_ANDARIEL_2, Rsc.RES_ANDARIEL_3, Rsc.RES_ANDARIEL_4, Rsc.RES_ANDARIEL_5, Rsc.RES_ANDARIEL_6, Rsc.RES_ANDARIEL_7, Rsc.RES_ANDARIEL_8, Rsc.RES_ANDARIEL_9, Rsc.RES_ANDARIEL_10, Rsc.RES_ANDARIEL_11, Rsc.RES_ANDARIEL_12, Rsc.RES_ANDARIEL_13));
		srv.addItemBox(box);

		box = new MonsterBox();
		box.category = new MonsterCategory("episode2", "第二幕\r\n沙漠的旅程", R.drawable.episode2);
		/* 罗达门特(Radament) */
		box.items.add(new Monster(box.category.id, Rsc.RES_RADAMENT_1, Rsc.RES_RADAMENT_2, Rsc.RES_RADAMENT_3, Rsc.RES_RADAMENT_4, Rsc.RES_RADAMENT_5, Rsc.RES_RADAMENT_6, Rsc.RES_RADAMENT_7, Rsc.RES_RADAMENT_8, Rsc.RES_RADAMENT_9, Rsc.RES_RADAMENT_10, Rsc.RES_RADAMENT_11, Rsc.RES_RADAMENT_12, Rsc.RES_RADAMENT_13));
		/* 爬行容貌(CreepingFeature) */
		box.items.add(new Monster(box.category.id, Rsc.RES_CREEPING_FEATURE_1, Rsc.RES_CREEPING_FEATURE_2, Rsc.RES_CREEPING_FEATURE_3, Rsc.RES_CREEPING_FEATURE_4, Rsc.RES_CREEPING_FEATURE_5, Rsc.RES_CREEPING_FEATURE_6, Rsc.RES_CREEPING_FEATURE_7, Rsc.RES_CREEPING_FEATURE_8, Rsc.RES_CREEPING_FEATURE_9, Rsc.RES_CREEPING_FEATURE_10, Rsc.RES_CREEPING_FEATURE_11, Rsc.RES_CREEPING_FEATURE_12, Rsc.RES_CREEPING_FEATURE_13));
		/* 疯狂血腥女巫(BloodWitchTheWild) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BLOOD_WITCH_THE_WILD_1, Rsc.RES_BLOOD_WITCH_THE_WILD_2, Rsc.RES_BLOOD_WITCH_THE_WILD_3, Rsc.RES_BLOOD_WITCH_THE_WILD_4, Rsc.RES_BLOOD_WITCH_THE_WILD_5, Rsc.RES_BLOOD_WITCH_THE_WILD_6, Rsc.RES_BLOOD_WITCH_THE_WILD_7, Rsc.RES_BLOOD_WITCH_THE_WILD_8, Rsc.RES_BLOOD_WITCH_THE_WILD_9, Rsc.RES_BLOOD_WITCH_THE_WILD_10, Rsc.RES_BLOOD_WITCH_THE_WILD_11, Rsc.RES_BLOOD_WITCH_THE_WILD_12, Rsc.RES_BLOOD_WITCH_THE_WILD_13));
		/* 爆开的甲虫(Beetleburst) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BEETLEBURST_1, Rsc.RES_BEETLEBURST_2, Rsc.RES_BEETLEBURST_3, Rsc.RES_BEETLEBURST_4, Rsc.RES_BEETLEBURST_5, Rsc.RES_BEETLEBURST_6, Rsc.RES_BEETLEBURST_7, Rsc.RES_BEETLEBURST_8, Rsc.RES_BEETLEBURST_9, Rsc.RES_BEETLEBURST_10, Rsc.RES_BEETLEBURST_11, Rsc.RES_BEETLEBURST_12, Rsc.RES_BEETLEBURST_13));
		/* 钻地的冰虫(ColdwormTheBurrower) */
		box.items.add(new Monster(box.category.id, Rsc.RES_COLDWORM_THE_BURROWER_1, Rsc.RES_COLDWORM_THE_BURROWER_2, Rsc.RES_COLDWORM_THE_BURROWER_3, Rsc.RES_COLDWORM_THE_BURROWER_4, Rsc.RES_COLDWORM_THE_BURROWER_5, Rsc.RES_COLDWORM_THE_BURROWER_6, Rsc.RES_COLDWORM_THE_BURROWER_7, Rsc.RES_COLDWORM_THE_BURROWER_8, Rsc.RES_COLDWORM_THE_BURROWER_9, Rsc.RES_COLDWORM_THE_BURROWER_10, Rsc.RES_COLDWORM_THE_BURROWER_11, Rsc.RES_COLDWORM_THE_BURROWER_12, Rsc.RES_COLDWORM_THE_BURROWER_13));
		/* 黑暗长老(DarkElder) */
		box.items.add(new Monster(box.category.id, Rsc.RES_DARK_ELDER_1, Rsc.RES_DARK_ELDER_2, Rsc.RES_DARK_ELDER_3, Rsc.RES_DARK_ELDER_4, Rsc.RES_DARK_ELDER_5, Rsc.RES_DARK_ELDER_6, Rsc.RES_DARK_ELDER_7, Rsc.RES_DARK_ELDER_8, Rsc.RES_DARK_ELDER_9, Rsc.RES_DARK_ELDER_10, Rsc.RES_DARK_ELDER_11, Rsc.RES_DARK_ELDER_12, Rsc.RES_DARK_ELDER_13));
		/* 牙皮(Fangskin) */
		box.items.add(new Monster(box.category.id, Rsc.RES_FANGSKIN_1, Rsc.RES_FANGSKIN_2, Rsc.RES_FANGSKIN_3, Rsc.RES_FANGSKIN_4, Rsc.RES_FANGSKIN_5, Rsc.RES_FANGSKIN_6, Rsc.RES_FANGSKIN_7, Rsc.RES_FANGSKIN_8, Rsc.RES_FANGSKIN_9, Rsc.RES_FANGSKIN_10, Rsc.RES_FANGSKIN_11, Rsc.RES_FANGSKIN_12, Rsc.RES_FANGSKIN_13));
		/* 火之眼(FireEye) */
		box.items.add(new Monster(box.category.id, Rsc.RES_FIRE_EYE_1, Rsc.RES_FIRE_EYE_2, Rsc.RES_FIRE_EYE_3, Rsc.RES_FIRE_EYE_4, Rsc.RES_FIRE_EYE_5, Rsc.RES_FIRE_EYE_6, Rsc.RES_FIRE_EYE_7, Rsc.RES_FIRE_EYE_8, Rsc.RES_FIRE_EYE_9, Rsc.RES_FIRE_EYE_10, Rsc.RES_FIRE_EYE_11, Rsc.RES_FIRE_EYE_12, Rsc.RES_FIRE_EYE_13));
		/* 召唤者(Summoner) */
		box.items.add(new Monster(box.category.id, Rsc.RES_SUMMONER_1, Rsc.RES_SUMMONER_2, Rsc.RES_SUMMONER_3, Rsc.RES_SUMMONER_4, Rsc.RES_SUMMONER_5, Rsc.RES_SUMMONER_6, Rsc.RES_SUMMONER_7, Rsc.RES_SUMMONER_8, Rsc.RES_SUMMONER_9, Rsc.RES_SUMMONER_10, Rsc.RES_SUMMONER_11, Rsc.RES_SUMMONER_12, Rsc.RES_SUMMONER_13));
		/* 古代无魂之卡(AncientKaaTheSoulless) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_1, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_2, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_3, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_4, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_5, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_6, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_7, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_8, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_9, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_10, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_11, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_12, Rsc.RES_ANCIENT_KAA_THE_SOULLESS_13));
		/* 都瑞尔(Duriel) */
		box.items.add(new Monster(box.category.id, Rsc.RES_DURIEL_1, Rsc.RES_DURIEL_2, Rsc.RES_DURIEL_3, Rsc.RES_DURIEL_4, Rsc.RES_DURIEL_5, Rsc.RES_DURIEL_6, Rsc.RES_DURIEL_7, Rsc.RES_DURIEL_8, Rsc.RES_DURIEL_9, Rsc.RES_DURIEL_10, Rsc.RES_DURIEL_11, Rsc.RES_DURIEL_12, Rsc.RES_DURIEL_13));
		srv.addItemBox(box);

		box = new MonsterBox();
		box.category = new MonsterCategory("episode3", "第三幕\r\n墨菲斯托的丛林", R.drawable.episode3);
		/* 燃烧者-韦布(Sszark The Burning) */
		box.items.add(new Monster(box.category.id, Rsc.RES_SSZARK_THE_BURNING_1, Rsc.RES_SSZARK_THE_BURNING_2, Rsc.RES_SSZARK_THE_BURNING_3, Rsc.RES_SSZARK_THE_BURNING_4, Rsc.RES_SSZARK_THE_BURNING_5, Rsc.RES_SSZARK_THE_BURNING_6, Rsc.RES_SSZARK_THE_BURNING_7, Rsc.RES_SSZARK_THE_BURNING_8, Rsc.RES_SSZARK_THE_BURNING_9, Rsc.RES_SSZARK_THE_BURNING_10, Rsc.RES_SSZARK_THE_BURNING_11, Rsc.RES_SSZARK_THE_BURNING_12, Rsc.RES_SSZARK_THE_BURNING_13));
		/* 古巫医-印都(Witch Doctor Endugu) */
		box.items.add(new Monster(box.category.id, Rsc.RES_WITCH_DOCTOR_ENDUGU_1, Rsc.RES_WITCH_DOCTOR_ENDUGU_2, Rsc.RES_WITCH_DOCTOR_ENDUGU_3, Rsc.RES_WITCH_DOCTOR_ENDUGU_4, Rsc.RES_WITCH_DOCTOR_ENDUGU_5, Rsc.RES_WITCH_DOCTOR_ENDUGU_6, Rsc.RES_WITCH_DOCTOR_ENDUGU_7, Rsc.RES_WITCH_DOCTOR_ENDUGU_8, Rsc.RES_WITCH_DOCTOR_ENDUGU_9, Rsc.RES_WITCH_DOCTOR_ENDUGU_10, Rsc.RES_WITCH_DOCTOR_ENDUGU_11, Rsc.RES_WITCH_DOCTOR_ENDUGU_12, Rsc.RES_WITCH_DOCTOR_ENDUGU_13));
		/* 暴风之树(Stormtree) */
		box.items.add(new Monster(box.category.id, Rsc.RES_STORMTREE_1, Rsc.RES_STORMTREE_2, Rsc.RES_STORMTREE_3, Rsc.RES_STORMTREE_4, Rsc.RES_STORMTREE_5, Rsc.RES_STORMTREE_6, Rsc.RES_STORMTREE_7, Rsc.RES_STORMTREE_8, Rsc.RES_STORMTREE_9, Rsc.RES_STORMTREE_10, Rsc.RES_STORMTREE_11, Rsc.RES_STORMTREE_12, Rsc.RES_STORMTREE_13));
		/* 战场处子-沙利娜(Battlemaid Sarina) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BATTLEMAID_SARINA_1, Rsc.RES_BATTLEMAID_SARINA_2, Rsc.RES_BATTLEMAID_SARINA_3, Rsc.RES_BATTLEMAID_SARINA_4, Rsc.RES_BATTLEMAID_SARINA_5, Rsc.RES_BATTLEMAID_SARINA_6, Rsc.RES_BATTLEMAID_SARINA_7, Rsc.RES_BATTLEMAID_SARINA_8, Rsc.RES_BATTLEMAID_SARINA_9, Rsc.RES_BATTLEMAID_SARINA_10, Rsc.RES_BATTLEMAID_SARINA_11, Rsc.RES_BATTLEMAID_SARINA_12, Rsc.RES_BATTLEMAID_SARINA_13));
		/* 裂缝之翼-冰鹰(Icehawk Riftwing) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ICEHAWK_RIFTWING_1, Rsc.RES_ICEHAWK_RIFTWING_2, Rsc.RES_ICEHAWK_RIFTWING_3, Rsc.RES_ICEHAWK_RIFTWING_4, Rsc.RES_ICEHAWK_RIFTWING_5, Rsc.RES_ICEHAWK_RIFTWING_6, Rsc.RES_ICEHAWK_RIFTWING_7, Rsc.RES_ICEHAWK_RIFTWING_8, Rsc.RES_ICEHAWK_RIFTWING_9, Rsc.RES_ICEHAWK_RIFTWING_10, Rsc.RES_ICEHAWK_RIFTWING_11, Rsc.RES_ICEHAWK_RIFTWING_12, Rsc.RES_ICEHAWK_RIFTWING_13));
		/* 邪恶之手-伊斯梅尔(Ismail Vilehand) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ISMAIL_VILEHAND_1, Rsc.RES_ISMAIL_VILEHAND_2, Rsc.RES_ISMAIL_VILEHAND_3, Rsc.RES_ISMAIL_VILEHAND_4, Rsc.RES_ISMAIL_VILEHAND_5, Rsc.RES_ISMAIL_VILEHAND_6, Rsc.RES_ISMAIL_VILEHAND_7, Rsc.RES_ISMAIL_VILEHAND_8, Rsc.RES_ISMAIL_VILEHAND_9, Rsc.RES_ISMAIL_VILEHAND_10, Rsc.RES_ISMAIL_VILEHAND_11, Rsc.RES_ISMAIL_VILEHAND_12, Rsc.RES_ISMAIL_VILEHAND_13));
		/* 火焰之指-吉列布(Geleb Flamefinger) */
		box.items.add(new Monster(box.category.id, Rsc.RES_GELEB_FLAMEFINGER_1, Rsc.RES_GELEB_FLAMEFINGER_2, Rsc.RES_GELEB_FLAMEFINGER_3, Rsc.RES_GELEB_FLAMEFINGER_4, Rsc.RES_GELEB_FLAMEFINGER_5, Rsc.RES_GELEB_FLAMEFINGER_6, Rsc.RES_GELEB_FLAMEFINGER_7, Rsc.RES_GELEB_FLAMEFINGER_8, Rsc.RES_GELEB_FLAMEFINGER_9, Rsc.RES_GELEB_FLAMEFINGER_10, Rsc.RES_GELEB_FLAMEFINGER_11, Rsc.RES_GELEB_FLAMEFINGER_12, Rsc.RES_GELEB_FLAMEFINGER_13));
		/* 冰拳-托克(Toorc Icefist) */
		box.items.add(new Monster(box.category.id, Rsc.RES_TOORC_ICEFIST_1, Rsc.RES_TOORC_ICEFIST_2, Rsc.RES_TOORC_ICEFIST_3, Rsc.RES_TOORC_ICEFIST_4, Rsc.RES_TOORC_ICEFIST_5, Rsc.RES_TOORC_ICEFIST_6, Rsc.RES_TOORC_ICEFIST_7, Rsc.RES_TOORC_ICEFIST_8, Rsc.RES_TOORC_ICEFIST_9, Rsc.RES_TOORC_ICEFIST_10, Rsc.RES_TOORC_ICEFIST_11, Rsc.RES_TOORC_ICEFIST_12, Rsc.RES_TOORC_ICEFIST_13));
		/* 火花之拳-布瑞姆(Bremm Sparkfist) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BREMM_SPARKFIST_1, Rsc.RES_BREMM_SPARKFIST_2, Rsc.RES_BREMM_SPARKFIST_3, Rsc.RES_BREMM_SPARKFIST_4, Rsc.RES_BREMM_SPARKFIST_5, Rsc.RES_BREMM_SPARKFIST_6, Rsc.RES_BREMM_SPARKFIST_7, Rsc.RES_BREMM_SPARKFIST_8, Rsc.RES_BREMM_SPARKFIST_9, Rsc.RES_BREMM_SPARKFIST_10, Rsc.RES_BREMM_SPARKFIST_11, Rsc.RES_BREMM_SPARKFIST_12, Rsc.RES_BREMM_SPARKFIST_13));
		/* 龙首--马弗(Maffer Dragonhand) */
		box.items.add(new Monster(box.category.id, Rsc.RES_MAFFER_DRAGONHAND_1, Rsc.RES_MAFFER_DRAGONHAND_2, Rsc.RES_MAFFER_DRAGONHAND_3, Rsc.RES_MAFFER_DRAGONHAND_4, Rsc.RES_MAFFER_DRAGONHAND_5, Rsc.RES_MAFFER_DRAGONHAND_6, Rsc.RES_MAFFER_DRAGONHAND_7, Rsc.RES_MAFFER_DRAGONHAND_8, Rsc.RES_MAFFER_DRAGONHAND_9, Rsc.RES_MAFFER_DRAGONHAND_10, Rsc.RES_MAFFER_DRAGONHAND_11, Rsc.RES_MAFFER_DRAGONHAND_12, Rsc.RES_MAFFER_DRAGONHAND_13));
		/* 空虚使者-韦恩(Wyand Voidbringer) */
		box.items.add(new Monster(box.category.id, Rsc.RES_WYAND_VOIDBRINGER_1, Rsc.RES_WYAND_VOIDBRINGER_2, Rsc.RES_WYAND_VOIDBRINGER_3, Rsc.RES_WYAND_VOIDBRINGER_4, Rsc.RES_WYAND_VOIDBRINGER_5, Rsc.RES_WYAND_VOIDBRINGER_6, Rsc.RES_WYAND_VOIDBRINGER_7, Rsc.RES_WYAND_VOIDBRINGER_8, Rsc.RES_WYAND_VOIDBRINGER_9, Rsc.RES_WYAND_VOIDBRINGER_10, Rsc.RES_WYAND_VOIDBRINGER_11, Rsc.RES_WYAND_VOIDBRINGER_12, Rsc.RES_WYAND_VOIDBRINGER_13));
		/* 墨菲斯托(Mephisto) */
		box.items.add(new Monster(box.category.id, Rsc.RES_MEPHISTO_1, Rsc.RES_MEPHISTO_2, Rsc.RES_MEPHISTO_3, Rsc.RES_MEPHISTO_4, Rsc.RES_MEPHISTO_5, Rsc.RES_MEPHISTO_6, Rsc.RES_MEPHISTO_7, Rsc.RES_MEPHISTO_8, Rsc.RES_MEPHISTO_9, Rsc.RES_MEPHISTO_10, Rsc.RES_MEPHISTO_11, Rsc.RES_MEPHISTO_12, Rsc.RES_MEPHISTO_13));

		srv.addItemBox(box);

		box = new MonsterBox();
		box.category = new MonsterCategory("episode4", "第四幕\r\n进入地狱", R.drawable.episode4);

		/* 依卒尔(Izual) */
		box.items.add(new Monster(box.category.id, Rsc.RES_IZUAL_1, Rsc.RES_IZUAL_2, Rsc.RES_IZUAL_3, Rsc.RES_IZUAL_4, Rsc.RES_IZUAL_5, Rsc.RES_IZUAL_6, Rsc.RES_IZUAL_7, Rsc.RES_IZUAL_8, Rsc.RES_IZUAL_9, Rsc.RES_IZUAL_10, Rsc.RES_IZUAL_11, Rsc.RES_IZUAL_12, Rsc.RES_IZUAL_13));
		/* 海法斯特盔甲制作者(Hephasto The Armorer) */
		box.items.add(new Monster(box.category.id, Rsc.RES_HEPHASTO_THE_ARMORER_1, Rsc.RES_HEPHASTO_THE_ARMORER_2, Rsc.RES_HEPHASTO_THE_ARMORER_3, Rsc.RES_HEPHASTO_THE_ARMORER_4, Rsc.RES_HEPHASTO_THE_ARMORER_5, Rsc.RES_HEPHASTO_THE_ARMORER_6, Rsc.RES_HEPHASTO_THE_ARMORER_7, Rsc.RES_HEPHASTO_THE_ARMORER_8, Rsc.RES_HEPHASTO_THE_ARMORER_9, Rsc.RES_HEPHASTO_THE_ARMORER_10, Rsc.RES_HEPHASTO_THE_ARMORER_11, Rsc.RES_HEPHASTO_THE_ARMORER_12, Rsc.RES_HEPHASTO_THE_ARMORER_13));
		/* 雄伟的混沌大臣(Grand Vizier of Chaos) */
		box.items.add(new Monster(box.category.id, Rsc.RES_GRAND_VIZIER_OF_CHAOS_1, Rsc.RES_GRAND_VIZIER_OF_CHAOS_2, Rsc.RES_GRAND_VIZIER_OF_CHAOS_3, Rsc.RES_GRAND_VIZIER_OF_CHAOS_4, Rsc.RES_GRAND_VIZIER_OF_CHAOS_5, Rsc.RES_GRAND_VIZIER_OF_CHAOS_6, Rsc.RES_GRAND_VIZIER_OF_CHAOS_7, Rsc.RES_GRAND_VIZIER_OF_CHAOS_8, Rsc.RES_GRAND_VIZIER_OF_CHAOS_9, Rsc.RES_GRAND_VIZIER_OF_CHAOS_10, Rsc.RES_GRAND_VIZIER_OF_CHAOS_11, Rsc.RES_GRAND_VIZIER_OF_CHAOS_12, Rsc.RES_GRAND_VIZIER_OF_CHAOS_13));
		/* 灵魂传播者(Infector of Souls) */
		box.items.add(new Monster(box.category.id, Rsc.RES_INFECTOR_OF_SOULS_1, Rsc.RES_INFECTOR_OF_SOULS_2, Rsc.RES_INFECTOR_OF_SOULS_3, Rsc.RES_INFECTOR_OF_SOULS_4, Rsc.RES_INFECTOR_OF_SOULS_5, Rsc.RES_INFECTOR_OF_SOULS_6, Rsc.RES_INFECTOR_OF_SOULS_7, Rsc.RES_INFECTOR_OF_SOULS_8, Rsc.RES_INFECTOR_OF_SOULS_9, Rsc.RES_INFECTOR_OF_SOULS_10, Rsc.RES_INFECTOR_OF_SOULS_11, Rsc.RES_INFECTOR_OF_SOULS_12, Rsc.RES_INFECTOR_OF_SOULS_13));
		/* 西希之王(Lord De Seis) */
		box.items.add(new Monster(box.category.id, Rsc.RES_LORD_DE_SEIS_1, Rsc.RES_LORD_DE_SEIS_2, Rsc.RES_LORD_DE_SEIS_3, Rsc.RES_LORD_DE_SEIS_4, Rsc.RES_LORD_DE_SEIS_5, Rsc.RES_LORD_DE_SEIS_6, Rsc.RES_LORD_DE_SEIS_7, Rsc.RES_LORD_DE_SEIS_8, Rsc.RES_LORD_DE_SEIS_9, Rsc.RES_LORD_DE_SEIS_10, Rsc.RES_LORD_DE_SEIS_11, Rsc.RES_LORD_DE_SEIS_12, Rsc.RES_LORD_DE_SEIS_13));
		/* 暗黑破坏神(Diablo) */
		box.items.add(new Monster(box.category.id, Rsc.RES_DIABLO_1, Rsc.RES_DIABLO_2, Rsc.RES_DIABLO_3, Rsc.RES_DIABLO_4, Rsc.RES_DIABLO_5, Rsc.RES_DIABLO_6, Rsc.RES_DIABLO_7, Rsc.RES_DIABLO_8, Rsc.RES_DIABLO_9, Rsc.RES_DIABLO_10, Rsc.RES_DIABLO_11, Rsc.RES_DIABLO_12, Rsc.RES_DIABLO_13));
		srv.addItemBox(box);

		box = new MonsterBox();
		box.category = new MonsterCategory("episode5", "第五幕\r\n寻找巴尔", R.drawable.episode5);

		/* 达克法恩(Dac Farren) */
		box.items.add(new Monster(box.category.id, Rsc.RES_DAC_FARREN_1, Rsc.RES_DAC_FARREN_2, Rsc.RES_DAC_FARREN_3, Rsc.RES_DAC_FARREN_4, Rsc.RES_DAC_FARREN_5, Rsc.RES_DAC_FARREN_6, Rsc.RES_DAC_FARREN_7, Rsc.RES_DAC_FARREN_8, Rsc.RES_DAC_FARREN_9, Rsc.RES_DAC_FARREN_10, Rsc.RES_DAC_FARREN_11, Rsc.RES_DAC_FARREN_12, Rsc.RES_DAC_FARREN_13));
		/* 督军山克(Shenk The Overseer) */
		box.items.add(new Monster(box.category.id, Rsc.RES_SHENK_THE_OVERSEER_1, Rsc.RES_SHENK_THE_OVERSEER_2, Rsc.RES_SHENK_THE_OVERSEER_3, Rsc.RES_SHENK_THE_OVERSEER_4, Rsc.RES_SHENK_THE_OVERSEER_5, Rsc.RES_SHENK_THE_OVERSEER_6, Rsc.RES_SHENK_THE_OVERSEER_7, Rsc.RES_SHENK_THE_OVERSEER_8, Rsc.RES_SHENK_THE_OVERSEER_9, Rsc.RES_SHENK_THE_OVERSEER_10, Rsc.RES_SHENK_THE_OVERSEER_11, Rsc.RES_SHENK_THE_OVERSEER_12, Rsc.RES_SHENK_THE_OVERSEER_13));
		/* 矫正者--怪异(Eldritch The Rectifier) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ELDRITCH_THE_RECTIFIER_1, Rsc.RES_ELDRITCH_THE_RECTIFIER_2, Rsc.RES_ELDRITCH_THE_RECTIFIER_3, Rsc.RES_ELDRITCH_THE_RECTIFIER_4, Rsc.RES_ELDRITCH_THE_RECTIFIER_5, Rsc.RES_ELDRITCH_THE_RECTIFIER_6, Rsc.RES_ELDRITCH_THE_RECTIFIER_7, Rsc.RES_ELDRITCH_THE_RECTIFIER_8, Rsc.RES_ELDRITCH_THE_RECTIFIER_9, Rsc.RES_ELDRITCH_THE_RECTIFIER_10, Rsc.RES_ELDRITCH_THE_RECTIFIER_11, Rsc.RES_ELDRITCH_THE_RECTIFIER_12, Rsc.RES_ELDRITCH_THE_RECTIFIER_13));
		/* 狂暴者-眼魔(Eyeback The Unleashed) */
		box.items.add(new Monster(box.category.id, Rsc.RES_EYEBACK_THE_UNLEASHED_1, Rsc.RES_EYEBACK_THE_UNLEASHED_2, Rsc.RES_EYEBACK_THE_UNLEASHED_3, Rsc.RES_EYEBACK_THE_UNLEASHED_4, Rsc.RES_EYEBACK_THE_UNLEASHED_5, Rsc.RES_EYEBACK_THE_UNLEASHED_6, Rsc.RES_EYEBACK_THE_UNLEASHED_7, Rsc.RES_EYEBACK_THE_UNLEASHED_8, Rsc.RES_EYEBACK_THE_UNLEASHED_9, Rsc.RES_EYEBACK_THE_UNLEASHED_10, Rsc.RES_EYEBACK_THE_UNLEASHED_11, Rsc.RES_EYEBACK_THE_UNLEASHED_12, Rsc.RES_EYEBACK_THE_UNLEASHED_13));
		/* 利牙杀手(Sharptooth Slayer) */
		box.items.add(new Monster(box.category.id, Rsc.RES_SHARPTOOTH_SLAYER_1, Rsc.RES_SHARPTOOTH_SLAYER_2, Rsc.RES_SHARPTOOTH_SLAYER_3, Rsc.RES_SHARPTOOTH_SLAYER_4, Rsc.RES_SHARPTOOTH_SLAYER_5, Rsc.RES_SHARPTOOTH_SLAYER_6, Rsc.RES_SHARPTOOTH_SLAYER_7, Rsc.RES_SHARPTOOTH_SLAYER_8, Rsc.RES_SHARPTOOTH_SLAYER_9, Rsc.RES_SHARPTOOTH_SLAYER_10, Rsc.RES_SHARPTOOTH_SLAYER_11, Rsc.RES_SHARPTOOTH_SLAYER_12, Rsc.RES_SHARPTOOTH_SLAYER_13));
		/* 剥壳凹槽(Thresh Socket) */
		box.items.add(new Monster(box.category.id, Rsc.RES_THRESH_SOCKET_1, Rsc.RES_THRESH_SOCKET_2, Rsc.RES_THRESH_SOCKET_3, Rsc.RES_THRESH_SOCKET_4, Rsc.RES_THRESH_SOCKET_5, Rsc.RES_THRESH_SOCKET_6, Rsc.RES_THRESH_SOCKET_7, Rsc.RES_THRESH_SOCKET_8, Rsc.RES_THRESH_SOCKET_9, Rsc.RES_THRESH_SOCKET_10, Rsc.RES_THRESH_SOCKET_11, Rsc.RES_THRESH_SOCKET_12, Rsc.RES_THRESH_SOCKET_13));
		/* 冰冻怪魔(Frozenstein) */
		box.items.add(new Monster(box.category.id, Rsc.RES_FROZENSTEIN_1, Rsc.RES_FROZENSTEIN_2, Rsc.RES_FROZENSTEIN_3, Rsc.RES_FROZENSTEIN_4, Rsc.RES_FROZENSTEIN_5, Rsc.RES_FROZENSTEIN_6, Rsc.RES_FROZENSTEIN_7, Rsc.RES_FROZENSTEIN_8, Rsc.RES_FROZENSTEIN_9, Rsc.RES_FROZENSTEIN_10, Rsc.RES_FROZENSTEIN_11, Rsc.RES_FROZENSTEIN_12, Rsc.RES_FROZENSTEIN_13));
		/* 骨锯破坏者(Bonesaw Breaker) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BONESAW_BREAKER_1, Rsc.RES_BONESAW_BREAKER_2, Rsc.RES_BONESAW_BREAKER_3, Rsc.RES_BONESAW_BREAKER_4, Rsc.RES_BONESAW_BREAKER_5, Rsc.RES_BONESAW_BREAKER_6, Rsc.RES_BONESAW_BREAKER_7, Rsc.RES_BONESAW_BREAKER_8, Rsc.RES_BONESAW_BREAKER_9, Rsc.RES_BONESAW_BREAKER_10, Rsc.RES_BONESAW_BREAKER_11, Rsc.RES_BONESAW_BREAKER_12, Rsc.RES_BONESAW_BREAKER_13));
		/* 粉碎者(Snapchip Shatter) */
		box.items.add(new Monster(box.category.id, Rsc.RES_SNAPCHIP_SHATTER_1, Rsc.RES_SNAPCHIP_SHATTER_2, Rsc.RES_SNAPCHIP_SHATTER_3, Rsc.RES_SNAPCHIP_SHATTER_4, Rsc.RES_SNAPCHIP_SHATTER_5, Rsc.RES_SNAPCHIP_SHATTER_6, Rsc.RES_SNAPCHIP_SHATTER_7, Rsc.RES_SNAPCHIP_SHATTER_8, Rsc.RES_SNAPCHIP_SHATTER_9, Rsc.RES_SNAPCHIP_SHATTER_10, Rsc.RES_SNAPCHIP_SHATTER_11, Rsc.RES_SNAPCHIP_SHATTER_12, Rsc.RES_SNAPCHIP_SHATTER_13));
		/* 暴躁外皮(Pindleskin) */
		box.items.add(new Monster(box.category.id, Rsc.RES_PINDLESKIN_1, Rsc.RES_PINDLESKIN_2, Rsc.RES_PINDLESKIN_3, Rsc.RES_PINDLESKIN_4, Rsc.RES_PINDLESKIN_5, Rsc.RES_PINDLESKIN_6, Rsc.RES_PINDLESKIN_7, Rsc.RES_PINDLESKIN_8, Rsc.RES_PINDLESKIN_9, Rsc.RES_PINDLESKIN_10, Rsc.RES_PINDLESKIN_11, Rsc.RES_PINDLESKIN_12, Rsc.RES_PINDLESKIN_13));
		/* 尼拉塞克(Nihlathak) */
		box.items.add(new Monster(box.category.id, Rsc.RES_NIHLATHAK_1, Rsc.RES_NIHLATHAK_2, Rsc.RES_NIHLATHAK_3, Rsc.RES_NIHLATHAK_4, Rsc.RES_NIHLATHAK_5, Rsc.RES_NIHLATHAK_6, Rsc.RES_NIHLATHAK_7, Rsc.RES_NIHLATHAK_8, Rsc.RES_NIHLATHAK_9, Rsc.RES_NIHLATHAK_10, Rsc.RES_NIHLATHAK_11, Rsc.RES_NIHLATHAK_12, Rsc.RES_NIHLATHAK_13));
		/* 科力克(Korlic) */
		box.items.add(new Monster(box.category.id, Rsc.RES_KORLIC_1, Rsc.RES_KORLIC_2, Rsc.RES_KORLIC_3, Rsc.RES_KORLIC_4, Rsc.RES_KORLIC_5, Rsc.RES_KORLIC_6, Rsc.RES_KORLIC_7, Rsc.RES_KORLIC_8, Rsc.RES_KORLIC_9, Rsc.RES_KORLIC_10, Rsc.RES_KORLIC_11, Rsc.RES_KORLIC_12, Rsc.RES_KORLIC_13));
		/* 马道克(Madawc) */
		box.items.add(new Monster(box.category.id, Rsc.RES_MADAWC_1, Rsc.RES_MADAWC_2, Rsc.RES_MADAWC_3, Rsc.RES_MADAWC_4, Rsc.RES_MADAWC_5, Rsc.RES_MADAWC_6, Rsc.RES_MADAWC_7, Rsc.RES_MADAWC_8, Rsc.RES_MADAWC_9, Rsc.RES_MADAWC_10, Rsc.RES_MADAWC_11, Rsc.RES_MADAWC_12, Rsc.RES_MADAWC_13));
		/* 塔力克(Talic) */
		box.items.add(new Monster(box.category.id, Rsc.RES_TALIC_1, Rsc.RES_TALIC_2, Rsc.RES_TALIC_3, Rsc.RES_TALIC_4, Rsc.RES_TALIC_5, Rsc.RES_TALIC_6, Rsc.RES_TALIC_7, Rsc.RES_TALIC_8, Rsc.RES_TALIC_9, Rsc.RES_TALIC_10, Rsc.RES_TALIC_11, Rsc.RES_TALIC_12, Rsc.RES_TALIC_13));
		/* 破坏者卡兰索(Colenzo The Annihilator) */
		box.items.add(new Monster(box.category.id, Rsc.RES_COLENZO_THE_ANNIHILATOR_1, Rsc.RES_COLENZO_THE_ANNIHILATOR_2, Rsc.RES_COLENZO_THE_ANNIHILATOR_3, Rsc.RES_COLENZO_THE_ANNIHILATOR_4, Rsc.RES_COLENZO_THE_ANNIHILATOR_5, Rsc.RES_COLENZO_THE_ANNIHILATOR_6, Rsc.RES_COLENZO_THE_ANNIHILATOR_7, Rsc.RES_COLENZO_THE_ANNIHILATOR_8, Rsc.RES_COLENZO_THE_ANNIHILATOR_9, Rsc.RES_COLENZO_THE_ANNIHILATOR_10, Rsc.RES_COLENZO_THE_ANNIHILATOR_11, Rsc.RES_COLENZO_THE_ANNIHILATOR_12, Rsc.RES_COLENZO_THE_ANNIHILATOR_13));
		/* 诅咒的阿克姆(Achmel The Cursed) */
		box.items.add(new Monster(box.category.id, Rsc.RES_ACHMEL_THE_CURSED_1, Rsc.RES_ACHMEL_THE_CURSED_2, Rsc.RES_ACHMEL_THE_CURSED_3, Rsc.RES_ACHMEL_THE_CURSED_4, Rsc.RES_ACHMEL_THE_CURSED_5, Rsc.RES_ACHMEL_THE_CURSED_6, Rsc.RES_ACHMEL_THE_CURSED_7, Rsc.RES_ACHMEL_THE_CURSED_8, Rsc.RES_ACHMEL_THE_CURSED_9, Rsc.RES_ACHMEL_THE_CURSED_10, Rsc.RES_ACHMEL_THE_CURSED_11, Rsc.RES_ACHMEL_THE_CURSED_12, Rsc.RES_ACHMEL_THE_CURSED_13));
		/* 血腥的巴特科(Bartuc The Bloody) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BARTUC_THE_BLOODY_1, Rsc.RES_BARTUC_THE_BLOODY_2, Rsc.RES_BARTUC_THE_BLOODY_3, Rsc.RES_BARTUC_THE_BLOODY_4, Rsc.RES_BARTUC_THE_BLOODY_5, Rsc.RES_BARTUC_THE_BLOODY_6, Rsc.RES_BARTUC_THE_BLOODY_7, Rsc.RES_BARTUC_THE_BLOODY_8, Rsc.RES_BARTUC_THE_BLOODY_9, Rsc.RES_BARTUC_THE_BLOODY_10, Rsc.RES_BARTUC_THE_BLOODY_11, Rsc.RES_BARTUC_THE_BLOODY_12, Rsc.RES_BARTUC_THE_BLOODY_13));
		/* 不洁的凡塔(Ventar the Unholy) */
		box.items.add(new Monster(box.category.id, Rsc.RES_VENTAR_THE_UNHOLY_1, Rsc.RES_VENTAR_THE_UNHOLY_2, Rsc.RES_VENTAR_THE_UNHOLY_3, Rsc.RES_VENTAR_THE_UNHOLY_4, Rsc.RES_VENTAR_THE_UNHOLY_5, Rsc.RES_VENTAR_THE_UNHOLY_6, Rsc.RES_VENTAR_THE_UNHOLY_7, Rsc.RES_VENTAR_THE_UNHOLY_8, Rsc.RES_VENTAR_THE_UNHOLY_9, Rsc.RES_VENTAR_THE_UNHOLY_10, Rsc.RES_VENTAR_THE_UNHOLY_11, Rsc.RES_VENTAR_THE_UNHOLY_12, Rsc.RES_VENTAR_THE_UNHOLY_13));
		/* 古难记录者(Lister The Tormentor) */
		box.items.add(new Monster(box.category.id, Rsc.RES_LISTER_THE_TORMENTOR_1, Rsc.RES_LISTER_THE_TORMENTOR_2, Rsc.RES_LISTER_THE_TORMENTOR_3, Rsc.RES_LISTER_THE_TORMENTOR_4, Rsc.RES_LISTER_THE_TORMENTOR_5, Rsc.RES_LISTER_THE_TORMENTOR_6, Rsc.RES_LISTER_THE_TORMENTOR_7, Rsc.RES_LISTER_THE_TORMENTOR_8, Rsc.RES_LISTER_THE_TORMENTOR_9, Rsc.RES_LISTER_THE_TORMENTOR_10, Rsc.RES_LISTER_THE_TORMENTOR_11, Rsc.RES_LISTER_THE_TORMENTOR_12, Rsc.RES_LISTER_THE_TORMENTOR_13));
		/* 巴尔(Baal) */
		box.items.add(new Monster(box.category.id, Rsc.RES_BAAL_1, Rsc.RES_BAAL_2, Rsc.RES_BAAL_3, Rsc.RES_BAAL_4, Rsc.RES_BAAL_5, Rsc.RES_BAAL_6, Rsc.RES_BAAL_7, Rsc.RES_BAAL_8, Rsc.RES_BAAL_9, Rsc.RES_BAAL_10, Rsc.RES_BAAL_11, Rsc.RES_BAAL_12, Rsc.RES_BAAL_13));
		srv.addItemBox(box);
	}
}