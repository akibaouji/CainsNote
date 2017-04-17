package cains.note.service.skill;

final class DruSkillStrategy extends AbstractSkillStrategy
{
	private final static int[][] tbl_dru1_s1_1 = new int[][]{
			{3,7},{7,10},{10,14},{14,17},{17,21},{21,24},{24,28},{28,31},{33,38},{39,45},
			{45,52},{51,59},{57,66},{63,73},{69,80},{75,87},{83,97},{91,106},{99,116},{107,125},
			{116,134},{124,144},{140,161},{157,179},{173,196},{189,214},{206,232},{222,249},{247,276},{271,303},
			{296,330},{321,357},{345,384},{370,411},{394,438},{419,465},{444,492},{468,519},{493,546},{517,573},
			{542,600},{567,626},{591,653},{616,680},{641,707},{665,734},{690,761},{714,788},{739,815},{764,842}
	};//火风暴

	private final static int[][] tbl_dru1_s6_1 = new int[][]{
			{11,15,6,12},{18,21,10,17},{25,30,14,22},{32,36,18,27},{39,42,22,32},{46,51,26,37},{53,57,30,42},{60,63,34,47},{69,72,41,55},{77,81,48,63},
			{85,90,55,71},{93,96,62,79},{101,105,69,87},{110,114,76,95},{118,123,83,103},{126,129,90,111},{135,138,100,122},{145,150,110,133},{154,159,120,144},{164,168,130,155},
			{173,177,140,166},{182,186,150,177},{193,198,163,191},{203,207,176,205},{214,219,189,219},{225,228,202,233},{235,240,215,247},{246,249,228,261},{257,261,244,278},{269,273,260,295},
			{281,285,276,312},{292,297,292,329},{304,309,308,346},{316,321,324,363},{328,330,340,380},{339,342,356,397},{351,354,372,414},{363,366,388,431},{375,378,404,448},{386,390,420,465},
			{398,402,436,482},{410,414,452,499},{421,426,468,516},{433,438,484,533},{445,450,500,550},{457,459,516,567},{468,471,532,584},{480,483,548,601},{492,495,564,618},{503,507,580,635}
	};//熔浆巨岩平均火焰伤害,伤害


	private final static int[][] tbl_dru1_s12_1 = new int[][]{
			{15,25},{21,31},{27,37},{33,43},{39,49},{45,55},{51,61},{57,67},{69,79},{81,91},
			{93,103},{105,115},{117,127},{129,139},{141,151},{153,163},{169,179},{185,195},{201,211},{201,211},
			{233,243},{249,259},{267,278},{285,297},{303,316},{321,335},{339,354},{339,354},{379,396},{401,419},
			{423,442},{445,465},{467,488},{489,511},{511,534},{533,557},{555,580},{577,603},{599,626},{621,649},
			{643,672},{665,695},{687,718},{709,741},{731,764},{753,787},{775,810},{797,833},{819,856},{841,879}
	}; //火山爆伤害

	private final static int[][] tbl_dru1_s24_1 = new int[][]{
			{8,10,8,10},{10,12,10,12},{12,14,12,14},{14,16,14,16},{16,18,16,18},{18,20,18,20},{20,22,20,22},{22,24,22,24},{26,28,26,28},{30,32,30,32},
			{34,36,34,36},{38,40,38,40},{42,44,42,44},{46,48,46,48},{50,52,50,52},{54,56,54,56},{60,62,60,62},{66,68,66,68},{72,74,72,74},{78,80,78,80},
			{84,86,84,86},{90,92,90,92},{98,100,98,100},{106,108,106,108},{114,116,114,116},{122,124,122,124},{130,132,130,132},{138,140,138,140},{148,150,149,153},{158,160,160,166},
			{168,170,171,179},{178,180,182,192},{188,190,193,205},{198,200,204,218},{208,210,215,231},{218,220,226,244},{228,230,237,257},{238,240,248,270},{248,250,259,283},{258,260,270,296},
			{268,270,281,309},{278,280,292,322},{288,290,303,335},{298,300,314,348},{308,310,325,361},{318,320,336,374},{328,330,347,387},{338,340,358,400},{348,350,369,413},{358,360,380,426}
	}; //火山伤害,火伤

	private final static int[][] tbl_dru1_s30_1 = new int[][]{
			{11,15,25,75},{18,21,40,91},{25,30,55,107},{32,36,70,123},{39,42,85,139},{46,51,100,155},{53,57,115,171},{60,63,130,187},{69,72,150,209},{77,81,170,231},
			{85,90,190,253},{93,96,210,275},{101,105,230,297},{110,114,250,319},{118,123,270,341},{126,129,290,363},{135,138,315,390},{145,150,340,417},{154,159,365,444},{164,168,390,471},
			{173,177,415,498},{182,186,440,525},{193,198,471,559},{203,207,502,593},{214,219,533,627},{225,228,564,661},{235,240,595,695},{246,249,626,729},{257,261,664,769},{269,273,702,809},
			{281,285,740,849},{292,297,778,889},{304,309,816,929},{316,321,854,969},{328,330,892,1009},{339,342,930,1049},{351,354,968,1089},{363,366,1006,1129},{375,378,1044,1169},{386,390,1082,1209},
			{398,402,1120,1249},{410,414,1158,1289},{421,426,1196,1329},{433,438,1234,1369},{445,450,1272,1409},{457,459,1310,1449},{468,471,1348,1489},{480,483,1386,1529},{492,495,1424,1569},{503,507,1462,1609}
	}; //毁天灭地平均火伤,火伤

