package cains.note.data.green;

import cains.note.service.green.GreenItemService;

import cains.note.view.R;
import cains.note.service.green.*;

public final class GreenData1
{
	private GreenData1()
	{
	}

	public static void generate(GreenItemService srv)
	{
		String comment;

		GreenItemBox box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+25 Mana\r\n3 装备 	+50 生命\r\n\r\n全 部\r\n+50 Mana\r\n+50 生命\r\n每次命中偷取 5% Mana\r\n20% 快速施放法术";
		box.category = new GreenItemCategory("arcanna", "阿卡娜的诡计", R.drawable.arcanna, comment);
		/* 阿卡娜的死亡之杖 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCANNAS_DEATHWAND_1,Rsc1.RES_ARCANNAS_DEATHWAND_2,Rsc1.RES_ARCANNAS_DEATHWAND_3,Rsc1.RES_ARCANNAS_DEATHWAND_4,Rsc1.RES_ARCANNAS_DEATHWAND_5,Rsc1.RES_ARCANNAS_DEATHWAND_6,Rsc1.RES_ARCANNAS_DEATHWAND_8,Rsc1.RES_ARCANNAS_DEATHWAND_7));
		/* 阿卡娜的血肉 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCANNAS_FLESH_1,Rsc1.RES_ARCANNAS_FLESH_2,Rsc1.RES_ARCANNAS_FLESH_3,Rsc1.RES_ARCANNAS_FLESH_4,Rsc1.RES_ARCANNAS_FLESH_5,Rsc1.RES_ARCANNAS_FLESH_6,Rsc1.RES_ARCANNAS_FLESH_8,Rsc1.RES_ARCANNAS_FLESH_7));
		/* 阿卡娜的头 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCANNAS_HEAD_1,Rsc1.RES_ARCANNAS_HEAD_2,Rsc1.RES_ARCANNAS_HEAD_3,Rsc1.RES_ARCANNAS_HEAD_4,Rsc1.RES_ARCANNAS_HEAD_5,Rsc1.RES_ARCANNAS_HEAD_6,Rsc1.RES_ARCANNAS_HEAD_8,Rsc1.RES_ARCANNAS_HEAD_7));
		/* 阿卡娜的符号 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCANNAS_SIGN_1,Rsc1.RES_ARCANNAS_SIGN_2,Rsc1.RES_ARCANNAS_SIGN_3,Rsc1.RES_ARCANNAS_SIGN_4,Rsc1.RES_ARCANNAS_SIGN_5,Rsc1.RES_ARCANNAS_SIGN_6,Rsc1.RES_ARCANNAS_SIGN_8,Rsc1.RES_ARCANNAS_SIGN_7));
		srv.addItemBox(box);

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	150% 提升攻击命中率\r\n3 装备 	50% 提升魔法装备出现概率\r\n\r\n全　部\r\n+350% 伤害力\r\n50% 提升魔法装备出现概率\r\n150% 提升攻击命中率\r\n+150 防御力\r\n+150 Mana\r\n四防 +50\r\n每次命中偷取 10% Mana\r\n+3 级技能\r\nDisplay Aura -- 显示灵气";
		box.category = new GreenItemCategory("aldur", "艾尔多的守卫(德鲁伊专用)", R.drawable.aldur, comment);
		/* 艾尔多的律动 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ALDURS_RHYTHM_1,Rsc1.RES_ALDURS_RHYTHM_2,Rsc1.RES_ALDURS_RHYTHM_3,Rsc1.RES_ALDURS_RHYTHM_4,Rsc1.RES_ALDURS_RHYTHM_5,Rsc1.RES_ALDURS_RHYTHM_6,Rsc1.RES_ALDURS_RHYTHM_8,Rsc1.RES_ALDURS_RHYTHM_7));
		/* 艾尔多的欺瞒 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ALDURS_DECEPTION_1,Rsc1.RES_ALDURS_DECEPTION_2,Rsc1.RES_ALDURS_DECEPTION_3,Rsc1.RES_ALDURS_DECEPTION_4,Rsc1.RES_ALDURS_DECEPTION_5,Rsc1.RES_ALDURS_DECEPTION_6,Rsc1.RES_ALDURS_DECEPTION_8,Rsc1.RES_ALDURS_DECEPTION_7));
		/* 艾尔多的成长 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ALDURS_ADVANCE_1,Rsc1.RES_ALDURS_ADVANCE_2,Rsc1.RES_ALDURS_ADVANCE_3,Rsc1.RES_ALDURS_ADVANCE_4,Rsc1.RES_ALDURS_ADVANCE_5,Rsc1.RES_ALDURS_ADVANCE_6,Rsc1.RES_ALDURS_ADVANCE_8,Rsc1.RES_ALDURS_ADVANCE_7));
		/* 艾尔多的冷酷凝视 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ALDURS_STONY_GAZE_1,Rsc1.RES_ALDURS_STONY_GAZE_2,Rsc1.RES_ALDURS_STONY_GAZE_3,Rsc1.RES_ALDURS_STONY_GAZE_4,Rsc1.RES_ALDURS_STONY_GAZE_5,Rsc1.RES_ALDURS_STONY_GAZE_6,Rsc1.RES_ALDURS_STONY_GAZE_8,Rsc1.RES_ALDURS_STONY_GAZE_7));
		srv.addItemBox(box);

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+5 强壮\r\n3 装备 	+50 生命\r\n\r\n全 部 	\r\n+6-14 冰伤害，效果持续 4 秒\r\n不被冰冻\r\n+50 生命\r\n+5 强壮";
		box.category = new GreenItemCategory("arctic", "北极装置", R.drawable.arctic, comment);
		/* 北极号角 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCTIC_HORN_1,Rsc1.RES_ARCTIC_HORN_2,Rsc1.RES_ARCTIC_HORN_3,Rsc1.RES_ARCTIC_HORN_4,Rsc1.RES_ARCTIC_HORN_5,Rsc1.RES_ARCTIC_HORN_6,Rsc1.RES_ARCTIC_HORN_8,Rsc1.RES_ARCTIC_HORN_7));
		/* 北极毛皮 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCTIC_FURS_1,Rsc1.RES_ARCTIC_FURS_2,Rsc1.RES_ARCTIC_FURS_3,Rsc1.RES_ARCTIC_FURS_4,Rsc1.RES_ARCTIC_FURS_5,Rsc1.RES_ARCTIC_FURS_6,Rsc1.RES_ARCTIC_FURS_8,Rsc1.RES_ARCTIC_FURS_7));
		/* 北极捆缚 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCTIC_BINDING_1,Rsc1.RES_ARCTIC_BINDING_2,Rsc1.RES_ARCTIC_BINDING_3,Rsc1.RES_ARCTIC_BINDING_4,Rsc1.RES_ARCTIC_BINDING_5,Rsc1.RES_ARCTIC_BINDING_6,Rsc1.RES_ARCTIC_BINDING_8,Rsc1.RES_ARCTIC_BINDING_7));
		/* 北极手套 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ARCTIC_MITTS_1,Rsc1.RES_ARCTIC_MITTS_2,Rsc1.RES_ARCTIC_MITTS_3,Rsc1.RES_ARCTIC_MITTS_4,Rsc1.RES_ARCTIC_MITTS_5,Rsc1.RES_ARCTIC_MITTS_6,Rsc1.RES_ARCTIC_MITTS_8,Rsc1.RES_ARCTIC_MITTS_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+50 攻击命中率\r\n3 装备 	+75 攻击命中率\r\n4 装备 	+125 攻击命中率\r\n5 装备 	+200 攻击命中率\r\n\r\n全　部\r\n+3 野蛮人技能\r\n+450 攻击命中率\r\n+150 生命\r\n四防 +50\r\n抵消魔法伤害 10\r\nDisplay Aura -- 显示灵气";
		box.category = new GreenItemCategory("immortalking", "不朽之王(野蛮人专用)", R.drawable.immortalking, comment);
		/* 不朽之王的碎魂者 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_1,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_2,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_3,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_4,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_5,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_6,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_8,Rsc1.RES_IMMORTAL_KINGS_STONE_CRUSHER_7));
		/* 不朽之王的灵魂牢宠 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_1,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_2,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_3,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_4,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_5,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_6,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_8,Rsc1.RES_IMMORTAL_KINGS_SOUL_CAGE_7));
		/* 不朽之王的琐事 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_DETAIL_1,Rsc1.RES_IMMORTAL_KINGS_DETAIL_2,Rsc1.RES_IMMORTAL_KINGS_DETAIL_3,Rsc1.RES_IMMORTAL_KINGS_DETAIL_4,Rsc1.RES_IMMORTAL_KINGS_DETAIL_5,Rsc1.RES_IMMORTAL_KINGS_DETAIL_6,Rsc1.RES_IMMORTAL_KINGS_DETAIL_8,Rsc1.RES_IMMORTAL_KINGS_DETAIL_7));
		/* 不朽之王的熔炉 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_FORGE_1,Rsc1.RES_IMMORTAL_KINGS_FORGE_2,Rsc1.RES_IMMORTAL_KINGS_FORGE_3,Rsc1.RES_IMMORTAL_KINGS_FORGE_4,Rsc1.RES_IMMORTAL_KINGS_FORGE_5,Rsc1.RES_IMMORTAL_KINGS_FORGE_6,Rsc1.RES_IMMORTAL_KINGS_FORGE_8,Rsc1.RES_IMMORTAL_KINGS_FORGE_7));
		/* 不朽之王之柱 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_PILLAR_1,Rsc1.RES_IMMORTAL_KINGS_PILLAR_2,Rsc1.RES_IMMORTAL_KINGS_PILLAR_3,Rsc1.RES_IMMORTAL_KINGS_PILLAR_4,Rsc1.RES_IMMORTAL_KINGS_PILLAR_5,Rsc1.RES_IMMORTAL_KINGS_PILLAR_6,Rsc1.RES_IMMORTAL_KINGS_PILLAR_8,Rsc1.RES_IMMORTAL_KINGS_PILLAR_7));
		/* 不朽之王的意志 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IMMORTAL_KINGS_WILL_1,Rsc1.RES_IMMORTAL_KINGS_WILL_2,Rsc1.RES_IMMORTAL_KINGS_WILL_3,Rsc1.RES_IMMORTAL_KINGS_WILL_4,Rsc1.RES_IMMORTAL_KINGS_WILL_5,Rsc1.RES_IMMORTAL_KINGS_WILL_6,Rsc1.RES_IMMORTAL_KINGS_WILL_8,Rsc1.RES_IMMORTAL_KINGS_WILL_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "全部装备奖励\r\n+2 级所有技能\r\n+200 攻击命中率\r\n200% 伤害力对恶魔系怪物\r\n200% 伤害力对不死系怪物\r\n+20 火伤害\r\n+25 防御力";
		box.category = new GreenItemCategory("bulkathos", "布尔凯索的孩子", R.drawable.bulkathos, comment);
		/* 布尔凯索的部族守护 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_1,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_2,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_3,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_4,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_5,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_6,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_8,Rsc1.RES_BUL_KATHOS_TRIBAL_GUARDIAN_7));
		/* 布尔凯索的神圣代价 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_1,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_2,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_3,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_4,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_5,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_6,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_8,Rsc1.RES_BUL_KATHOS_SACRED_CHARGE_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+8 毒伤害，效果持续 3 秒\r\n\r\n全 部 	\r\n每次命中偷取 6% Mana\r\n+1 男巫技能\r\n20% 提升攻击命中率\r\n20% 概率造成伤口\r\n+8 毒伤害，效果持续 3 秒";
		box.category = new GreenItemCategory("inferno", "地狱的工具", R.drawable.inferno, comment);
		/* 地狱火炬 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_INFERNAL_TORCH_1,Rsc1.RES_INFERNAL_TORCH_2,Rsc1.RES_INFERNAL_TORCH_3,Rsc1.RES_INFERNAL_TORCH_4,Rsc1.RES_INFERNAL_TORCH_5,Rsc1.RES_INFERNAL_TORCH_6,Rsc1.RES_INFERNAL_TORCH_8,Rsc1.RES_INFERNAL_TORCH_7));
		/* 地狱符号 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_INFERNAL_SIGN_1,Rsc1.RES_INFERNAL_SIGN_2,Rsc1.RES_INFERNAL_SIGN_3,Rsc1.RES_INFERNAL_SIGN_4,Rsc1.RES_INFERNAL_SIGN_5,Rsc1.RES_INFERNAL_SIGN_6,Rsc1.RES_INFERNAL_SIGN_8,Rsc1.RES_INFERNAL_SIGN_7));
		/* 地狱头骨 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_INFERNAL_CRANIUM_1,Rsc1.RES_INFERNAL_CRANIUM_2,Rsc1.RES_INFERNAL_CRANIUM_3,Rsc1.RES_INFERNAL_CRANIUM_4,Rsc1.RES_INFERNAL_CRANIUM_5,Rsc1.RES_INFERNAL_CRANIUM_6,Rsc1.RES_INFERNAL_CRANIUM_8,Rsc1.RES_INFERNAL_CRANIUM_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+20 强壮\r\n3 装备 	+30 敏捷\r\n\r\n全　部 	\r\n+3 游侠技能\r\n30% 快速恢复打击\r\n+200 攻击命中率\r\n+20 强壮\r\n+30 敏捷\r\n+150 生命\r\n四防 +50\r\nDisplay Aura -- 显示灵气";
		box.category = new GreenItemCategory("griswold", "格瑞斯华尔德的传奇(圣骑士专用)", R.drawable.griswold, comment);
		/* 格瑞斯华尔德的救赎 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_GRISWOLDS_REDEMPTION_1,Rsc1.RES_GRISWOLDS_REDEMPTION_2,Rsc1.RES_GRISWOLDS_REDEMPTION_3,Rsc1.RES_GRISWOLDS_REDEMPTION_4,Rsc1.RES_GRISWOLDS_REDEMPTION_5,Rsc1.RES_GRISWOLDS_REDEMPTION_6,Rsc1.RES_GRISWOLDS_REDEMPTION_8,Rsc1.RES_GRISWOLDS_REDEMPTION_7));
		/* 格瑞斯华尔德之心 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_GRISWOLDS_HEART_1,Rsc1.RES_GRISWOLDS_HEART_2,Rsc1.RES_GRISWOLDS_HEART_3,Rsc1.RES_GRISWOLDS_HEART_4,Rsc1.RES_GRISWOLDS_HEART_5,Rsc1.RES_GRISWOLDS_HEART_6,Rsc1.RES_GRISWOLDS_HEART_8,Rsc1.RES_GRISWOLDS_HEART_7));
		/* 格瑞斯华尔德的勇气 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_GRISWOLDS_VALOR_1,Rsc1.RES_GRISWOLDS_VALOR_2,Rsc1.RES_GRISWOLDS_VALOR_3,Rsc1.RES_GRISWOLDS_VALOR_4,Rsc1.RES_GRISWOLDS_VALOR_5,Rsc1.RES_GRISWOLDS_VALOR_6,Rsc1.RES_GRISWOLDS_VALOR_8,Rsc1.RES_GRISWOLDS_VALOR_7));
		/* 格瑞斯华尔德荣耀 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_GRISWOLDS_HONOR_1,Rsc1.RES_GRISWOLDS_HONOR_2,Rsc1.RES_GRISWOLDS_HONOR_3,Rsc1.RES_GRISWOLDS_HONOR_4,Rsc1.RES_GRISWOLDS_HONOR_5,Rsc1.RES_GRISWOLDS_HONOR_6,Rsc1.RES_GRISWOLDS_HONOR_8,Rsc1.RES_GRISWOLDS_HONOR_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+35 生命\r\n3 装备 	敌人受到反伤害 5\r\n\r\n全　部 	\r\n+85 生命\r\n敌人受到反伤害 5\r\n四防 +15\r\n+100 防御力\r\n+10 敏捷\r\n+20 强壮\r\n80% 提升魔法装备出现概率";
		box.category = new GreenItemCategory("orphan", "孤儿的呼唤", R.drawable.orphan, comment);
		/* 惠斯坦的武装 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_WHITSTANS_GUARD_1,Rsc1.RES_WHITSTANS_GUARD_2,Rsc1.RES_WHITSTANS_GUARD_3,Rsc1.RES_WHITSTANS_GUARD_4,Rsc1.RES_WHITSTANS_GUARD_5,Rsc1.RES_WHITSTANS_GUARD_6,Rsc1.RES_WHITSTANS_GUARD_8,Rsc1.RES_WHITSTANS_GUARD_7));
		/* 威廉的自尊 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_WILHELMS_PRIDE_1,Rsc1.RES_WILHELMS_PRIDE_2,Rsc1.RES_WILHELMS_PRIDE_3,Rsc1.RES_WILHELMS_PRIDE_4,Rsc1.RES_WILHELMS_PRIDE_5,Rsc1.RES_WILHELMS_PRIDE_6,Rsc1.RES_WILHELMS_PRIDE_8,Rsc1.RES_WILHELMS_PRIDE_7));
		/* 马格纳斯之皮 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAGNUS_SKIN_1,Rsc1.RES_MAGNUS_SKIN_2,Rsc1.RES_MAGNUS_SKIN_3,Rsc1.RES_MAGNUS_SKIN_4,Rsc1.RES_MAGNUS_SKIN_5,Rsc1.RES_MAGNUS_SKIN_6,Rsc1.RES_MAGNUS_SKIN_8,Rsc1.RES_MAGNUS_SKIN_7));
		/* 吉永之脸 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_GUILLAUMES_FACE_1,Rsc1.RES_GUILLAUMES_FACE_2,Rsc1.RES_GUILLAUMES_FACE_3,Rsc1.RES_GUILLAUMES_FACE_4,Rsc1.RES_GUILLAUMES_FACE_5,Rsc1.RES_GUILLAUMES_FACE_6,Rsc1.RES_GUILLAUMES_FACE_8,Rsc1.RES_GUILLAUMES_FACE_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	敌人受到反伤害 5\r\n\r\n全 部 	\r\n+5 最大伤害力\r\n敌人受到反伤害 5\r\n防电 +25%\r\n不被冰冻";
		box.category = new GreenItemCategory("hsaru", "哈斯拉柏的防御", R.drawable.hsaru, comment);
		/* 哈撒路的铁拳 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HSARUS_IRON_FIST_1,Rsc1.RES_HSARUS_IRON_FIST_2,Rsc1.RES_HSARUS_IRON_FIST_3,Rsc1.RES_HSARUS_IRON_FIST_4,Rsc1.RES_HSARUS_IRON_FIST_5,Rsc1.RES_HSARUS_IRON_FIST_6,Rsc1.RES_HSARUS_IRON_FIST_8,Rsc1.RES_HSARUS_IRON_FIST_7));
		/* 哈撒路的铁胸衣 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HSARUS_IRON_STAY_1,Rsc1.RES_HSARUS_IRON_STAY_2,Rsc1.RES_HSARUS_IRON_STAY_3,Rsc1.RES_HSARUS_IRON_STAY_4,Rsc1.RES_HSARUS_IRON_STAY_5,Rsc1.RES_HSARUS_IRON_STAY_6,Rsc1.RES_HSARUS_IRON_STAY_8,Rsc1.RES_HSARUS_IRON_STAY_7));
		/* 哈撒路的铁后跟 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HSARUS_IRON_HEEL_1,Rsc1.RES_HSARUS_IRON_HEEL_2,Rsc1.RES_HSARUS_IRON_HEEL_3,Rsc1.RES_HSARUS_IRON_HEEL_4,Rsc1.RES_HSARUS_IRON_HEEL_5,Rsc1.RES_HSARUS_IRON_HEEL_6,Rsc1.RES_HSARUS_IRON_HEEL_8,Rsc1.RES_HSARUS_IRON_HEEL_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+100 防御力\r\n3 装备 	+200 防御力\r\n\r\n全　部 	\r\n2 级所有技能\r\n30% 快速移动/奔跑\r\n每次命中偷取 20% 生命\r\n+300 防御力\r\n四防 +30";
		box.category = new GreenItemCategory("hwanin", "华宁的威严", R.drawable.hwanin, comment);
		/* 华宁的正义 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HWANINS_JUSTICE_1,Rsc1.RES_HWANINS_JUSTICE_2,Rsc1.RES_HWANINS_JUSTICE_3,Rsc1.RES_HWANINS_JUSTICE_4,Rsc1.RES_HWANINS_JUSTICE_5,Rsc1.RES_HWANINS_JUSTICE_6,Rsc1.RES_HWANINS_JUSTICE_8,Rsc1.RES_HWANINS_JUSTICE_7));
		/* 华宁的保护 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HWANINS_REFUGE_1,Rsc1.RES_HWANINS_REFUGE_2,Rsc1.RES_HWANINS_REFUGE_3,Rsc1.RES_HWANINS_REFUGE_4,Rsc1.RES_HWANINS_REFUGE_5,Rsc1.RES_HWANINS_REFUGE_6,Rsc1.RES_HWANINS_REFUGE_8,Rsc1.RES_HWANINS_REFUGE_7));
		/* 华宁的祝福 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HWANINS_BLESSING_1,Rsc1.RES_HWANINS_BLESSING_2,Rsc1.RES_HWANINS_BLESSING_3,Rsc1.RES_HWANINS_BLESSING_4,Rsc1.RES_HWANINS_BLESSING_5,Rsc1.RES_HWANINS_BLESSING_6,Rsc1.RES_HWANINS_BLESSING_8,Rsc1.RES_HWANINS_BLESSING_7));
		/* 华宁的光辉 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HWANINS_SPLENDOR_1,Rsc1.RES_HWANINS_SPLENDOR_2,Rsc1.RES_HWANINS_SPLENDOR_3,Rsc1.RES_HWANINS_SPLENDOR_4,Rsc1.RES_HWANINS_SPLENDOR_5,Rsc1.RES_HWANINS_SPLENDOR_6,Rsc1.RES_HWANINS_SPLENDOR_8,Rsc1.RES_HWANINS_SPLENDOR_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+15-20 火伤害\r\n3 装备 	防电 +25%\r\n\r\n全 部 	\r\n抵消魔法伤害 3\r\n+20 Mana\r\n+60 攻击命中率\r\n四防 +25\r\n防电 +25%\r\n+15-20 火伤害\r\n10% 快速施放法术";
		box.category = new GreenItemCategory("cathan", "卡珊的陷阱", R.drawable.cathan, comment);
		/* 卡珊的裁决 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CATHANS_RULE_1,Rsc1.RES_CATHANS_RULE_2,Rsc1.RES_CATHANS_RULE_3,Rsc1.RES_CATHANS_RULE_4,Rsc1.RES_CATHANS_RULE_5,Rsc1.RES_CATHANS_RULE_6,Rsc1.RES_CATHANS_RULE_8,Rsc1.RES_CATHANS_RULE_7));
		/* 卡珊之网 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CATHANS_MESH_1,Rsc1.RES_CATHANS_MESH_2,Rsc1.RES_CATHANS_MESH_3,Rsc1.RES_CATHANS_MESH_4,Rsc1.RES_CATHANS_MESH_5,Rsc1.RES_CATHANS_MESH_6,Rsc1.RES_CATHANS_MESH_8,Rsc1.RES_CATHANS_MESH_7));
		/* 卡珊的容貌 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CATHANS_VISAGE_1,Rsc1.RES_CATHANS_VISAGE_2,Rsc1.RES_CATHANS_VISAGE_3,Rsc1.RES_CATHANS_VISAGE_4,Rsc1.RES_CATHANS_VISAGE_5,Rsc1.RES_CATHANS_VISAGE_6,Rsc1.RES_CATHANS_VISAGE_8,Rsc1.RES_CATHANS_VISAGE_7));
		/* 卡珊之魔咒 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CATHANS_SIGIL_1,Rsc1.RES_CATHANS_SIGIL_2,Rsc1.RES_CATHANS_SIGIL_3,Rsc1.RES_CATHANS_SIGIL_4,Rsc1.RES_CATHANS_SIGIL_5,Rsc1.RES_CATHANS_SIGIL_6,Rsc1.RES_CATHANS_SIGIL_8,Rsc1.RES_CATHANS_SIGIL_7));
		/* 卡珊之偷取 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CATHANS_SEAL_1,Rsc1.RES_CATHANS_SEAL_2,Rsc1.RES_CATHANS_SEAL_3,Rsc1.RES_CATHANS_SEAL_4,Rsc1.RES_CATHANS_SEAL_5,Rsc1.RES_CATHANS_SEAL_6,Rsc1.RES_CATHANS_SEAL_8,Rsc1.RES_CATHANS_SEAL_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+50 防御力\r\n\r\n全 部 	\r\n+100 防御力\r\n20% 提升攻击速度\r\n每次命中偷取 6% Mana\r\n35% 概率决定性打击";
		box.category = new GreenItemCategory("cleglaw", "克雷得劳的支柱", R.drawable.cleglaw, comment);
		/* 克雷得劳之牙 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CLEGLAWS_TOOTH_1,Rsc1.RES_CLEGLAWS_TOOTH_2,Rsc1.RES_CLEGLAWS_TOOTH_3,Rsc1.RES_CLEGLAWS_TOOTH_4,Rsc1.RES_CLEGLAWS_TOOTH_5,Rsc1.RES_CLEGLAWS_TOOTH_6,Rsc1.RES_CLEGLAWS_TOOTH_8,Rsc1.RES_CLEGLAWS_TOOTH_7));
		/* 克雷得劳之爪 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CLEGLAWS_CLAW_1,Rsc1.RES_CLEGLAWS_CLAW_2,Rsc1.RES_CLEGLAWS_CLAW_3,Rsc1.RES_CLEGLAWS_CLAW_4,Rsc1.RES_CLEGLAWS_CLAW_5,Rsc1.RES_CLEGLAWS_CLAW_6,Rsc1.RES_CLEGLAWS_CLAW_8,Rsc1.RES_CLEGLAWS_CLAW_7));
		/* 克雷得劳之钳 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CLEGLAWS_PINCERS_1,Rsc1.RES_CLEGLAWS_PINCERS_2,Rsc1.RES_CLEGLAWS_PINCERS_3,Rsc1.RES_CLEGLAWS_PINCERS_4,Rsc1.RES_CLEGLAWS_PINCERS_5,Rsc1.RES_CLEGLAWS_PINCERS_6,Rsc1.RES_CLEGLAWS_PINCERS_8,Rsc1.RES_CLEGLAWS_PINCERS_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+50 生命\r\n\r\n全 部\r\n+5-9 毒伤害，效果持续 3 秒\r\n+75 防御力\r\n快速解毒 75%\r\n+50 生命";
		box.category = new GreenItemCategory("berserker", "狂战士的军火库", R.drawable.berserker, comment);
		/* 狂战士的手斧 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_BERSERKERS_HATCHET_1,Rsc1.RES_BERSERKERS_HATCHET_2,Rsc1.RES_BERSERKERS_HATCHET_3,Rsc1.RES_BERSERKERS_HATCHET_4,Rsc1.RES_BERSERKERS_HATCHET_5,Rsc1.RES_BERSERKERS_HATCHET_6,Rsc1.RES_BERSERKERS_HATCHET_8, Rsc1.RES_BERSERKERS_HATCHET_7));
		/* 狂战士的锁子甲 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_BERSERKERS_HAUBERK_1,Rsc1.RES_BERSERKERS_HAUBERK_2,Rsc1.RES_BERSERKERS_HAUBERK_3,Rsc1.RES_BERSERKERS_HAUBERK_4,Rsc1.RES_BERSERKERS_HAUBERK_5,Rsc1.RES_BERSERKERS_HAUBERK_6,Rsc1.RES_BERSERKERS_HAUBERK_8,Rsc1.RES_BERSERKERS_HAUBERK_7));
		/* 狂战士的头戴 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_BERSERKERS_HEADGEAR_1,Rsc1.RES_BERSERKERS_HEADGEAR_2,Rsc1.RES_BERSERKERS_HEADGEAR_3,Rsc1.RES_BERSERKERS_HEADGEAR_4,Rsc1.RES_BERSERKERS_HEADGEAR_5,Rsc1.RES_BERSERKERS_HEADGEAR_6,Rsc1.RES_BERSERKERS_HEADGEAR_8,Rsc1.RES_BERSERKERS_HEADGEAR_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+20 强壮\r\n3 装备 	+30 敏捷\r\n\r\n全　部 	\r\n+3 亚玛逊技能\r\n+20 强壮\r\n+30 敏捷\r\n四防 +50\r\n+100 防御力\r\n+100 攻击命中率\r\n100% 提升魔法装备出现概率\r\nDisplay Aura -- 显示灵气";
		box.category = new GreenItemCategory("mavina", "马维娜之战斗诗歌(亚玛逊专用)", R.drawable.mavina, comment);
		/* 马维娜的施展 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAVINAS_CASTER_1,Rsc1.RES_MAVINAS_CASTER_2,Rsc1.RES_MAVINAS_CASTER_3,Rsc1.RES_MAVINAS_CASTER_4,Rsc1.RES_MAVINAS_CASTER_5,Rsc1.RES_MAVINAS_CASTER_6,Rsc1.RES_MAVINAS_CASTER_8,Rsc1.RES_MAVINAS_CASTER_7));
		/* 马维娜的拥抱 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAVINAS_EMBRACE_1,Rsc1.RES_MAVINAS_EMBRACE_2,Rsc1.RES_MAVINAS_EMBRACE_3,Rsc1.RES_MAVINAS_EMBRACE_4,Rsc1.RES_MAVINAS_EMBRACE_5,Rsc1.RES_MAVINAS_EMBRACE_6,Rsc1.RES_MAVINAS_EMBRACE_8,Rsc1.RES_MAVINAS_EMBRACE_7));
		/* 马维娜的教义 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAVINAS_TENET_1,Rsc1.RES_MAVINAS_TENET_2,Rsc1.RES_MAVINAS_TENET_3,Rsc1.RES_MAVINAS_TENET_4,Rsc1.RES_MAVINAS_TENET_5,Rsc1.RES_MAVINAS_TENET_6,Rsc1.RES_MAVINAS_TENET_8,Rsc1.RES_MAVINAS_TENET_7));
		/* 马维娜的冰握 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAVINAS_ICY_CLUTCH_1,Rsc1.RES_MAVINAS_ICY_CLUTCH_2,Rsc1.RES_MAVINAS_ICY_CLUTCH_3,Rsc1.RES_MAVINAS_ICY_CLUTCH_4,Rsc1.RES_MAVINAS_ICY_CLUTCH_5,Rsc1.RES_MAVINAS_ICY_CLUTCH_6,Rsc1.RES_MAVINAS_ICY_CLUTCH_8,Rsc1.RES_MAVINAS_ICY_CLUTCH_7));
		/* 马维娜的真实之眼 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MAVINAS_TRUE_SIGHT_1,Rsc1.RES_MAVINAS_TRUE_SIGHT_2,Rsc1.RES_MAVINAS_TRUE_SIGHT_3,Rsc1.RES_MAVINAS_TRUE_SIGHT_4,Rsc1.RES_MAVINAS_TRUE_SIGHT_5,Rsc1.RES_MAVINAS_TRUE_SIGHT_6,Rsc1.RES_MAVINAS_TRUE_SIGHT_8,Rsc1.RES_MAVINAS_TRUE_SIGHT_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+150 防御力\r\n3 装备 	+22 毒伤害，效果持续 3 秒\r\n4 装备 	+10 强壮\r\n\r\n全　部 	\r\n+100 mana\r\n+10 强壮\r\n+22 毒伤害，效果持续 3 秒\r\n+150 防御力\r\n+2 级所有技能\r\n四防 +50";
		box.category = new GreenItemCategory("disciple", "门徒", R.drawable.disciple, comment);
		/* 黑暗信徒 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_DARK_ADHERENT_1,Rsc1.RES_DARK_ADHERENT_2,Rsc1.RES_DARK_ADHERENT_3,Rsc1.RES_DARK_ADHERENT_4,Rsc1.RES_DARK_ADHERENT_5,Rsc1.RES_DARK_ADHERENT_6,Rsc1.RES_DARK_ADHERENT_8,Rsc1.RES_DARK_ADHERENT_7));
		/* 信条 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CREDENDUM_1,Rsc1.RES_CREDENDUM_2,Rsc1.RES_CREDENDUM_3,Rsc1.RES_CREDENDUM_4,Rsc1.RES_CREDENDUM_5,Rsc1.RES_CREDENDUM_6,Rsc1.RES_CREDENDUM_8,Rsc1.RES_CREDENDUM_7));
		/* 手掌的安置 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_LAYING_OF_HANDS_1,Rsc1.RES_LAYING_OF_HANDS_2,Rsc1.RES_LAYING_OF_HANDS_3,Rsc1.RES_LAYING_OF_HANDS_4,Rsc1.RES_LAYING_OF_HANDS_5,Rsc1.RES_LAYING_OF_HANDS_6,Rsc1.RES_LAYING_OF_HANDS_8,Rsc1.RES_LAYING_OF_HANDS_7));
		/* 仪式的走道 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_RITE_OF_PASSAGE_1,Rsc1.RES_RITE_OF_PASSAGE_2,Rsc1.RES_RITE_OF_PASSAGE_3,Rsc1.RES_RITE_OF_PASSAGE_4,Rsc1.RES_RITE_OF_PASSAGE_5,Rsc1.RES_RITE_OF_PASSAGE_6,Rsc1.RES_RITE_OF_PASSAGE_8,Rsc1.RES_RITE_OF_PASSAGE_7));
		/* 述说之珠 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TELLING_OF_BEADS_1,Rsc1.RES_TELLING_OF_BEADS_2,Rsc1.RES_TELLING_OF_BEADS_3,Rsc1.RES_TELLING_OF_BEADS_4,Rsc1.RES_TELLING_OF_BEADS_5,Rsc1.RES_TELLING_OF_BEADS_6,Rsc1.RES_TELLING_OF_BEADS_8,Rsc1.RES_TELLING_OF_BEADS_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+75 攻击命中率\r\n3 装备 	+125 攻击命中率\r\n\r\n全 部 	\r\n防毒 +15%\r\n每次命中偷取 10% Mana\r\n每次命中偷取 8% 生命\r\n+2 游侠技能\r\n+200 攻击命中率";
		box.category = new GreenItemCategory("milabrega", "米拉伯佳的雪茄", R.drawable.milabrega, comment);
		/* 米勒柏德加之杖 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MILABREGAS_ROD_1,Rsc1.RES_MILABREGAS_ROD_2,Rsc1.RES_MILABREGAS_ROD_3,Rsc1.RES_MILABREGAS_ROD_4,Rsc1.RES_MILABREGAS_ROD_5,Rsc1.RES_MILABREGAS_ROD_6,Rsc1.RES_MILABREGAS_ROD_8,Rsc1.RES_MILABREGAS_ROD_7));
		/* 米勒柏德加之袍 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MILABREGAS_ROBE_1,Rsc1.RES_MILABREGAS_ROBE_2,Rsc1.RES_MILABREGAS_ROBE_3,Rsc1.RES_MILABREGAS_ROBE_4,Rsc1.RES_MILABREGAS_ROBE_5,Rsc1.RES_MILABREGAS_ROBE_6,Rsc1.RES_MILABREGAS_ROBE_8,Rsc1.RES_MILABREGAS_ROBE_7));
		/* 米勒柏德加之球 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MILABREGAS_ORB_1,Rsc1.RES_MILABREGAS_ORB_2,Rsc1.RES_MILABREGAS_ORB_3,Rsc1.RES_MILABREGAS_ORB_4,Rsc1.RES_MILABREGAS_ORB_5,Rsc1.RES_MILABREGAS_ORB_6,Rsc1.RES_MILABREGAS_ORB_8,Rsc1.RES_MILABREGAS_ORB_7));
		/* 米勒柏德加的皇冠 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_MILABREGAS_DIADEM_1,Rsc1.RES_MILABREGAS_DIADEM_2,Rsc1.RES_MILABREGAS_DIADEM_3,Rsc1.RES_MILABREGAS_DIADEM_4,Rsc1.RES_MILABREGAS_DIADEM_5,Rsc1.RES_MILABREGAS_DIADEM_6,Rsc1.RES_MILABREGAS_DIADEM_8,Rsc1.RES_MILABREGAS_DIADEM_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+175 防御力\r\n\r\n全　部 	\r\n+175 防御力\r\n+15 敏捷\r\n四防 +50\r\n+20 强壮\r\n+100 Mana\r\n+1 级所有技能\r\n恢复生命速度 +10";
		box.category = new GreenItemCategory("naj", "娜吉的古代遗迹", R.drawable.naj, comment);
		/* 娜吉的解密棒 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NAJS_PUZZLER_1,Rsc1.RES_NAJS_PUZZLER_2,Rsc1.RES_NAJS_PUZZLER_3,Rsc1.RES_NAJS_PUZZLER_4,Rsc1.RES_NAJS_PUZZLER_5,Rsc1.RES_NAJS_PUZZLER_6,Rsc1.RES_NAJS_PUZZLER_8,Rsc1.RES_NAJS_PUZZLER_7));
		/* 娜吉的轻铠甲 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NAJS_LIGHT_PLATE_1,Rsc1.RES_NAJS_LIGHT_PLATE_2,Rsc1.RES_NAJS_LIGHT_PLATE_3,Rsc1.RES_NAJS_LIGHT_PLATE_4,Rsc1.RES_NAJS_LIGHT_PLATE_5,Rsc1.RES_NAJS_LIGHT_PLATE_6,Rsc1.RES_NAJS_LIGHT_PLATE_8,Rsc1.RES_NAJS_LIGHT_PLATE_7));
		/* 娜吉的小环 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NAJS_CIRCLET_1,Rsc1.RES_NAJS_CIRCLET_2,Rsc1.RES_NAJS_CIRCLET_3,Rsc1.RES_NAJS_CIRCLET_4,Rsc1.RES_NAJS_CIRCLET_5,Rsc1.RES_NAJS_CIRCLET_6,Rsc1.RES_NAJS_CIRCLET_8,Rsc1.RES_NAJS_CIRCLET_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	抵消魔法伤害 15\r\n3 装备 	+200 防御力\r\n\r\n全　部 	\r\n+3 刺客技能\r\n+350 防御力\r\n每次命中偷取 14% 生命\r\n每次命中偷取 14% Mana\r\n四防 +50\r\n抵消物理伤害 30%\r\n抵消魔法伤害 15\r\nFade * -- 隐行";
		box.category = new GreenItemCategory("natalya", "娜塔亚的非难(刺客专用)", R.drawable.natalya, comment);
		/* 娜塔亚的标记 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NATALYAS_MARK_1,Rsc1.RES_NATALYAS_MARK_2,Rsc1.RES_NATALYAS_MARK_3,Rsc1.RES_NATALYAS_MARK_4,Rsc1.RES_NATALYAS_MARK_5,Rsc1.RES_NATALYAS_MARK_6,Rsc1.RES_NATALYAS_MARK_8,Rsc1.RES_NATALYAS_MARK_7));
		/* 娜塔亚的影子 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NATALYAS_SHADOW_1,Rsc1.RES_NATALYAS_SHADOW_2,Rsc1.RES_NATALYAS_SHADOW_3,Rsc1.RES_NATALYAS_SHADOW_4,Rsc1.RES_NATALYAS_SHADOW_5,Rsc1.RES_NATALYAS_SHADOW_6,Rsc1.RES_NATALYAS_SHADOW_8,Rsc1.RES_NATALYAS_SHADOW_7));
		/* 娜塔亚的灵魂 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NATALYAS_SOUL_1,Rsc1.RES_NATALYAS_SOUL_2,Rsc1.RES_NATALYAS_SOUL_3,Rsc1.RES_NATALYAS_SOUL_4,Rsc1.RES_NATALYAS_SOUL_5,Rsc1.RES_NATALYAS_SOUL_6,Rsc1.RES_NATALYAS_SOUL_8,Rsc1.RES_NATALYAS_SOUL_7));
		/* 娜塔亚的图腾 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_NATALYAS_TOTEM_1,Rsc1.RES_NATALYAS_TOTEM_2,Rsc1.RES_NATALYAS_TOTEM_3,Rsc1.RES_NATALYAS_TOTEM_4,Rsc1.RES_NATALYAS_TOTEM_5,Rsc1.RES_NATALYAS_TOTEM_6,Rsc1.RES_NATALYAS_TOTEM_8,Rsc1.RES_NATALYAS_TOTEM_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	防毒 +25%\r\n\r\n全　部 	\r\n25% 概率当被攻击时施放 5 级 静态力场\r\n+100 体力\r\n+20 强壮\r\n防毒 +25%\r\n30% 提升攻击速度\r\n100% 提升魔法装备出现概率\r\n100% 得到额外金钱";
		box.category = new GreenItemCategory("cowking", "牛魔王之皮甲", R.drawable.cowking, comment);
		/* 牛魔王之皮 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_COW_KINGS_HIDE_1,Rsc1.RES_COW_KINGS_HIDE_2,Rsc1.RES_COW_KINGS_HIDE_3,Rsc1.RES_COW_KINGS_HIDE_4,Rsc1.RES_COW_KINGS_HIDE_5,Rsc1.RES_COW_KINGS_HIDE_6,Rsc1.RES_COW_KINGS_HIDE_8,Rsc1.RES_COW_KINGS_HIDE_7));
		/* 牛魔王之蹄 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_COW_KINGS_HOOVES_1,Rsc1.RES_COW_KINGS_HOOVES_2,Rsc1.RES_COW_KINGS_HOOVES_3,Rsc1.RES_COW_KINGS_HOOVES_4,Rsc1.RES_COW_KINGS_HOOVES_5,Rsc1.RES_COW_KINGS_HOOVES_6,Rsc1.RES_COW_KINGS_HOOVES_8,Rsc1.RES_COW_KINGS_HOOVES_7));
		/* 牛魔王之角 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_COW_KINGS_HORNS_1,Rsc1.RES_COW_KINGS_HORNS_2,Rsc1.RES_COW_KINGS_HORNS_3,Rsc1.RES_COW_KINGS_HORNS_4,Rsc1.RES_COW_KINGS_HORNS_5,Rsc1.RES_COW_KINGS_HORNS_6,Rsc1.RES_COW_KINGS_HORNS_8,Rsc1.RES_COW_KINGS_HORNS_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	40% 快速移动/奔跑\r\n\r\n全　部 	\r\n40% 快速移动/奔跑\r\n每次命中偷取 15% 生命\r\n提升生命上限 27%\r\n四防 +30";
		box.category = new GreenItemCategory("sazabi", "沙撒璧的雄伟贡品", R.drawable.sazabi, comment);
		/* 沙撒璧歉悔之钴 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SAZABIS_COBALT_REDEEMER_1,Rsc1.RES_SAZABIS_COBALT_REDEEMER_2,Rsc1.RES_SAZABIS_COBALT_REDEEMER_3,Rsc1.RES_SAZABIS_COBALT_REDEEMER_4,Rsc1.RES_SAZABIS_COBALT_REDEEMER_5,Rsc1.RES_SAZABIS_COBALT_REDEEMER_6,Rsc1.RES_SAZABIS_COBALT_REDEEMER_8,Rsc1.RES_SAZABIS_COBALT_REDEEMER_7));
		/* 沙撒璧的鬼魂释放者 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SAZABIS_GHOST_LIBERATOR_1,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_2,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_3,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_4,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_5,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_6,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_8,Rsc1.RES_SAZABIS_GHOST_LIBERATOR_7));
		/* 沙撒璧的精神之鞘 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SAZABIS_MENTAL_SHEATH_1,Rsc1.RES_SAZABIS_MENTAL_SHEATH_2,Rsc1.RES_SAZABIS_MENTAL_SHEATH_3,Rsc1.RES_SAZABIS_MENTAL_SHEATH_4,Rsc1.RES_SAZABIS_MENTAL_SHEATH_5,Rsc1.RES_SAZABIS_MENTAL_SHEATH_6,Rsc1.RES_SAZABIS_MENTAL_SHEATH_8,Rsc1.RES_SAZABIS_MENTAL_SHEATH_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+50 防御力\r\n3 装备 	+75 攻击命中率\r\n\r\n全　部\r\n+75 攻击命中率\r\n+1 级所有技能\r\n每次命中偷取 4% 生命\r\n+50 Mana\r\n50% 提升魔法装备出现概率";
		box.category = new GreenItemCategory("sander", "山德的愚行", R.drawable.sander, comment);
		/* 山德的迷信 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SANDERS_SUPERSTITION_1,Rsc1.RES_SANDERS_SUPERSTITION_2,Rsc1.RES_SANDERS_SUPERSTITION_3,Rsc1.RES_SANDERS_SUPERSTITION_4,Rsc1.RES_SANDERS_SUPERSTITION_5,Rsc1.RES_SANDERS_SUPERSTITION_6,Rsc1.RES_SANDERS_SUPERSTITION_8,Rsc1.RES_SANDERS_SUPERSTITION_7));
		/* 山德的禁忌 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SANDERS_TABOO_1,Rsc1.RES_SANDERS_TABOO_2,Rsc1.RES_SANDERS_TABOO_3,Rsc1.RES_SANDERS_TABOO_4,Rsc1.RES_SANDERS_TABOO_5,Rsc1.RES_SANDERS_TABOO_6,Rsc1.RES_SANDERS_TABOO_8,Rsc1.RES_SANDERS_TABOO_7));
		/* 山德的碎石 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SANDERS_RIPRAP_1,Rsc1.RES_SANDERS_RIPRAP_2,Rsc1.RES_SANDERS_RIPRAP_3,Rsc1.RES_SANDERS_RIPRAP_4,Rsc1.RES_SANDERS_RIPRAP_5,Rsc1.RES_SANDERS_RIPRAP_6,Rsc1.RES_SANDERS_RIPRAP_8,Rsc1.RES_SANDERS_RIPRAP_7));
		/* 山德的模范 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SANDERS_PARAGON_1,Rsc1.RES_SANDERS_PARAGON_2,Rsc1.RES_SANDERS_PARAGON_3,Rsc1.RES_SANDERS_PARAGON_4,Rsc1.RES_SANDERS_PARAGON_5,Rsc1.RES_SANDERS_PARAGON_6,Rsc1.RES_SANDERS_PARAGON_8,Rsc1.RES_SANDERS_PARAGON_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	每次命中偷取 8% 生命\r\n\r\n全 部 	\r\n每次命中偷取 8% 生命\r\n+10 最小伤害力\r\n四防 +25\r\n40% 提升攻击命中率";
		box.category = new GreenItemCategory("death", "死亡的伪装", R.drawable.death, comment);
		/* 死神之触 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_DEATHS_TOUCH_1,Rsc1.RES_DEATHS_TOUCH_2,Rsc1.RES_DEATHS_TOUCH_3,Rsc1.RES_DEATHS_TOUCH_4,Rsc1.RES_DEATHS_TOUCH_5,Rsc1.RES_DEATHS_TOUCH_6,Rsc1.RES_DEATHS_TOUCH_8,Rsc1.RES_DEATHS_TOUCH_7));
		/* 死神之守卫 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_DEATHS_GUARD_1,Rsc1.RES_DEATHS_GUARD_2,Rsc1.RES_DEATHS_GUARD_3,Rsc1.RES_DEATHS_GUARD_4,Rsc1.RES_DEATHS_GUARD_5,Rsc1.RES_DEATHS_GUARD_6,Rsc1.RES_DEATHS_GUARD_8,Rsc1.RES_DEATHS_GUARD_7));
		/* 死神之手 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_DEATHS_HAND_1,Rsc1.RES_DEATHS_HAND_2,Rsc1.RES_DEATHS_HAND_3,Rsc1.RES_DEATHS_HAND_4,Rsc1.RES_DEATHS_HAND_5,Rsc1.RES_DEATHS_HAND_6,Rsc1.RES_DEATHS_HAND_8,Rsc1.RES_DEATHS_HAND_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	提升 Mana 回复速度 15%\r\n+18 级 火球\r\n3 装备 	+13 级 火墙\r\n提升 Mana 回复速度 15%\r\n4 装备 	+10 级 陨石\r\n提升 Mana 回复速度 15%\r\n\r\n全　部 	\r\n+3 男巫技能\r\n每次命中偷取 20% 生命\r\n+3 级 火系掌握\r\n+10 级 陨石\r\n+13 级 火墙\r\n+18 级 火球\r\n+200 防御力\r\n+100 Mana\r\n提升 Mana 回复速度 60%\r\n自动恢复生命 +5\r\n四防 +50";
		box.category = new GreenItemCategory("trangoul", "塔格奥的化身(死灵法师专用)", R.drawable.trangoul, comment);
		/* 塔格奥之鳞 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TRANG_OULS_SCALES_1,Rsc1.RES_TRANG_OULS_SCALES_2,Rsc1.RES_TRANG_OULS_SCALES_3,Rsc1.RES_TRANG_OULS_SCALES_4,Rsc1.RES_TRANG_OULS_SCALES_5,Rsc1.RES_TRANG_OULS_SCALES_6,Rsc1.RES_TRANG_OULS_SCALES_8,Rsc1.RES_TRANG_OULS_SCALES_7));
		/* 塔格奥之束带 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TRANG_OULS_GIRTH_1,Rsc1.RES_TRANG_OULS_GIRTH_2,Rsc1.RES_TRANG_OULS_GIRTH_3,Rsc1.RES_TRANG_OULS_GIRTH_4,Rsc1.RES_TRANG_OULS_GIRTH_5,Rsc1.RES_TRANG_OULS_GIRTH_6,Rsc1.RES_TRANG_OULS_GIRTH_8,Rsc1.RES_TRANG_OULS_GIRTH_7));
		/* 塔格奥之爪 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TRANG_OULS_CLAWS_1,Rsc1.RES_TRANG_OULS_CLAWS_2,Rsc1.RES_TRANG_OULS_CLAWS_3,Rsc1.RES_TRANG_OULS_CLAWS_4,Rsc1.RES_TRANG_OULS_CLAWS_5,Rsc1.RES_TRANG_OULS_CLAWS_6,Rsc1.RES_TRANG_OULS_CLAWS_8,Rsc1.RES_TRANG_OULS_CLAWS_7));
		/* 塔格奥之外装 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TRANG_OULS_GUISE_1,Rsc1.RES_TRANG_OULS_GUISE_2,Rsc1.RES_TRANG_OULS_GUISE_3,Rsc1.RES_TRANG_OULS_GUISE_4,Rsc1.RES_TRANG_OULS_GUISE_5,Rsc1.RES_TRANG_OULS_GUISE_6,Rsc1.RES_TRANG_OULS_GUISE_8,Rsc1.RES_TRANG_OULS_GUISE_7));
		/* 塔格奥之翼 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TRANG_OULS_WING_1,Rsc1.RES_TRANG_OULS_WING_2,Rsc1.RES_TRANG_OULS_WING_3,Rsc1.RES_TRANG_OULS_WING_4,Rsc1.RES_TRANG_OULS_WING_5,Rsc1.RES_TRANG_OULS_WING_6,Rsc1.RES_TRANG_OULS_WING_8,Rsc1.RES_TRANG_OULS_WING_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	自动恢复生命 +10\r\n3 装备 	65% 提升魔法装备出现概率\r\n4 装备 	25% 快速恢复打击\r\n\r\n全　部 	\r\n+3 女巫技能\r\n自动恢复生命 +10\r\n65% 提升魔法装备出现概率\r\n25% 快速恢复打击\r\n+150 生命\r\n四防 +50\r\n+50 防御力对远距离攻击\r\n+150 防御力\r\nDisplay Aura -- 显示灵气";
		box.category = new GreenItemCategory("talrasha", "塔拉夏的外袍(女巫专用)", R.drawable.talrasha, comment);
		/* 塔拉夏的警戒之眼 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_1,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_2,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_3,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_4,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_5,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_6,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_8,Rsc1.RES_TAL_RASHAS_LIDLESS_EYE_7));
		/* 塔拉夏的守护 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_1,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_2,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_3,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_4,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_5,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_6,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_8,Rsc1.RES_TAL_RASHAS_GUARDIANSHIP_7));
		/* 塔拉夏的织细衣服 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_1,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_2,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_3,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_4,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_5,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_6,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_8,Rsc1.RES_TAL_RASHAS_FINE_SPUN_CLOTH_7));
		/* 塔拉夏的赫拉迪克纹章 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_1,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_2,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_3,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_4,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_5,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_6,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_8,Rsc1.RES_TAL_RASHAS_HORADRIC_CREST_7));
		/* 塔拉夏的判决 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAL_RASHAS_ADJUDICATION_1,Rsc1.RES_TAL_RASHAS_ADJUDICATION_2,Rsc1.RES_TAL_RASHAS_ADJUDICATION_3,Rsc1.RES_TAL_RASHAS_ADJUDICATION_4,Rsc1.RES_TAL_RASHAS_ADJUDICATION_5,Rsc1.RES_TAL_RASHAS_ADJUDICATION_6,Rsc1.RES_TAL_RASHAS_ADJUDICATION_8,Rsc1.RES_TAL_RASHAS_ADJUDICATION_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+15 电伤害\r\n3 装备 	每次命中偷取 5% 生命\r\n\r\n全 部 	\r\n四防 +10\r\n75% 得到额外金钱\r\n+15 电伤害\r\n每次命中偷取 5% Mana\r\n每次命中偷取 5% 生命\r\n减慢目标速度 35%";
		box.category = new GreenItemCategory("tancred", "坦克雷的战斗装备", R.drawable.tancred, comment);
		/* 泰克理的鹤嘴锄 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TANCREDS_CROWBILL_1,Rsc1.RES_TANCREDS_CROWBILL_2,Rsc1.RES_TANCREDS_CROWBILL_3,Rsc1.RES_TANCREDS_CROWBILL_4,Rsc1.RES_TANCREDS_CROWBILL_5,Rsc1.RES_TANCREDS_CROWBILL_6,Rsc1.RES_TANCREDS_CROWBILL_8,Rsc1.RES_TANCREDS_CROWBILL_7));
		/* 泰克理的脊柱 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TANCREDS_SPINE_1,Rsc1.RES_TANCREDS_SPINE_2,Rsc1.RES_TANCREDS_SPINE_3,Rsc1.RES_TANCREDS_SPINE_4,Rsc1.RES_TANCREDS_SPINE_5,Rsc1.RES_TANCREDS_SPINE_6,Rsc1.RES_TANCREDS_SPINE_8,Rsc1.RES_TANCREDS_SPINE_7));
		/* 泰克理的平头钉 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TANCREDS_HOBNAILS_1,Rsc1.RES_TANCREDS_HOBNAILS_2,Rsc1.RES_TANCREDS_HOBNAILS_3,Rsc1.RES_TANCREDS_HOBNAILS_4,Rsc1.RES_TANCREDS_HOBNAILS_5,Rsc1.RES_TANCREDS_HOBNAILS_6,Rsc1.RES_TANCREDS_HOBNAILS_8,Rsc1.RES_TANCREDS_HOBNAILS_7));
		/* 泰克理的骷髅 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TANCREDS_SKULL_1,Rsc1.RES_TANCREDS_SKULL_2,Rsc1.RES_TANCREDS_SKULL_3,Rsc1.RES_TANCREDS_SKULL_4,Rsc1.RES_TANCREDS_SKULL_5,Rsc1.RES_TANCREDS_SKULL_6,Rsc1.RES_TANCREDS_SKULL_8,Rsc1.RES_TANCREDS_SKULL_7));
		/* 泰克理的的怪诞 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TANCREDS_WEIRD_1,Rsc1.RES_TANCREDS_WEIRD_2,Rsc1.RES_TANCREDS_WEIRD_3,Rsc1.RES_TANCREDS_WEIRD_4,Rsc1.RES_TANCREDS_WEIRD_5,Rsc1.RES_TANCREDS_WEIRD_6,Rsc1.RES_TANCREDS_WEIRD_8,Rsc1.RES_TANCREDS_WEIRD_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+10 敏捷\r\n3 装备 	+50 Mana\r\n\r\n全 部	\r\n四防 +25\r\n+50 Mana\r\n+10 敏捷\r\n40% 提升魔法装备出现概率\r\n提升 Mana 回复速度 8%\r\n冰冻时间减半";
		box.category = new GreenItemCategory("angelic", "天上的衣服", R.drawable.angelic, comment);
		/* 天使的镰刀 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ANGELIC_SICKLE_1,Rsc1.RES_ANGELIC_SICKLE_2,Rsc1.RES_ANGELIC_SICKLE_3,Rsc1.RES_ANGELIC_SICKLE_4,Rsc1.RES_ANGELIC_SICKLE_5,Rsc1.RES_ANGELIC_SICKLE_6,Rsc1.RES_ANGELIC_SICKLE_8,Rsc1.RES_ANGELIC_SICKLE_7));
		/* 天使的披风 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ANGELIC_MANTLE_1,Rsc1.RES_ANGELIC_MANTLE_2,Rsc1.RES_ANGELIC_MANTLE_3,Rsc1.RES_ANGELIC_MANTLE_4,Rsc1.RES_ANGELIC_MANTLE_5,Rsc1.RES_ANGELIC_MANTLE_6,Rsc1.RES_ANGELIC_MANTLE_8,Rsc1.RES_ANGELIC_MANTLE_7));
		/* 天使之翼 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ANGELIC_WINGS_1,Rsc1.RES_ANGELIC_WINGS_2,Rsc1.RES_ANGELIC_WINGS_3,Rsc1.RES_ANGELIC_WINGS_4,Rsc1.RES_ANGELIC_WINGS_5,Rsc1.RES_ANGELIC_WINGS_6,Rsc1.RES_ANGELIC_WINGS_8,Rsc1.RES_ANGELIC_WINGS_7));
		/* 天使之光 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ANGELIC_HALO_1,Rsc1.RES_ANGELIC_HALO_2,Rsc1.RES_ANGELIC_HALO_3,Rsc1.RES_ANGELIC_HALO_4,Rsc1.RES_ANGELIC_HALO_5,Rsc1.RES_ANGELIC_HALO_6,Rsc1.RES_ANGELIC_HALO_8,Rsc1.RES_ANGELIC_HALO_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	快速恢复体力 50%\r\n3 装备 	自动恢复生命 +20\r\n\r\n全　部 	\r\n+2 级所有技能\r\n自动恢复生命 +20\r\n快速恢复体力 50%\r\n四防 +50\r\n不被冰冻\r\n+5 光明度";
		box.category = new GreenItemCategory("heaven", "天堂的信徒", R.drawable.heaven, comment);
		/* 丹弓的教导 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_DANGOONS_TEACHING_1,Rsc1.RES_DANGOONS_TEACHING_2,Rsc1.RES_DANGOONS_TEACHING_3,Rsc1.RES_DANGOONS_TEACHING_4,Rsc1.RES_DANGOONS_TEACHING_5,Rsc1.RES_DANGOONS_TEACHING_6,Rsc1.RES_DANGOONS_TEACHING_8,Rsc1.RES_DANGOONS_TEACHING_7));
		/* 黑摩苏的坚决 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_HAEMOSUS_ADAMENT_1,Rsc1.RES_HAEMOSUS_ADAMENT_2,Rsc1.RES_HAEMOSUS_ADAMENT_3,Rsc1.RES_HAEMOSUS_ADAMENT_4,Rsc1.RES_HAEMOSUS_ADAMENT_5,Rsc1.RES_HAEMOSUS_ADAMENT_6,Rsc1.RES_HAEMOSUS_ADAMENT_8,Rsc1.RES_HAEMOSUS_ADAMENT_7));
		/* 泰比克的光荣 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_TAEBAEKS_GLORY_1,Rsc1.RES_TAEBAEKS_GLORY_2,Rsc1.RES_TAEBAEKS_GLORY_3,Rsc1.RES_TAEBAEKS_GLORY_4,Rsc1.RES_TAEBAEKS_GLORY_5,Rsc1.RES_TAEBAEKS_GLORY_6,Rsc1.RES_TAEBAEKS_GLORY_8,Rsc1.RES_TAEBAEKS_GLORY_7));
		/* 安戴尔的全灵 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ONDALS_ALMIGHTY_1,Rsc1.RES_ONDALS_ALMIGHTY_2,Rsc1.RES_ONDALS_ALMIGHTY_3,Rsc1.RES_ONDALS_ALMIGHTY_4,Rsc1.RES_ONDALS_ALMIGHTY_5,Rsc1.RES_ONDALS_ALMIGHTY_6,Rsc1.RES_ONDALS_ALMIGHTY_8,Rsc1.RES_ONDALS_ALMIGHTY_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+75 攻击命中率\r\n3 装备 	+15 敏捷\r\n\r\n全 部 	\r\n+10 强壮\r\n+75 攻击命中率\r\n+15 敏捷\r\n冰冻目标\r\n穿刺攻击 [50]\r\n+15-20 冰伤害,效果持续 2 秒";
		box.category = new GreenItemCategory("vidala", "维达拉的配备", R.drawable.vidala, comment);
		/* 维达拉的倒刺 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_VIDALAS_BARB_1,Rsc1.RES_VIDALAS_BARB_2,Rsc1.RES_VIDALAS_BARB_3,Rsc1.RES_VIDALAS_BARB_4,Rsc1.RES_VIDALAS_BARB_5,Rsc1.RES_VIDALAS_BARB_6,Rsc1.RES_VIDALAS_BARB_8,Rsc1.RES_VIDALAS_BARB_7));
		/* 维达拉的突袭 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_VIDALAS_AMBUSH_1,Rsc1.RES_VIDALAS_AMBUSH_2,Rsc1.RES_VIDALAS_AMBUSH_3,Rsc1.RES_VIDALAS_AMBUSH_4,Rsc1.RES_VIDALAS_AMBUSH_5,Rsc1.RES_VIDALAS_AMBUSH_6,Rsc1.RES_VIDALAS_AMBUSH_8,Rsc1.RES_VIDALAS_AMBUSH_7));
		/* 维达拉的羽毛 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_VIDALAS_FETLOCK_1,Rsc1.RES_VIDALAS_FETLOCK_2,Rsc1.RES_VIDALAS_FETLOCK_3,Rsc1.RES_VIDALAS_FETLOCK_4,Rsc1.RES_VIDALAS_FETLOCK_5,Rsc1.RES_VIDALAS_FETLOCK_6,Rsc1.RES_VIDALAS_FETLOCK_8,Rsc1.RES_VIDALAS_FETLOCK_7));
		/* 维达拉的陷阱 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_VIDALAS_SNARE_1,Rsc1.RES_VIDALAS_SNARE_2,Rsc1.RES_VIDALAS_SNARE_3,Rsc1.RES_VIDALAS_SNARE_4,Rsc1.RES_VIDALAS_SNARE_5,Rsc1.RES_VIDALAS_SNARE_6,Rsc1.RES_VIDALAS_SNARE_8,Rsc1.RES_VIDALAS_SNARE_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	每次命中偷取 10% 生命\r\n3 装备 	+100 防御力\r\n\r\n全 部 	\r\n抵消物理伤害 7\r\n每次命中偷取 10% 生命\r\n+100 防御力\r\n+20 Mana\r\n+24 最大火伤害\r\n防火 +12%\r\n敌人受到反伤害 12";
		box.category = new GreenItemCategory("sigon", "西刚的全套刀剑", R.drawable.sigon, comment);
		/* 西刚的遮蔽 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_SHELTER_1,Rsc1.RES_SIGONS_SHELTER_2,Rsc1.RES_SIGONS_SHELTER_3,Rsc1.RES_SIGONS_SHELTER_4,Rsc1.RES_SIGONS_SHELTER_5,Rsc1.RES_SIGONS_SHELTER_6,Rsc1.RES_SIGONS_SHELTER_8,Rsc1.RES_SIGONS_SHELTER_7));
		/* 西刚的守护 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_GUARD_1,Rsc1.RES_SIGONS_GUARD_2,Rsc1.RES_SIGONS_GUARD_3,Rsc1.RES_SIGONS_GUARD_4,Rsc1.RES_SIGONS_GUARD_5,Rsc1.RES_SIGONS_GUARD_6,Rsc1.RES_SIGONS_GUARD_8,Rsc1.RES_SIGONS_GUARD_7));
		/* 西刚的挑战 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_WRAP_1,Rsc1.RES_SIGONS_WRAP_2,Rsc1.RES_SIGONS_WRAP_3,Rsc1.RES_SIGONS_WRAP_4,Rsc1.RES_SIGONS_WRAP_5,Rsc1.RES_SIGONS_WRAP_6,Rsc1.RES_SIGONS_WRAP_8,Rsc1.RES_SIGONS_WRAP_7));
		/* 西刚之翼 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_GAGE_1,Rsc1.RES_SIGONS_GAGE_2,Rsc1.RES_SIGONS_GAGE_3,Rsc1.RES_SIGONS_GAGE_4,Rsc1.RES_SIGONS_GAGE_5,Rsc1.RES_SIGONS_GAGE_6,Rsc1.RES_SIGONS_GAGE_8,Rsc1.RES_SIGONS_GAGE_7));
		/* 西刚的木鞋 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_SABOT_1,Rsc1.RES_SIGONS_SABOT_2,Rsc1.RES_SIGONS_SABOT_3,Rsc1.RES_SIGONS_SABOT_4,Rsc1.RES_SIGONS_SABOT_5,Rsc1.RES_SIGONS_SABOT_6,Rsc1.RES_SIGONS_SABOT_8,Rsc1.RES_SIGONS_SABOT_7));
		/* 西刚之面甲 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_SIGONS_VISOR_1,Rsc1.RES_SIGONS_VISOR_2,Rsc1.RES_SIGONS_VISOR_3,Rsc1.RES_SIGONS_VISOR_4,Rsc1.RES_SIGONS_VISOR_5,Rsc1.RES_SIGONS_VISOR_6,Rsc1.RES_SIGONS_VISOR_8,Rsc1.RES_SIGONS_VISOR_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	防火 +15%\r\n\r\n全 部 	\r\n+15 强壮\r\n防电 +25%\r\n防火 +15%\r\n+200% 伤害力对不死系怪物";
		box.category = new GreenItemCategory("civerb", "希弗伯的法衣", R.drawable.civerb, comment);
		/* 希弗柏的短棍 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CIVERBS_CUDGEL_1,Rsc1.RES_CIVERBS_CUDGEL_2,Rsc1.RES_CIVERBS_CUDGEL_3,Rsc1.RES_CIVERBS_CUDGEL_4,Rsc1.RES_CIVERBS_CUDGEL_5,Rsc1.RES_CIVERBS_CUDGEL_6,Rsc1.RES_CIVERBS_CUDGEL_8,Rsc1.RES_CIVERBS_CUDGEL_7));
		/* 希弗伯的防护 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CIVERBS_WARD_1,Rsc1.RES_CIVERBS_WARD_2,Rsc1.RES_CIVERBS_WARD_3,Rsc1.RES_CIVERBS_WARD_4,Rsc1.RES_CIVERBS_WARD_5,Rsc1.RES_CIVERBS_WARD_6,Rsc1.RES_CIVERBS_WARD_8,Rsc1.RES_CIVERBS_WARD_7));
		/* 希弗伯的图案 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_CIVERBS_ICON_1,Rsc1.RES_CIVERBS_ICON_2,Rsc1.RES_CIVERBS_ICON_3,Rsc1.RES_CIVERBS_ICON_4,Rsc1.RES_CIVERBS_ICON_5,Rsc1.RES_CIVERBS_ICON_6,Rsc1.RES_CIVERBS_ICON_8,Rsc1.RES_CIVERBS_ICON_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+50 防御力\r\n3 装备 	20% 快速移动/奔跑\r\n\r\n全 部 	\r\n+15 敏捷\r\n+10% 防火上限\r\n+10% 防电上限\r\n+10% 防冰上限\r\n+10% 防毒上限\r\n四防 +20\r\n20% 快速移动/奔跑\r\n+50 防御力";
		box.category = new GreenItemCategory("iraths", "依雷撒的精洗炉", R.drawable.iraths, comment);
		/* 依雷撒之绳 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IRATHSS_CORD_1,Rsc1.RES_IRATHSS_CORD_2,Rsc1.RES_IRATHSS_CORD_3,Rsc1.RES_IRATHSS_CORD_4,Rsc1.RES_IRATHSS_CORD_5,Rsc1.RES_IRATHSS_CORD_6,Rsc1.RES_IRATHSS_CORD_8,Rsc1.RES_IRATHSS_CORD_7));
		/* 依雷撒的袖口 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IRATHAS_CUFF_1,Rsc1.RES_IRATHAS_CUFF_2,Rsc1.RES_IRATHAS_CUFF_3,Rsc1.RES_IRATHAS_CUFF_4,Rsc1.RES_IRATHAS_CUFF_5,Rsc1.RES_IRATHAS_CUFF_6,Rsc1.RES_IRATHAS_CUFF_8,Rsc1.RES_IRATHAS_CUFF_7));
		/* 依雷撒的线圈 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IRATHAS_COIL_1,Rsc1.RES_IRATHAS_COIL_2,Rsc1.RES_IRATHAS_COIL_3,Rsc1.RES_IRATHAS_COIL_4,Rsc1.RES_IRATHAS_COIL_5,Rsc1.RES_IRATHAS_COIL_6,Rsc1.RES_IRATHAS_COIL_8,Rsc1.RES_IRATHAS_COIL_7));
		/* 依雷撒的项圈 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_IRATHAS_COLLAR_1,Rsc1.RES_IRATHAS_COLLAR_2,Rsc1.RES_IRATHAS_COLLAR_3,Rsc1.RES_IRATHAS_COLLAR_4,Rsc1.RES_IRATHAS_COLLAR_5,Rsc1.RES_IRATHAS_COLLAR_6,Rsc1.RES_IRATHAS_COLLAR_8,Rsc1.RES_IRATHAS_COLLAR_7));
		srv.addItemBox(box);
		//

		//
		box = new GreenItemBox();
		comment = "部分装备奖励\r\n2 装备 	+10 强壮\r\n3 装备 	+10 敏捷\r\n\r\n全 部 	\r\n+10 敏捷\r\n+10 强壮\r\n+30% 抵挡成功率\r\n四防 +10\r\n每次命中偷取 5% 生命\r\n20% 快速移动/奔跑\r\n35% 提升攻击命中率";
		box.category = new GreenItemCategory("isenhart", "依森哈德的武器室", R.drawable.isenhart, comment);
		/* 依森哈德的光之烙铁 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ISENHARTS_LIGHTBRAND_1,Rsc1.RES_ISENHARTS_LIGHTBRAND_2,Rsc1.RES_ISENHARTS_LIGHTBRAND_3,Rsc1.RES_ISENHARTS_LIGHTBRAND_4,Rsc1.RES_ISENHARTS_LIGHTBRAND_5,Rsc1.RES_ISENHARTS_LIGHTBRAND_6,Rsc1.RES_ISENHARTS_LIGHTBRAND_8,Rsc1.RES_ISENHARTS_LIGHTBRAND_7));
		/* 依森哈德的外壳 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ISENHARTS_CASE_1,Rsc1.RES_ISENHARTS_CASE_2,Rsc1.RES_ISENHARTS_CASE_3,Rsc1.RES_ISENHARTS_CASE_4,Rsc1.RES_ISENHARTS_CASE_5,Rsc1.RES_ISENHARTS_CASE_6,Rsc1.RES_ISENHARTS_CASE_8,Rsc1.RES_ISENHARTS_CASE_7));
		/* 依森哈德的闪避 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ISENHARTS_PARRY_1,Rsc1.RES_ISENHARTS_PARRY_2,Rsc1.RES_ISENHARTS_PARRY_3,Rsc1.RES_ISENHARTS_PARRY_4,Rsc1.RES_ISENHARTS_PARRY_5,Rsc1.RES_ISENHARTS_PARRY_6,Rsc1.RES_ISENHARTS_PARRY_8,Rsc1.RES_ISENHARTS_PARRY_7));
		/* 依森哈德的号角 */
		box.items.add(new GreenItem(box.category.id, Rsc1.RES_ISENHARTS_HORNS_1,Rsc1.RES_ISENHARTS_HORNS_2,Rsc1.RES_ISENHARTS_HORNS_3,Rsc1.RES_ISENHARTS_HORNS_4,Rsc1.RES_ISENHARTS_HORNS_5,Rsc1.RES_ISENHARTS_HORNS_6,Rsc1.RES_ISENHARTS_HORNS_8,Rsc1.RES_ISENHARTS_HORNS_7));
		srv.addItemBox(box);
		//
	}
}
