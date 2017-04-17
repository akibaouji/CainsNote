package cains.note.service.skill;

final class AssSkillStrategy extends AbstractSkillStrategy
{
	private static int[] tbl_ass1_s1_3 = {
			1,1,1,1,1,2,2,2,2,2,
			2,3,3,3,3,3,3,4,4,4,
			4,4,4,5,5,5,5,5,5,6,
			6,6,6,6,6,7,7,7,7,7,
			7,8,8,8,8,8,8,9,9,9
	}; //龙爪踢击次数

	private static int[][] tbl_ass1_s6_1 = {
			{6,10,8,14},{11,15,16,22},{16,20,24,30},{21,25,32,38},{26,30,40,46},{31,35,48,54},{36,40,56,62},{41,45,64,70},{51,56,78,84},{61,67,94,100},
			{71,78,110,116},{81,89,126,132},{91,100,142,148},{101,111,156,164},{111,122,172,178},{121,133,188,194},{141,155,214,220},{161,177,238,248},{181,199,264,274},{201,221,288,300},
			{221,243,314,328},{241,265,338,354},{271,298,372,392},{301,331,406,428},{331,364,442,466},{361,397,476,504},{391,430,510,542},{421,463,544,578},{461,507,592,628},{501,551,638,678},
			{541,595,684,728},{581,639,732,778},{621,683,778,828},{661,727,826,878},{701,771,872,928},{741,815,920,978},{781,859,966,1028},{821,903,1014,1078},{861,947,1060,1128},{901,991,1106,1178},
			{941,1035,1154,1228},{981,1079,1200,1278},{1021,1123,1248,1328},{1061,1167,1294,1378},{1101,1211,1342,1428},{1141,1255,1388,1478},{1181,1299,1434,1528},{1221,1343,1482,1578},{1261,1387,1528,1628},{1301,1431,1576,1678}
	}; //焰拳火伤(1级,3级)

	private static int[][] tbl_ass1_s18_1 = {
			{80,30,40},{100,45,60},{120,60,80},{140,75,100},{160,90,120},{180,105,140},{200,120,160},{220,135,180},{260,160,220},{300,185,260},
			{340,210,300},{380,235,340},{420,260,380},{460,285,420},{500,310,460},{540,335,500},{600,370,560},{660,405,620},{720,440,680},{780,475,740},
			{840,510,800},{900,545,860},{980,590,940},{1060,635,1020},{1140,680,1100},{1220,725,1180},{1300,770,1260},{1380,815,1340},{1480,880,1440},{1580,945,1540},
			{1680,1010,1640},{1780,1075,1740},{1880,1140,1840},{1980,1205,1940},{2080,1270,2040},{2180,1335,2140},{2280,1400,2240},{2380,1465,2340},{2480,1530,2440},{2580,1595,2540},
			{2680,1660,2640},{2780,1725,2740},{2880,1790,2840},{2980,1855,2940},{3080,1920,3040},{3180,1985,3140},{3280,2050,3240},{3380,2115,3340},{3480,2180,3440},{3580,2245,3540}
	}; //闪电爪电伤

	private static int[][] tbl_ass1_s24_1 = {
			{15,35},{23,43},{31,51},{39,59},{47,67},{55,75},{63,83},{71,91},{81,101},{91,111},
			{101,121},{111,131},{121,141},{131,151},{141,161},{151,171},{171,193},{191,215},{211,237},{231,259},
			{251,281},{271,303},{301,335},{331,367},{361,399},{391,431},{421,463},{451,495},{491,537},{531,579},
			{571,621},{611,663},{651,705},{691,747},{731,789},{771,831},{811,873},{851,915},{891,957},{931,999},
			{971,1041},{1011,1083},{1051,1125},{1091,1167},{1131,1209},{1171,1251},{1211,1293},{1251,1335},{1291,1377},{1331,1419}
	}; //寒冰刃冰伤

