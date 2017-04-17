package cains.note.service.skill;

final class PalSkillStrategy extends AbstractSkillStrategy
{
	private static int[] tbl_pal1_s1_3 = {
			52,66,76,85,92,98,102,106,110,113,
			116,118,121,123,124,127,128,129,130,131,
			132,133,135,136,136,137,138,138,139,139,
			140,140,141,141,141,143,143,144,144,144,
			144,145,145,145,146,146,146,146,147,147
	}; //火焰抵抗

	private static int[] tbl_pal1_s12_1 = {
			39,46,51,56,60,63,65,67,69,70,
			72,73,75,76,76,78,78,79,79,80,
			81,81,82,82,82,83,84,84,84,84,
			85,85,85,85,85,86,86,87,87,87,
			87,87,87,87,88,88,88,88,88,88
	}; //净化抵消时间

	private static int[] tbl_pal1_s18_2 = {
			13,18,22,25,28,30,32,33,35,36,
			37,38,39,40,40,41,41,42,42,43,
			43,43,44,44,44,45,45,45,46,46,
			46,46,46,46,46,47,47,47,47,47,
			47,48,48,48,48,48,48,48,49,49
	}; //精力移动速度

	private static int[] tbl_pal1_s30_2 = {
			23,34,42,49,55,59,63,65,69,71,
			73,75,77,79,80,82,82,83,84,85,
			86,87,88,89,89,90,91,91,91,91,
			92,92,93,93,93,94,94,95,95,95,
			95,96,96,96,97,97,97,97,98,98
	}; //救赎机率

	private static int[] tbl_pal1_s30_3 = {
			60,68,75,80,85,88,91,93,96,97,
			99,101,102,103,104,106,106,107,108,108,
			109,110,110,111,111,112,113,113,113,113,
			114,114,115,115,115,115,115,116,116,116,
			116,117,117,117,117,117,117,117,118,118
	}; //救助火电冰抗性

	private static int[] tbl_pal2_s18_2 = {
			30,34,37,40,42,44,45,46,48,48,
			49,50,51,51,52,53,53,53,54,54,
			54,55,55,55,55,56,56,56,56,56,
			57,57,57,57,57,57,57,58,58,58,
			58,58,58,58,58,58,58,58,59,59
	}; //神圣冰冻减速

	private static float[] tbl_pal2_s24_3 = {
			3.3f,4,4.6f,5.3f,6,6.6f,7.3f,8,8.6f,9.3f,
			10,10.6f,11.3f,12,12.6f,13.3f,14,14.6f,15.3f,16,
			16.6f,17.3f,18,18.6f,19.3f,20,20.6f,21.3f,22,22.6f,
			23.3f,24,24.6f,25.3f,26,26.6f,27.3f,28,28.6f,29.3f,
			30,30.6f,31.3f,32,32.6f,33.3f,34,34.6f,35.3f,36
	}; //庇护所

	private static int[] tbl_pal2_s30_1 = {
			14,18,20,23,25,26,27,28,29,30,
			31,31,32,33,33,34,34,34,34,35,
			35,35,36,36,36,36,37,37,37,37,
			37,37,37,37,37,38,38,38,38,38,
			38,38,38,38,39,39,39,39,39,39
	}; //狂热攻击速度

	private static int[] tbl_pal2_s30_3 = {
			49,56,61,66,70,73,75,77,79,80,
			82,83,85,86,86,88,88,89,89,90,
			91,91,92,92,92,93,94,94,94,94,
			95,95,95,95,95,96,96,97,97,97,
			97,97,97,97,98,98,98,98,98,98
	}; //审判减防御

	private static float[] tbl_pal3_s6_2 = {
			2,2,2.1f,2.1f,2.2f,2.3f,2.3f,2.4f,2.5f,2.5f,
			2.6f,2.6f,2.7f,2.8f,2.8f,2.9f,3,3,3.1f,3.1f,
			3.2f,3.3f,3.3f,3.4f,3.5f,3.5f,3.6f,3.6f,3.7f,3.8f,
			3.8f,3.9f,4,4,4.1f,4.1f,4.2f,4.3f,4.3f,4.4f,
			4.5f,4.5f,4.6f,4.6f,4.7f,4.8f,4.8f,4.9f,5,5
	}; //圣光弹

