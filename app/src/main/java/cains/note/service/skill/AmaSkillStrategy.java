package cains.note.service.skill;

final class AmaSkillStrategy extends AbstractSkillStrategy
{

	private final static int[] tbl_ama1_s6_2 = new int[]{
			16,34,52,70,88,106,124,142,178,214,
			250,286,322,358,394,430,484,538,592,646,
			700,754,826,898,970,1042,1114,1186,1276,1366,
			1456,1546,1636,1726,1816,1906,1996,2086,2176,2266,
			2356,2446,2536,2626,2716,2806,2896,2986,3076,3166
	}; //威力一击闪电伤害

	private final static int[][] tbl_ama1_s6_3 = new int[][]{
			{25,37},{46,62},{75,93},{109,131},{150,175},{196,225},{250,281},{309,343},{412,459},{528,589},
			{656,732},{796,890},{950,1062},{1115,1248},{1293,1448},{1484,1662},{1750,1953},{2034,2264},{2337,2595},{2659,2946},
			{3000,3318},{3359,3710},{3818,4204},{4303,4725},{4812,5271},{5346,5845},{5906,6445},{6490,7071},{7300,7825},{8146,8610},
			{9031,9429},{9953,10281},{10912,11165},{11909,12082},{12943,13032},{14015,14015},{15125,15031},{16271,16079},{17456,17160},{18678,18275},
			{19937,19421},{21234,20601},{22568,21814},{23940,23059},{25350,24337},{26796,25648},{28281,26992},{29803,28368},{31362,29778},{32959,31220}
	}; //毒枪毒伤

	private final static int[] tbl_ama1_s12_1 = new int[]{
			46,42,40,37,35,34,33,32,31,30,
			29,29,28,27,27,26,26,26,26,25,
			25,25,24,24,24,24,23,23,23,23,
			23,23,23,23,23,22,22,22,22,22,
			22,22,22,22,21,21,21,21,21,21
	}; //刺爆武器耐久度损失

	private final static int[] tbl_ama1_s12_3 = new int[]{
			40,52,64,76,88,100,112,124,142,160,
			178,196,214,232,250,268,296,324,352,380,
			408,436,484,532,580,628,676,724,812,900,
			988,1076,1164,1252,1340,1428,1516,1604,1692,1780,
			1868,1956,2044,2132,2220,2308,2396,2484,2572,2660
	}; //闪电球闪电伤害

	private final static int[][] tbl_ama1_s18_2 = new int[][]{
			{3,30},{3,42},{3,54},{3,66},{4,78},{4,90},{4,102},{4,114},{4,130},{5,146},
			{5,162},{5,178},{5,194},{5,210},{6,226},{6,242},{6,262},{6,282},{6,302},{7,322},
			{7,342},{7,362},{7,386},{7,410},{8,434},{8,458},{8,482},{8,506},{8,534},{9,562},
			{9,590},{9,618},{9,646},{9,674},{10,702},{10,730},{10,758},{10,786},{10,814},{11,842},
			{11,870},{11,898},{11,926},{11,954},{12,982},{12,1010},{12,1038},{12,1066},{12,1094},{13,1122}
	}; //充能一击闪点弹个数,闪电伤害

	private final static int[][] tbl_ama1_s18_3 = new int[][]{
			{23,37},{42,58},{65,83},{91,111},{122,143},{156,179},{194,219},{235,262},{310,339},{391,422},
			{481,514},{578,612},{682,719},{794,832},{913,954},{1040,1082},{1233,1277},{1439,1485},{1657,1705},{1888,1937},
			{2131,2182},{2386,2440},{2839,2894},{3316,3374},{3819,3878},{4346,4407},{4899,4962},{5476,5541},{6301,6367},{7163,7231},
			{8062,8132},{8999,9071},{9973,10047},{10985,11061},{12035,12112},{13121,13201},{14246,14327},{15408,15491},{16607,16692},{17844,17931},
			{19118,19207},{20430,20521},{21780,21872},{23166,23261},{24591,24687},{26053,26151},{27552,27652},{29089,29191},{30663,30767},{32275,32381}
	}; //瘟疫标枪毒伤