	private final static float[][] tbl_dru1_s6_3 = new float[][]{
			{8,15,4,5.3f,4},{14,21,4.6f,6,4},{20,28,5.2f,6,5},{26,34,5.8f,6.6f,5},{33,40,6.4f,6.6f,5},{39,46,7,7.3f,5},{45,53,7.6f,7.3f,5},{51,59,8.2f,8,6},{58,66,8.8f,8,6},{66,74,9.4f,8.6f,6},
			{73,81,10,8.6f,6},{80,89,10.6f,9.3f,6},{87,96,11.2f,9.3f,7},{94,103,11.8f,10,7},{101,111,12.4f,10,7},{108,118,13,10.6f,7},{116,126,13.6f,10.6f,7},{123,135,14.2f,11.3f,8},{131,143,14.8f,11.3f,8},{139,151,15.4f,12,8},
			{147,159,16,12,8},{155,167,16.6f,12.6f,8},{164,177,17.2f,12.6f,8},{173,187,17.8f,13.3f,9},{183,197,18.4f,13.3f,9},{192,207,19,14,9},{201,216,19.6f,14,9},{211,226,20.2f,14.6f,9},{222,238,20.8f,14.6f,10},{233,250,21.4f,15.3f,10},
			{245,262,22,15.3f,10},{256,275,22.6f,16,10},{267,287,23.2f,16,10},{279,299,23.8f,16.6f,11},{290,311,24.4f,16.6f,11},{301,323,25,17.3f,11},{313,335,25.6f,17.3f,11},{324,347,26.2f,18,11},{335,359,26.8f,18,12},{347,371,27.4f,18.6f,12},
			{358,383,28,18.6f,12},{369,396,28.6f,19.3f,12},{381,408,29.2f,19.3f,12},{392,420,29.8f,20,13},{403,432,30.4f,20,13},{415,444,31,20.6f,13},{426,456,31.6f,20.6f,13},{437,468,32.2f,21.3f,13},{449,480,32.8f,21.3f,14},{460,492,33.4f,22,14}
	}; //极地风暴平均冰冷,冰冻时间,射程,魔法消耗

	private final static int[][] tbl_dru1_s18_2 = new int[][]{
			{6,8},{8,10},{10,12},{12,14},{14,16},{16,18},{18,20},{20,22},{23,25},
			{27,29},{30,32},{34,36},{37,39},{41,43},{44,46},{48,50},{53,55},{58,61},{63,66},{68,72},
			{73,77},{78,83},{84,90},{91,97},{97,104},{104,111},{110,118},{117,125},{125,133},{133,142},
			{141,150},{149,159},{157,167},{165,176},{173,184},{181,193},{189,201},{197,210},{205,218},{213,227},
			{221,235},{229,244},{237,252},{245,261},{253,269},{261,278},{269,286},{277,295},{285,303},{293,312}
	};//小旋风伤害

	private final static int[][] tbl_dru1_s24_2 = new int[][]{
			{25,35},{33,43},{41,51},{49,59},{57,67},{65,75},{73,83},{81,91},{95,106},{109,121},
			{123,136},{137,151},{151,166},{165,181},{179,196},{193,211},{213,232},{233,253},{253,274},{273,295},
			{293,316},{313,337},{337,362},{361,387},{385,412},{409,437},{433,462},{457,487},{485,516},{513,545},
			{541,574},{569,603},{597,632},{625,661},{653,690},{681,719},{709,748},{737,777},{765,806},{793,835},
			{821,864},{849,893},{877,922},{905,951},{933,980},{961,1009},{989,1038},{1017,1067},{1045,1096},{1073,1125}

	};//龙卷风伤害

	private final static int[][] tbl_dru1_s30_2 = new int[][]{
			{25,50},{32,57},{39,64},{46,71},{53,78},{60,85},{67,92},{74,99},{84,109},{94,119},
			{104,129},{114,139},{124,149},{134,159},{144,169},{154,179},{166,191},{178,203},{190,215},{202,227},
			{214,239},{226,251},{240,265},{254,279},{268,293},{282,307},{296,321},{310,335},{326,351},{342,367},
			{358,383},{374,399},{390,415},{406,431},{422,447},{438,463},{454,479},{470,495},{486,511},{502,527},
			{518,543},{534,559},{550,575},{566,591},{582,607},{598,623},{614,639},{630,655},{646,671},{662,687}
	};//暴风伤害

	private final static int[] tbl_dru2_s1_1 = new int[]{
			20,28,35,40,45,48,51,53,56,57,
			59,61,62,63,64,66,66,67,68,68,
			69,70,70,71,71,72,73,73,73,73,
			74,74,75,75,75,75,75,76,76,76,
			76,77,77,77,77,77,77,77,78,78

	};//狼人变化攻击速度加成

	private final static int[][] tbl_dru2_s12_1 = new int[][]{
			{34,12},{36,16},{38,20},{40,24},{41,28},{43,32},{44,36},{45,40},{46,44},{47,48},
			{48,52},{49,56},{50,60},{51,64},{52,68},{52,72},{53,76},{54,80},{54,84},{55,88},
			{55,92},{56,96},{56,100},{57,104},{57,108},{58,112},{58,116},{58,120},{59,124},{59,128},
			{59,132},{60,136},{60,140},{60,144},{61,148},{61,152},{61,156},{61,160},{62,164},{62,168},
			{62,172},{62,176},{63,180},{63,184},{63,188},{63,192},{63,196},{64,200},{64,204},{64,208}
	};//野性狂暴移动速度,生命偷取

