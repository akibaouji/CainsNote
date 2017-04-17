package cains.note.service.skill;

final class NecSkillStrategy extends AbstractSkillStrategy
{
	private static int[][] tbl_nec1_s1_3 = new int[][]{
			{1,2,21,1},{1,2,21,2},{1,2,21,3},{1,2,31,3},{1,2,42,3},{1,2,52,4},{1,2,63,4},{1,2,73,4},{2,4,84,5},{4,5,94,5},
			{6,7,105,5},{8,9,115,6},{10,11,126,6},{12,14,136,6},{14,16,147,7},{17,19,157,7},{21,23,168,7},{26,28,178,8},{31,33,189,8},{37,39,199,8},
			{42,45,210,9},{48,51,220,9},{57,60,231,9},{66,69,241,10},{76,78,252,10},{86,88,262,10},{96,99,273,11},{107,110,283,11},{121,124,294,11},{135,138,304,12},
			{150,153,315,12},{166,169,325,12},{182,186,336,13},{199,202,346,13},{217,220,357,13},{235,238,367,14},{253,256,378,14},{272,276,388,14},{292,295,399,15},{312,315,409,15},
			{333,336,420,15},{354,358,430,16},{376,380,441,16},{398,402,451,16},{421,425,462,17},{445,449,472,17},{469,473,483,17},{493,498,493,18},{519,523,504,18},{544,549,514,18}
	};//骷髅复生伤害MIN,伤害MAX,普通生命,骷髅总数

	private static int[][] tbl_nec1_s6_2 = new int[][]{
			{100,175,275,2,5,2,6,3,7,11},{135,236,371,2,6,2,8,4,9,20},{170,297,467,3,8,3,10,5,11,27},{205,358,563,4,10,4,12,6,14,33},{240,420,660,4,12,4,14,7,16,37},{275,481,756,5,13,5,16,8,19,41},{310,542,852,6,15,6,18,9,21,44},{345,603,948,6,17,6,20,10,24,46},{380,665,1045,7,19,7,22,11,26,49},{415,726,1141,8,20,8,24,12,29,51},
			{450,787,1237,9,22,9,27,13,31,53},{485,848,1333,9,24,9,29,14,33,54},{520,910,1430,10,26,10,31,15,36,56},{555,971,1526,11,27,11,33,16,38,57},{590,1032,1622,11,29,11,35,17,41,58},{625,1093,1718,12,31,12,37,18,43,60},{660,1155,1815,13,33,13,39,19,46,60},{695,1216,1911,13,34,13,41,20,48,61},{730,1277,2007,14,36,14,43,21,51,62},{765,1338,2103,15,38,15,45,22,53,63},
			{800,1400,2200,16,40,16,48,24,56,63},{835,1461,2296,16,41,16,50,25,58,64},{870,1522,2392,17,43,17,52,26,60,65},{905,1583,2488,18,45,18,54,27,63,66},{940,1645,2585,18,47,18,56,28,65,66},{975,1706,2681,19,48,19,58,29,68,66},{1010,1767,2777,20,50,20,60,30,70,67},{1045,1828,2873,20,52,20,62,31,73,67},{1080,1890,2970,21,54,21,64,32,75,68},{1115,1951,3066,22,55,22,66,33,78,68},
			{1150,2012,3162,23,57,23,69,34,80,69},{1185,2073,3258,23,59,23,71,35,82,69},{1220,2135,3355,24,61,24,73,36,85,69},{1255,2196,3451,25,62,25,75,37,87,69},{1290,2257,3547,25,64,25,77,38,90,69},{1325,2318,3643,26,66,26,79,39,92,70},{1360,2380,3740,27,68,27,81,40,95,70},{1395,2441,3836,27,69,27,83,41,97,71},{1430,2502,3932,28,71,28,85,42,100,71},{1465,2563,4028,29,73,29,87,43,102,71},
			{1500,2625,4125,30,75,30,90,45,105,71},{1535,2686,4221,30,76,30,92,46,107,72},{1570,2747,4317,31,78,31,94,47,109,72},{1605,2808,4413,32,80,32,96,48,112,72},{1640,2870,4510,32,82,32,98,49,114,72},{1675,2931,4606,33,83,33,100,50,117,72},{1710,2992,4702,34,85,34,102,51,119,72},{1745,3053,4798,34,87,34,104,52,122,72},{1780,3115,4895,35,89,35,106,53,124,73},{1815,3176,4991,36,90,36,108,54,127,73}
	}; //土魔生命(普通,噩梦,地狱),伤害(普通,噩梦,地狱),减慢敌人

	private static int[] tbl_nec1_s12_1 = new int[]{
			6,10,14,17,20,22,23,24,26,27,
			28,29,30,30,31,32,32,32,33,33,
			34,34,34,35,35,35,36,36,36,36,
			36,36,37,37,37,37,37,38,38,38,
			38,38,38,38,38,38,38,38,39,39
	}; //石魔移动速度