	private static int[][] tbl_ass1_s30_2 = {
			{20,40,12,21,40,16,32},{30,50,24,33,60,20,36},{40,60,36,45,80,24,40},{50,70,48,57,100,28,44},{60,80,60,69,120,32,48},{70,90,72,81,140,36,52},{80,100,84,93,160,40,56},{90,110,96,105,180,44,60},{109,131,117,126,220,52,68},{128,152,141,150,260,60,76},
			{147,173,165,174,300,68,84},{166,194,189,198,340,76,92},{185,215,213,222,380,84,100},{204,236,234,246,420,92,108},{223,257,258,267,460,100,116},{242,278,282,291,500,108,124},{271,311,321,330,560,120,137},{300,344,357,372,620,132,150},{329,377,396,411,680,144,163},{358,410,432,450,740,156,176},
			{387,443,471,492,800,168,189},{416,476,507,531,860,180,202},{454,518,558,588,940,200,223},{492,560,609,642,1020,220,244},{530,602,663,699,1100,240,265},{568,644,714,756,1180,260,286},{606,686,765,813,1260,280,307},{644,728,816,867,1340,300,328},{690,778,888,942,1440,328,357},{736,828,957,1017,1540,356,386},
			{782,878,1026,1092,1640,384,415},{828,928,1098,1167,1740,412,444},{874,978,1167,1242,1840,440,473},{920,1028,1239,1317,1940,468,502},{966,1078,1308,1392,2040,496,531},{1012,1128,1380,1467,2140,524,560},{1058,1178,1449,1542,2240,552,589},{1104,1228,1521,1617,2340,580,618},{1150,1278,1590,1692,2440,608,647},{1196,1328,1659,1767,2540,636,676},
			{1242,1378,1731,1842,2640,664,705},{1288,1428,1800,1917,2740,692,734},{1334,1478,1872,1992,2840,720,763},{1380,1528,1941,2067,2940,748,792},{1426,1578,2013,2142,3040,776,821},{1472,1628,2082,2217,3140,804,850},{1518,1678,2151,2292,3240,832,879},{1564,1728,2223,2367,3340,860,908},{1610,1778,2292,2442,3440,888,937},{1656,1828,2364,2517,3540,916,966}
	}; //凤凰攻击伤害(陨石,火焰爆炸,连锁闪电,混沌冰弹)

	private static int[] tbl_ass2_s1_2 = {
			3,6,9,11,12,13,14,15,16,17,
			17,18,18,19,19,20,20,20,20,21,
			21,21,21,22,22,22,22,22,22,22,
			23,23,23,23,23,23,23,23,23,23,
			23,24,24,24,24,24,24,24,24,24
	}; //利爪掌握一击必杀概率

	private static int[][] tbl_ass2_s1_3 = {
			{1,3},{2,4},{3,6},{4,7},{5,9},{6,10},{7,12},{8,13},{9,15},{11,17},
			{12,19},{14,21},{15,23},{17,25},{18,27},{20,29},{22,32},{24,34},{26,37},{28,39},
			{30,42},{32,44},{34,47},{37,50},{39,53},{42,56},{44,59},{47,62},{50,66},{53,69},
			{56,73},{59,76},{62,80},{65,83},{68,87},{71,90},{74,94},{77,97},{80,101},{83,104},
			{86,108},{89,111},{92,115},{95,118},{98,122},{101,125},{104,129},{107,132},{110,136},{113,139}
	}; //心灵战锤伤害

	private static int[][] tbl_ass2_s6_1 = {
			{21,23},{27,29},{31,34},{34,39},{37,42},{39,45},{41,47},{42,49},{44,51},{45,52},
			{46,54},{47,55},{48,56},{49,57},{50,57},{51,59},{51,59},{51,60},{52,60},{52,61},
			{53,61},{53,62},{54,62},{54,63},{54,63},{55,63},{55,64},{55,64},{55,65},{55,65},
			{56,65},{56,65},{56,66},{56,66},{56,66},{57,66},{57,66},{57,67},{57,67},{57,67},
			{57,67},{58,67},{58,67},{58,67},{58,68},{58,68},{58,68},{58,68},{59,68},{59,68}
	}; //速度爆发攻击速度,移动速度

	private static int[] tbl_ass2_s12_2 = {
			26,32,36,39,42,44,46,47,49,50,
			51,52,53,54,55,56,56,56,57,57,
			58,58,59,59,59,60,60,60,60,60,
			61,61,61,61,61,62,62,62,62,62,
			62,63,63,63,63,63,63,63,64,64
	}; //武器格挡概率

