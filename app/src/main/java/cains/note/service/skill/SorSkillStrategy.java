package cains.note.service.skill;

final class SorSkillStrategy extends AbstractSkillStrategy
{
	private static int[] tbl_sor1_s1_2 = {
			5,6,8,9,11,12,14,15,18,20,
			23,25,28,30,33,35,39,42,46,49,
			53,56,61,65,70,74,79,83,89,94,
			100,105,111,116,122,127,133,138,144,149,
			155,160,166,171,177,182,188,193,199,204
	}; //冰弹最大冰伤

	private static float[] tbl_sor1_s1_3 = {
			1.2f,1.3f,1.4f,1.5f,1.6f,1.8f,1.9f,2,2.1f,2.2f,
			2.4f,2.5f,2.6f,2.7f,2.8f,3,3.1f,3.2f,3.3f,3.4f,
			3.6f,3.7f,3.8f,3.9f,4,4.2f,4.3f,4.4f,4.5f,4.6f,
			4.8f,4.9f,5,5.1f,5.2f,5.4f,5.5f,5.6f,5.7f,5.8f,
			6,6.1f,6.2f,6.3f,6.4f,6.6f,6.7f,6.8f,6.9f,7
	}; //冰封装甲冰冻时间

	private static int[] tbl_sor1_s6_1 = {
			4,6,9,11,14,16,19,21,25,28,
			32,35,39,42,46,49,54,58,63,67,
			72,76,82,87,93,98,104,109,116,122,
			129,135,142,148,155,161,168,174,181,187,
			194,200,207,213,220,226,233,239,246,252
	}; //霜之新星最大冰伤

	private static int[] tbl_sor1_s6_2 = {
			12,19,27,34,42,49,57,64,79,93,
			108,122,137,151,166,180,202,223,245,266,
			288,309,338,366,395,423,452,480,516,551,
			587,622,658,693,729,764,800,835,871,906,
			942,977,1013,1048,1084,1119,1155,1190,1226,1261
	}; //冰风暴最大冰伤

	private static int[] tbl_sor1_s12_3 = {
			8,10,13,15,18,20,23,25,29,32,
			36,39,43,46,50,53,58,62,67,71,
			76,80,86,91,97,102,108,113,120,126,
			133,139,146,152,159,165,172,178,185,191,
			198,204,211,217,224,230,237,243,250,256
	}; //碎冰甲最大冰伤

	private static int[] tbl_sor1_s18_2 = {
			24,31,39,46,54,61,69,76,90,103,
			117,130,144,157,171,184,199,213,228,242,
			257,271,287,302,318,333,349,364,381,397,
			414,430,447,463,480,496,513,529,546,562,
			579,595,612,628,645,661,678,694,711,727
	}; //冰尖柱最大冰伤

	private static int[] tbl_sor1_s24_3 = {
			6,7,9,10,12,13,15,16,19,21,
			24,26,29,31,34,36,40,43,47,50,
			54,57,62,66,71,75,80,84,90,95,
			101,106,112,117,123,128,134,139,145,150,
			156,161,167,172,178,183,189,194,200,205
	}; //寒冰装甲最大冰伤

	private static int[] tbl_sor1_s30_1 = {
			45,55,66,76,87,97,108,118,131,143,
			156,168,181,193,206,218,233,247,262,276,
			291,305,320,335,350,365,380,395,411,426,
			442,457,473,488,504,519,535,550,566,581,
			597,612,628,643,659,674,690,705,721,736
	}; //冰封球最大冰伤

	private static int[][] tbl_sor2_s1_2 = {
			{2,4},{2,4},{3,5},{3,5},{4,6},{4,6},{5,7},{5,7},{6,8},{6,8},
			{7,9},{7,9},{8,10},{8,10},{9,11},{9,11},{10,12},{11,13},{12,14},{13,15},
			{14,16},{15,17},{17,19},{18,20},{20,22},{21,23},{23,25},{24,26},{26,28},{28,30},
			{30,32},{32,34},{34,36},{36,38},{38,40},{40,42},{42,44},{44,46},{46,48},{48,50},
			{50,52},{52,54},{54,56},{56,58},{58,60},{60,62},{62,64},{64,66},{66,68},{68,70}
	}; //充能弹电伤