	private static int[] tbl_nec1_s12_3 = new int[]{
			1,2,3,3,3,4,4,4,5,5,
			5,6,6,6,7,7,7,8,8,8,
			9,9,9,10,10,10,11,11,11,12,
			12,12,13,13,13,14,14,14,15,15,
			15,16,16,16,17,17,17,18,18,18
	}; //骷髅法师数量

	private static int[][] tbl_nec1_s18_2 = new int[][]{
			{86,6,16,9,23,10,27},{95,8,21,12,31,13,36},{102,10,27,15,39,17,45},{108,12,32,18,47,20,55},{112,14,38,21,55,24,64},{116,16,44,24,63,27,74},{119,18,49,27,71,31,83},{121,20,55,31,79,34,93},{124,22,60,34,87,38,102},{126,24,66,37,95,41,112},
			{128,27,72,40,103,45,121},{129,29,77,43,111,48,130},{131,31,83,46,119,52,140},{132,33,88,49,127,55,149},{133,35,94,53,135,59,159},{135,37,100,56,143,62,168},{135,39,105,59,151,66,178},{136,41,111,62,159,69,187},{137,43,116,65,167,73,197},{138,45,122,68,175,76,206},
			{138,48,128,72,184,80,216},{139,50,133,75,192,83,225},{140,52,139,78,200,87,234},{141,54,144,81,208,90,244},{141,56,150,84,216,94,253},{141,58,156,87,224,97,263},{142,60,161,90,232,101,272},{142,62,167,94,240,104,282},{143,64,172,97,248,108,291},{143,66,178,100,256,111,301},
			{144,69,184,103,264,115,310},{144,71,189,106,272,118,319},{144,73,195,109,280,122,329},{144,75,200,112,288,125,338},{144,77,206,116,296,129,348},{145,79,212,119,304,132,357},{145,81,217,122,312,136,367},{146,83,223,125,320,139,376},{146,85,228,128,328,143,386},{146,87,234,131,336,146,395},
			{146,90,240,135,345,150,405},{147,92,245,138,353,153,414},{147,94,251,141,361,157,423},{147,96,256,144,369,160,433},{147,98,262,147,377,164,442},{147,100,268,150,385,167,452},{147,102,273,153,393,171,461},{147,104,279,157,401,174,471},{148,106,284,160,409,178,480},{148,108,290,163,417,181,490}
	}; //鲜血石魔转化生命,伤害(普通,噩梦,地狱)

	private static int[] tbl_nec1_s24_1 = new int[]{
			28,34,39,44,47,50,52,54,56,57,
			59,60,61,62,62,64,64,65,65,66,
			66,67,67,68,68,68,69,69,70,70,
			70,70,71,71,71,71,71,72,72,72,
			72,72,72,72,73,73,73,73,73,73
	};//召唤抵抗抗性

	private static int[][] tbl_nec1_s30_2 = new int[][]{
			{36,34,63,4,6},{45,49,79,5,7},{52,64,95,6,8},{58,79,111,7,9},{62,94,127,8,10},{66,109,143,9,11},{69,124,159,10,12},{71,139,175,11,13},{74,155,192,12,14},{76,177,215,14,16},
			{78,193,232,15,17},{79,215,255,17,19},{81,231,272,18,20},{82,253,295,20,22},{83,269,312,21,23},{85,297,341,24,26},{85,320,365,26,28},{86,349,395,29,31},{87,372,419,31,33},{88,401,449,34,36},
			{88,424,473,36,38},{89,459,509,40,42},{90,489,540,43,45},{91,525,577,47,49},{91,555,608,50,52},{91,591,645,54,56},{92,621,676,57,59},{92,657,713,61,63},{93,688,745,64,66},{93,725,783,68,70},
			{94,756,815,71,73},{94,793,853,75,77},{94,824,885,78,80},{94,861,923,82,84},{94,892,955,85,87},{95,929,993,89,91},{95,960,1025,92,94},{96,997,1063,96,98},{96,1028,1095,99,101},{96,1065,1133,103,105},
			{96,1096,1165,106,108},{97,1133,1203,110,112},{97,1164,1235,113,115},{97,1201,1273,117,119},{97,1232,1305,120,122},{97,1269,1343,124,126},{97,1300,1375,127,129},{97,1337,1413,131,133},{98,1368,1445,134,136},{98,1405,1483,138,140}
	}; //火焰石魔火吸收,火焰伤害,圣火伤害