	private static int[][] tbl_ass2_s18_1 = {
			{47,19},{53,27},{58,33},{62,38},{65,42},{67,45},{69,48},{71,50},{73,52},{74,54},
			{75,56},{76,57},{77,58},{78,60},{79,60},{80,62},{80,62},{81,63},{81,63},{82,64},
			{82,65},{83,65},{83,66},{84,67},{84,67},{84,67},{85,68},{85,68},{85,69},{85,69},
			{86,69},{86,69},{86,70},{86,70},{86,70},{87,71},{87,71},{87,71},{87,71},{87,71},
			{87,71},{88,72},{88,72},{88,72},{88,73},{88,73},{88,73},{88,73},{89,73},{89,73}
	}; //消退减少诅咒持续时间,所有抗性

	private static int[] tbl_ass2_s18_2 = {
			376,432,488,545,601,658,714,770,827,883,
			940,996,1052,1109,1165,1222,1278,1334,1391,1447,
			1504,1560,1616,1673,1729,1786,1842,1898,1955,2011,
			2068,2124,2180,2237,2293,2350,2406,2462,2519,2575,
			2632,2688,2744,2801,2857,2914,2970,3026,3083,3139
	}; //影子战士生命

	private static int[][] tbl_ass2_s24_3 = {
			{10,18},{12,21},{14,24},{16,26},{18,27},{20,28},{22,29},{24,30},{29,31},{34,32},
			{39,32},{44,33},{49,33},{54,34},{59,34},{64,35},{72,35},{80,35},{88,35},{96,36},
			{104,36},{112,36},{120,36},{128,37},{136,37},{144,37},{152,37},{160,37},{168,37},{176,37},
			{184,38},{192,38},{200,38},{208,38},{216,38},{224,38},{232,38},{240,38},{248,38},{256,38},
			{264,38},{272,39},{280,39},{288,39},{296,39},{304,39},{312,39},{320,39},{328,39},{336,39}
	}; //心灵爆震最小伤害,转化概率

	private static int[] tbl_ass2_s30_1 = {
			60,75,90,105,120,135,150,165,185,205,
			225,245,265,285,305,325,350,375,400,425,
			450,475,505,535,565,595,625,655,690,725,
			760,795,830,865,900,935,970,1005,1040,1075,
			1110,1145,1180,1215,1250,1285,1320,1355,1390,1425
	}; //毒牙最低毒伤

	private static int[] tbl_ass2_s30_2 = {
			5,16,25,32,38,42,46,49,52,54,
			56,58,60,61,62,63,65,65,66,67,
			68,69,69,70,71,71,72,72,72,73,
			73,74,74,74,75,75,75,75,76,76,
			76,76,77,77,77,77,77,78,78,78
	}; //影子大师抗性

	private static int[][] tbl_ass3_s1_2 = {
			{3,4},{4,6},{6,9},{7,11},{9,14},{10,16},{12,19},{13,21},{17,27},{21,32},
			{25,38},{29,43},{33,49},{37,54},{41,60},{45,65},{55,77},{65,89},{75,101},{85,113},
			{95,125},{105,137},{124,159},{143,181},{162,203},{181,225},{200,247},{219,269},{248,302},{277,335},
			{306,368},{335,401},{364,434},{393,467},{422,500},{451,533},{480,566},{509,599},{538,632},{567,665},
			{596,698},{625,731},{654,764},{683,797},{712,830},{741,863},{770,896},{799,929},{828,962},{857,995}
	}; //火焰爆震火伤

	private static int[] tbl_ass3_s6_1 = {
			10,13,16,19,22,25,28,31,37,43,
			49,55,61,67,73,79,89,99,109,119,
			129,139,154,169,184,199,214,229,250,271,
			292,313,334,355,376,397,418,439,460,481,
			502,523,544,565,586,607,628,649,670,691
	}; //闪电网伤害

	private static int[] tbl_ass3_s6_1_2 = {
			6,6,6,7,7,7,7,8,8,8,
			8,9,9,9,9,10,10,10,10,11,
			11,11,11,12,12,12,12,13,13,13,
			13,14,14,14,14,15,15,15,15,16,
			16,16,16,17,17,17,17,18,18,18
	}; //闪电网数量