	private static int[] tbl_sor2_s18_2 = {
			5,5,5,5,6,6,6,6,6,7,
			7,7,7,7,8,8,8,8,8,9,
			9,9,9,9,10,10,10,10,10,11,
			11,11,11,11,12,12,12,12,12,13,
			13,13,13,13,14,14,14,14,14,15
	}; //连锁闪电电击次数

	private static int[][] tbl_sor3_s1_2 = {
			{3,6},{4,7},{6,9},{7,10},{9,12},{10,13},{12,15},{13,16},{15,19},{17,22},
			{19,25},{21,28},{23,31},{25,34},{27,37},{29,40},{33,45},{37,50},{41,55},{45,60},
			{49,65},{53,70},{62,80},{71,90},{80,100},{89,110},{98,120},{107,130},{134,158},{161,186},
			{188,214},{215,242},{242,270},{269,298},{296,326},{323,354},{350,382},{377,410},{404,438},{431,466},
			{458,494},{485,522},{512,550},{539,578},{566,606},{593,634},{620,662},{647,690},{674,718},{701,746}
	}; //火弹火伤

	private static int[][] tbl_sor3_s6_1 = {
			{12,25},{21,34},{31,43},{40,53},{50,62},{59,71},{68,81},{78,90},{88,101},{98,111},
			{108,122},{118,132},{128,143},{139,153},{149,164},{159,175},{170,186},{181,197},{192,208},{203,220},
			{214,231},{225,242},{237,255},{250,268},{262,281},{275,294},{287,307},{300,320},{314,334},{328,349},
			{342,363},{356,378},{370,392},{384,407},{398,421},{412,435},{426,450},{440,464},{454,479},{468,493},
			{482,508},{496,522},{510,537},{525,551},{539,566},{553,580},{567,594},{581,609},{595,623},{609,638}
	}; //地狱火火伤

	private static int[] tbl_sor3_s6_1_mana = {
			7,7,7,7,7,8,8,8,8,8,
			8,9,9,9,9,9,10,10,10,10,
			10,11,11,11,11,11,12,12,12,12,
			12,13,13,13,13,13,14,14,14,14,
			14,15,15,15,15,15,16,16,16,16
	}; //地狱火魔法消耗

	private static int[][] tbl_sor3_s12_1 = {
			{18,37},{28,46},{37,56},{46,65},{56,75},{65,84},{75,93},{84,103},{98,117},{112,131},
			{126,145},{140,159},{154,173},{168,187},{182,201},{196,215},{215,234},{234,253},{253,271},{271,290},
			{290,309},{309,328},{337,356},{365,384},{393,412},{421,440},{450,468},{478,496},{520,539},{562,581},
			{604,623},{646,665},{689,707},{731,750},{773,792},{815,834},{857,876},{900,918},{942,960},{984,1003},
			{1026,1045},{1068,1087},{1110,1129},{1153,1171},{1195,1214},{1237,1256},{1279,1298},{1321,1340},{1364,1382},{1406,1425}
	}; //烈焰之径平均火焰伤害

	private static int[][] tbl_sor3_s12_2 = {
			{6,14},{12,21},{19,29},{25,36},{32,44},{38,51},{45,59},{51,66},{63,79},{74,91},
			{86,104},{97,116},{109,129},{120,141},{132,154},{143,166},{157,181},{171,196},{185,211},{199,226},
			{213,241},{227,256},{244,274},{260,291},{277,309},{293,326},{310,344},{326,361},{345,381},{364,401},
			{383,421},{402,441},{421,461},{440,481},{459,501},{478,521},{497,541},{516,561},{535,581},{554,601},
			{573,621},{592,641},{611,661},{630,681},{649,701},{668,721},{687,741},{706,761},{725,781},{744,801}
	}; //火球火焰伤害