	private final static float[] tbl_dru2_s12_3 = new float[]{
			0.9f,1.3f,1.6f,1.9f,2.2f,2.3f,2.5f,2.6f,2.7f,2.8f,
			2.9f,3f,3f,3.1f,3.2f,3.2f,3.2f,3.3f,3.3f,3.4f,
			3.4f,3.4f,3.5f,3.5f,3.5f,3.6f,3.6f,3.6f,3.6f,3.6f,
			3.6f,3.6f,3.7f,3.7f,3.7f,3.7f,3.7f,3.8f,3.8f,3.8f,
			3.8f,3.8f,3.8f,3.8f,3.8f,3.8f,3.8f,3.8f,3.9f,3.9f
	}; //撞槌晕眩时间

	private final static int[][] tbl_dru2_s18_1 = new int[][]{
			{18,43},{34,61},{52,82},{73,105},{96,131},{121,159},{150,190},{180,223},{219,264},{261,308},
			{306,356},{354,406},{405,460},{460,517},{517,577},{578,640},{658,723},{742,810},{831,901},{924,996},
			{1021,1096},{1123,1201},{1270,1350},{1423,1505},{1583,1668},{1750,1837},{1923,2013},{2104,2196},{2351,2446},{2608,2705},
			{2875,2975},{3151,3254},{3438,3543},{3735,3843},{4042,4152},{4359,4471},{4686,4801},{5023,5140},{5370,5490},{5726,5849},
			{6093,6218},{6470,6598},{6857,6987},{7254,7386},{7661,7796},{8078,8215},{8505,8645},{8941,9084},{9388,9533},{9845,9993}
	}; //狂犬病毒素伤害

	private final static int[][] tbl_dru2_s18_2 = new int[][]{
			{15,20},{23,28},{31,36},{39,44},{47,52},{55,60},{63,68},{71,76},{83,88},{95,100},
			{107,112},{119,124},{131,136},{143,148},{155,160},{167,172},{187,194},{207,216},{227,238},{247,260},
			{267,282},{287,304},{311,330},{335,356},{359,382},{383,408},{407,434},{431,460},{461,494},{491,528},
			{521,562},{551,596},{581,630},{611,664},{641,698},{671,732},{701,766},{731,800},{761,834},{791,868},
			{821,902},{851,936},{881,970},{911,1004},{941,1038},{971,1072},{1001,1106},{1031,1140},{1061,1174},{1091,1208}
	}; //焰爪火伤

	private final static int[] tbl_dru2_s24_2 = new int[]{
			72,90,104,116,125,132,138,143,149,152,
			156,159,162,165,167,170,171,173,174,176,
			177,179,180,182,182,183,185,185,186,186,
			188,188,189,189,189,191,191,192,192,192,
			192,194,194,194,195,195,195,195,197,197
	}; //饥饿偷取

	private final static float[][] tbl_dru2_s24_3 = new float[][]{
			{1.6f,10,20},{2.2f,13,23},{2.8f,16,26},{3.4f,19,29},{4f,22,32},{4.6f,25,35},{5.2f,28,38},{5.8f,31,41},{6.4f,36,46},{7f,41,51},
			{7.6f,46,56},{8.2f,51,61},{8.8f,56,66},{9.4f,61,71},{10f,66,76},{10.6f,71,81},{11.2f,78,88},{11.8f,85,95},{12.4f,92,102},{13f,99,109},
			{13.6f,106,116},{14.2f,113,123},{14.8f,120,130},{15.4f,127,137},{16f,134,144},{16.6f,141,151},{17.2f,148,158},{17.8f,155,165},{18.4f,162,172},{19f,169,179},
			{19.6f,176,186},{20.2f,183,193},{20.8f,190,200},{21.4f,197,207},{22f,204,214},{22.6f,211,221},{23.2f,218,228},{23.8f,225,235},{24.4f,232,242},{25f,239,249},
			{25.6f,246,256},{26.2f,253,263},{26.8f,260,270},{27.4f,267,277},{28f,274,284},{28.6f,281,291},{29.2f,288,298},{29.8f,295,305},{30.4f,302,312},{31f,309,319}
	};//震波晕眩时间,伤害

	private final static int[][] tbl_dru3_s1_3 = new int[][]{
			{42,58,4,6},{52,72,7,8},{63,87,10,11},{73,101,12,14},{84,116,15,17},{94,130,18,19},{105,145,21,22},{115,159,23,25},{126,174,28,30},{136,188,33,34},
			{147,203,37,39},{157,217,42,44},{168,232,47,48},{178,246,51,53},{189,261,56,58},{199,275,61,62},{210,290,67,68},{220,304,73,74},{231,319,78,80},{241,333,84,86},
			{252,348,90,92},{262,362,96,98},{273,377,103,104},{283,391,109,111},{294,406,116,117},{304,420,123,124},{315,435,129,131},{325,449,136,137},{336,464,143,145},{346,478,151,152},
			{357,493,158,160},{367,507,166,167},{378,522,173,175},{388,536,180,182},{399,551,188,189},{409,565,195,197},{420,580,203,204},{430,594,210,212},{441,609,217,219},{451,623,225,226},
			{462,638,232,234},{472,652,240,241},{483,667,247,249},{493,681,255,256},{504,696,262,264},{514,710,269,271},{525,725,277,278},{535,739,284,286},{546,754,292,293},{556,768,299,301}
	}; //毒藤生命,毒伤

