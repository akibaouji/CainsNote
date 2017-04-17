package cains.note.data.formula;

import cains.note.view.R;
import cains.note.service.formula.*;

public final class FormulaData
{
	private FormulaData()
	{
	}

	public static void generate(FormulaService srv)
	{
		int i = 0;

		//符文类
		FormulaBox box = new FormulaBox();
		box.category = new FormulaCategory("formula_rune", "符文合成类", R.drawable.formula_rune);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 艾尔(1#)", "1 艾德(2#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.el,R.drawable.el,R.drawable.el}, R.drawable.eld));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 艾德(2#)", "1 特尔(3#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.eld,R.drawable.eld,R.drawable.eld}, R.drawable.tir));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 特尔(3#)", "1 那夫(4#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.tir,R.drawable.tir,R.drawable.tir}, R.drawable.nef));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 那夫(4#)", "1 爱斯(5#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.nef,R.drawable.nef,R.drawable.nef},R.drawable.eth));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 爱斯(5#)", "1 伊司(6#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.eth,R.drawable.eth,R.drawable.eth}, R.drawable.ith));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 伊司(6#)", "1 塔尔(7#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.ith,R.drawable.ith,R.drawable.ith}, R.drawable.tal));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 塔尔(7#)", "1 拉尔(8#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.tal,R.drawable.tal,R.drawable.tal}, R.drawable.ral));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 拉尔(8#)", "1 欧特(9#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.ral,R.drawable.ral,R.drawable.ral}, R.drawable.ort));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 欧特(9#)", "1 书尔(10#)", "3 个相同符文 (符文 1-9#) = 1 个更高级别符文, 这个规律只能到 9#.", new int[]{R.drawable.ort,R.drawable.ort,R.drawable.ort},R.drawable.thul));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 书尔(10#) + 1 碎裂的黄宝石", "安姆(11#)", null, new int[]{R.drawable.thul,R.drawable.thul,R.drawable.thul,R.drawable.chippedtopaz}, R.drawable.amn));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 安姆(11#) + 1 碎裂的紫宝石", "索尔(12#)", null, new int[]{R.drawable.amn, R.drawable.amn, R.drawable.amn,R.drawable.chippedamethyst}, R.drawable.sol));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 索尔(12#) + 1 碎裂的蓝宝石", "夏(13#)", null, new int[]{R.drawable.sol,R.drawable.sol,R.drawable.sol,R.drawable.chippedsaphire}, R.drawable.shael));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 夏(13#) + 1 碎裂的红宝石", "多尔(14#)", null, new int[]{R.drawable.shael,R.drawable.shael,R.drawable.shael,R.drawable.chippedruby},R.drawable.dol));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 多尔(14#) + 1 碎裂的绿宝石", "海尔(15#)", null, new int[]{R.drawable.dol,R.drawable.dol,R.drawable.dol, R.drawable.chippedemerald},R.drawable.hel));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 海尔(15#) + 1 碎裂的钻石", "破(16#)", null, new int[]{R.drawable.hel,R.drawable.hel,R.drawable.hel,R.drawable.chippeddiamond},R.drawable.io));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 破(16#) + 1 裂开的黄宝石", "卢姆(17#)", null, new int[]{R.drawable.io,R.drawable.io,R.drawable.io,R.drawable.flawedtopaz},R.drawable.lum));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 卢姆(17#) + 1 裂开的紫宝石", "科(18#)", null,new int[]{R.drawable.lum,R.drawable.lum,R.drawable.lum,R.drawable.flawedamethyst},R.drawable.ko));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 科(18#) + 1 裂开的蓝宝石", "法尔(19#)", null,new int[]{R.drawable.ko,R.drawable.ko,R.drawable.ko,R.drawable.flawedsaphire},R.drawable.fal));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 法尔(19#) + 1 裂开的红宝石", "蓝姆(20#)", null,new int[]{R.drawable.fal,R.drawable.fal,R.drawable.fal,R.drawable.flawedruby},R.drawable.lem));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 蓝姆(20#) + 1 裂开的绿宝石", "普尔(21#)", null,new int[]{R.drawable.lem,R.drawable.lem,R.drawable.lem,R.drawable.flawedemerald},R.drawable.pul));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 普尔(21#) + 1 裂开的钻石", "乌姆(22#)", null,new int[]{R.drawable.pul,R.drawable.pul,R.drawable.flaweddiamond},R.drawable.um));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 乌姆(22#) + 1 黄宝石", "马尔(23#)", null,new int[]{R.drawable.um,R.drawable.um,R.drawable.topaz},R.drawable.mal));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 马尔(23#) + 1 紫宝石", "伊司特(24#)", null,new int[]{R.drawable.mal,R.drawable.mal,R.drawable.amethyst},R.drawable.ist));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 伊司特(24#) + 1 蓝宝石", "古尔(25#)", null,new int[]{R.drawable.ist,R.drawable.ist,R.drawable.saphire},R.drawable.gul));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 古尔(25#) + 1 红宝石", "伐克斯(26#)", null,new int[]{R.drawable.gul,R.drawable.gul,R.drawable.ruby},R.drawable.vex));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 伐克斯(26#) + 1 绿宝石", "欧姆(27#)", null,new int[]{R.drawable.vex,R.drawable.vex,R.drawable.emerald},R.drawable.ohm));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 欧姆(27#) + 1 钻石", "罗(28#)", null,new int[]{R.drawable.ohm,R.drawable.ohm,R.drawable.diamond},R.drawable.lo));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 罗(28#) + 1 无瑕疵的黄宝石", "瑟(29#)", null,new int[]{R.drawable.lo,R.drawable.lo,R.drawable.flawlesstopaz},R.drawable.sur));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 瑟(29#) + 1 无瑕疵的紫宝石", "贝(30#)", null,new int[]{R.drawable.sur,R.drawable.sur,R.drawable.flawlessamethyst},R.drawable.ber));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 贝(30#) + 1 无瑕疵的蓝宝石", "乔(31#)", null,new int[]{R.drawable.ber,R.drawable.ber,R.drawable.flawlesssaphire},R.drawable.jah));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 乔(31#) + 1 无瑕疵的红宝石", "查姆(32#)", null,new int[]{R.drawable.jah,R.drawable.jah,R.drawable.flawlessruby},R.drawable.cham));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 查姆(32#) + 1 无瑕疵的绿宝石", "萨德(33#)", null,new int[]{R.drawable.cham,R.drawable.cham,R.drawable.flawlessemerald},R.drawable.zod));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_levUp", "武器防具升级类", R.drawable.formula_levup);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 艾德(2#) + 1 碎裂的宝石 + 劣质的武器", "同样类型普通品质的武器", "ilvl = 1. ilvl 始终被设定为 1.", new int[]{R.drawable.eld,R.drawable.chippedruby,R.drawable.weapon}, R.drawable.weapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 艾尔(1#) + 1 碎裂的宝石 + 劣质的盔甲", "同样类型普通品质的盔甲", "ilvl = 1. ilvl 始终被设定为 1.", new int[]{R.drawable.el,R.drawable.chippedruby,R.drawable.armor2}, R.drawable.armor2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 欧特(9#) + 1 安姆(11#) + 1 完美蓝宝石 + 普通级杰出武器", "扩展级杰出武器", "物品基础类型的升级.", new int[]{R.drawable.ort,R.drawable.amn,R.drawable.perfectsaphire,R.drawable.weapon}, R.drawable.weapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 1 书尔(10#) + 1 完美紫宝石 + 普通级杰出盔甲", "扩展级杰出盔甲", "物品基础类型的升级.", new int[]{R.drawable.ral,R.drawable.thul,R.drawable.perfectamethyst,R.drawable.armor2}, R.drawable.armor2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 法尔(19#) + 1 乌姆(22#) + 1 完美的蓝宝石 + 扩展级杰出武器", "精华级杰出武器", "物品基础类型的升级.", new int[]{R.drawable.fal,R.drawable.um,R.drawable.perfectsaphire,R.drawable.weapon}, R.drawable.weapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 科(18#) + 1 普尔(21#) + 1 完美的紫宝石 + 扩展级杰出盔甲", "精华级杰出盔甲", "物品基础类型的升级.", new int[]{R.drawable.ko,R.drawable.pul,R.drawable.perfectamethyst,R.drawable.armor2}, R.drawable.armor2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 1 索尔(12#) + 1 完美的绿宝石 + 普通级暗金武器", "扩展级暗金武器", "你可以使用这个升级公式将一件暗金武器的基础类型从普通级升到扩展级,升级只针对物品基础类型,属性不会改变.这个公式可以作用在无形物品上. 并且已经插在物品上的符文,珠宝等依然存在.", new int[]{R.drawable.ral,R.drawable.sol,R.drawable.perfectemerald,R.drawable.goldweaponlv1}, R.drawable.goldweaponlv1));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 塔尔(7#) + 1 夏(13#) + 1 完美的钻石 + 普通级暗金盔甲", "扩展级暗金盔甲", "你可以使用这个升级公式将一件暗金盔甲的基础类型从普通级升到扩展级,升级只针对物品基础类型,属性不会改变.这个公式可以作用在无形物品上. 并且已经插在物品上的符文,珠宝等依然存在.", new int[]{R.drawable.tal,R.drawable.shael,R.drawable.perfectdiamond,R.drawable.goldarmorlv1}, R.drawable.goldarmorlv1));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 卢姆(17#) + 1 普尔(21#) + 1 完美的绿宝石 + 扩展级暗金武器", "精华级暗金武器", "你可以使用这个升级公式将一件暗金武器的基础类型从扩展级升到精华级,升级只针对物品基础类型,属性不会改变.这个公式可以作用在无形物品上. 并且已经插在物品上的符文,珠宝等依然存在.(单机游戏, 天梯模式独有)", new int[]{R.drawable.lum,R.drawable.pul,R.drawable.perfectemerald,R.drawable.goldweaponlv2}, R.drawable.goldweaponlv2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 科(18#) + 1 蓝姆(20#) + 1 完美的钻石 + 扩展级暗金盔甲", "精华级暗金盔甲", "你可以使用这个升级公式将一件暗金盔甲的基础类型从扩展级升到精华级,升级只针对物品基础类型,属性不会改变.这个公式可以作用在无形物品上. 并且已经插在物品上的符文,珠宝等依然存在.(单机游戏, 天梯模式独有)", new int[]{R.drawable.ko,R.drawable.lem,R.drawable.perfectdiamond,R.drawable.goldarmorlv2}, R.drawable.goldarmorlv2));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_punch", "装备打孔类", R.drawable.formula_punch);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 完美的骷髅 + 1 稀有装备 + 乔丹之石", "给该稀有装备增加 1 凹槽", "稀有装备只能有一个凹槽. 当它已有凹槽时,你无法增加新的凹槽. 你只能应用在没有凹槽的稀有装备上.", new int[]{R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.weapon,R.drawable.stoneofjordan}, R.drawable.punchedweapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 标准宝石 (普通) + 1 有凹槽的武器 (任何类型)", "1 有凹槽的魔法武器 (相同类型)", "使用这个公式可以的到一个有随机数量凹槽的魔法武器. 可以允许你得到之前武器所没有的魔法效果. 当创造出新的武器后, 最初武器的属性将被删除(被变更). Ilvl=30. 凹槽数 1-2.", new int[]{R.drawable.ruby,R.drawable.ruby,R.drawable.ruby,R.drawable.punchedweapon}, R.drawable.punchedweapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 碎裂的宝石 + 1 魔法武器", "有凹槽的魔法武器", "在魔法武器上加入凹槽.原有的魔法属性将变为全新属性. 如果使用的是标枪这类无法有凹槽的物品,那么只会更新属性而不会加入凹槽. ilvl=25 魔法武器会有 1-2 凹槽.", new int[]{R.drawable.chippedruby,R.drawable.chippedruby,R.drawable.chippedruby,R.drawable.weapon}, R.drawable.punchedweapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 无瑕疵的宝石 + 1 魔法武器", "有凹槽的魔法武器", "在魔法武器上加入凹槽.原有的魔法属性将变为全新属性. 如果使用的是标枪这类无法有凹槽的物品,那么只会更新属性而不会加入凹槽. ilvl=30 魔法武器会有 1-2 凹槽.", new int[]{R.drawable.flawlessruby,R.drawable.flawlessruby,R.drawable.flawlessruby,R.drawable.weapon}, R.drawable.punchedweapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 塔尔(7#) + 1 书尔(10#) + 1 完美的黄宝石 + 普通级盔甲", "同样类型有凹槽的盔甲", "凹槽数量会发生变化.物品必须是普通级别并且没有凹槽的.劣质以及超强的物品都无法使用. 物品会随机获得 1-6 个凹槽. 无论何时,你总有很大机会获得该物品的最大凹槽数.例如,你有个物品可以有 2 个凹槽,那么就有 2/4 的概率获得 2 凹槽以及 1/4 的概率获得 1 凹槽.", new int[]{R.drawable.tal,R.drawable.thul,R.drawable.perfecttopaz,R.drawable.armor2}, R.drawable.punchedarmor));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 1 安姆(11#) + 1 完美的紫宝石 + 普通级武器", "同样类型有凹槽的武器", "凹槽数量会发生变化.物品必须是普通级别并且没有凹槽的.劣质以及超强的物品都无法使用. 物品会随机获得 1-6 个凹槽. 无论何时,你总有很大机会获得该物品的最大凹槽数.例如,你有个物品可以有 2 个凹槽,那么就有 5/6 的概率获得 2 凹槽以及 1/6 的概率获得 1 凹槽.", new int[]{R.drawable.ral,R.drawable.amn,R.drawable.perfectamethyst,R.drawable.weapon}, R.drawable.punchedweapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 1 书尔(10#) + 1 完美的蓝宝石 + 普通级头盔", "同样类型有凹槽的头盔", "凹槽数量会发生变化.物品必须是普通级别并且没有凹槽的.劣质以及超强的物品都无法使用. 物品会随机获得 1-3 个凹槽. 无论何时,你总有很大机会获得该物品的最大凹槽数.例如,你有个物品可以有 2 个凹槽,那么就有 2/3 的概率获得 2 凹槽以及 1/3 的概率获得 1 凹槽.", new int[]{R.drawable.ral,R.drawable.thul,R.drawable.perfectsaphire,R.drawable.helmet}, R.drawable.punchedhelmet));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 塔尔(7#) + 1 安姆(11#) + 1 完美的红宝石 + 普通级盾牌", "同样类型有凹槽的盾牌", "凹槽数量会发生变化.物品必须是普通级别并且没有凹槽的.劣质以及超强的物品都无法使用. 物品会随机获得 1-4 个凹槽. 无论何时,你总有很大机会获得该物品的最大凹槽数.例如,你有个物品可以有 2 个凹槽,那么就有 3/4 的概率获得 2 凹槽以及 1/4 的概率获得 1 凹槽.", new int[]{R.drawable.tal,R.drawable.amn,R.drawable.perfectruby,R.drawable.shield2}, R.drawable.punchedshield));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_repair", "装备修复类", R.drawable.formula_repair);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 欧特(9#) + 武器", "完全耐久度的武器", "你无法修理无形的武器.", new int[]{R.drawable.ort,R.drawable.weapon}, R.drawable.weapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 盔甲", "完全耐久度的盔甲", "你无法修理无形的盔甲.", new int[]{R.drawable.ral,R.drawable.armor2}, R.drawable.armor2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 海尔(15#) + 城镇传送卷轴 + 任何已安装凹槽装备", "移除凹槽中物品", "警告: 这会摧毁任何以插入的宝石, 符文或是珠宝. 当你想改变凹槽中的物品以适应新的环境时,这个公式非常适合你.", new int[]{R.drawable.hel,R.drawable.scroll1,R.drawable.embeddedshield}, R.drawable.removedshield));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 欧特(9#) + 1 碎裂的宝石 (任何种类) + 武器", "完全耐久度和充能的武器", "你无法修理无形的武器.", new int[]{R.drawable.ort,R.drawable.chippedruby,R.drawable.weapon}, R.drawable.weapon));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 拉尔(8#) + 1 裂开的宝石 (任何种类) + 盔甲", "完全耐久度和充能的盔甲", "你无法修理无形的盔甲.盔甲包括的部位不光有衣服,还有头, 脚, 腰带, 手套和盾牌.", new int[]{R.drawable.ral,R.drawable.flawedruby,R.drawable.armor2}, R.drawable.armor2));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_item", "物品合成类", R.drawable.formula_item);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 治疗药剂 + 3 法力药剂 + 1 碎裂的宝石", "1 回复活力药剂", "使用这个公式可以制造回复生命/法力的药剂.任何级别的治疗/法力药剂都可以使用.你也可以使用碎裂的骷髅代替宝石.", new int[]{R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.manapotion,R.drawable.manapotion,R.drawable.manapotion,R.drawable.chippedruby}, R.drawable.potion));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 治疗药剂 + 3 法力药剂 + 1 宝石 (第三级)", "1 全面回复活力药剂", "使用这个公式可以制造完全回复生命/法力的药剂.任何级别的治疗/法力药剂都可以使用.你也可以使用骷髅代替宝石.", new int[]{R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.manapotion,R.drawable.manapotion,R.drawable.manapotion,R.drawable.ruby}, R.drawable.fullpotion));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 回复活力药剂", "1 全面回复活力药剂", null, new int[]{R.drawable.potion,R.drawable.potion,R.drawable.potion}, R.drawable.fullpotion));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"窒息瓦斯药剂 + 任何类型治疗药剂", "1 解毒药剂", null, new int[]{R.drawable.chokinggaspotion,R.drawable.healingpotion}, R.drawable.antidote));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 同类型宝石 (完美的 级别之下)", "1 高一级同类型宝石", "使用这个公式可以将那些没用的低级宝石升级后发挥更大作用.", new int[]{R.drawable.flawlessruby,R.drawable.flawlessruby,R.drawable.flawlessruby}, R.drawable.perfectruby));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 十字弓弹", "1 箭矢", "生成的数量随机.", new int[]{R.drawable.bolt,R.drawable.bolt}, R.drawable.arrow));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"2 箭矢", "1 十字弓弹", "生成的数量随机.", new int[]{R.drawable.arrow,R.drawable.arrow}, R.drawable.bolt));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 长矛 + 1 箭矢", "1 标枪", "任何 角色/类型 的长矛都可以用来转换.", new int[]{R.drawable.spear2,R.drawable.arrow}, R.drawable.javalins2));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 斧头 + 1 匕首", "1 飞斧", "任何 角色/类型 的斧头都可以用来转换,生成的飞斧数量随机.", new int[]{R.drawable.axe,R.drawable.dagger2}, R.drawable.throwingaxe));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 完美的骷髅 + 1 稀有装备 + 乔丹之石", "1 同类型更高品质的稀有装备", "这个公式可以用来合成更高品质的随机物品. ilvl = int(.66 * clvl) + int(.66 * ilvl). 也就是物品的 ilvl 等于 66 乘以你的 clvl 加上 66 乘以 ilvl, 物品的 ilvl 要取整数", new int[]{R.drawable.perfectskull,R.drawable.wand,R.drawable.stoneofjordan}, R.drawable.wand));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"6 完美的骷髅 + 1 稀有装备", "1 随机新的同类型稀有装备", "你不能用这个公式去改变稀有装备的类型. ilvl = int(.4 * clvl) + int(.4 * ilvl) . 这个公式无法作用在占用空间大于 3x2 的物品上.", new int[]{R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.perfectskull,R.drawable.wand}, R.drawable.wand));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"4 治疗药剂 (任何类型) + 红宝石 (任何类型) + 魔法剑", "吸血属性的魔法剑", "你可以通过这个公式获得一把吸血剑. ilvl = 30. 合成的剑始终为 \"巫妖的\" 后缀 (4-5% 击中偷取生命) 并且有可能得到好的前缀. 剑的类型不会改变. 例如, 放入双手剑后仍然得到的是有了吸血属性的双手剑.", new int[]{R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.healingpotion,R.drawable.ruby,R.drawable.sword}, R.drawable.sword));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 魔法盾牌 (任何类型) + 1 狼牙棒 (任何质量) + 2 骷髅 (任何质量)", "尖刺之魔法盾牌 (ilvl=30)", "盾牌始终拥有 \"尖刺之\"(of Spikes) 的后缀 (攻击者受到伤害 4-6) 并且有机会得到一个前缀. 这个盾牌的类型是固定的, 任何盾牌的类型 (包括圣骑士盾牌和死灵法师的萎缩头颅) 都可以作为材料使用.", new int[]{R.drawable.spikedshield,R.drawable.spikedclub,R.drawable.skull,R.drawable.skull}, R.drawable.spikedshield));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"钻石 (任何品质) + 1 法杖 (任何类型及品质) + 1 波形刀 (任何品质) + 1 腰带 (任何类型及品质)", "野人的前缀的木棍类型武器 (ivl = 50)", "木棍始终拥有\"野人的\"(Savage)这个前缀 (增加 66-80% 破(16#)坏力) 并且有机会获得额外的后缀. 木棍是长棍类武器中随机所选定的类型.", new int[]{R.drawable.diamond,R.drawable.staff,R.drawable.kris,R.drawable.belt2}, R.drawable.poleaxe2));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_accessory", "首饰合成类", R.drawable.formula_accessory);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 魔法戒指", "1 随机魔法项链", "保存那些没用的戒指来合成为新的项链. ilvl = int(.75 * clvl). 这意味着当角色级别为 65, ilvl = 48. 一些有用的魔法属性在 48 级之下就存在了. 但例如 +2 所有技能的项链级别为 90, 所以你无法通过这个公式获得一个 +2 所有技能的项链.", new int[]{R.drawable.ring,R.drawable.ring,R.drawable.ring}, R.drawable.amulets));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 魔法项链", "1 随机魔法戒指", "保存那些没用的项链来合成为新的戒指. ilvl = int(.75 * clvl). 这意味着当角色级别为 65, ilvl = 48. 一些有用的魔法属性在 48 级之下就存在了.", new int[]{R.drawable.amulets,R.drawable.amulets,R.drawable.amulets}, R.drawable.ring));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"3 完美的宝石 (任何类型) + 1 魔法物品", "1 相同类型新的魔法物品", "你可以使用这个公式获得一件同类型的新的魔法物品.ilvl = ilvl. 这意味着 ilvl 不会变化. \"ilvl 被设定到了一个固定的数值\" 就像有些公式中出现的情况一样与 \"ilvl的输出和它的输入是一样的\" 之间的不同作为情形记录下来是很有必要的. 因此如果你想合成一个加技能的超大型护身符, 那么, 你应该用噩梦开始掉落的护身符, 而不应该是鲜血荒地掉落的护身符. 你可以用这个公式(项链)来制造一条 +2 所有技能的项链, 但你的角色在没达到 84 级之前这是非常冒险的. 然而要告诫大家的是得到一个这样的护身符的机会可能很低(考虑到每个物品都是有用的), 可能会经过很多次的尝试. 稀有装备无法使用此公式转化为新的稀有装备. 一般此公式多用来转换护身符和珠宝.", new int[]{R.drawable.perfectruby,R.drawable.perfectruby,R.drawable.perfectruby,R.drawable.jewels}, R.drawable.jewels));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"6 完美的宝石 (1 每种类型) + 1 项链 (魔法)", "所有抗性项链", "使用这个公式可以获得所有抗性的项链. ilvl = 50. 这个项链始终拥有 Prismatic 前缀 (所有抗性 +16-20) 并且有可能获得不错的后缀.", new int[]{R.drawable.perfectruby,R.drawable.perfectamethyst,R.drawable.perfectdiamond,R.drawable.perfectemerald,R.drawable.perfecttopaz,R.drawable.perfectsaphire,R.drawable.amulets}, R.drawable.amulets));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 魔法戒指 + 1 完美的绿宝石 + 1 解毒药剂", "1 抗毒戒指", "使用这个公式可以获得抗毒素戒指. 抗毒素戒指可以随机获得毒素抗性 (21-30%).你也许会获得额外的后缀. ilvl=30.", new int[]{R.drawable.ring,R.drawable.perfectemerald,R.drawable.antidote}, R.drawable.ring));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 魔法戒指 + 1 完美的红宝石 + 1 爆裂药剂", "1 抗火戒指", "使用这个公式可以获得抗火焰戒指. 抗火焰戒指可以随机获得火焰抗性 (21-30%).你也许会获得额外的后缀. ilvl=30.", new int[]{R.drawable.ring,R.drawable.perfectruby,R.drawable.fulminatingpotion}, R.drawable.ring));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 魔法戒指 + 1 完美的黄宝石 + 1 回复活力药剂", "1 抗电戒指", "使用这个公式可以获得抗闪电戒指. 抗闪电戒指可以随机获得闪电抗性 (21-30%).你也许会获得额外的后缀. ilvl=30.", new int[]{R.drawable.ring,R.drawable.perfecttopaz,R.drawable.potion}, R.drawable.ring));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"1 魔法戒指 + 1 完美的蓝宝石 + 1 溶解药剂", "1 抗冰戒指", "使用这个公式可以获得抗冰冻戒指. 抗冰冻戒指可以随机获得冰冻抗性 (21-30%).你也许会获得额外的后缀. ilvl=30.", new int[]{R.drawable.ring,R.drawable.perfectsaphire,R.drawable.thawingpotion}, R.drawable.ring));
		srv.addItemBox(box);

		box = new FormulaBox();
		i = 0;
		box.category = new FormulaCategory("formula_quest", "任务合成类", R.drawable.formula_quest);
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"国王之杖 + 蝮蛇项链", "赫拉迪克法杖", "进入都瑞尔的房间", new int[]{R.drawable.staffofkings,R.drawable.amuletoftheviper}, R.drawable.horadicstaff));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"卡里姆的眼球 + 卡里姆的大脑 + 卡里姆的心脏 + 卡里姆链枷", "卡里姆的意愿", "摧毁强制球体", new int[]{R.drawable.eye,R.drawable.brain,R.drawable.heart,R.drawable.flail}, R.drawable.flail));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"维特之腿 + 城镇传送之书", "秘密奶牛关卡传送门", "你必须在第一场景的箩格营地.必须已经杀掉过当前难度下的巴尔. 警告: 如果你的红门恰好开在了牛群中间,那么很容易死亡.最好迅速跑离牛群,开个传送门以防不测.", new int[]{R.drawable.leg,R.drawable.tome}, R.drawable.reddoor));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"毁灭之钥 + 憎恨之钥 + 恐惧之钥", "通往遗忘沙漠, 苦难熔炉和女仆牢房的传送门", null, new int[]{R.drawable.key,R.drawable.key,R.drawable.key}, R.drawable.reddoor));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"迪亚波罗之角 + 巴尔之眼 + 墨菲斯托之脑", "通往混乱崔斯特瑞姆的传送门", null, new int[]{R.drawable.horn,R.drawable.eye,R.drawable.brain}, R.drawable.reddoor));
		box.items.add(new Formula(box.category.id, box.category.id + String.valueOf(i++),"恐惧之燃烧精华 + 憎恨之电精华 + 毁灭之溃烂精华 + 痛苦之扭曲精华", "赦免标记", "使用后重置属性点与技能点", new int[]{R.drawable.burning,R.drawable.charged,R.drawable.festering,R.drawable.twistted}, R.drawable.token));
		srv.addItemBox(box);

	}
}