	private final static int[] tbl_ama1_s30_3 = new int[]{
			40,60,80,100,120,140,160,180,210,240,
			270,300,330,360,390,420,460,500,540,580,
			620,660,710,760,810,860,910,960,1010,1060,
			1110,1160,1210,1260,1310,1360,1410,1460,1510,1560,
			1610,1660,1710,1760,1810,1860,1910,1960,2010,2060

	}; //闪电之怒伤害

	private final static int[] tbl_ama2_s1_1 = new int[]{
			40,65,90,115,140,165,190,215,260,305,
			350,395,440,485,530,575,635,695,755,815,
			875,935,1015,1095,1175,1255,1335,1415,1515,1615,
			1715,1815,1915,2015,2115,2215,2315,2415,2515,2615,
			2715,2815,2915,3015,3115,3215,3315,3415,3515,3615
	}; //内视减防

	private final static int[] tbl_ama2_s1_3 = new int[]{
			16,25,32,38,42,46,49,51,54,56,
			58,59,61,62,63,65,65,66,67,68,
			68,69,70,71,71,71,72,72,73,73,
			74,74,74,74,74,75,75,76,76,76,
			76,77,77,77,77,77,77,77,78,78
	}; //致命打击概率

	private final static int[] tbl_ama2_s6_2 = new int[]{
			18,24,29,34,37,40,42,44,46,47,
			49,50,51,52,52,54,54,55,55,56,
			56,57,57,58,58,58,59,59,60,60,
			60,60,61,61,61,61,61,62,62,62,
			62,62,62,62,63,63,63,63,63,63
	}; //闪避概率

	private final static int[] tbl_ama2_s12_2 = new int[]{
			24,31,36,41,45,48,50,52,54,55,
			57,58,60,61,61,63,63,64,64,65,
			66,66,67,67,67,68,69,69,69,69,
			70,70,70,70,70,71,71,72,72,72,
			72,72,72,72,73,73,73,73,73,73
	};//躲避概率

	private final static int[] tbl_ama2_s24_2 = new int[]{
			18,24,29,34,37,40,42,44,46,47,
			49,50,51,52,52,54,54,55,55,56,
			56,57,57,58,58,58,59,59,60,60,
			60,60,61,61,61,61,61,62,62,62,
			62,62,62,62,63,63,63,63,63,63
	}; //逃避概率

	private final static int[] tbl_ama2_s30_3 = new int[]{
			23,34,42,49,55,59,63,65,69,71,
			73,75,77,79,80,82,82,83,84,85,
			86,87,88,89,89,90,91,91,91,91,
			92,92,93,93,93,94,94,95,95,95,
			95,96,96,96,97,97,97,97,98,98
	}; //穿透概率


	private final static float[] tbl_ama3_s1_2 = new float[]{
			1.5f,1.3f,1.2f,1.1f,1,0.8f,0.7f,0.6f,0.5f,0.3f,0.2f,0.1f
	}; //魔法箭魔法消耗

	private final static int[][] tbl_ama3_s1_3 = new int[][]{
			{1,4},{3,6},{5,8},{7,10},{9,12},{11,14},{13,16},{15,18},{18,21},{21,24},
			{24,27},{27,30},{30,33},{33,36},{36,39},{39,42},{45,49},{51,56},{57,63},{63,70},
			{69,77},{75,84},{87,98},{99,112},{111,126},{123,140},{135,154},{147,168},{171,195},{195,222},
			{219,249},{243,276},{267,303},{291,330},{315,357},{339,384},{363,411},{387,438},{411,465},{435,492},
			{459,519},{483,546},{507,573},{531,600},{555,627},{579,654},{603,681},{627,708},{651,735},{675,762}
	}; //火焰箭火伤

//	private final static float[] tbl_ama3_s1_3_mana = new float[]{
//		3,3.1f,3.2f,3.3f,3.5f,3.6f,3.7f,3.8f,4,4.1f,
//		4.2f,4.3f,4.5f,4.6f,4.7f,4.8f,5f,5.1f,5.2f,5.3f,
//		5.5f,5.6f,5.7f,5.8f,6,6.1f,6.2f,6.3f,6.5f,6.6f,
//		6.7f,6.8f,7,7.1f,7.2f,7.3f,7.5f,7.6f,7.7f,7.8f,
//		8,8.1f,8.2f,8.3f,8.5f,8.6f,8.7f,8.8f,9,9.1f
//	}; //火焰箭耗魔