	private static int[][] tbl_sor3_s18_1 = {
			{70,93},{112,135},{154,178},{196,220},{239,262},{281,304},{323,346},{365,389},{431,454},{496,520},
			{562,585},{628,651},{693,717},{759,782},{825,848},{890,914},{989,1012},{1087,1110},{1185,1209},{1284,1307},
			{1382,1406},{1481,1504},{1579,1603},{1678,1701},{1776,1800},{1875,1898},{1973,1996},{2071,2095},{2170,2193},{2268,2292},
			{2367,2390},{2465,2489},{2564,2587},{2662,2685},{2760,2784},{2859,2882},{2957,2981},{3056,3079},{3154,3178},{3253,3276},
			{3351,3375},{3450,3473},{3548,3571},{3646,3670},{3745,3768},{3843,3867},{3942,3965},{4040,4064},{4139,4162},{4237,4260}
	}; //火墙火焰伤害

	private static int[][] tbl_sor3_s18_3 = {
			{8,10},{9,12},{11,15},{12,17},{14,20},{15,22},{17,25},{18,27},{22,32},{25,36},
			{29,41},{32,45},{36,50},{39,54},{43,59},{46,63},{52,70},{57,76},{63,83},{68,89},
			{74,96},{79,102},{87,111},{94,119},{102,128},{109,136},{117,145},{124,153},{134,164},{143,174},
			{153,185},{162,195},{172,206},{181,216},{191,227},{200,237},{210,248},{219,258},{229,269},{238,279},
			{248,290},{257,300},{267,311},{276,321},{286,332},{295,342},{305,353},{314,363},{324,374},{333,384}
	}; //火焰强化火焰伤害

	private static int[][] tbl_sor3_s24_2 = {
			{35,57},{44,66},{53,75},{63,84},{72,96},{82,105},{91,114},{100,123},{112,135},{124,147},
			{135,159},{147,171},{159,180},{171,192},{182,204},{194,216},{208,231},{222,246},{236,258},{250,273},
			{264,288},{278,300},{292,315},{307,330},{321,342},{335,357},{349,372},{363,384},{377,399},{391,414},
			{405,426},{419,441},{433,456},{447,471},{461,483},{475,498},{489,513},{503,525},{517,540},{532,555},
			{546,567},{560,582},{574,597},{588,609},{602,624},{616,639},{630,651},{644,666},{658,681},{672,696}
	}; //陨石平均火焰伤害