	private static int[][] tbl_nec2_s1_2 = new int[][]{
			{2,4},{3,5},{4,6},{5,7},{6,8},{7,9},{8,10},{9,11},{10,12},{11,14},
			{12,15},{13,17},{14,18},{15,20},{16,21},{17,23},{18,25},{20,27},{21,29},{23,31},
			{24,33},{26,35},{28,37},{30,40},{32,42},{34,45},{36,47},{38,50},{40,53},{43,56},
			{45,59},{48,62},{50,65},{53,68},{55,71},{58,74},{60,77},{63,80},{65,83},{68,86},
			{70,89},{73,92},{75,95},{78,98},{80,101},{83,104},{85,107},{88,110},{90,113},{93,116}
	}; //牙数量,伤害

	private static int[][] tbl_nec2_s6_1 = new int[][]{
			{7,15},{13,23},{20,32},{30,43},{40,56},{53,70},{67,85},{82,103},{104,126},{129,153},
			{155,181},{185,212},{216,245},{250,281},{286,319},{325,359},{374,410},{426,464},{481,521},{540,581},
			{601,644},{666,710},{740,786},{818,866},{899,949},{984,1035},{1072,1126},{1165,1220},{1268,1325},{1375,1434},
			{1487,1547},{1603,1665},{1722,1786},{1846,1911},{1974,2041},{2106,2175},{2242,2312},{2382,2454},{2526,2600},{2674,2750},
			{2826,2903},{2982,3061},{3143,3223},{3307,3390},{3475,3560},{3648,3734},{3825,3912},{4005,4095},{4190,4281},{4379,4471}
	}; //淬毒匕首毒伤

	private static int[][] tbl_nec2_s18_1 = new int[][]{
			{25,75},{37,97},{52,122},{70,150},{90,180},{112,212},{137,247},{165,285},{211,341},{262,402},
			{318,468},{380,540},{446,616},{517,697},{593,783},{675,875},{787,997},{907,1127},{1035,1265},{1170,1410},
			{1312,1562},{1462,1722},{1653,1923},{1855,2135},{2066,2356},{2287,2587},{2518,2828},{2760,3080},{3052,3382},{3357,3697},
			{3675,4025},{4005,4365},{4347,4717},{4702,5082},{5070,5460},{5450,5850},{5842,6252},{6247,6667},{6665,7095},{7095,7535},
			{7537,7987},{7992,8452},{8460,8930},{8940,9420},{9432,9922},{9937,10437},{10455,10965},{10985,11505},{11527,12057},{12082,12622}
	}; //毒爆毒伤

	private static int[][] tbl_nec2_s18_2 = new int[][]{
			{16,24},{24,32},{32,40},{40,48},{48,56},{56,64},{64,72},{72,80},{81,89},{90,98},
			{99,107},{108,116},{117,125},{126,134},{135,143},{144,152},{156,165},{168,178},{180,191},{192,204},
			{204,217},{216,230},{234,249},{252,268},{270,287},{288,306},{306,325},{324,344},{348,369},{372,394},
			{396,419},{420,444},{444,469},{468,494},{492,519},{516,544},{540,569},{564,594},{588,619},{612,644},
			{636,669},{660,694},{684,719},{708,744},{732,769},{756,794},{780,819},{804,844},{828,869},{852,894}
	}; //骨矛伤害

	private static int[][] tbl_nec2_s30_1 = new int[][]{
			{43,78},{56,90},{68,103},{81,115},{93,128},{106,140},{118,153},{131,165},{146,181},{162,196},
			{178,212},{193,228},{209,243},{225,259},{240,275},{256,290},{281,315},{306,340},{331,365},{356,390},
			{381,415},{406,440},{443,478},{481,515},{518,553},{556,590},{593,628},{631,665},{675,709},{718,753},
			{762,796},{806,840},{850,884},{893,928},{937,971},{981,1015},{1025,1059},{1068,1103},{1112,1146},{1156,1190},
			{1200,1234},{1243,1278},{1287,1321},{1331,1365},{1375,1409},{1418,1453},{1462,1496},{1506,1540},{1550,1584},{1593,1628}
	};//剧毒新星毒伤

	private static int[][] tbl_nec2_s30_2 = new int[][]{
			{20,30},{36,47},{52,64},{68,81},{84,98},{100,115},{116,132},{132,149},{149,167},{166,185},
			{183,203},{200,221},{217,239},{234,257},{251,275},{268,293},{286,312},{304,331},{322,350},{340,369},
			{358,388},{376,407},{395,427},{414,447},{433,467},{452,487},{471,507},{490,527},{510,548},{530,569},
			{550,590},{570,611},{590,632},{610,653},{630,674},{650,695},{670,716},{690,737},{710,758},{730,779},
			{750,800},{770,821},{790,842},{810,863},{830,884},{850,905},{870,926},{890,947},{910,968},{930,989}
	}; //骨魂伤害