	private static int[][] tbl_ass3_s6_3 = {
			{6,10},{9,13},{12,16},{15,19},{18,22},{21,25},{24,28},{27,31},{31,35},{35,39},
			{39,43},{43,47},{47,51},{51,55},{55,59},{59,63},{64,68},{69,73},{74,78},{79,83},
			{84,88},{89,93},{94,98},{99,103},{104,108},{109,113},{114,118},{119,123},{124,128},{129,133},
			{134,138},{139,143},{144,148},{149,153},{154,158},{159,163},{164,168},{169,173},{174,178},{179,183},
			{184,188},{189,193},{194,198},{199,203},{204,208},{209,213},{214,218},{219,223},{224,228},{229,233}
	}; //刃之守护伤害

	private static int[] tbl_ass3_s12_1 = {
			7,10,13,16,19,22,25,28,32,36,
			40,44,48,52,56,60,66,72,78,84,
			90,96,103,110,117,124,131,138,146,154,
			162,170,178,186,194,202,210,218,226,234,
			242,250,258,266,274,282,290,298,306,314
	}; //电能守护伤害

	private static int[][] tbl_ass3_s12_2 = {
			{5,10},{7,12},{9,14},{11,16},{13,18},{15,20},{17,22},{19,24},{22,27},{25,30},
			{28,33},{31,36},{34,39},{37,42},{40,45},{43,48},{48,54},{53,60},{58,66},{63,72},
			{68,78},{73,84},{80,92},{87,100},{94,108},{101,116},{108,124},{115,132},{124,142},{133,152},
			{142,162},{151,172},{160,182},{169,192},{178,202},{187,212},{196,222},{205,232},{214,242},{223,252},
			{232,262},{241,272},{250,282},{259,292},{268,302},{277,312},{286,322},{295,332},{304,342},{313,352}
	}; //火焰复生伤害