	private final static float[][] tbl_dru3_s6_1 = new float[][]{
			{56,64,20f},{72,83,21.3f},{89,102,22.6f},{106,121,24f},{123,140,25.3f},{140,160,26.6f},{156,179,28f},{173,198,29.3f},{190,217,30.6f},{207,236,32f},
			{224,256,33.3f},{240,275,34.6f},{257,294,36f},{274,313,37.3f},{291,332,38.6f},{308,352,40f},{324,371,41.3f},{341,390,42.6f},{358,409,44f},{375,428,45.3f},
			{392,448,46.6f},{408,467,48f},{425,486,49.3f},{442,505,50.6f},{459,524,52f},{476,544,53.3f},{492,563,54.6f},{509,582,56f},{526,601,57.3f},{543,620,58.6f},
			{560,640,60f},{576,659,61.3f},{593,678,62.6f},{610,697,64f},{627,716,65.3f},{644,736,66.6f},{660,755,68f},{677,774,69.3f},{694,793,70.6f},{711,812,72f},
			{728,832,73.3f},{744,851,74.6f},{761,870,76f},{778,889,77.3f},{795,908,78.6f},{812,928,80f},{828,947,81.3f},{845,966,82.6f},{862,985,84f},{879,1004,85.3f}
	}; //橡木智者生命,半径

	private final static int[][] tbl_dru3_s6_2 = new int[][]{
			{2,6},{3,7},{4,8},{5,9},{6,10},{7,11},{8,12},{9,13},{11,15},{13,17},
			{15,19},{17,21},{19,23},{21,25},{23,27},{25,29},{29,33},{33,37},{37,41},{41,45},
			{45,49},{49,53},{54,58},{59,63},{64,68},{69,73},{74,78},{79,83},{87,91},{95,99},
			{103,107},{111,115},{119,123},{127,131},{135,139},{143,147},{151,155},{159,163},{167,171},{175,179},
			{183,187},{191,195},{199,203},{207,211},{215,219},{223,227},{231,235},{239,243},{247,251},{255,259}
	}; //灵狼伤害

	private final static int[] tbl_dru3_s12_3 = new int[]{
			4,5,6,6,7,7,8,8,8,9,
			9,9,9,9,10,10,10,10,10,10,
			10,10,10,10,10,11,11,11,11,11,
			11,11,11,11,11,11,11,11,11,11,
			11,11,11,11,11,11,11,11,11,11
	}; //食腐藤治疗

	private final static int[][] tbl_dru3_s18_2 = new int[][]{
			{147,195,7,12},{171,227,9,14},{196,260,11,16},{220,292,13,18},{245,325,15,20},{269,357,17,22},{294,390,19,24},{318,422,21,26},{343,455,24,29},{367,487,27,32},
			{392,520,30,35},{416,552,33,38},{441,585,36,41},{465,617,39,44},{490,650,42,47},{514,682,45,50},{539,715,51,56},{563,747,57,62},{588,780,63,68},{612,812,69,74},
			{637,845,75,80},{661,877,81,86},{686,910,89,95},{710,942,97,104},{735,975,105,113},{759,1007,113,122},{784,1040,121,131},{808,1072,129,140},{833,1105,140,153},{857,1137,151,166},
			{882,1170,162,179},{906,1202,173,192},{931,1235,184,205},{955,1267,195,218},{980,1300,206,231},{1004,1332,217,244},{1029,1365,228,257},{1053,1397,239,270},{1078,1430,250,283},{1102,1462,261,296},
			{1127,1495,272,309},{1151,1527,283,322},{1176,1560,294,335},{1200,1592,305,348},{1225,1625,316,361},{1249,1657,327,374},{1274,1690,338,387},{1298,1722,349,400},{1323,1755,360,413},{1347,1787,371,426}
	}; //召唤狂狼生命,伤害

	private final static int[] tbl_dru3_s24_3 = new int[]{
			2,2,3,4,4,4,5,5,5,5,
			5,6,6,6,6,6,6,6,6,6,
			6,7,7,7,7,7,7,7,7,7,
			7,7,7,7,7,7,7,7,7,7,
			7,7,7,7,7,7,7,7,7,7
	}; //太阳藤魔法恢复比率