	private static int[] tbl_nec3_s30_2 = new int[]{
			31,37,41,44,47,49,51,52,54,55,
			56,57,58,59,60,61,61,61,62,62,
			63,63,64,64,64,65,65,65,65,65,
			66,66,66,66,66,67,67,67,67,67,
			67,68,68,68,68,68,68,68,69,69
	}; //降低抵抗降抗

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("nec1_s1_1")) //骷髅掌握
		{
			this.beginAppendFormatLine("骷髅生命: +%1$s", 8*p);
			this.appendFormatLine("骷髅伤害: +%1$s", 2*p);
			this.appendFormatLine("骷髅法师生命: +%1$s", 8*p);
			this.appendLine("加强骷髅法师投射伤害");
			this.appendFormatLine("怪物生命: +%1$s%%", 5*p);
			this.endAppendFormatLine("怪物伤害: +%1$s%%", 10*p);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s1_3")) //骷髅复生
		{
			//骷髅掌握加成
			int up = theTree.getPoint("nec1_s1_1");
			int lifeUp = 8*up;
			int damageUp = 2*up;
			int damageUp2 = 2*up;
			int accuracyAndDefenceUp = 15*up;

			//伤害
			int damagePlus = 0;
			if (p >=4)
			{
				damagePlus += 7*(p-3); //从第4级开始每级+7
				damageUp = upByPercent2_ceil(damageUp, damagePlus); //计算伤害加成(向上取整)
				damageUp2 = upByPercent2(damageUp2, damagePlus); //计算伤害加成(向下取整)
			}
			int damageMin = tbl_nec1_s1_3[p-1][0] + damageUp;
			int damageMax = tbl_nec1_s1_3[p-1][1] + damageUp2;

			//命中,防御
			int accuracyAndDefence = 20 + 15*(p-1) + accuracyAndDefenceUp;

			//普通生命
			int lifeNormal = tbl_nec1_s1_3[p-1][2] + lifeUp;

			//噩梦生命
			int lifeNightmare = 30;
			if (p >= 4)
			{
				lifeNightmare += 15*(p-3); //从第4级开始每级+15
			}
			lifeNightmare += lifeUp;

			//地狱生命
			int lifeHell = 42;
			if (p >= 4)
			{
				lifeHell += 21*(p-3); //从第4级开始每级+21
			}
			int mana = 6 + 1*(p-1);
			lifeHell += lifeUp;

			this.beginAppendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			if (damagePlus > 0)
			{
				this.appendFormatLine("伤害: +%1$s%%", damagePlus);
			}
			this.appendFormatLine("命中率: %1$s", accuracyAndDefence);
			this.appendFormatLine("防御: %1$s", accuracyAndDefence);
			this.appendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("骷髅总数: %1$s", tbl_nec1_s1_3[p-1][3]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s6_2")) //土魔
		{
			int p1 = theTree.getPoint("nec1_s12_1"); //石魔控制

			//命中率
			int accuracy = 60 + 20*(p-1) + p1*25;

			//防御
			int defence = 100 + 35*theTree.getPoint("nec1_s24_2");

			//生命
			int lifeUp = 20*p1 + 5* theTree.getPoint("nec1_s18_2");
			int lifeNormal = upByPercent2(tbl_nec1_s6_2[p-1][0], lifeUp);
			int lifeNightmare = upByPercent2(tbl_nec1_s6_2[p-1][1], lifeUp);
			int lifeHell = upByPercent2(tbl_nec1_s6_2[p-1][2], lifeUp);

			//伤害(每级6%是指在第一级值的基础上的6%)
			int p2 = theTree.getPoint("nec1_s30_2");
			int damageNormalMin = upByPercent5(tbl_nec1_s6_2[p-1][3],tbl_nec1_s6_2[0][3],6,p2);
			int damageNormalMax = upByPercent5(tbl_nec1_s6_2[p-1][4],tbl_nec1_s6_2[0][4],6,p2);
			int damageNightmareMin = upByPercent5(tbl_nec1_s6_2[p-1][5],tbl_nec1_s6_2[0][5],6,p2);
			int damageNightmareMax = upByPercent5(tbl_nec1_s6_2[p-1][6],tbl_nec1_s6_2[0][6],6,p2);
			int damageHellMin = upByPercent5(tbl_nec1_s6_2[p-1][7],tbl_nec1_s6_2[0][7],6,p2);
			int damageHellMax = upByPercent5(tbl_nec1_s6_2[p-1][8],tbl_nec1_s6_2[0][8],6,p2);

			//攻击准确率
			int attack = 20*p;

			//耗魔
			int mana = 15 + 3*(p-1);

			this.beginAppendFormatLine("命中率: %1$s", accuracy);
			this.appendFormatLine("防御: %1$s", defence);
			this.appendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("伤害: %1$s-%2$s", damageNormalMin, damageNormalMax);
			this.appendFormatLine("伤害: %1$s-%2$s (噩梦)", damageNightmareMin, damageNightmareMax);
			this.appendFormatLine("伤害: %1$s-%2$s (地狱)", damageHellMin, damageHellMax);
			this.appendFormatLine("攻击准确率: +%1$s", attack);
			this.appendFormatLine("减慢敌人: %1$s%%", tbl_nec1_s6_2[p-1][9]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s12_1")) //石魔掌握
		{
			this.beginAppendFormatLine("生命: +%1$s%%", 20*p);
			this.appendFormatLine("攻击准确率: +%1$s", 25*p);
			this.endAppendFormatLine("移动速度: +%1$s%%", tbl_nec1_s12_1[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s12_3")) //骷髅法师
		{
			//骷髅掌握加成
			int up = theTree.getPoint("nec1_s1_1");
			int lifeUp = 8*up;
			int defenceUp = 10*up;

			int lifeNormal = 61 + lifeUp;
			int lifeNightmare = 88 + lifeUp;
			int lifeHell = 123 + lifeUp;
			int defence = 10*p + defenceUp;
			int mana = 8 + 1*(p-1);

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("防御: %1$s", defence);
			this.appendFormatLine("骷髅法师数量 %1$s", tbl_nec1_s12_3[p-1]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if(skill.id.equals("nec1_s18_2")) //鲜血石魔
		{
			int p1 = theTree.getPoint("nec1_s12_1"); //石魔控制

			//生命
			int lifeUp = 20*p1;
			int lifeNormal = upByPercent2(201, lifeUp);
			int lifeNightmare = upByPercent2(388, lifeUp);
			int lifeHell = upByPercent2(637, lifeUp);

			//命中率
			int accuracy = 60 + 20*theTree.getPoint("nec1_s6_2") + p1*25;
			//防御
			int defence = 80 + 35*theTree.getPoint("nec1_s24_2");

			//伤害(每级6%是指在第一级值的基础上的6%)
			int p2 = theTree.getPoint("nec1_s30_2");
			int damageNormalMin = upByPercent5(tbl_nec1_s18_2[p-1][1],tbl_nec1_s18_2[0][1],6,p2);
			int damageNormalMax = upByPercent5(tbl_nec1_s18_2[p-1][2],tbl_nec1_s18_2[0][2],6,p2);
			int damageNightmareMin = upByPercent5(tbl_nec1_s18_2[p-1][3],tbl_nec1_s18_2[0][3],6,p2);
			int damageNightmareMax = upByPercent5(tbl_nec1_s18_2[p-1][4],tbl_nec1_s18_2[0][4],6,p2);
			int damageHellMin = upByPercent5(tbl_nec1_s18_2[p-1][5],tbl_nec1_s18_2[0][5],6,p2);
			int damageHellMax = upByPercent5(tbl_nec1_s18_2[p-1][6],tbl_nec1_s18_2[0][6],6,p2);

			//耗魔
			int mana = 25 + 4*(p-1);

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("命中率: %1$s", accuracy);
			this.appendFormatLine("防御: %1$s", defence);
			this.appendFormatLine("将 %1$s%% 伤害转化为生命", tbl_nec1_s18_2[p-1][0]);
			this.appendFormatLine("伤害: %1$s-%2$s", damageNormalMin, damageNormalMax);
			this.appendFormatLine("伤害: %1$s-%2$s (噩梦)", damageNightmareMin, damageNightmareMax);
			this.appendFormatLine("伤害: %1$s-%2$s (地狱)", damageHellMin, damageHellMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s24_1")) //召唤抵抗
		{
			this.beginAppendFormatLine("所有抗性: +%1$s%%", tbl_nec1_s24_1[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s24_2")) //钢铁石魔
		{
			int p1 = theTree.getPoint("nec1_s12_1"); //石魔控制

			//生命
			int lifeUp = 20*p1 + 5*theTree.getPoint("nec1_s18_2");
			int lifeNormal = upByPercent2(306, lifeUp);
			int lifeNightmare = upByPercent2(595, lifeUp);
			int lifeHell = upByPercent2(980, lifeUp);

			//命中率
			int accuracy = 80 + 20*theTree.getPoint("nec1_s6_2") + p1*25;
			//防御
			int defence = 175 + 35*(p-1);

			//伤害(每级6%是指在第一级值的基础上的6%)
			int p2 = theTree.getPoint("nec1_s30_2");
			int damageNormalMin = upByPercent3(7,6,p2);
			int damageNormalMax = upByPercent3(19,6,p2);
			int damageNightmareMin = upByPercent3(11,6,p2);
			int damageNightmareMax = upByPercent3(30,6,p2);
			int damageHellMin = upByPercent3(12,6,p2);
			int damageHellMax = upByPercent3(33,6,p2);

			//伤害反噬
			int reflection = 150 + 15*(p-1);
			//防御加成
			int defenceUp = 35*p;

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("伤害: %1$s-%2$s", damageNormalMin, damageNormalMax);
			this.appendFormatLine("伤害: %1$s-%2$s (噩梦)", damageNightmareMin, damageNightmareMax);
			this.appendFormatLine("伤害: %1$s-%2$s (地狱)", damageHellMin, damageHellMax);
			this.appendFormatLine("命中率: %1$s", accuracy);
			this.appendFormatLine("防御: %1$s", defence);
			this.appendLine("反刺");
			this.appendFormatLine("%1$s%% 伤害反噬", reflection);
			this.appendFormatLine("防御加成: +%1$s", defenceUp);
			this.endAppendLine("魔法消耗: 35");

			return buffer.toString();
		}
		else if (skill.id.equals("nec1_s30_2")) //火焰石魔
		{
			int p1 = theTree.getPoint("nec1_s12_1"); //石魔控制

			//生命
			int lifeUp = 20*p1 + 5*theTree.getPoint("nec1_s18_2");
			int lifeNormal = upByPercent2(328, lifeUp);
			int lifeNightmare = upByPercent2(643, lifeUp);
			int lifeHell = upByPercent2(1063, lifeUp);

			//命中率
			int accuracy = 120 + 20*theTree.getPoint("nec1_s6_2") + p1*25;
			//防御
			int defence = 200 + 35*theTree.getPoint("nec1_s24_2");

			//耗魔
			int mana = 50+10*(p-1);

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendFormatLine("命中率: %1$s", accuracy);
			this.appendFormatLine("防御: %1$s", defence);
			this.appendFormatLine("吸收 %1$s%% 火焰伤害", tbl_nec1_s30_2[p-1][0]);
			this.appendLine("伤害: 10-27");
			this.appendLine("伤害: 15-39 (噩梦)");
			this.appendLine("伤害: 18-47 (地狱)");
			this.appendFormatLine("火焰伤害: %1$s-%2$s", tbl_nec1_s30_2[p-1][1], tbl_nec1_s30_2[p-1][2]);
			this.appendFormatLine("圣火 %1$s-%2$s", tbl_nec1_s30_2[p-1][3], tbl_nec1_s30_2[p-1][4]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if(skill.id.equals("nec1_s30_3")) //重生
		{
			int p1 = theTree.getPoint("nec1_s1_1");

			int lifeUp = 200 + 5*p1;
			int damageUp = 10*p1;

			this.beginAppendLine("持续时间: 180 秒 ");
			this.appendFormatLine("生命: +%1$s%%", lifeUp);
			if (damageUp > 0)
			{
				this.appendFormatLine("伤害: +%1$s%%", damageUp);
			}
			this.appendFormatLine("怪物数: %1$s", p);
			this.endAppendLine("魔法消耗: 45");

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s1_2")) //牙
		{
			int num = p+1;
			if (num > 24)
			{
				num = 24;
			}
			int upLev = getUpLev(theTree, new String[]{"nec2_s12_3","nec2_s18_2","nec2_s24_3","nec2_s30_2"});
			int damageMax = upByPercent3(tbl_nec2_s1_2[p-1][0], 15, upLev);
			int damageMin = upByPercent3(tbl_nec2_s1_2[p-1][1], 15, upLev);
			float mana = upFloat2(3 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("牙齿数量:%1$s", num);
			this.appendFormatLine("魔法伤害: %1$s-%2$s", damageMax, damageMin);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s1_3")) //白骨装甲
		{
			int upLev = getUpLev(theTree, new String[]{"nec2_s12_3","nec2_s24_3"});
			int absorb = 20 + 10*(p-1) + 15*upLev;
			int mana = 11 +1*(p-1);

			this.beginAppendFormatLine("吸收 %1$s 伤害", absorb);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s6_1")) //淬毒匕首
		{
			float duration = upFloat2(2 + 0.4f*(p-1),2);
			int accuracy = 30 + 20*(p-1);
			float mana = cal_mana_1(3, 0.2f, p);

			int upLev = getUpLev(theTree, new String[]{"nec2_s18_1","nec2_s30_1"});
			int poisonDamageMin = upByPercent3(tbl_nec2_s6_1[p-1][0], 20, upLev);
			int poisonDamageMax = upByPercent3(tbl_nec2_s6_1[p-1][1], 20, upLev);

			this.beginAppendFormatLine("毒素伤害: %1$s-%2$s", poisonDamageMin, poisonDamageMax);
			this.appendFormatLine("结束于 %1$s 秒", duration);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s6_2")) //尸体爆炸
		{
			float radius = cal_mana_1(2.6f, 0.3f, p);
			int mana = 15 + 1*(p-1);

			this.beginAppendLine("伤害: 60-100% 尸体生命");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s12_3")) //骨墙
		{
			int upLev = theTree.getPoint("nec2_s1_3") + theTree.getPoint("nec2_s24_3");

			int lifeNormal = upByPercent5(cal_life_1(19,4,5,3,p), 19, 10, upLev);
			int lifeNightmare = upByPercent5(cal_life_1(147,36,37,3,p), 147, 10, upLev);
			int lifeHell = upByPercent5(cal_life_1(431,107,108,3,p), 431, 10, upLev);

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendLine("持续时间: 24 秒");
			this.endAppendLine("魔法消耗: 17");

			return buffer.toString();
		}
		else if(skill.id.equals("nec2_s18_1")) //毒爆
		{
			int upLev = theTree.getPoint("nec2_s6_1") + theTree.getPoint("nec2_s30_1");
			int poisonDamageMin = upByPercent3(tbl_nec2_s18_1[p-1][0], 15, upLev);
			int poisonDamageMax = upByPercent3(tbl_nec2_s18_1[p-1][1], 15, upLev);
			float duration = upFloat2(2 + 0.4f*(p-1),2);

			this.beginAppendFormatLine("毒素伤害: %1$s-%2$s", poisonDamageMin, poisonDamageMax);
			this.appendFormatLine("结束于 %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 8");

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s18_2")) //骨矛
		{
			int upLev = getUpLev(theTree, new String[]{"nec2_s1_2","nec2_s12_3","nec2_s24_3","nec2_s30_2"});
			int damageMin = upByPercent3(tbl_nec2_s18_2[p-1][0], 7, upLev);
			int damageMax = upByPercent3(tbl_nec2_s18_2[p-1][1], 7, upLev);
			float mana = cal_mana_1(7, 0.2f, p);

			this.beginAppendFormatLine("魔法伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s24_3")) //骨牢
		{
			int upLev = theTree.getPoint("nec2_s1_3") + theTree.getPoint("nec2_s12_3");

			//第一级基础上的累加
			int lifeNormal = upByPercent5(cal_life_1(19,4,5,3,p), 19, 8, upLev);
			int lifeNightmare = upByPercent5(cal_life_1(147,36,37,3,p), 147, 8, upLev);
			int lifeHell = upByPercent5(cal_life_1(431,107,108,3,p), 431, 8, upLev);

			int mana = 27 - (p-1);
			if (mana < 1)
			{
				mana = 1;
			}

			this.beginAppendFormatLine("生命: %1$s", lifeNormal);
			this.appendFormatLine("生命: %1$s (噩梦)", lifeNightmare);
			this.appendFormatLine("生命: %1$s (地狱)", lifeHell);
			this.appendLine("持续时间: 24 秒");
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s30_1")) //剧毒新星
		{
			int upLev = theTree.getPoint("nec2_s6_1") + theTree.getPoint("nec2_s18_1");
			int poisonDamageMin = upByPercent3(tbl_nec2_s30_1[p-1][0], 10, upLev);
			int poisonDamageMax = upByPercent3(tbl_nec2_s30_1[p-1][1], 10, upLev);

			this.beginAppendFormatLine("毒素伤害: %1$s-%2$s", poisonDamageMin, poisonDamageMax);
			this.appendLine("结束于 2 秒");
			this.endAppendLine("魔法消耗: 20");

			return buffer.toString();
		}
		else if (skill.id.equals("nec2_s30_2")) //白骨之魂
		{
			int upLev = getUpLev(theTree, new String[]{"nec2_s1_2","nec2_s12_3","nec2_s18_2","nec2_s24_3"});
			int damageMin = upByPercent3(tbl_nec2_s30_2[p-1][0], 6, upLev);
			int damageMax = upByPercent3(tbl_nec2_s30_2[p-1][1], 6, upLev);
			float mana = upFloat2(12 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("魔法伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s1_2")) //伤害加深
		{
			float radius = cal_life_1(2,0.6f,0.7f,2,p);
			int duration = 8 + 3*(p-1);

			this.beginAppendLine("伤害增加: +100%");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s6_1")) //微弱暗视
		{
			float radius;
			if (p == 1)
			{
				radius = 2.6f;
			}
			else if (p == 2)
			{
				radius = 3.3f;
			}
			else if (p == 3)
			{
				radius = 4;
			}
			else
			{
				radius = cal_life_1(4,0.6f,0.7f,2,p-2);
			}

			int duration = 7 + 2*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s6_3")) //削弱
		{
			float radius = cal_life_1(6,0.6f,0.7f,2,p);
			float duration = upFloat2(14 + 2.4f*(p-1),2);

			this.beginAppendLine("目标伤害: -33%");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s12_2")) //攻击反噬
		{
			int reflection = 200 + 25*(p-1);
			float duration = upFloat2(12 + 2.4f*(p-1),2);

			this.beginAppendFormatLine("%1$s%% 伤害反噬", reflection);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.appendLine("半径: 4.6 码");
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s12_3")) //恐惧
		{
			int duration = 8 + 1*(p-1);

			this.beginAppendLine("半径: 2.6 码");
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s18_1")) //迷乱
		{
			float radius = cal_life_1(4,0.6f,0.7f,2,p);
			int duration = 10 + 2* (p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 13");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s18_2")) //生命偷取
		{
			float radius;
			if (p == 1)
			{
				radius = 2.6f;
			}
			else if (p == 2)
			{
				radius = 3.3f;
			}
			else if (p == 3)
			{
				radius = 4;
			}
			else
			{
				radius = cal_life_1(4,0.6f,0.7f,2,p-2);
			}
			float duration = upFloat2(16 + 2.4f*(p-1),2);

			this.beginAppendLine("偷取生命: 50% 攻击伤害");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s24_1")) //吸引
		{
			float duration = upFloat2(12 + 3.6f*(p-1),2);

			this.beginAppendLine("半径: 6 码");
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 17");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s24_3")) //衰老
		{
			float duration = upFloat2(4 + 0.6f*(p-1),2);

			this.beginAppendLine("半径: 4 码");
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 11");

			return buffer.toString();
		}
		else if (skill.id.equals("nec3_s30_2"))
		{
			float radius;
			if (p == 1)
			{
				radius = 4.6f;
			}
			else if (p == 2)
			{
				radius = 5.3f;
			}
			else if (p == 3)
			{
				radius = 6;
			}
			else
			{
				radius = cal_life_1(6,0.6f,0.7f,2,p-2);
			}

			int duration = 20 + 2*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("所有抗性: -%1$s%%", tbl_nec3_s30_2[p-1]);
			this.endAppendLine("魔法消耗: 22");

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
		//纯召
		SkillBuildTemplate t1 = new SkillBuildTemplate("nec_template_1", "纯召");
		t1.skillTemplates.put("nec1_s1_1", 20); //骷髅掌握
		t1.skillTemplates.put("nec1_s1_3", 20); //骷髅复生
		t1.skillTemplates.put("nec1_s6_2", 1); //粘土石魔
		t1.skillTemplates.put("nec1_s12_1", 18); //石魔掌握
		t1.skillTemplates.put("nec1_s12_3", 1); //骷髅法师
		t1.skillTemplates.put("nec1_s18_2", 1); //鲜血石魔
		t1.skillTemplates.put("nec1_s24_1", 1); //召唤抵抗
		t1.skillTemplates.put("nec1_s24_2", 1); //钢铁石魔
		t1.skillTemplates.put("nec1_s30_3", 1); //重生
		t1.skillTemplates.put("nec2_s1_2", 1); //牙
		t1.skillTemplates.put("nec2_s6_2", 20); //尸体爆炸
		t1.skillTemplates.put("nec3_s1_2", 1); //伤害加深
		t1.skillTemplates.put("nec3_s6_3", 1); //削弱
		t1.skillTemplates.put("nec3_s12_2", 1); //攻击反噬
		t1.skillTemplates.put("nec3_s12_3", 1); //恐惧
		t1.skillTemplates.put("nec3_s24_3", 1); //衰老

		//毒召
		SkillBuildTemplate t2 = new SkillBuildTemplate("nec_template_2", "毒召");
		t2.skillTemplates.put("nec1_s1_1", 1); //骷髅掌握
		t2.skillTemplates.put("nec1_s1_3", 20); //骷髅复生
		t2.skillTemplates.put("nec1_s6_2", 1); //粘土石魔
		t2.skillTemplates.put("nec1_s12_1", 1); //石魔掌握
		t2.skillTemplates.put("nec1_s24_1", 1); //召唤抵抗
		t2.skillTemplates.put("nec2_s1_2", 1); //牙
		t2.skillTemplates.put("nec2_s6_2", 1); //尸体爆炸
		t2.skillTemplates.put("nec2_s6_1", 20); //淬毒匕首
		t2.skillTemplates.put("nec2_s18_1", 20); //毒爆
		t2.skillTemplates.put("nec2_s30_1", 20); //剧毒新星
		t2.skillTemplates.put("nec3_s1_2", 1); //伤害加深
		t2.skillTemplates.put("nec3_s6_3", 1); //削弱
		t2.skillTemplates.put("nec3_s12_3", 1); //恐惧
		t2.skillTemplates.put("nec3_s24_3", 1); //衰老

		return new SkillBuildTemplate[]{t1, t2};
	}


}