	private static int[][] tbl_sor3_s30_3 = {
			{12,17},{16,22},{21,28},{25,33},{30,39},{34,44},{39,50},{43,55},{50,63},{56,70},
			{63,78},{69,85},{76,93},{82,100},{89,108},{95,115},{104,125},{112,134},{121,144},{129,153},
			{138,163},{146,172},{157,184},{167,195},{178,207},{188,218},{199,230},{209,241},{222,255},{234,268},
			{247,282},{259,295},{272,309},{284,322},{297,336},{309,349},{322,363},{334,376},{347,390},{359,403},
			{372,417},{384,430},{397,444},{409,457},{422,471},{434,484},{447,498},{459,511},{472,525},{484,538}
	}; //九头海蛇火焰伤害

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("sor1_s1_2")) //冰弹
		{
			int upPercent = 15 * this.getUpLev(theTree, new String[]{"sor1_s6_1","sor1_s6_2","sor1_s18_2","sor1_s24_1","sor1_s30_1"});
			int iceDamageMin = upByValue8(3,new int[][]{{2,1},{9,2},{17,3},{23,4},{29,5}},p);
			int iceDamageMax = tbl_sor1_s1_2[p-1];

			if (upPercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upPercent);
				iceDamageMax = upByPercent2(iceDamageMax, upPercent);
			}

			float duration = upFloat2(6 + 1.4f*(p-1),2);

			this.beginAppendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s1_3")) //冰封装甲
		{
			int defence = 30 + 5*(p-1);

			int upLev = theTree.getPoint("sor1_s12_3") + theTree.getPoint("sor1_s24_3");
			int duration = 120 + 12*(p-1) + 10*upLev;
			float frozenDuration = tbl_sor1_s1_3[p-1];
			if (upLev > 0)
			{
				frozenDuration = upByPercent2_ceil(frozenDuration, 5*upLev);
			}

			this.beginAppendFormatLine("防御加成: %1$s%%", defence);
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("冰冻时间 %1$s 秒 ", frozenDuration);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s6_1")) //霜之新星
		{
			int upPercent = 10*(theTree.getPoint("sor1_s24_1") + theTree.getPoint("sor1_s30_1"));
			int iceDamageMin = upByValue8(2,new int[][]{{2,2},{9,3},{17,4},{23,5},{29,6}},p);
			int iceDamageMax = tbl_sor1_s6_1[p-1];

			if (upPercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upPercent);
				iceDamageMax = upByPercent2(iceDamageMax, upPercent);
			}

			int duration = 8 + 1*(p-1);
			int mana = 9 + 1*(p-1);

			this.beginAppendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s6_2")) //冰风暴
		{
			int upDamagePercent = 8*(this.getUpLev(theTree, new String[]{"sor1_s1_2","sor1_s24_1","sor1_s30_1"}));
			int upDurationPercent = 10*theTree.getPoint("sor1_s18_2");

			int iceDamageMin = upByValue8(8,new int[][]{{2,7},{9,14},{17,21},{23,28},{29,35}},p);
			int iceDamageMax = tbl_sor1_s6_2[p-1];

			if (upDamagePercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upDamagePercent);
				iceDamageMax = upByPercent2(iceDamageMax, upDamagePercent);
			}

			float duration = upFloat2(3 + 0.2f*(p-1),2);
			if (upDurationPercent > 0)
			{
				duration = upByPercent2_ceil(duration, upDurationPercent);
			}

			float mana = upFloat2(6 + 0.5f*(p-1),2);

			this.beginAppendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s12_3")) //碎冰甲
		{
			int duration = 120 + 12*(p-1);
			int defence = 45 + 6*(p-1);

			int iceDamageMin = upByValue8(6,new int[][]{{2,2},{9,3},{17,4},{23,5},{29,6}},p);
			int iceDamageMax = tbl_sor1_s12_3[p-1];

			int upLev = theTree.getPoint("sor1_s1_3") + theTree.getPoint("sor1_s24_3");
			int upDamagePercent = 9*upLev;
			int upDuration = 10*upLev;

			duration += upDuration;
			if (upDamagePercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upDamagePercent);
				iceDamageMax = upByPercent2(iceDamageMax, upDamagePercent);
			}

			int frozenDuration = cal_sor1_s12_3_frozenDuration(p);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("防御加成: %1$s%%", defence);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", frozenDuration);
			this.endAppendLine("魔法消耗: 11");

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s18_2")) //冰尖柱
		{
			int upDamagePercent = 5*(this.getUpLev(theTree, new String[]{"sor1_s1_2","sor1_s6_2","sor1_s30_1"}));
			int upDurationPercent = 3*theTree.getPoint("sor1_s24_1");

			int iceDamageMin = upByValue8(16,new int[][]{{2,7},{9,13},{17,14},{23,15},{29,16}},p);
			int iceDamageMax = tbl_sor1_s18_2[p-1];

			float duration = upByValue4(2,0.1f,0.2f,4,p);

			if (upDamagePercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upDamagePercent);
				iceDamageMax = upByPercent2(iceDamageMax, upDamagePercent);
			}

			if (upDurationPercent > 0)
			{
				duration = upByPercent2_ceil(duration, upDurationPercent);
			}

			float mana = 10 + 0.5f*(p-1);

			this.beginAppendLine("半径: 2.6 码");
			this.appendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s24_1")) //暴风雪
		{
			int upDamagePercent = 5*(this.getUpLev(theTree, new String[]{"sor1_s1_2","sor1_s6_2","sor1_s18_2"}));

			int iceDamageMin = upByValue8(45,new int[][]{{2,15},{9,30},{17,45},{23,55},{29,65}},p);
			int iceDamageMax = upByValue8(75,new int[][]{{2,16},{9,31},{17,46},{23,56},{29,66}},p);

			if (upDamagePercent > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, upDamagePercent);
				iceDamageMax = upByPercent2(iceDamageMax, upDamagePercent);
			}

			int mana = 23 + 1*(p-1);

			this.beginAppendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendLine("持续时间: 4 秒");
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s24_3")) //寒冰装甲
		{
			int upLev = theTree.getPoint("sor1_s1_3") + theTree.getPoint("sor1_s12_3");

			int defence = 45 + 5*(p-1);
			int duration = 144 + 6*(p-1) + 10*upLev;

			int iceDamageMin = upByValue8(4,new int[][]{{2,1},{9,2},{17,3},{23,4},{29,5}},p);
			int iceDamageMax = tbl_sor1_s24_3[p-1];

			if (upLev > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, 7*upLev);
				iceDamageMax = upByPercent2(iceDamageMax, 7*upLev);
			}

			this.beginAppendFormatLine("防御加成: %1$s%%", defence);
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.endAppendLine("魔法消耗: 17");

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s30_1")) //冰封球
		{
			int iceDamageMin = upByValue8(40,new int[][]{{2,10},{9,12},{17,14},{24,15},{25,14},{26,15},{27,14},{28,15}},p);
			int iceDamageMax = tbl_sor1_s30_1[p-1];

			int upLev = theTree.getPoint("sor1_s1_2");
			if (upLev > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, 2*upLev);
				iceDamageMax = upByPercent2(iceDamageMax, 2*upLev);
			}

			int duration = 8 + 1*(p-1);
			int mana = upByValue2(25,0,1,p);

			this.beginAppendFormatLine("冰冷伤害: %1$s-%2$s", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor1_s30_2")) //冰冷掌握
		{
			int percent = 20 + 5*(p-1);

			this.beginAppendFormatLine("%1$s%%", percent);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s1_2")) //充能弹
		{
			int minLightDamage = tbl_sor2_s1_2[p-1][0];
			int maxLightDamage = tbl_sor2_s1_2[p-1][1];

			int upPercent = 6*theTree.getPoint("sor2_s12_2");

			if (upPercent > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent);
			}

			int upPercent2 =  getLightMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent2);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent2);
			}

			int num = 3 + 1*(p-1);
			if (num > 24)
			{
				num = 24;
			}

			float mana = 3 + 0.5f*(p-1);

			this.beginAppendFormatLine("闪电伤害: %1$s-%2$s", minLightDamage, maxLightDamage);
			this.appendFormatLine("数量 %1$s", num);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s6_1")) //静态力场
		{
			float radius = cal_sor2_s6_1(p);

			this.beginAppendLine("削弱敌人生命 25%");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s6_3")) //心灵遥感
		{
			this.beginAppendFormatLine("闪电伤害: %1$s-%2$s", p, p+1);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s12_1")) //新星
		{
			int lightDamageMin = upByValue8(1,new int[][]{{2,6},{9,7},{17,8},{23,9},{29,10}},p);
			int lightDamageMax = upByValue8(20,new int[][]{{2,8},{9,9},{17,10},{23,11},{29,12}},p);

			int mana = 15 + 1*(p-1);

			this.beginAppendFormatLine("闪电伤害: %1$s-%2$s", lightDamageMin, lightDamageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s12_2")) //闪电
		{
			int minLightDamage = 1;
			int maxLightDamage = upByValue8(40,new int[][]{{2,8},{9,12},{17,20},{23,28},{29,36}},p);

			int upPercent = 8*this.getUpLev(theTree, new String[]{"sor2_s1_2","sor2_s12_1","sor2_s18_2"});

			if (upPercent > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent);
			}

			int upPercent2 =  getLightMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent2);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent2);
			}

			float mana = upFloat2(8 + 0.5f*(p-1),1);

			this.beginAppendFormatLine("闪电伤害: %1$s-%2$s", minLightDamage, maxLightDamage);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s18_2")) //连锁闪电
		{
			int minLightDamage = 1;
			int maxLightDamage = upByValue8(40,new int[][]{{2,11},{9,13},{17,15}},p);

			int upPercent = 4*this.getUpLev(theTree, new String[]{"sor2_s1_2","sor2_s12_1","sor2_s12_2"});

			if (upPercent > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent);
			}

			int upPercent2 =  getLightMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent2);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent2);
			}

			int mana = 9 + 1*(p-1);

			this.beginAppendFormatLine("电击次数: %1$s", tbl_sor2_s18_2[p-1]);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", minLightDamage, maxLightDamage);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s18_3")) //传送
		{
			int mana = 24 - 1*(p-1);
			if (mana < 1)
			{
				mana = 1;
			}

			this.beginAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s24_1")) //雷云风暴
		{
			int minLightDamage = upByValue8(1,new int[][]{{2,10},{17,11}},p);
			int maxLightDamage = upByValue8(100,new int[][]{{2,10},{17,11}},p);

			int upPercent2 =  getLightMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minLightDamage = upByPercent2(minLightDamage, upPercent2);
				maxLightDamage = upByPercent2(maxLightDamage, upPercent2);
			}

			int duration = 32 + 8*(p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", minLightDamage, maxLightDamage);
			this.endAppendLine("魔法消耗: 19");

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s24_3")) //能量护盾
		{
			int duration = 144 + 60*(p-1);
			int absorb = upByValue8(20,new int[][]{{2,5},{9,2},{17,1}},p);
			if (absorb > 95)
			{
				absorb = 95;
			}

			this.beginAppendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("吸收 %1$s%%", absorb);
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if (skill.id.equals("sor2_s30_2")) //电系掌握
		{
			this.beginAppendFormatLine("闪电伤害: +%1$s%%", getLightMasteryUp(theTree));

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s1_2")) //火弹
		{
			int minFireDamage = tbl_sor3_s1_2[p-1][0];
			int maxFireDamage = tbl_sor3_s1_2[p-1][1];

			int upPercent = 16*this.getUpLev(theTree, new String[]{"sor3_s12_2","sor3_s24_2"});

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			this.beginAppendFormatLine("火焰伤害: %1$s-%2$s", minFireDamage, maxFireDamage);
			this.endAppendLine("魔法消耗: 2.5");

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s1_3")) //暖气
		{
			int percent = 30 + 12*(p-1);

			this.beginAppendFormatLine("%1$s%%", percent);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s6_1")) //地狱火
		{
			int minFireDamage = tbl_sor3_s6_1[p-1][0];
			int maxFireDamage = tbl_sor3_s6_1[p-1][1];

			int upPercent = 13*theTree.getPoint("sor3_s1_3");

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			float radius = cal_sor3_s6_1(p);

			this.beginAppendLine("最低魔法需求: 6");
			this.appendFormatLine("平均火焰伤害: %1$s-%2$s 每秒 ", minFireDamage, maxFireDamage);
			this.appendFormatLine("射程: %1$s 码", radius);
			this.endAppendFormatLine("魔法消耗: %1$s 每秒 ", tbl_sor3_s6_1_mana[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s12_1")) //烈焰之径
		{
			int minFireDamage = tbl_sor3_s12_1[p-1][0];
			int maxFireDamage = tbl_sor3_s12_1[p-1][1];

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			float duration = upFloat2(3.6f + 1*(p-1),1);
			float mana = upFloat2(11 + 0.5f*(p-1),1);

			this.beginAppendFormatLine("火焰持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("平均火焰伤害: %1$s-%2$s 每秒 ", minFireDamage, maxFireDamage);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s12_2")) //火球
		{
			int minFireDamage = tbl_sor3_s12_2[p-1][0];
			int maxFireDamage = tbl_sor3_s12_2[p-1][1];

			int upPercent = 14*(theTree.getPoint("sor3_s1_2") + theTree.getPoint("sor3_s24_2"));

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			float mana = upFloat2(5 + 0.5f*(p-1),1);

			this.beginAppendLine("半径: 1 码");
			this.appendFormatLine("火焰伤害: %1$s-%2$s", minFireDamage, maxFireDamage);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s18_1")) //火墙
		{
			int minFireDamage = tbl_sor3_s18_1[p-1][0];
			int maxFireDamage = tbl_sor3_s18_1[p-1][1];

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			float radius = upByFloat(4.6f, 1.3f, new float[]{0.9f}, p);

			int mana = 22 + 1*(p-1);

			this.beginAppendLine("火焰持续时间: 3.6 秒");
			this.appendFormatLine("平均火焰伤害: %1$s-%2$s 每秒", minFireDamage, maxFireDamage);
			this.appendFormatLine("%1$s 码", radius);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s18_3")) //火焰强化
		{
			int minFireDamage = tbl_sor3_s18_3[p-1][0];
			int maxFireDamage = tbl_sor3_s18_3[p-1][1];

			int upPercent = 9*theTree.getPoint("sor3_s1_3");

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			int duration = 144 + 24*(p-1);
			int attack = 20 + 9*(p-1);
			int mana = 25 + 1*(p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("火焰伤害: %1$s-%2$s", minFireDamage, maxFireDamage);
			this.appendFormatLine("攻击力: +%1$s%%", attack);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();

		}
		else if (skill.id.equals("sor3_s24_2")) //火焰强化
		{
			//火伤
			int minFireDamage = upByValue8(80, new int[][]{{2,23},{9,39},{17,79},{23,81},{29,83}},p);
			int maxFireDamage = upByValue8(100, new int[][]{{2,25},{9,41},{17,81},{23,83},{29,85}},p);

			int upPercent = 5*(theTree.getPoint("sor3_s1_2") + theTree.getPoint("sor3_s12_2"));

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			//平均火伤
			int minFireDamage2 = tbl_sor3_s24_2[p-1][0];
			int maxFireDamage2 = tbl_sor3_s24_2[p-1][1];

			upPercent = 3*theTree.getPoint("sor3_s6_1");
			if (upPercent > 0)
			{
				minFireDamage2 = upByPercent2(minFireDamage2, upPercent);
				maxFireDamage2 = upByPercent2(maxFireDamage2, upPercent);
			}
			if (upPercent2 > 0)
			{
				minFireDamage2 = upByPercent2(minFireDamage2, upPercent2);
				maxFireDamage2 = upByPercent2(maxFireDamage2, upPercent2);
			}

			int mana = upByValue2(17,0,1,p);

			this.beginAppendFormatLine("火焰伤害: %1$s-%2$s", minFireDamage, maxFireDamage);
			this.appendLine("半径: 4 码");
			this.appendFormatLine("平均火焰伤害: %1$s-%2$s 每秒 ", minFireDamage2, maxFireDamage2);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s30_2")) //火系掌握
		{
			this.beginAppendFormatLine("火焰伤害: +%1$s%%", getFireMasteryUp(theTree));

			return buffer.toString();
		}
		else if (skill.id.equals("sor3_s30_3")) //九头海蛇
		{
			int minFireDamage = tbl_sor3_s30_3[p-1][0];
			int maxFireDamage = tbl_sor3_s30_3[p-1][1];

			int upPercent = 3*(theTree.getPoint("sor3_s1_2") + theTree.getPoint("sor3_s12_2"));

			if (upPercent > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent);
			}

			int upPercent2 =  getFireMasteryUp(theTree);
			if (upPercent2 > 0)
			{
				minFireDamage = upByPercent2(minFireDamage, upPercent2);
				maxFireDamage = upByPercent2(maxFireDamage, upPercent2);
			}

			int mana = upByValue2(20,0,1,p);

			this.beginAppendLine("持续时间: 10 秒 ");
			this.appendFormatLine("九头海蛇 火焰伤害: %1$s-%2$s", minFireDamage, maxFireDamage);
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
		SkillBuildTemplate t1 = new SkillBuildTemplate("sor_template_1", "纯冰\r\n法师");
		t1.skillTemplates.put("sor1_s1_2", 4); //冰弹
		t1.skillTemplates.put("sor1_s1_3", 1); //冰封装甲
		t1.skillTemplates.put("sor1_s6_1", 1); //霜之新星
		t1.skillTemplates.put("sor1_s6_2", 20); //冰风暴
		t1.skillTemplates.put("sor1_s18_2", 20); //冰尖柱
		t1.skillTemplates.put("sor1_s24_1", 20); //暴风雪
		t1.skillTemplates.put("sor1_s30_2", 20); //冰冷掌握
		t1.skillTemplates.put("sor2_s6_1", 1); //静态力场
		t1.skillTemplates.put("sor2_s6_3", 1); //心灵传动
		t1.skillTemplates.put("sor2_s18_3", 1); //传送
		t1.skillTemplates.put("sor3_s1_3", 1); //暖气

		SkillBuildTemplate t2 = new SkillBuildTemplate("sor_template_2", "纯电\r\n法师");
		t2.skillTemplates.put("sor1_s1_3", 1); //冰封装甲
		t2.skillTemplates.put("sor2_s1_2", 5); //充能弹
		t2.skillTemplates.put("sor2_s6_1", 1); //静态力场
		t2.skillTemplates.put("sor2_s6_3", 1); //心灵传动
		t2.skillTemplates.put("sor2_s12_1", 20); //新星
		t2.skillTemplates.put("sor2_s12_2", 20); //闪电
		t2.skillTemplates.put("sor2_s18_2", 20); //连锁闪电
		t2.skillTemplates.put("sor2_s18_3", 1); //传送
		t2.skillTemplates.put("sor2_s30_2", 20); //电系掌握
		t2.skillTemplates.put("sor3_s1_3", 1); //暖气

		return new SkillBuildTemplate[]{t1, t2};
	}

	private int cal_sor1_s12_3_frozenDuration(int lv)
	{
		int rtn = 4;
		if (lv == 1) return rtn;

		for (int i = 2; i<=lv; i++)
		{
			if (i>=2 && i<=8)
			{
				rtn += 0;
			}
			else if (i>=9 && i<=16)
			{
				rtn += 1;
			}
			else
			{
				rtn += 2;
			}
		}
		return rtn;
	}

	private int getLightMasteryUp(SkillTree theTree)
	{
		int levUp = theTree.getPoint("sor2_s30_2");
		if (levUp == 0)
		{
			return 0;
		}
		else
		{
			return 50 + 12*(levUp - 1);
		}
	}

	private int getFireMasteryUp(SkillTree theTree)
	{
		int levUp = theTree.getPoint("sor3_s30_2");
		if (levUp == 0)
		{
			return 0;
		}
		else
		{
			return 30 + 7*(levUp - 1);
		}
	}

	private float cal_sor2_s6_1(int lv)
	{
		float rtn = 3.3f;
		if (lv == 1)
		{
			return rtn;
		}
		else
		{
			for (int i = 2; i <= lv; i++)
			{
				float f = upFloat2((float)(rtn - (int)rtn),2);
				if (f == 0)
				{
					rtn += 0.6f;
					rtn = upFloat2(rtn,2);
				}
				else
				{
					rtn += 0.7f;
					rtn = upFloat2(rtn,2);
				}
			}
		}
		return upFloat2(rtn,2);
	}

	private float cal_sor3_s6_1(int lv)
	{
		float rtn = 3.3f;
		if (lv == 1)
		{
			return rtn;
		}
		else
		{
			int num = 0;
			for (int i = 2; i <= lv; i++)
			{
				if (num == 0)
				{
				}
				else if (num == 1 || num == 3)
				{
					rtn += 0.7f;
					rtn = upFloat2(rtn,2);
				}
				else if (num == 2)
				{
					rtn += 0.6f;
					rtn = upFloat2(rtn,2);
				}
				num++;
				if (num == 4)
				{
					num = 0;
				}
			}
		}

		return rtn;
	}
}