	private final static int[][] tbl_ama3_s6_1 = new int[][]{
			{3,4},{5,6},{7,8},{9,10},{11,12},{13,14},{15,16},{17,18},{19,20},{22,23},
			{24,25},{27,28},{29,30},{32,33},{34,35},{37,38},{41,42},{45,47},{49,51},{53,56},
			{57,60},{61,65},{69,73},{77,82},{85,90},{93,99},{101,107},{109,116},{130,138},{151,160},
			{172,182},{193,204},{214,226},{235,248},{256,270},{277,292},{298,314},{319,336},{340,358},{361,380},
			{382,402},{403,424},{424,446},{445,468},{466,490},{487,512},{508,534},{529,556},{550,578},{571,600}
	}; //冰箭冰伤

	private final static int[][] tbl_ama3_s12_3 = new int[][]{
			{2,6},{7,11},{12,16},{17,21},{22,26},{27,31},{32,36},{37,41},{44,49},{51,57},
			{58,65},{65,73},{72,81},{79,89},{86,97},{93,105},{102,116},{111,127},{120,138},{129,149},
			{138,160},{147,171},{159,185},{171,199},{183,213},{195,227},{207,241},{219,255},{239,278},{259,301},
			{279,324},{299,347},{319,370},{339,393},{359,416},{379,439},{399,462},{419,485},{439,508},{459,531},
			{479,554},{499,577},{519,600},{539,623},{559,646},{579,669},{599,692},{619,715},{639,738},{659,761}
	}; //爆裂箭火伤

	private final static int[][] tbl_ama3_s18_1 = new int[][]{
			{6,10},{12,16},{18,22},{24,28},{30,34},{36,40},{42,46},{48,52},{60,65},{72,78},
			{84,91},{96,104},{108,117},{120,130},{132,143},{144,156},{162,175},{180,194},{198,213},{216,232},
			{234,251},{252,270},{278,297},{304,324},{330,351},{356,378},{382,405},{408,432},{444,470},{480,508},
			{516,546},{552,584},{588,622},{624,660},{660,698},{696,736},{732,774},{768,812},{804,850},{840,888},
			{876,926},{912,964},{948,1002},{984,1040},{1020,1078},{1056,1116},{1092,1154},{1128,1192},{1164,1230},{1200,1268}
	}; //急冻箭冰伤

	private final static int[][] tbl_ama3_s24_3 = new int[][]{
			{10,20,8,9},{20,30,14,15},{30,40,19,21},{40,50,25,27},{50,60,31,33},{60,70,37,39},{70,80,43,45},{80,90,49,51},{100,110,55,57},{120,130,60,63},
			{140,150,66,69},{160,170,72,75},{180,190,78,78},{200,210,84,84},{220,230,90,90},{240,250,96,96},{270,280,101,102},{300,310,107,108},{330,340,113,114},{360,370,119,120},
			{390,400,125,126},{420,430,131,132},{452,462,137,138},{484,494,142,144},{516,526,148,150},{548,558,154,156},{580,590,160,162},{612,622,166,168},{646,656,172,174},{680,690,178,180},
			{714,724,183,186},{748,758,189,192},{782,792,195,198},{816,826,201,201},{850,860,207,207},{884,894,213,213},{918,928,219,219},{952,962,225,225},{986,996,230,231},{1020,1030,236,237},
			{1054,1064,242,243},{1088,1098,248,249},{1122,1132,254,255},{1156,1166,260,261},{1190,1200,266,267},{1224,1234,271,273},{1258,1268,277,279},{1292,1302,283,285},{1326,1336,289,291},{1360,1370,295,297}
	}; //祭奠之箭爆炸伤害,平均火伤