	private final static int[][] tbl_dru3_s30_2 = new int[][]{
			{37,75},{54,94},{72,116},{93,139},{115,165},{140,192},{166,222},{195,253},{235,297},{279,344},
			{326,393},{376,446},{428,502},{484,561},{543,622},{605,687},{684,769},{767,855},{854,945},{945,1039},
			{1040,1137},{1139,1239},{1262,1366},{1391,1498},{1525,1635},{1665,1777},{1809,1925},{1959,2077},{2130,2251},{2307,2431},
			{2490,2618},{2679,2810},{2874,3008},{3075,3212},{3282,3422},{3496,3638},{3715,3860},{3940,4088},{4171,4322},{4408,4562},
			{4651,4809},{4900,5061},{5155,5319},{5416,5583},{5683,5853},{5957,6129},{6236,6411},{6521,6699},{6812,6993},{7109,7293}
	}; //灰熊伤害

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("dru1_s1_1")) //火风暴
		{
			//加成
			int minDamage = upByPercent3(tbl_dru1_s1_1[p-1][0], 23,
					theTree.getSkill("dru1_s6_1").point + theTree.getSkill("dru1_s12_1").point);
			int maxDamage = upByPercent3(tbl_dru1_s1_1[p-1][1], 23,
					theTree.getSkill("dru1_s6_1").point + theTree.getSkill("dru1_s12_1").point);

			this.beginAppendLine(String.format("平均火焰伤害: %1$s-%2$s 每秒",
					String.valueOf(minDamage),
					String.valueOf(maxDamage)));
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();

		}
		else if (skill.id.equals("dru1_s6_1")) //熔浆巨岩
		{
			//魔法
			float mana = upFloat2((float)(10 + 0.5*(p-1)),2);

			//伤害加成
			int phyDamageMinFinal = upByPercent3(tbl_dru1_s6_1[p-1][2], 10, theTree.getSkill("dru1_s24_1").point);
			int phyDamageMaxFinal = upByPercent3(tbl_dru1_s6_1[p-1][3], 10, theTree.getSkill("dru1_s24_1").point);

			int fireDamageMinFinal = upByPercent3(tbl_dru1_s6_1[p-1][2], 8, theTree.getSkill("dru1_s1_1").point);
			int fireDamageMaxFinal = upByPercent3(tbl_dru1_s6_1[p-1][3], 8, theTree.getSkill("dru1_s1_1").point);
			int avrFireDamageMinFinal = upByPercent3(tbl_dru1_s6_1[p-1][0], 8, theTree.getSkill("dru1_s1_1").point);
			int avrFireDamageMaxFinal = upByPercent3(tbl_dru1_s6_1[p-1][1], 8, theTree.getSkill("dru1_s1_1").point);

			this.beginAppendLine(String.format("伤害: %1$s-%2$s", String.valueOf(phyDamageMinFinal), String.valueOf(phyDamageMaxFinal)));
			this.appendLine(String.format("火焰伤害: %1$s-%2$s", String.valueOf(fireDamageMinFinal), String.valueOf(fireDamageMaxFinal)));
			this.appendLine(String.format("平均火焰伤害: %1$s-%2$s 每秒",String.valueOf(avrFireDamageMinFinal), String.valueOf(avrFireDamageMaxFinal)));
			this.endAppendLine("魔法消耗: " + String.valueOf(mana));

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s12_1")) //火山爆
		{
			int fireDamageMinFinal = upByPercent3(tbl_dru1_s12_1[p-1][0], 12, theTree.getSkill("dru1_s1_1").point + theTree.getSkill("dru1_s24_1").point);
			int fireDamageMaxFinal = upByPercent3(tbl_dru1_s12_1[p-1][1], 12, theTree.getSkill("dru1_s1_1").point + theTree.getSkill("dru1_s24_1").point);

			this.beginAppendLine(String.format("火焰伤害: %1$s-%2$s", String.valueOf(fireDamageMinFinal), String.valueOf(fireDamageMaxFinal)));
			this.appendLine("持续时间: 3.2 秒");
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s24_1")) //火山
		{
			int phyDamageMinFinal = upByPercent3(tbl_dru1_s24_1[p-1][0], 12, theTree.getSkill("dru1_s6_1").point);
			int phyDamageMaxFinal = upByPercent3(tbl_dru1_s24_1[p-1][1], 12, theTree.getSkill("dru1_s6_1").point);

			int fireDamageMinFinal = upByPercent3(tbl_dru1_s24_1[p-1][2], 12, theTree.getSkill("dru1_s12_1").point + theTree.getSkill("dru1_s30_1").point);
			int fireDamageMaxFinal = upByPercent3(tbl_dru1_s24_1[p-1][3], 12, theTree.getSkill("dru1_s12_1").point + theTree.getSkill("dru1_s30_1").point);

			this.beginAppendLine(String.format("伤害: %1$s-%2$s",String.valueOf(phyDamageMinFinal),String.valueOf(phyDamageMaxFinal)));
			this.appendLine(String.format("火焰伤害: %1$s-%2$s", String.valueOf(fireDamageMinFinal),String.valueOf(fireDamageMaxFinal)));
			this.endAppendLine("魔法消耗: 25");

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s30_1")) //毁天灭地
		{
			int duration = 10 + 2* theTree.getSkill("dru1_s12_1").point;
			//火焰伤害加成点数
			//int upLev = theTree.getSkill("dru1_s1_1").point + theTree.getSkill("dru1_s6_1").point + theTree.getSkill("dru1_s24_1").point;
			int upLev = getUpLev(theTree, new String[]{"dru1_s1_1","dru1_s6_1","dru1_s24_1"});

			int avrFireDamageMinFinal = upByPercent3(tbl_dru1_s30_1[p-1][0], 7, upLev);
			int avrFireDamageMaxFinal = upByPercent3(tbl_dru1_s30_1[p-1][1], 7, upLev);
			int fireDamageMinFinal = upByPercent3(tbl_dru1_s30_1[p-1][2], 14, upLev);
			int fireDamageMaxFinal = upByPercent3(tbl_dru1_s30_1[p-1][3], 14, upLev);

			this.beginAppendLine("持续时间: " + String.valueOf(duration) + " 秒");
			this.appendLine("半径: 5.3 码");
			this.appendLine(String.format("平均火焰伤害: %1$s-%2$s 每秒",String.valueOf(avrFireDamageMinFinal), String.valueOf(avrFireDamageMaxFinal)));
			this.appendLine(String.format("火焰伤害: %1$s-%2$s",String.valueOf(fireDamageMinFinal), String.valueOf(fireDamageMaxFinal)));
			this.endAppendLine("魔法消耗: 35");

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s6_3"))  //极地风暴
		{
			int upLev = getUpLev(theTree, new String[]{"dru1_s30_2","dru1_s12_3"});
			int avrColdDamageMinFinal = upByPercent3((int)tbl_dru1_s6_3[p-1][0], 15, upLev);
			int avrColdDamageMaxFinal = upByPercent3((int)tbl_dru1_s6_3[p-1][1], 15, upLev);

			this.beginAppendFormatLine("平均冰冷伤害: %1$s-%2$s 每秒",avrColdDamageMinFinal,avrColdDamageMaxFinal);
			this.appendFormatLine("冰冻时间: %1$s 秒", tbl_dru1_s6_3[p-1][2]);
			this.appendFormatLine("射程: %1$s 码", tbl_dru1_s6_3[p-1][3]);
			this.endAppendFormatLine("魔法消耗: %1$s 每秒", (int)tbl_dru1_s6_3[p-1][4]);

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s12_3")) //风甲
		{
			int damageAbsorb = 40 + (p-1)*12;
			int upLev = getUpLev(theTree, new String[]{"dru1_s18_2","dru1_s24_2","dru1_s30_2"});
			damageAbsorb = upByPercent3(damageAbsorb, 7, upLev);
			int mana = 5 + (p-1)*1;

			this.beginAppendFormatLine("吸收 %1$s 伤害", damageAbsorb);
			this.endAppendFormatLine("魔法消耗: %1$s ", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s18_2")) //小旋风
		{
			int upLev = getUpLev(theTree, new String[]{"dru1_s24_2","dru1_s30_2"});
			int damageMinFinal = upByPercent3((int)tbl_dru1_s18_2[p-1][0], 10, upLev);
			int damageMaxFinal = upByPercent3((int)tbl_dru1_s18_2[p-1][1], 10, upLev);

			this.beginAppendLine("晕眩时间: 0.4 秒");
			this.appendFormatLine("伤害: %1$1s-%2$s",damageMinFinal,damageMaxFinal);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s24_2")) //龙卷风
		{
			int upLev = getUpLev(theTree, new String[]{"dru1_s12_3","dru1_s18_2","dru1_s30_2"});
			int damageMinFinal = upByPercent3((int)tbl_dru1_s24_2[p-1][0], 9, upLev);
			int damageMaxFinal = upByPercent3((int)tbl_dru1_s24_2[p-1][1], 9, upLev);

			this.beginAppendFormatLine("伤害: %1$1s-%2$s",damageMinFinal,damageMaxFinal);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if (skill.id.equals("dru1_s30_2")) //暴风
		{
			int duration = 10 + 2 * theTree.getSkill("dru1_s12_3").point;
			int upLev = getUpLev(theTree, new String[]{"dru1_s18_2","dru1_s24_2"});
			int damageMinFinal = upByPercent3((int)tbl_dru1_s30_2[p-1][0], 9, upLev);
			int damageMaxFinal = upByPercent3((int)tbl_dru1_s30_2[p-1][1], 9, upLev);

			this.beginAppendFormatLine("持续时间: %1$s 秒", duration);
			this.appendLine("半径: 6 码");
			this.appendFormatLine("冰冷伤害: %1$s-%2$s",damageMinFinal,damageMaxFinal);
			this.endAppendLine("魔法消耗: 30");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s1_1")) //狼人变化
		{
			int upLev = theTree.getPoint("dru2_s1_2");

			int life = upByValue(25, 20, 5, upLev);
			int duration = upByValue(40, 40, 20, upLev);
			int accuracy = 50 + 15*(p-1);
			int speed = tbl_dru2_s1_1[p-1];

			this.beginAppendFormatLine("生命: +%1$s%%", life);
			this.appendLine("耐力加成: +25%");
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("攻击速度: +%1$s%%", speed);
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s1_2")) //变形术
		{
			int life = 20 + 5*(p-1);
			int duration = 40 + 20*(p-1);
			this.beginAppendFormatLine("最大生命: +%1$s%%", life);
			this.endAppendFormatLine("持续时间: +%1$s 秒", duration);

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s6_3")) //熊人变化
		{
			int upLev = theTree.getPoint("dru2_s1_2");
			int life = upByValue(50, 20, 5, upLev);
			int duration = upByValue(40, 40, 20, upLev);

			int damage = 50 + 7*(p-1);
			int defence = 25 + 5*(p-1);

			this.beginAppendFormatLine("生命: +%1$s%%", life);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("防御: +%1$s%%", defence);
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s12_1")) //野性狂暴
		{
			int damage = 50 + 5*(p-1);
			int accuracy = 20 +  10*(p-1);

			this.beginAppendLine("持续时间: 20 秒");
			this.appendFormatLine("移动速度: +19-%1$s%%", tbl_dru2_s12_1[p-1][0]);
			this.appendFormatLine("生命偷取: +4-%1$s%%", tbl_dru2_s12_1[p-1][1]);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s12_3")) //撞锤
		{
			int damage = 70 + 10*(p-1);
			int accuracy = 20 + 10*(p-1);

			this.beginAppendLine("持续时间: 20 秒");
			this.appendFormatLine("晕眩时间: %1$s 秒", tbl_dru2_s12_3[p-1]);
			this.appendFormatLine("伤害: +20-%1$s%%",damage);
			this.appendFormatLine("命中率: +%1$s%%",accuracy);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s18_1")) //狂犬病
		{
			int accuracy = 50 + 7*(p-1);
			float duration = upFloat2((float)(4 + 0.4*(p-1)),2);

			int upLev = getUpLev(theTree, new String[]{"dru3_s1_3"});
			int damageMinFinal = upByPercent3(tbl_dru2_s18_1[p-1][0], 18, upLev);
			int damageMaxFinal = upByPercent3(tbl_dru2_s18_1[p-1][1], 18, upLev);

			this.beginAppendFormatLine("命中率: +%1$s%%",accuracy);
			this.appendFormatLine("毒素伤害: %1$s-%2$s",damageMinFinal, damageMaxFinal);
			this.appendFormatLine("结束于 %1$s 秒",duration);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s18_2")) //焰爪
		{
			int accuracy = 50 + 15*(p-1);
			int upLev = getUpLev(theTree, new String[]{"dru1_s1_1","dru1_s6_1","dru1_s12_1","dru1_s24_1"});

			int fireDamageMinFinal = upByPercent3(tbl_dru2_s18_2[p-1][0], 22, upLev);
			int fireDamageMaxFinal = upByPercent3(tbl_dru2_s18_2[p-1][1], 22, upLev);

			this.beginAppendFormatLine("火焰伤害: %1$s-%2$s",fireDamageMinFinal, fireDamageMaxFinal);
			this.appendFormatLine("命中率: +%1$s%%",accuracy);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s24_2")) //饥饿
		{
			int accuracy = 50 + 10*(p-1);

			this.beginAppendLine("伤害: -75%");
			this.appendFormatLine("生命偷取: %1$s%%", tbl_dru2_s24_2[p-1]);
			this.appendFormatLine("魔法偷取: %1$s%%", tbl_dru2_s24_2[p-1]);
			this.appendFormatLine("命中率: +%1$s%%",accuracy);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s24_3")) //震波
		{
			this.beginAppendFormatLine("晕眩时间: %1$s 秒",tbl_dru2_s24_3[p-1][0]);
			this.appendFormatLine("伤害: %1$s-%2$s", (int)tbl_dru2_s24_3[p-1][1], (int)tbl_dru2_s24_3[p-1][2]);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("dru2_s30_1"))
		{
			int attackNum;
			if (p >= 4)
			{
				attackNum = 5;
			}
			else
			{
				attackNum = p + 1;
			}

			int attack = 50 + 7*(p-1);
			int damage = 100 + 17*(p-1);

			this.beginAppendFormatLine("攻击次数 %1$s", attackNum);
			this.appendFormatLine("攻击力: +%1$s%%", attack);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s1_2")) //乌鸦
		{
			int damageMin = 2 + (p-1);
			int damageMax = 4 + (p-1);
			int attackNum = 12 + (p-1);

			this.beginAppendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("攻击次数: %1$s", attackNum);
			this.appendFormatLine("数量: %1$s", (p>5 ? 5:p));
			this.endAppendLine("每乌鸦魔法消耗: 6");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s1_3")) //毒藤
		{
			int lifeMin = upByValue2(42,10,11,p);
			int lifeMax = upByValue2(58,14,15,p);

			//this.beginAppendFormatLine("生命: %1$s-%2$s", tbl_dru3_s1_3[p-1][0], tbl_dru3_s1_3[p-1][1]);
			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("毒素伤害: %1$s-%2$s", tbl_dru3_s1_3[p-1][2], tbl_dru3_s1_3[p-1][3]);
			this.appendLine("结束于 4 秒 ");
			this.endAppendLine("魔法消耗: 8");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s6_1")) //橡木智者
		{
			int lifePlus = 30 + 5*(p-1);
			int mana = 15 + (p-1);

			int lifeMin = upByValue3(56,16,17,4,p);
			int lifeMax = upByValue4(64,19,20,4,p);

			//this.beginAppendFormatLine("生命: %1$s-%2$s", (int)tbl_dru3_s6_1[p-1][0], (int)tbl_dru3_s6_1[p-1][1]);
			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("生命: +%1$s%%", lifePlus);
			this.appendFormatLine("半径: %1$s 码", tbl_dru3_s6_1[p-1][2]);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s6_2")) //召唤灵狼
		{
			int num;
			if (p >= 5)
			{
				num = 5;
			}
			else
			{
				num = p;
			}

			int lifeLevUp = theTree.getSkill("dru3_s18_2").point; //狂狼
			int damageLevUp = theTree.getSkill("dru3_s30_2").point; //熊

			int lifeMin = upByPercent2(60, getUpValue(50,25,lifeLevUp));
			int lifeMax = upByPercent2(82, getUpValue(50,25,lifeLevUp));

			int damageMin = upByPercent2(tbl_dru3_s6_2[p-1][0], getUpValue(25,10,damageLevUp));
			int damageMax = upByPercent2(tbl_dru3_s6_2[p-1][1], getUpValue(25,10,damageLevUp));

			int accuracy = 50 + 25 * (p-1);
			int defence = 50 + 10 * (p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("防御: +%1$s%%", defence);
			this.appendFormatLine("数量: %1$s", num);
			this.endAppendLine("魔法消耗: 15");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s12_3")) //食尸藤
		{
			int lifeMin = 80 + 20*(p-1);
			int lifeMax = upByValue2(110,27,28,p);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("治疗: %1$s%%", tbl_dru3_s12_3[p-1]);
			this.endAppendLine("魔法消耗: 10");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s18_1")) //狼獾之心
		{
			int lifeMin = 128 + 32*(p-1);
			int lifeMax = 144 + 36*(p-1);
			int damage = 20 + 7*(p-1);
			int accuracy = 25 + 7*(p-1);
			float radius = 20;
			for (int i = 2; i <= p; i++)
			{
				radius = upFloat((float)(radius + 1.3f), 0.8f);
			}
			int mana = 20 + (p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine(" 魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s18_2")) //召唤狂狼
		{
			int damageLevUp = theTree.getSkill("dru3_s30_2").point; //熊
			int accuracyLevUp = theTree.getSkill("dru3_s6_2").point; //灵狼
			int defenceLevUp = accuracyLevUp;

			int damageMin = upByPercent2(tbl_dru3_s18_2[p-1][2], getUpValue(25,10,damageLevUp));
			int damageMax = upByPercent2(tbl_dru3_s18_2[p-1][3], getUpValue(25,10,damageLevUp));

			int num = 0;
			int accuracy = 0;
			if (accuracyLevUp > 0)
			{
				accuracy = 50 + 25 * (accuracyLevUp-1);
			}
			int defence = 0;
			if (defenceLevUp > 0)
			{
				defence = 50 + 10 * (defenceLevUp-1);
			}

			if ((p >= 1) && (p<=3))
			{
				num = p;
			}
			else
			{
				num = 3;
			}

			int lifeUp = 50 + 25*(p-1);

			int lifeMin = upByValue2(147,24,25,p);
			int lifeMax = upByValue2(195,32,33,p);

			//this.beginAppendFormatLine("生命: %1$s-%2$s", tbl_dru3_s18_2[p-1][0], tbl_dru3_s18_2[p-1][1]);
			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			if (accuracy > 0)
			{
				this.appendFormatLine("命中率: +%1$s%%", accuracy);
			}
			if (defence > 0)
			{
				this.appendFormatLine("防御: +%1$s%%", defence);
			}
			this.appendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("生命: +%1$s%%", lifeUp);
			this.appendFormatLine("数量: %1$s", num);
			this.endAppendLine("魔法消耗: 20");

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s24_3")) //太阳藤
		{
			int lifeMin = upByValue5(138,27,28,5,p);
			int lifeMax = upByValue6(192,39,38,5,p);
			int mana = 14 + (p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("魔法恢复比率: %1$s%%", tbl_dru3_s24_3[p-1]);
			this.endAppendFormatLine(" 魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s30_1")) //棘灵
		{
			int lifeMin = 200 + 50*(p-1);
			int lifeMax = upByValue2(226,56,57,p);
			float radius = 20;
			for (int i = 2; i <= p; i++)
			{
				radius = upFloat((float)(radius + 1.3f), 0.8f);
			}
			int mana = 25 +(p-1);
			int reflect = 50 + 20*(p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			this.appendFormatLine("%1$s%% 伤害反弹", reflect);
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine(" 魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("dru3_s30_2"))
		{
			int lifeLevUp = theTree.getSkill("dru3_s18_2").point; //狂狼
			int accuracyLevUp = theTree.getSkill("dru3_s6_2").point; //灵狼
			int defenceLevUp = accuracyLevUp;

			int accuracy = 0;
			if (accuracyLevUp > 0)
			{
				accuracy = 50 + 25 * (accuracyLevUp-1);
			}
			int defence = 0;
			if (defenceLevUp > 0)
			{
				defence = 50 + 10 * (defenceLevUp-1);
			}

			int lifeMin = upByPercent2(550, getUpValue(50,25,lifeLevUp));
			int lifeMax = upByPercent2(750, getUpValue(50,25,lifeLevUp));

			int damageUp = 25 + 10*(p-1);

			this.beginAppendFormatLine("生命: %1$s-%2$s", lifeMin, lifeMax);
			if (accuracy > 0)
			{
				this.appendFormatLine("命中率: +%1$s%%", accuracy);
			}
			if (defence > 0)
			{
				this.appendFormatLine("防御: +%1$s%%", defence);
			}
			this.appendFormatLine("伤害: %1$s-%2$s", tbl_dru3_s30_2[p-1][0], tbl_dru3_s30_2[p-1][1]);
			this.appendFormatLine("伤害: +%1$s%%", damageUp);
			this.endAppendLine("魔法消耗: 40");

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
		//风德
		SkillBuildTemplate t1 = new SkillBuildTemplate("dru_template_1", "风德");
		t1.skillTemplates.put("dru1_s6_3", 1); //极地风暴
		t1.skillTemplates.put("dru1_s12_3", 20); //飓风装甲
		t1.skillTemplates.put("dru1_s18_2", 20); //小旋风
		t1.skillTemplates.put("dru1_s24_2", 20); //龙卷风
		t1.skillTemplates.put("dru1_s30_2", 20); //暴风

		t1.skillTemplates.put("dru3_s1_2", 1); //乌鸦
		t1.skillTemplates.put("dru3_s6_1", 5); //橡木智者
		t1.skillTemplates.put("dru3_s6_2", 1); //灵狼
		t1.skillTemplates.put("dru3_s18_2", 1); //狂狼
		t1.skillTemplates.put("dru3_s30_2", 1); //熊

		//暴力狼德
		SkillBuildTemplate t2 = new SkillBuildTemplate("dru_template_2", "暴力\r\n狼德");
		t2.skillTemplates.put("dru2_s1_1", 20); //狼人变化
		t2.skillTemplates.put("dru2_s1_2", 20); //变形术
		t2.skillTemplates.put("dru2_s12_1", 1); //野性狂暴
		t2.skillTemplates.put("dru2_s18_1", 1); //狂犬病
		t2.skillTemplates.put("dru2_s30_1", 20); //狂怒

		t2.skillTemplates.put("dru3_s1_2", 1); //乌鸦
		t2.skillTemplates.put("dru3_s6_1", 1); //橡木智者
		t2.skillTemplates.put("dru3_s18_1", 20); //狼獾之心
		t2.skillTemplates.put("dru3_s6_2", 1); //灵狼
		t2.skillTemplates.put("dru3_s18_2", 4); //狂狼
		t2.skillTemplates.put("dru3_s30_2", 1); //熊

		return new SkillBuildTemplate[]{t1, t2};
	}
}