	private static int[] tbl_pal3_s24_1 = {
			7,13,18,22,25,27,29,31,33,34,
			35,36,37,38,39,40,40,41,41,42,
			42,43,43,44,44,44,45,45,45,45,
			46,46,46,46,46,47,47,47,47,47,
			47,48,48,48,48,48,48,48,49,49
	}; //转化概率

	private static int[] tbl_pal3_s24_3 = {
			14,18,20,23,25,26,27,28,29,30,
			31,31,32,33,33,34,34,34,34,35,
			35,35,36,36,36,36,37,37,37,37,
			37,37,37,37,37,38,38,38,38,38,
			38,38,38,38,39,39,39,39,39,39
	}; //神圣护盾格挡成功率

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("pal1_s1_1")) //祈祷
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int heal = upByValue8(2,new int[][]{{2,1},{17,2},{29,3}},p);
			float mana = cal_pal1_s1_1_mana(p);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("治疗: +%1$s", heal);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s1_3")) //火焰抵抗
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("火焰抵抗: +%1$s%%", tbl_pal1_s1_3[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s6_2")) //反抗
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int defence = 70 + 10*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("防御加成: +%1$s%%", defence);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s6_3")) //冰冷抵抗
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("冰冷抵抗: +%1$s%%", tbl_pal1_s1_3[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s12_1")) //净化
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int healLv = theTree.getPoint("pal1_s1_1");
			int heal;
			if (healLv == 0) //0级不能被upByValue8处理,注意
			{
				heal = 0;
			}
			else
			{
				heal = upByValue8(2,new int[][]{{2,1},{17,2},{29,3}},healLv);
			}

			this.beginAppendFormatLine("祈祷: +%1$s 生命恢复每2秒", heal);
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("抵消时间 %1$s%%", tbl_pal1_s12_1[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s12_3")) //闪电抵抗
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("闪电抵抗: +%1$s%%", tbl_pal1_s1_3[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s18_2")) //精力
		{
			float radius = upFloat2(10.6f + 2*(p-1), 2);
			int stamina = 50 + 25*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("移动速度: +%1$s%%", tbl_pal1_s18_2[p-1]);
			this.appendFormatLine("耐力加成: +%1$s%%", stamina);
			this.endAppendFormatLine("耐力恢复速度: +%1$s%%", stamina);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s24_1")) //冥想
		{
			int healLv = theTree.getPoint("pal1_s1_1");
			int heal;
			if (healLv == 0) //0级不能被upByValue8处理,注意
			{
				heal = 0;
			}
			else
			{
				heal = upByValue8(2,new int[][]{{2,1},{17,2},{29,3}},healLv);
			}
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int manaRecovery = 300 + 25*(p-1);

			this.beginAppendFormatLine("祈祷: +%1$s 生命恢复每2秒", heal);
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("魔法恢复比率: +%1$s%%", manaRecovery);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s30_2")) //救赎
		{
			int recovery = 25 + 5*(p-1);

			this.beginAppendLine("半径: 10.6 码");
			this.appendFormatLine("救赎几率: %1$s%%", tbl_pal1_s30_2[p-1]);
			this.endAppendFormatLine("生命/魔法恢复: %1$s 点", recovery);

			return buffer.toString();
		}
		else if (skill.id.equals("pal1_s30_3")) //救助
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("火电冰抗性: +%1$s%%", tbl_pal1_s30_3[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s1_1")) //力量
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);

			int damage = 40 + 10*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("伤害: +%1$s%%", damage);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s6_2")) //圣火
		{
			float radius = cal_life_1(4,0.6f,0.7f,2,p);
			int fireDamageMin = upByValue8(6,new int[][]{{2,3},{9,6},{17,9},{23,15},{29,21}},p);
			int fireDamageMax = fireDamageMin + 12;

			float fireDamage2Min = upByValue8(1,new float[][]{{2,0.5f},{9,1},{17,1.5f},{23,2.5f},{29,3.5f}},p);
			float fireDamage2Max = upFloat2(fireDamage2Min + 2, 2);

			int percentUp = 18*this.getUpLev(theTree, new String[]{"pal1_s1_3"}) + 6*this.getUpLev(theTree, new String[]{"pal1_s30_3"});
			if (percentUp > 0)
			{
				fireDamageMin = upByPercent2(fireDamageMin, percentUp);
				fireDamageMax = upByPercent2(fireDamageMax, percentUp);
				fireDamage2Min = upByPercent2(fireDamage2Min, percentUp);
				fireDamage2Max = upByPercent2(fireDamage2Max, percentUp);
			}

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("火焰伤害: %1$s-%2$s 在攻击上", fireDamageMin, fireDamageMax);
			this.endAppendFormatLine("火焰伤害: %1$s-%2$s", fireDamage2Min, fireDamage2Max);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s6_3")) //荆棘
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int reflection = 250 + 40*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("%1$s%% 伤害反噬", reflection);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s12_1")) //祝福瞄准
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int accuracy = 75 + 15*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.endAppendFormatLine("命中率: +%1$s%%", accuracy);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s18_1")) //专注
		{
			float radius = upByFloat(10.6f,1.3f,new float[]{0.9f},p);
			int damage = 60 + 15*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendLine("打断概率 20%");
			this.endAppendFormatLine("伤害: +%1$s%%", damage);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s18_2")) //神圣冰冻
		{
			float radius = cal_life_1(4,0.6f,0.7f,2,p);
			int iceDamageMin = upByValue8(10,new int[][]{{2,5},{9,10},{17,15},{23,20},{29,25}},p);
			int iceDamageMax = iceDamageMin + 5;

			int iceDamage2Min = upByValue8(2,new int[][]{{2,1},{9,2},{17,3},{23,4},{29,5}},p);
			int iceDamage2Max = iceDamage2Min + 1;

			int percentUp = 15*this.getUpLev(theTree, new String[]{"pal1_s6_3"}) + 7*this.getUpLev(theTree, new String[]{"pal1_s30_3"});
			if (percentUp > 0)
			{
				iceDamageMin = upByPercent2(iceDamageMin, percentUp);
				iceDamageMax = upByPercent2(iceDamageMax, percentUp);
				iceDamage2Min = upByPercent2(iceDamage2Min, percentUp);
				iceDamage2Max = upByPercent2(iceDamage2Max, percentUp);
			}

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s 在攻击上", iceDamageMin, iceDamageMax);
			this.appendFormatLine("冰冷伤害: %1$s-%2$s", iceDamage2Min, iceDamage2Max);
			this.endAppendFormatLine("敌人减慢 %1$s%%", tbl_pal2_s18_2[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s24_2")) //神圣冲击
		{
			float radius = cal_life_1(4,0.6f,0.7f,2,p);

			//int lightDamageMin = 1;
			int lightDamageMax = upByValue8(60,new int[][]{{2,36},{9,48},{17,60},{23,72},{29,90}},p);

			int lightDamage2Min = 1;
			int lightDamage2Max = upByValue8(10,new int[][]{{2,6},{9,8},{17,10},{23,12},{29,15}},p);

			int percentUp = 12*this.getUpLev(theTree, new String[]{"pal1_s12_3"}) + 4*this.getUpLev(theTree, new String[]{"pal1_s30_3"});
			if (percentUp > 0)
			{
				//lightDamageMin = upByPercent2(lightDamageMin, percentUp);
				lightDamageMax = upByPercent2(lightDamageMax, percentUp);
				lightDamage2Min = upByPercent2(lightDamage2Min, percentUp);
				lightDamage2Max = upByPercent2(lightDamage2Max, percentUp);
			}

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("闪电伤害: 1-%1$s 在攻击上", lightDamageMax); //根据模拟器结果,这里最小伤害永远是1
			this.endAppendFormatLine("闪电伤害: %1$s-%2$s", lightDamage2Min, lightDamage2Max);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s24_3")) //庇护所
		{
			int damageMin = upByValue8(8,new int[][]{{2,4},{17,5},{29,6},},p);
			int damageMax = upByValue8(16,new int[][]{{2,4},{9,5},{17,6},{29,7}},p);

			int upLev = this.getUpLev(theTree, new String[]{"pal1_s12_1"});
			if (upLev > 0)
			{
				damageMin = upByPercent3(damageMin, 7, upLev);
				damageMax = upByPercent3(damageMax, 7, upLev);
			}

			int damageToUndead = 150 + 30*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", tbl_pal2_s24_3[p-1]);
			this.appendFormatLine("对不死系伤害: +%1$s %%", damageToUndead);
			this.endAppendFormatLine("魔法伤害: %1$s-%2$s", damageMin, damageMax);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s30_1")) //狂热
		{
			float radius = upFloat2(tbl_pal2_s24_3[p-1] + 4, 2);
			int coleagueDamage = upByValue2(25,8,9,p);
			int selfDamage = 50 + 17*(p-1);
			int accuracy = 40 + 5*(p-1);

			this.beginAppendFormatLine("半径: %1$s 码", radius);
			this.appendFormatLine("队友伤害: +%1$s%%", coleagueDamage);
			this.appendFormatLine("自身伤害: +%1$s%%", selfDamage);
			this.appendFormatLine("攻击速度: +%1$s%%", tbl_pal2_s30_1[p-1]);
			this.endAppendFormatLine("命中率: +%1$s%%", accuracy);

			return buffer.toString();
		}
		else if (skill.id.equals("pal2_s30_3")) //审判
		{
			int resistance = 30 + 5*(p-1);
			if (resistance > 150)
			{
				resistance = 150;
			}

			this.beginAppendLine("半径: 13.3 码");
			this.appendFormatLine("防御: -%1$s%%", tbl_pal2_s30_3[p-1]);
			this.endAppendFormatLine("抗性: -%1$s%%", resistance);

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s1_1")) //牺牲
		{
			int accuracy = 20 + 7*(p-1);
			int damage = 180 + 15*(p-1) + 15*this.getUpLev(theTree, new String[]{"pal1_s30_2"}) + 5*this.getUpLev(theTree, new String[]{"pal2_s30_1"});

			this.beginAppendLine("8% 自身伤害");
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendFormatLine("伤害: +%1$s%%", damage);

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s1_3")) //盾击
		{
			int damage = 15*p;
			float duration = upFloat2(0.6f + 0.2f*(p-1), 2);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("眩晕时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s6_2")) //圣光弹
		{
			int damageMin = upByValue8(8,new int[][]{{2,8},{9,10},{17,13},{23,16},{29,20}},p);
			int damageMax = upByValue8(16,new int[][]{{2,8},{9,11},{17,15},{23,18},{29,23}},p);
			int healMin = 1 + 2*(p-1);
			int healMax = 6 + 4*(p-1);

			int damageUpLev = theTree.getPoint("pal3_s18_2") + theTree.getPoint("pal3_s30_2");
			if (damageUpLev > 0)
			{
				damageMin = upByPercent3(damageMin, 50, damageUpLev);
				damageMax = upByPercent3(damageMax, 50, damageUpLev);
			}
			int healUpLev = this.getUpLev(theTree, new String[]{"pal1_s1_1"});
			if (healUpLev > 0)
			{
				healMin = upByPercent3(healMin, 15, healUpLev);
				healMax = upByPercent3(healMax, 15, healUpLev);
			}

			this.beginAppendFormatLine("魔法伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("治疗: %1$s-%2$s", healMin, healMax);
			this.endAppendFormatLine("魔法消耗: %1$s", tbl_pal3_s6_2[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s12_1")) //白热
		{
			int attack = 10*p;
			int num = 5;
			if (p>=1 && p<= 4)
			{
				num = p+1;
			}
			int damage = 0;
			if (p >= 5)
			{
				damage = 6*(p-4);
			}
			damage += theTree.getPoint("pal3_s1_1")*12;

			this.beginAppendFormatLine("攻击力: +%1$s%%", attack);
			if (damage > 0)
			{
				this.appendFormatLine("伤害: +%1$s%%", damage);
			}
			this.appendFormatLine("%1$s 次攻击", num);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s12_3")) //冲锋
		{
			int damage = 100 + 25*(p-1) + 20*this.getUpLev(theTree, new String[]{"pal1_s18_2","pal2_s1_1"});
			int accuracy = 50 + 15*(p-1);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s18_1")) //复仇
		{
			float duration = upFloat2(1.2f + 0.6f*(p-1), 2);
			int fireDamage = 70 + 6*(p-1);
			int iceDamage = fireDamage;
			int lightDamage = iceDamage;

			int commonUp =  2*this.getUpLev(theTree, new String[]{"pal1_s30_3"});
			fireDamage += 10*this.getUpLev(theTree, new String[]{"pal1_s1_3"}) + commonUp;
			iceDamage += 10*this.getUpLev(theTree, new String[]{"pal1_s6_3"}) + commonUp;
			lightDamage += 10*this.getUpLev(theTree, new String[]{"pal1_s12_3"}) + commonUp;

			int accuracy = 20 + 10*(p-1);
			float mana = cal_mana_1(4,0.2f,p);

			this.beginAppendFormatLine("冰冻时间: %1$s 秒 ", duration);
			this.appendFormatLine("火焰伤害: +%1$s%%", fireDamage);
			this.appendFormatLine("冰冷伤害: +%1$s%%", iceDamage);
			this.appendFormatLine("闪电伤害: +%1$s%%", lightDamage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s18_2")) //祝福之槌
		{
			int damageMin = upByValue8(12,new int[][]{{2,8},{9,10},{17,12},{23,13},{29,14}},p);
			int damageMax = upByValue8(16,new int[][]{{2,8},{9,10},{17,12},{23,13},{29,14}},p);
			int upLev = this.getUpLev(theTree, new String[]{"pal2_s12_1","pal1_s18_2"});
			if (upLev > 0)
			{
				damageMin = upByPercent3(damageMin, 14, upLev);
				damageMax = upByPercent3(damageMax, 14, upLev);
			}
			float mana = cal_mana_1(5,0.2f,p);

			this.beginAppendFormatLine("魔法伤害: %1$s-%2$s", damageMin, damageMax);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s24_1")) //转化
		{
			this.beginAppendFormatLine("转化概率: %1$s%%", tbl_pal3_s24_1[p-1]);
			this.appendLine("持续时间: 16 秒 ");
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s24_3")) //神圣护盾
		{
			int damageMin = upByValue8(3,new int[][]{{2,2},{9,3},{17,4}},p);
			int damageMax = upByValue8(6,new int[][]{{2,2},{9,3},{17,4}},p);

			int duration = 30 + 25*(p-1);
			int defence = 25 + 15*(p-1) + 15*this.getUpLev(theTree, new String[]{"pal1_s6_2"});;

			this.beginAppendFormatLine("重击伤害: +%1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.appendFormatLine("防御加成: +%1$s%%", defence);
			this.appendFormatLine("格挡成功率: +%1$s%%", tbl_pal3_s24_3[p-1]);
			this.endAppendLine("魔法消耗: 35");

			return buffer.toString();
		}
		else if (skill.id.equals("pal3_s30_2")) //天堂之拳
		{
			int holyDamageMin = upByValue8(40,new int[][]{{2,6},{9,10},{17,16},{23,32},{29,48}},p);
			int holyDamageMax = upByValue8(50,new int[][]{{2,6},{9,10},{17,16},{23,32},{29,48}},p);

			int holyUpLev = theTree.getPoint("pal3_s6_2");
			if (holyUpLev > 0)
			{
				holyDamageMin = upByPercent3(holyDamageMin, 15, holyUpLev);
				holyDamageMax = upByPercent3(holyDamageMax, 15, holyUpLev);
			}

			int lightDamageMin = upByValue8(150,new int[][]{{2,15},{9,30},{17,45},{23,55},{29,65}},p);
			int lightDamageMax = upByValue8(200,new int[][]{{2,15},{9,30},{17,45},{23,55},{29,65}},p);

			int lightUpLev = this.getUpLev(theTree, new String[]{"pal2_s24_2"});
			if (lightUpLev > 0)
			{
				lightDamageMin = upByPercent3(lightDamageMin, 7, lightUpLev);
				lightDamageMax = upByPercent3(lightDamageMax, 7, lightUpLev);
			}

			this.beginAppendFormatLine("圣光弹 伤害: %1$s-%2$s", holyDamageMin, holyDamageMax);
			this.appendFormatLine("闪电伤害: %1$s-%2$s", lightDamageMin, lightDamageMax);
			this.endAppendLine("魔法消耗: 25");

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
		//祝福之锤
		SkillBuildTemplate t1 = new SkillBuildTemplate("pal_template_1", "祝福\r\n之锤");
		t1.skillTemplates.put("pal1_s1_1", 1); //祈祷
		t1.skillTemplates.put("pal1_s12_1", 1); //净化
		t1.skillTemplates.put("pal1_s6_2", 1); //反抗
		t1.skillTemplates.put("pal1_s18_2", 20); //精力
		t1.skillTemplates.put("pal2_s1_1", 1); //力量
		t1.skillTemplates.put("pal2_s12_1", 20); //祝福瞄准
		t1.skillTemplates.put("pal2_s18_1", 20); //专注
		t1.skillTemplates.put("pal3_s6_2", 1); //圣光弹
		t1.skillTemplates.put("pal3_s18_2", 20); //祝福之槌
		t1.skillTemplates.put("pal3_s1_3", 1); //盾击
		t1.skillTemplates.put("pal3_s12_3", 1); //冲锋
		t1.skillTemplates.put("pal3_s24_3", 3); //神圣护盾

		//双热
		SkillBuildTemplate t2 = new SkillBuildTemplate("pal_template_2", "双热");
		t2.skillTemplates.put("pal1_s6_2", 2); //反抗
		t2.skillTemplates.put("pal1_s30_3", 1); //救助
		t2.skillTemplates.put("pal2_s1_1", 1); //力量
		t2.skillTemplates.put("pal2_s12_1", 1); //祝福瞄准
		t2.skillTemplates.put("pal2_s18_1", 1); //专注
		t2.skillTemplates.put("pal2_s30_1", 20); //狂热
		t2.skillTemplates.put("pal3_s1_1", 20); //牺牲
		t2.skillTemplates.put("pal3_s12_1", 20); //白热
		t2.skillTemplates.put("pal3_s1_3", 1); //盾击
		t2.skillTemplates.put("pal3_s6_2", 1); //圣光弹
		t2.skillTemplates.put("pal3_s12_3", 1); //冲锋
		t2.skillTemplates.put("pal3_s18_2", 1); //祝福之槌
		t2.skillTemplates.put("pal3_s24_3", 20); //神圣护盾

		return new SkillBuildTemplate[]{t1,t2};
	}

	private float cal_pal1_s1_1_mana(int lv)
	{
		float rtn = 1;
		if (lv == 1)
		{
			return rtn;
		}
		else
		{
			int count = 0;
			for (int i=2; i<=lv; i++)
			{
				if (count++ == 0)
				{
					rtn += 0.1f;
				}
				else
				{
					rtn += 0.2f;
				}
				if (count == 8)
				{
					count = 0;
				}
			}
			return upFloat2(rtn,2);
		}

	}

}