	private final static int[][] tbl_ama3_s30_1 = new int[][]{
			{40,50},{50,60},{60,70},{70,80},{80,90},{90,100},{100,110},{110,120},{125,135},{140,150},
			{155,165},{170,180},{185,195},{200,210},{215,225},{230,240},{250,260},{270,280},{290,300},{310,320},
			{330,340},{350,360},{372,382},{394,404},{416,426},{438,448},{460,470},{482,492},{506,516},{530,540},
			{554,564},{578,588},{602,612},{626,636},{650,660},{674,684},{698,708},{722,732},{746,756},{770,780},
			{794,804},{818,828},{842,852},{866,876},{890,900},{914,924},{938,948},{962,972},{986,996},{1010,1020}
	}; //冻结之箭冰伤

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("ama1_s1_1")) //戳刺
		{
			int accuracy = 10 + (p - 1) * 9;
			int damage = -15 + (p - 1) * 3;
			float mana = upByValue2(2, 0.2f, 0.3f, p);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			if (damage < 0)
			{
				this.appendFormatLine("伤害: %1$s%%", damage);
			}
			else if (damage > 0)
			{
				this.appendFormatLine("伤害: +%1$s%%", damage);
			}
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s6_2")) //威力一击
		{
			int accuracy = 20 + 12*(p-1);
			int upLev = getUpLev(theTree, new String[]{"ama1_s12_3","ama1_s18_2","ama1_s30_2","ama1_s30_3"});
			int damageMin = upByPercent3(1,10,upLev);
			int damageMax = upByPercent3(tbl_ama1_s6_2[p-1],10,upLev);
			float mana = upByValue2(2, 0.2f, 0.3f, p);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s6_3")) //毒枪
		{
			int duration = 8 + 2*(p-1);
			float mana = upByValue2(4, 0.2f, 0.3f, p);

			int upLev = theTree.getPoint("ama1_s18_3");
			int damageMin = upByPercent3(tbl_ama1_s6_3[p-1][0],12,upLev);
			int damageMax = upByPercent3(tbl_ama1_s6_3[p-1][1],12,upLev);

			this.beginAppendFormatLine("毒素伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("结束于 %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s12_1")) //刺爆
		{
			int damage = 300 + 25*(p-1);
			int accuracy = 100 + 25*(p-1);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("武器耐久度损失: %1$s%%", tbl_ama1_s12_1[p-1]);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s12_3")) //闪电球
		{
			int upLev = getUpLev(theTree, new String[]{"ama1_s6_2","ama1_s18_2","ama1_s30_2","ama1_s30_3"});
			int damageMin = upByPercent3(1,3,upLev);
			int damageMax = upByPercent3(tbl_ama1_s12_3[p-1],3,upLev);
			float mana = upByValue2(6, 0.2f, 0.3f, p);

			this.beginAppendLine("3/4 武器伤害");
			this.appendLine("转变 100% 物理伤害为元素伤害");
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s18_2")) //充能一击
		{
			int upLev = getUpLev(theTree, new String[]{"ama1_s6_2","ama1_s12_3","ama1_s30_2","ama1_s30_3"});
			int damageMin = upByPercent3(1,10,upLev);
			int damageMax = upByPercent3(tbl_ama1_s18_2[p-1][1],10,upLev);
			float mana = upByValue2(4, 0.2f, 0.3f, p);

			this.beginAppendFormatLine("释放 %1$s 闪电弹", tbl_ama1_s18_2[p-1][0]);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s18_3")) //瘟疫标枪
		{
			int accuracy = 30 + 9*(p-1);
			int upLev = theTree.getPoint("ama1_s6_3");
			int damageMin = upByPercent3(tbl_ama1_s18_3[p-1][0],10,upLev);
			int damageMax = upByPercent3(tbl_ama1_s18_3[p-1][1],10,upLev);
			float duration = upFloat2(3 + 0.4f * (p-1),2);
			float mana = upFloat2(7 + 0.5f * (p-1),2);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("毒素伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("结束于 %1$s 秒", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s24_1")) //击退
		{
			int attack = 40 + 10 * (p-1);
			int damage = 70 + 10 * (p-1);

			this.beginAppendFormatLine("攻击力: +%1$s%%", attack);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s30_2")) //闪电攻击
		{
			int count = p + 1;
			int damage = cal_ama1_s30_2_dmg(p);

			int upLev = getUpLev(theTree, new String[]{"ama1_s6_2","ama1_s12_3","ama1_s18_2","ama1_s30_3"});
			int damageMin = upByPercent3(1,8,upLev);
			int damageMax = upByPercent3(damage,8,upLev);

			this.beginAppendFormatLine("%1$s 次", count);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("ama1_s30_3")) //闪电之怒
		{
			int count = p + 1;
			int upLev = getUpLev(theTree, new String[]{"ama1_s6_2","ama1_s12_3","ama1_s18_2","ama1_s30_2"});
			int damageMin = upByPercent3(1,1,upLev);
			int damageMax = upByPercent3(tbl_ama1_s30_3[p-1],1,upLev);
			float mana = upFloat2(10 + 0.5f * (p-1),2);

			this.beginAppendFormatLine("释放 %1$s 闪电球", count);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama2_s1_1")) //内视
		{
			int duration = 8 + 4 * (p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("敌人防御: -%1$s", tbl_ama2_s1_1[p-1]);
			this.appendLine("半径: 13.3 码");
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s1_3")) //致命打击
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ama2_s1_3[p-1]);
			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s6_2")) //闪避
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ama2_s6_2[p-1]);
			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s12_1")) //慢速箭
		{
			int duration = 12 + 6 * (p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendLine("减缓敌人速度 33%");
			this.appendLine("半径: 13.3 码");
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s12_2")) //躲避
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ama2_s12_2[p-1]);
			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s18_3")) //刺入
		{
			int accuracy = 35 + 10*(p-1);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s24_1")) //诱饵
		{
			int life = 10*p;
			int duration = 10 + 5*(p-1);
			float mana = cal_ama2_s24_1_mana(p);

			this.beginAppendFormatLine("生命: +%1$s%%", life);
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s24_2")) //逃避
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ama2_s24_2[p-1]);
			return buffer.toString();
		}
		else if(skill.id.equals("ama2_s30_1")) //女武神
		{
			int lifeMin = 400 + 80*(p-1);
			int lifeMax = 480 + 96*(p-1);
			lifeMin = upByPercent3(lifeMin,2,theTree.getPoint("ama2_s24_1"));
			lifeMax = upByPercent3(lifeMax,2,theTree.getPoint("ama2_s24_1"));

			int accuracy = 40 * p;
			accuracy += 40 * theTree.getPoint("ama2_s18_3");

			int damage = 25 * (p-1);
			int defence = 10 * (p-1);
			int mana = 25 + 1* (p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			if (damage > 0)
			{
				this.appendFormatLine("伤害: +%1$s%%", damage);
			}
			this.appendFormatLine("命中率: +%1$s", accuracy);
			if (defence > 0)
			{
				this.appendFormatLine("防御: +%1$s%%", defence);
			}
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();

		}
		else if (skill.id.equals("ama2_s30_3")) //穿透
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_ama2_s30_3[p-1]);
			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s1_2")) //魔法箭
		{
			int accuracy = 10 + 9*(p-1);
			float mana;
			if ((p >=1) && (p<=12))
			{
				mana = tbl_ama3_s1_2[p-1];
			}
			else
			{
				mana = 0;
			}
			this.beginAppendFormatLine("转化 %1$s%% 物理伤害为元素伤害", p);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("伤害: +%1$s", p);
			if (mana >0)
			{
				this.endAppendFormatLine("魔法消耗: %1$s", mana);
			}

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s1_3")) //火焰箭
		{
			int elementDamage = 3 + 2*(p-1);
			int accuracy = 10 + 9*(p-1);
			int fireDamageMin = upByPercent3(tbl_ama3_s1_3[p-1][0],12,theTree.getPoint("ama3_s12_3"));
			int fireDamageMax = upByPercent3(tbl_ama3_s1_3[p-1][1],12,theTree.getPoint("ama3_s12_3"));

			this.beginAppendFormatLine("转化 %1$s%% 物理伤害为元素伤害", elementDamage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("火焰伤害: %1$s-%2$s",fireDamageMin,fireDamageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", cal_mana_1(3, 0.1f, p));

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s6_1")) //冰箭
		{
			int elementDamage = 3 + 2*(p-1);
			int accuracy = 10 + 9*(p-1);
			int iceDamageMin = upByPercent3(tbl_ama3_s6_1[p-1][0],12,theTree.getPoint("ama3_s18_1"));
			int iceDamageMax = upByPercent3(tbl_ama3_s6_1[p-1][1],12,theTree.getPoint("ama3_s18_1"));
			float duration = upFloat2((float)(4 + 1.2f*(p-1)), 2);

			this.beginAppendFormatLine("转化 %1$s%% 物理伤害为元素伤害", elementDamage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s",iceDamageMin,iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", cal_mana_1(3.5f, 0.1f, p));

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s6_2")) //多重箭
		{
			int num = 2 + (p-1);
			if (num > 24)
			{
				num = 24;
			}
			int mana = 4 + (p-1);

			this.beginAppendLine("3/4 武器伤害");
			this.appendFormatLine("%1$s 枝", num);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s12_3")) //爆裂箭
		{
			int accuracy = 20 + 9*(p-1);
			int fireDamageMin = upByPercent3(tbl_ama3_s12_3[p-1][0],12,theTree.getPoint("ama3_s1_3"));
			int fireDamageMax = upByPercent3(tbl_ama3_s12_3[p-1][1],12,theTree.getPoint("ama3_s1_3"));
			float mana = upFloat2(5 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("火焰伤害: %1$s-%2$s",fireDamageMin,fireDamageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s18_1")) //急冻箭
		{
			int accuracy = 20 + 9*(p-1);

			int iceDamageMin = upByPercent3(tbl_ama3_s18_1[p-1][0],8,theTree.getPoint("ama3_s6_1"));
			int iceDamageMax = upByPercent3(tbl_ama3_s18_1[p-1][1],8,theTree.getPoint("ama3_s6_1"));

			float duration = upByPercent3(2 + 0.2f*(p-1), 5, theTree.getPoint("ama3_s30_1"));

			float mana = upByValue2(4,0.2f,0.3f,p);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s",iceDamageMin,iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s18_2")) //向导箭
		{
			int damage = 0 + 5*(p-1);
			float mana = upByValue2(8,-0.3f,-0.2f,p);
			if (mana < 1)
			{
				mana = 1;
			}

			if (damage > 0)
			{
				this.beginAppendFormatLine("伤害: +%1$s%%", damage);
				this.endAppendFormatLine("魔法消耗: %1$s", mana);
			}
			else
			{
				this.beginAppendFormatLine("魔法消耗: %1$s", mana);
			}
			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s24_2")) //炮轰
		{
			int num = 5 + 1*(p-1);
			if (num > 10)
			{
				num = 10;
			}
			int damage = 5*p;

			this.beginAppendLine("3/4 武器伤害");
			this.appendFormatLine("攻击目标数 %1$s", num);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.endAppendLine("魔法消耗: 11");

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s24_3")) //祭奠之箭
		{
			int accuracy = 30 + 9*(p-1);
			int fireDamageMin = upByPercent3(tbl_ama3_s24_3[p-1][0],10,theTree.getPoint("ama3_s12_3"));
			int fireDamageMax = upByPercent3(tbl_ama3_s24_3[p-1][1],10,theTree.getPoint("ama3_s12_3"));

			int avrFireDamageMin = upByPercent3(tbl_ama3_s24_3[p-1][2],5,theTree.getPoint("ama3_s1_3"));
			int avrFireDamageMax = upByPercent3(tbl_ama3_s24_3[p-1][3],5,theTree.getPoint("ama3_s1_3"));

			float mana = upFloat2(6 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("爆炸伤害: %1$s-%2$s", fireDamageMin, fireDamageMax);
			this.appendLine("火焰持续时间: 3 秒");
			this.appendFormatLine("平均火焰伤害: %1$s-%2$s 每秒", avrFireDamageMin, avrFireDamageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("ama3_s30_1"))
		{
			int accuracy = 40 + 9*(p-1);

			int iceDamageMin = upByPercent3(tbl_ama3_s30_1[p-1][0],12,theTree.getPoint("ama3_s6_1"));
			int iceDamageMax = upByPercent3(tbl_ama3_s30_1[p-1][1],12,theTree.getPoint("ama3_s6_1"));

			float duration = upByPercent3(2, 5, theTree.getPoint("ama3_s18_1"));

			float mana = upFloat2(9 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s",iceDamageMin,iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒", duration);
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
		SkillBuildTemplate t1 = new SkillBuildTemplate("ama_template_1", "弓马");
		t1.skillTemplates.put("ama2_s1_1", 1); //内视
		t1.skillTemplates.put("ama2_s12_1", 1); //慢速箭
		t1.skillTemplates.put("ama2_s24_1", 20); //诱饵
		t1.skillTemplates.put("ama2_s30_1", 1); //女武神
		t1.skillTemplates.put("ama2_s6_2", 1); //闪避
		t1.skillTemplates.put("ama2_s12_2", 1); //躲避
		t1.skillTemplates.put("ama2_s24_2", 1); //逃避
		t1.skillTemplates.put("ama2_s1_3", 20); //双倍打击
		t1.skillTemplates.put("ama2_s18_3", 20); //刺入

		t1.skillTemplates.put("ama3_s6_1", 1); //冰箭
		t1.skillTemplates.put("ama3_s1_2", 1); //魔法箭
		t1.skillTemplates.put("ama3_s6_2", 1); //多重箭
		t1.skillTemplates.put("ama3_s18_2", 1); //向导箭
		t1.skillTemplates.put("ama3_s24_2", 20); //炮轰

		SkillBuildTemplate t2 = new SkillBuildTemplate("ama_template_2", "标马");
		t2.skillTemplates.put("ama1_s1_1", 1); //戳刺
		t2.skillTemplates.put("ama1_s6_2", 7); //威力一击
		t2.skillTemplates.put("ama1_s18_2", 20); //充能一击
		t2.skillTemplates.put("ama1_s30_2", 20); //闪电攻击
		t2.skillTemplates.put("ama1_s6_3", 1); //毒枪
		t2.skillTemplates.put("ama1_s12_3", 20); //闪电球
		t2.skillTemplates.put("ama1_s18_3", 1); //瘟疫标枪
		t2.skillTemplates.put("ama1_s30_3", 20); //闪电之怒

		return new SkillBuildTemplate[]{t1, t2};
	}

	//闪电攻击伤害
	private int cal_ama1_s30_2_dmg(int lv)
	{
		int rtn = 25;
		for (int i = 2; i <= lv; i++)
		{
			int fromLv = i -1;
			if (fromLv<=7)
			{
				rtn += 10;
			}
			else if ((fromLv>=8) && (fromLv <= 15))
			{
				rtn += 15;
			}
			else if ((fromLv>=16) && (fromLv<=21))
			{
				rtn += 20;
			}
			else if ((fromLv>=22) && (fromLv<=27))
			{
				rtn += 25;
			}
			else
			{
				rtn += 30;
			}
		}
		return rtn;
	}

	//诱饵的魔法消耗
	private float cal_ama2_s24_1_mana(int lv)
	{
		float rtn = 19;
		for (int i = 2; i <= lv; i++)
		{
			int fromLv = i -1;
			if (fromLv % 2 != 0)
			{
				rtn -= 0.8f;
			}
			else
			{
				rtn -= 0.7f;
			}
			if (rtn <= 1)
			{
				return 1;
			}
		}
		return upFloat2(rtn,2);
	}
}
