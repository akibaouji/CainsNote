package cains.note.data.crafted;

import cains.note.service.crafted.*;
import cains.note.view.R;

public final class CraftedItemData
{
	private CraftedItemData()
	{
	}

	public static void generate(CraftedItemService srv)
	{
		int i = 0;
		CraftedItemBox box = new CraftedItemBox();
		box.category = new CraftedItemCategory("blooditems", "血腥系列", R.drawable.blooditems);
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"头盔",
				"魔法的 头盔/无颊头盔/活动头盔",
				"魔法的 头盔/无颊头盔/活动头盔 + 拉尔 8# + 完美的红宝石 + 任何珠宝",
				"5-10% 致命攻击\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_helm, R.drawable.ral, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"武器",
				"魔法的 普通/扩展/精华 斧头",
				"魔法的 普通/扩展/精华 斧头 + 欧特 9# + 完美的红宝石 + 任何珠宝",
				"+(35-60%) 增强伤害\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_axe, R.drawable.ort, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盔甲",
				"魔法的 铠甲/圣堂武士外袍/地狱锻甲",
				"魔法的 铠甲/圣堂武士外袍/地狱锻甲 + 书尔 10# + 完美的红宝石 + 任何珠宝",
				"+(1-3) 生命在每杀一个恶魔后取得\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_armor, R.drawable.thul, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盾牌",
				"魔法的 尖刺盾牌/倒刺护盾/刀刃刺盾",
				"魔法的 尖刺盾牌/倒刺护盾/刀刃刺盾 + 伊司 6# + 完美的红宝石 + 任何珠宝",
				"攻击者受到伤害 (4-7)\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_shield, R.drawable.ith, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"手套",
				"魔法的 重手套/鲨皮手套/吸血鬼骸骨手套",
				"魔法的 重手套/鲨皮手套/吸血鬼骸骨手套 + 那夫 4# + 完美的红宝石 + 任何珠宝",
				"造成压碎性打击的概率 (5-10)%\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_glove, R.drawable.nef, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"腰带",
				"魔法的 扣带/织网腰带/秘银腰带",
				"魔法的 扣带/织网腰带/秘银腰带 + 塔尔 7# + 完美的红宝石 + 任何珠宝",
				"撕开伤口机会 (5-10)%\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_belt, R.drawable.tal, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"鞋子",
				"魔法的 轻型金属靴/战场之靴/镜化靴",
				"魔法的 轻型金属靴/战场之靴/镜化靴 + 爱斯 5# + 完美的红宝石 + 任何珠宝",
				"生命补满 + (5-10)\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.crafted_boot, R.drawable.eth, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"项链",
				"魔法的 项链",
				"魔法的 项链 + 安姆 11# + 完美的红宝石 + 任何珠宝",
				"5-10% 高速跑步/行走\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.amulets, R.drawable.amn, R.drawable.perfectruby, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"戒指",
				"魔法的 戒指",
				"魔法的 戒指 + 索尔 12# + 完美的红宝石 + 任何珠宝",
				"+(1-5) 力量\r\n(1-4)% 击中偷取生命\r\n+(10-20) 生命",
				new int[]{R.drawable.ring, R.drawable.sol, R.drawable.perfectruby, R.drawable.jewels}));

		srv.addItemBox(box);

		i = 0;
		box = new CraftedItemBox();
		box.category = new CraftedItemCategory("casteritems", "施法者系列", R.drawable.casteritems);
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"面具",
				"魔法的 面具/死亡面具/恶魔头盖骨面具",
				"魔法的 面具/死亡面具/恶魔头盖骨面具 + 那夫 4# + 完美的紫宝石 + 任何珠宝",
				"(1-4)% 击中偷取法力\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_mask, R.drawable.nef, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"武器",
				"魔法的 普通/扩展/精华的 杖类",
				"魔法的 普通/扩展/精华的 杖类 + 特尔 3# + 完美的紫宝石 + 任何珠宝",
				"增加法力上限 (1-5)%\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_staff, R.drawable.tir, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盔甲",
				"魔法的 轻型铠甲/法师铠甲/执政官铠甲",
				"魔法的 轻型铠甲/法师铠甲/执政官铠甲 + 塔尔 7# + 完美的紫宝石 + 任何珠宝",
				"+ (1-3) 点法力在每杀一个敌人后取得\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_armor2, R.drawable.tal, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盾牌",
				"魔法的 小盾牌/圆型盾/月精灵护盾",
				"魔法的 小盾牌/圆型盾/月精灵护盾 + 爱斯 5# + 完美的紫宝石 + 任何珠宝",
				"+(5-10)% 增加格挡可能性\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_shield2, R.drawable.eth, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"手套",
				"魔法的 皮手套/魔皮手套/荆棘连指手套",
				"魔法的 皮手套/魔皮手套/荆棘连指手套 + 欧特 9# + 完美的紫宝石 + 任何珠宝",
				"+(1-3) 点法力在每杀一个敌人后取得\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_glove2, R.drawable.ort, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"腰带",
				"魔法的 轻扣带/鲨皮腰带/吸血鬼獠牙腰带",
				"魔法的 轻扣带/鲨皮腰带/吸血鬼獠牙腰带 + 伊司 9# + 完美的紫宝石 + 任何珠宝",
				"5-10% 高速施展速度\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_belt2, R.drawable.ith, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"鞋子",
				"魔法的 皮靴/魔皮靴/飞龙皮靴",
				"魔法的 皮靴/魔皮靴/飞龙皮靴 + 书尔 10# + 完美的紫宝石 + 任何珠宝",
				"增加法力上限 (2-5)%\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.crafted_boot2, R.drawable.ith, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"项链",
				"魔法的 项链",
				"魔法的 项链 + 拉尔 8# + 完美的紫宝石 + 任何珠宝",
				"+(5-10)% 高速施展速度\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.amulets, R.drawable.ral, R.drawable.perfectamethyst, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"戒指",
				"魔法的 戒指",
				"魔法的 戒指 + 安姆 11# + 完美的紫宝石 + 任何珠宝",
				"+(1-5) 精力\r\n法力重生 (4-10)%\r\n+(10-20) 法力",
				new int[]{R.drawable.ring, R.drawable.amn, R.drawable.perfectamethyst, R.drawable.jewels}));

		srv.addItemBox(box);

		i = 0;
		box = new CraftedItemBox();
		box.category = new CraftedItemCategory("hitpoweritems", "强力打击系列", R.drawable.hitpoweritems);
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"头盔",
				"魔法的 高级头盔/轻钢盔/巨贝头盔",
				"魔法的 高级头盔/轻钢盔/巨贝头盔 + 伊司6# + 完美的蓝宝石 + 任何珠宝",
				"(25-50) 对飞射性防御\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.crafted_helm2, R.drawable.ith, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"武器",
				"魔法的 普通/扩展/精华的 钝器",
				"魔法的 普通/扩展/精华的 钝器 + 特尔 3# + 完美的蓝宝石 + 任何珠宝",
				"(25-50) +(35-60%) 增强伤害\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.crafted_mace, R.drawable.tir, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盔甲",
				"魔法的 实战铠甲/鲨齿战甲/海妖壳甲",
				"魔法的 实战铠甲/鲨齿战甲/海妖壳甲 + 那夫 4# + 完美的蓝宝石 + 任何珠宝",
				"10-20% 快速再度攻击\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-10)",
				new int[]{R.drawable.crafted_armor3, R.drawable.nef, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盾牌",
				"魔法的 哥德盾牌/古代之盾/保护盾牌",
				"魔法的 哥德盾牌/古代之盾/保护盾牌 + 爱斯 5# + 完美的蓝宝石 + 任何珠宝",
				"(5-10%) 增加格挡可能性\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-10)",
				new int[]{R.drawable.crafted_shield3, R.drawable.eth, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"手套",
				"魔法的 锁链手套/重型手镯/吸血鬼手套",
				"魔法的 锁链手套/重型手镯/吸血鬼手套 + 欧特 9# + 完美的蓝宝石 + 任何珠宝",
				"击退\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.crafted_glove3, R.drawable.ort, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"腰带",
				"魔法的 重扣带/战场腰带/洞穴巨魔腰带",
				"魔法的 重扣带/战场腰带/洞穴巨魔腰带 + 塔尔 7# + 完美的蓝宝石 + 任何珠宝",
				"(5-10)% 受损的生命移至法力\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.crafted_belt3, R.drawable.tal, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"鞋子",
				"魔法的 锁链靴/织网之靴/骸骨靴",
				"魔法的 锁链靴/织网之靴/骸骨靴 + 拉尔 8# + 完美的蓝宝石 + 任何珠宝",
				"(25-50) 对飞射性防御\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.crafted_boot3, R.drawable.ral, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"项链",
				"魔法的 项链",
				"魔法的 项链 + 书尔 10# + 完美的蓝宝石 + 任何珠宝",
				"击中使怪物逃跑概率 (3-11)%\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-10)",
				new int[]{R.drawable.amulets, R.drawable.thul, R.drawable.perfectsaphire, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"戒指",
				"魔法的 戒指",
				"魔法的 戒指 + 安姆 11# + 完美的蓝宝石 + 任何珠宝",
				"+(1-5) 敏捷 (3-11)%\r\n攻击时有 5% 几率施展等级 4 冰冻新星\r\n攻击者受到伤害 (3-7)",
				new int[]{R.drawable.ring, R.drawable.amn, R.drawable.perfectsaphire, R.drawable.jewels}));

		srv.addItemBox(box);

		i = 0;
		box = new CraftedItemBox();
		box.category = new CraftedItemCategory("safetyitems", "安全系列", R.drawable.safetyitems);
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"头盔",
				"魔法的 皇冠/巨皇冠/头冠",
				"魔法的 皇冠/巨皇冠/头冠 + 伊司 6# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n抗闪电 +(5-10)%\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_helm3, R.drawable.ith, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"武器",
				"魔法的 普通/扩展/精华 长矛或标枪",
				"魔法的 普通/扩展/精华 长矛或标枪 + 索尔 12# + 完美的绿宝石 + 任何珠宝",
				"+(5-10%) 防御强化\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_spear, R.drawable.sol, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盔甲",
				"魔法的 胸甲/护胸甲/巨型鳞铠胸甲",
				"魔法的 胸甲/护胸甲/巨型鳞铠胸甲 + 爱斯 5# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n冰冻时间减半\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_armor4, R.drawable.eth, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"盾牌",
				"魔法的 轻盾/龙盾/统治者大盾",
				"魔法的 轻盾/龙盾/统治者大盾 + 那夫 4# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n魔法抗性 +(5-10)%\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_shield4, R.drawable.nef, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"手套",
				"魔法的 铁手套/巨战手套/食人魔铁手套",
				"魔法的 铁手套/巨战手套/食人魔铁手套 + 拉尔 8# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n抗寒 +(5-10)%\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_glove4, R.drawable.ral, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"腰带",
				"魔法的 饰带/魔皮动带/蛛网腰带",
				"魔法的 饰带/魔皮动带/蛛网腰带 + 塔尔 8# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n抗毒 +(5-10)%\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_belt4, R.drawable.tal, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"鞋子",
				"魔法的 护胫/巨战之靴/极速靴",
				"魔法的 护胫/巨战之靴/极速靴 + 欧特 9# + 完美的绿宝石 + 任何珠宝",
				"+(10-30)% 防御强化\r\n抗火 +(5-10)%\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.crafted_boot4, R.drawable.ort, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"项链",
				"魔法的 项链",
				"魔法的 项链 + 书尔 10# + 完美的绿宝石 + 任何珠宝",
				"+(1-10)% 增加格挡可能性\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.amulets, R.drawable.thul, R.drawable.perfectemerald, R.drawable.jewels}));
		box.items.add(new CraftedItem(box.category.id, box.category.id + "_" + String.valueOf(i++),
				"戒指",
				"魔法的 戒指",
				"魔法的 戒指 + 安姆 11# + 完美的绿宝石 + 任何珠宝",
				"+(1-5) 体力\r\n法术伤害减少 (1-2)\r\n伤害减少 (1-4)",
				new int[]{R.drawable.ring, R.drawable.amn, R.drawable.perfectemerald, R.drawable.jewels}));

		srv.addItemBox(box);
	}
}