	private static int[][] tbl_ass3_s24_2 = {
			{10,26},{19,35},{28,45},{36,55},{45,65},{54,75},{63,85},{72,95},{83,107},{94,119},
			{105,131},{116,143},{127,155},{138,167},{148,179},{159,191},{173,205},{186,220},{200,234},{214,249},
			{227,264},{241,278},{257,296},{274,314},{291,331},{307,349},{324,367},{341,384},{361,406},{381,427},
			{402,448},{422,470},{442,491},{463,513},{483,534},{503,555},{523,577},{544,598},{564,619},{584,641},
			{605,662},{625,683},{645,705},{666,726},{686,747},{706,769},{727,790},{747,811},{767,833},{788,854}
	}; //复生狱火伤害

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("ass1_s1_2")) //虎击
		{
			int lv1Up = 100 + 20*(p-1);
			int lv2Up = 200 + 40*(p-1);
			int lv3Up = 300 + 60*(p-1);

			int accuracy = 15 + 7*(p-1);

			this.beginAppendFormatLine("聚气1级 - +%1$s%% 伤害", lv1Up);
			this.appendFormatLine("聚气2级 - +%1$s%% 伤害", lv2Up);
			this.appendFormatLine("聚气3级 - +%1$s%% 伤害", lv3Up);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 1");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s1_3")) //龙爪
		{
			int damage = 5 + 7*(p-1);
			int accuracy = 20 + 25*(p-1);

			this.beginAppendFormatLine("%1$s踢击", tbl_ass1_s1_3[p-1]);
			this.appendFormatLine("踢击伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 6");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s6_1")) //焰拳
		{
			int accuracy = 15 + 7*(p-1);

			int upLev = theTree.getPoint("ass1_s30_2");
			int fireDamageLv1Min = upByPercent3(tbl_ass1_s6_1[p-1][0], 12, upLev);
			int fireDamageLv1Max = upByPercent3(tbl_ass1_s6_1[p-1][1], 12, upLev);
			int fireDamageLv3Min = upByPercent3(tbl_ass1_s6_1[p-1][2], 6, upLev);
			int fireDamageLv3Max = upByPercent3(tbl_ass1_s6_1[p-1][3], 6, upLev);

			this.beginAppendFormatLine("聚气1级 - 火焰伤害: %1$s-%2$s", fireDamageLv1Min,fireDamageLv1Max);
			this.appendLine("聚气2级 - 火焰伤害半径: 2.6 码");
			this.appendFormatLine("聚气3级 - 火焰伤害: %1$s-%2$s 每秒", fireDamageLv3Min,fireDamageLv3Max);
			this.appendFormatLine("命中率: +%1$s%%",accuracy);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s6_3")) //双龙爪
		{
			int damage = 50 + 5*(p-1);
			int accuracy = 40 + 25*(p-1);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s12_2")) //眼镜蛇攻击
		{
			int leechLv1 = 40 + 5*(p-1);
			int leechLv2 = 40 + 5*(p-1);
			int leechLv3 = 80 + 10*(p-1);
			int accuracy = 15 + 7*(p-1);

			this.beginAppendFormatLine("聚气1级 - +%1$s%% 生命偷取", leechLv1);
			this.appendFormatLine("聚气2级 - +%1$s%% 生命和魔法偷取", leechLv2);
			this.appendFormatLine("聚气3级 - +%1$s%% 生命和魔法偷取", leechLv3);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s18_1")) //闪电爪
		{
			int upLev = theTree.getPoint("ass1_s30_2");

			int lightDamageLv1Min = upByPercent3(1,8,upLev);
			int lightDamageLv2Min = upByPercent3(1,8,upLev);
			int lightDamageLv3Min = upByPercent3(1,8,upLev);

			int lightDamageLv1Max = upByPercent3(tbl_ass1_s18_1[p-1][0],8,upLev);
			int lightDamageLv2Max = upByPercent3(tbl_ass1_s18_1[p-1][1],8,upLev);
			int lightDamageLv3Max = upByPercent3(tbl_ass1_s18_1[p-1][2],8,upLev);
			int accuracy = 15 + 7*(p-1);

			this.beginAppendFormatLine("聚气1级 - 闪电伤害: %1$s-%2$s", lightDamageLv1Min, lightDamageLv1Max);
			this.appendFormatLine("聚气2级 - 新星伤害: %1$s-%2$s", lightDamageLv2Min, lightDamageLv2Max);
			this.appendFormatLine("聚气3级 - 闪电球伤害: %1$s-%2$s", lightDamageLv3Min, lightDamageLv3Max);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s18_3")) //神龙摆尾
		{
			int fireDamage = 50 + 10*(p-1);
			int accuracy = 20 + 15*(p-1);

			this.beginAppendFormatLine("火焰伤害: +%1$s%%", fireDamage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s24_1")) //寒冰刃
		{
			int upLev = theTree.getPoint("ass1_s30_2");

			int iceDamageMin = upByPercent3(tbl_ass1_s24_1[p-1][0],8,upLev);
			int iceDamageMax = upByPercent3(tbl_ass1_s24_1[p-1][1],8,upLev);
			float duration = upFloat2(4 + 0.4f*(p-1),2);
			int accuracy = 15 + 7*(p-1);

			this.beginAppendFormatLine("聚气1级 - 冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendLine("聚气2级 - 冰冷伤害半径: 4 码");
			this.appendFormatLine("聚气3级 - 冰冻持续时间: %1$s 秒", duration);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s24_3")) //飞龙在天
		{
			int kickDamage = 100 + 25*(p-1);
			int accuracy = 60 + 25*(p-1);

			this.beginAppendFormatLine("踢击伤害: +%1$s%%", kickDamage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("ass1_s30_2")) //凤凰攻击
		{
			int upLevFire = theTree.getPoint("ass1_s6_1");
			int upLevLight = theTree.getPoint("ass1_s18_1");
			int upLevIce = theTree.getPoint("ass1_s18_1");

			//陨石伤害
			int metorDamageMin = upByPercent3(tbl_ass1_s30_2[p-1][0],10,upLevFire);
			int metorDamageMax = upByPercent3(tbl_ass1_s30_2[p-1][1],10,upLevFire);

			//火焰爆炸伤害
			int fireDamageMin = upByPercent3(tbl_ass1_s30_2[p-1][2],6,upLevFire);
			int fireDamageMax = upByPercent3(tbl_ass1_s30_2[p-1][3],6,upLevFire);

			//连锁闪电伤害
			int lightDamageMin = upByPercent3(1,13,upLevLight);
			int lightDamageMax = upByPercent3(tbl_ass1_s30_2[p-1][4],13,upLevLight);

			//寒冰刃伤害
			int iceDamageMin = upByPercent3(tbl_ass1_s30_2[p-1][5],10,upLevIce);
			int iceDamageMax = upByPercent3(tbl_ass1_s30_2[p-1][6],10,upLevIce);

			int accuracy = 15 + 7*(p-1);

			this.beginAppendFormatLine("聚气1级 - 陨石伤害: %1$s-%2$s", metorDamageMin, metorDamageMax);
			this.appendFormatLine("火焰爆炸伤害: %1$s-%2$s 每秒", fireDamageMin, fireDamageMax);
			this.appendFormatLine("聚气2级 - 连锁闪电伤害: %1$s-%2$s", lightDamageMin, lightDamageMax);
			this.appendFormatLine("聚气3级 - 混沌冰弹伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("ass2_s1_2")) //利爪掌握
		{
			int damage = 35 + 4*(p-1);
			int accuracy = 30 + 10*(p-1);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendFormatLine("%1$s%% 概率一击必杀", tbl_ass2_s1_2[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("ass2_s1_3")) //心灵战锤
		{
			float mana = upFloat2(4+0.25f*(p-1),3);

			this.beginAppendFormatLine("伤害: %1$s-%2$s", tbl_ass2_s1_3[p-1][0], tbl_ass2_s1_3[p-1][1]);
			this.appendFormatLine("魔法伤害: %1$s-%2$s", tbl_ass2_s1_3[p-1][0], tbl_ass2_s1_3[p-1][1]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s6_1")) //速度爆发
		{
			int duration = 120 + 12*(p-1);

			this.beginAppendFormatLine("攻击速度: +%1$s%%", tbl_ass2_s6_1[p-1][0]);
			this.appendFormatLine("移动速度: +%1$s%%", tbl_ass2_s6_1[p-1][1]);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s12_2")) //武器格挡
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ass2_s12_2[p-1]);

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s12_3")) //魔影斗篷
		{
			int duration = 8 + 1*(p-1);
			int defence = 10 + 3*(p-1);
			int defenceDown = 15 + 3*(p-1);

			if (defenceDown > 95)
			{
				defenceDown = 95;
			}

			this.beginAppendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("防御提升: +%1$s%%", defence);
			this.appendFormatLine("敌人防御: -%1$s%%", defenceDown);
			this.appendLine("半径: 20 码");
			this.endAppendLine("魔法消耗: 13");

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s18_1")) //消退
		{
			int duration = 120 + 12*(p-1);

			this.beginAppendFormatLine("减少诅咒持续时间 %1$s%%", tbl_ass2_s18_1[p-1][0]);
			this.appendFormatLine("所有抗性: %1$s%%", tbl_ass2_s18_1[p-1][1]);
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s18_2")) //影子战士
		{
			int accuracy = 40*p;
			int defence = 12*(p-1);
			int mana = upByValue2(27,0,1,p);

			this.beginAppendFormatLine("生命: %1$s", tbl_ass2_s18_2[p-1]);
			this.appendFormatLine("命中率: +%1$s", accuracy);
			if (defence > 0)
			{
				this.appendFormatLine("防御力加成: +%1$s%%", defence);
			}
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if(skill.id.equals("ass2_s24_3")) //心灵爆震
		{
			float dizzyTime = upFloat2(2+0.2f*(p-1),2);
			if (dizzyTime > 10)
			{
				dizzyTime = 10;
			}
			this.beginAppendFormatLine("伤害: %1$s-%2$s", tbl_ass2_s24_3[p-1][0],tbl_ass2_s24_3[p-1][0] + 10);
			this.appendFormatLine("眩晕时间: %1$s 秒 ", dizzyTime);
			this.appendFormatLine("转化概率: %1$s%%", tbl_ass2_s24_3[p-1][1]);
			this.appendLine("持续时间: 6-10 秒 ");
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("ass2_s30_1")) //毒牙
		{
			int duration = 120 + 4*(p-1);

			this.beginAppendFormatLine("毒素伤害: %1$s-%2$s", tbl_ass2_s30_1[p-1], tbl_ass2_s30_1[p-1] + 20);
			this.appendLine("结束于 0.4 秒 ");
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 12");

			return buffer.toString();
		}
		else if (skill.id.equals("ass2_s30_2")) //影子大师
		{
			int accuracy = 40*p;
			int mana = upByValue2(35,0,1,p);

			this.beginAppendFormatLine("生命: %1$s", tbl_ass2_s18_2[p-1]);
			this.appendFormatLine("命中率: +%1$s", accuracy);
			this.appendFormatLine("所有抗性: +%1$s%%", tbl_ass2_s30_2[p-1]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s1_2")) //火焰爆震
		{
			int upLev = this.getUpLev(theTree, new String[]{"ass3_s6_1","ass3_s12_1","ass3_s12_2","ass3_s24_1","ass3_s24_2","ass3_s30_1"});

			int fireDamageMin = upByPercent3(tbl_ass3_s1_2[p-1][0], 9, upLev);
			int fireDamageMax = upByPercent3(tbl_ass3_s1_2[p-1][1], 9, upLev);
			float mana = cal_mana_1(3, 0.1f, p);

			this.beginAppendFormatLine("火焰伤害: %1$s-%2$s", fireDamageMin, fireDamageMax);
			this.appendLine("半径: 3.3 码");
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s6_1")) //闪电网
		{
			int upLev = this.getUpLev(theTree, new String[]{"ass3_s12_1","ass3_s24_1","ass3_s30_1"});

			int num = tbl_ass3_s6_1_2[p-1] + (theTree.getPoint("ass3_s1_2")+1)/3;

			int lightDamageMin = upByPercent3(1,11,upLev);
			int lightDamageMax = upByPercent3(tbl_ass3_s6_1[p-1],11,upLev);

			this.beginAppendFormatLine("电刺数量: %1$s", num);
			this.appendLine("持续时间: 3.6 秒");
			this.appendFormatLine("闪电伤害: %1$s-%2$s 每秒", lightDamageMin, lightDamageMax);
			this.endAppendLine("魔法消耗: 6");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s6_3")) //刃之守护
		{
			float duration = upFloat2(cal_ass3_s6_3_duration(p),2);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("伤害: %1$s-%2$s", tbl_ass3_s6_3[p-1][0],tbl_ass3_s6_3[p-1][1]);
			this.endAppendLine("+3/8 武器伤害");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s12_1")) //电能守护
		{
			int shootNum = 5 + theTree.getPoint("ass3_s24_1")/4;
			int boltNum = 5 + theTree.getPoint("ass3_s6_1")/3;
			int upLev = this.getUpLev(theTree, new String[]{"ass3_s1_2","ass3_s24_1","ass3_s30_1"});

			int lightDamageMin = upByPercent3(1,6,upLev);
			int lightDamageMax = upByPercent3(tbl_ass3_s12_1[p-1],6,upLev);

			this.beginAppendFormatLine("射击 %1$s 次", shootNum);
			this.appendFormatLine("释放 %1$s 闪电弹", boltNum);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", lightDamageMin, lightDamageMax);
			this.endAppendLine("魔法消耗: 13");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s12_2")) //火焰复生
		{
			int upLev = this.getUpLev(theTree, new String[]{"ass3_s1_2","ass3_s24_2"});

			int fireDamageMin = upByPercent3(tbl_ass3_s12_2[p-1][0],8,upLev);
			int fireDamageMax = upByPercent3(tbl_ass3_s12_2[p-1][1],8,upLev);

			this.beginAppendLine("射击 5 次");
			this.appendFormatLine("火焰伤害: %1$s-%2$s", fireDamageMin, fireDamageMax);
			this.endAppendLine("魔法消耗: 13");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s18_3")) //刃之怒
		{
			int damageMin = upByValue8(8,new int[][]{{2,3},{9,5},{17,8}},p);
			int damageMax = upByValue8(10,new int[][]{{2,3},{9,5},{17,8}},p);
			float mana = cal_mana_1(1, 0.1f, p);

			this.beginAppendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendLine("+3/4 武器伤害");
			this.appendLine("最少魔法需求: 3");
			this.endAppendFormatLine("魔法消耗: %1$s 每刀", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s24_1")) //雷光守卫
		{
			int upLev = this.getUpLev(theTree, new String[]{"ass3_s6_1","ass3_s12_1","ass3_s30_1"});

			int damageMin = upByPercent3(1, 12, upLev);
			int damageMax = upByValue8(20,new int[][]{{2,10},{9,16},{17,24},{23,34},{29,44}},p);
			damageMax = upByPercent3(damageMax, 12, upLev);

			this.beginAppendLine("射击 10 次");
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendLine("魔法消耗: 20");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s24_2")) //复生狱火
		{
			int upPercent = 10*(theTree.getPoint("ass3_s1_2") + theTree.getPoint("ass3_s30_1"))
					+ 7*theTree.getPoint("ass3_s12_2");

			int fireDamageMin = upByPercent2(tbl_ass3_s24_2[p-1][0],upPercent);
			int fireDamageMax = upByPercent2(tbl_ass3_s24_2[p-1][1],upPercent);

			this.beginAppendLine("射击 10 次");
			this.appendFormatLine("火焰伤害: %1$s-%2$s", fireDamageMin, fireDamageMax);
			this.endAppendLine("魔法消耗: 20");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s30_1")) //亡者守卫
		{
			int num = 5 + theTree.getPoint("ass3_s1_2")/3;

			int lightDamageMin = upByPercent3(1,12,theTree.getPoint("ass3_s24_1"));
			int lightDamageMax = upByValue8(50,new int[][]{{2,8},{9,14},{17,22},{23,28},{29,34}},p);
			lightDamageMax = upByPercent3(lightDamageMax, 12, theTree.getPoint("ass3_s24_1"));

			float radius = upByFloat(3.3f,0.3f,new float[]{0.9f},p);

			this.beginAppendLine("尸体爆炸伤害: 40-80% 尸体生命");
			this.appendFormatLine("射击 %1$s 次", num);
			this.appendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", lightDamageMin, lightDamageMax);
			this.endAppendLine("魔法消耗: 20");

			return buffer.toString();
		}
		else if (skill.id.equals("ass3_s30_3")) //刀刃之盾
		{
			int damageMin = upByValue8(1,new int[][]{{2,5},{9,6},{17,7}},p);
			int damageMax = upByValue8(30,new int[][]{{2,5},{9,6},{17,7}},p);

			int duration = 20 + 5*(p-1);
			int mana = 27 + 2*(p-1);

			this.beginAppendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendLine("+1/4 武器伤害");
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else
		{
			return "?";
		}
	}

	@Override
	public SkillBuildTemplate[] getBuildTemplates()
	{
		//陷阱刺客
		SkillBuildTemplate t1 = new SkillBuildTemplate("ass_template_1", "陷阱\r\n刺客");
		t1.skillTemplates.put("ass3_s1_2", 20); //火焰爆震
		t1.skillTemplates.put("ass3_s6_1", 10); //闪电网
		t1.skillTemplates.put("ass3_s12_1", 20); //电能守护
		t1.skillTemplates.put("ass3_s24_1", 20); //雷光守卫
		t1.skillTemplates.put("ass3_s30_1", 20); //亡者守卫

		//龙虎刺客
		SkillBuildTemplate t2 = new SkillBuildTemplate("ass_template_2", "龙虎\r\n刺客");
		t2.skillTemplates.put("ass1_s1_2", 20); //虎击
		t2.skillTemplates.put("ass1_s1_3", 1); //龙爪
		t2.skillTemplates.put("ass1_s6_3", 1); //双龙爪
		t2.skillTemplates.put("ass1_s18_3", 20); //神龙摆尾
		t2.skillTemplates.put("ass2_s1_2", 1); //利爪掌握
		t2.skillTemplates.put("ass2_s1_3", 1); //心灵战锤
		t2.skillTemplates.put("ass2_s6_1", 1); //速度爆发
		t2.skillTemplates.put("ass2_s12_2", 1); //武器格挡
		t2.skillTemplates.put("ass2_s12_3", 1); //魔影斗篷
		t2.skillTemplates.put("ass2_s18_2", 1); //影子战士
		t2.skillTemplates.put("ass2_s24_3", 1); //心灵爆震
		t2.skillTemplates.put("ass2_s30_2", 8); //影子大师
		t2.skillTemplates.put("ass3_s1_2", 1); //火焰爆震
		t2.skillTemplates.put("ass3_s6_1", 1); //闪电网
		t2.skillTemplates.put("ass3_s12_1", 1); //电能守护
		t2.skillTemplates.put("ass3_s24_1", 10); //雷光守卫
		t2.skillTemplates.put("ass3_s30_1", 20); //亡者守卫

		return new SkillBuildTemplate[]{t1,t2};
	}

	//刃之守护持续时间计算
	private float cal_ass3_s6_3_duration(int lv)
	{
		float rtn = 4;
		if (lv == 1)
		{
			return rtn;
		}
		else
		{
			int count = 0;
			for (int i = 2; i<=lv; i++)
			{
				if (count == 0)
				{
					rtn += 0.4f;
				}
				else
				{
					rtn += 0.5f;
				}
				count++;
				if (count == 5)
				{
					count = 0;
				}
			}
		}
		return rtn;
	}

}
