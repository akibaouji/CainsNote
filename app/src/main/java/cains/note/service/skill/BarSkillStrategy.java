package cains.note.service.skill;

final class BarSkillStrategy extends AbstractSkillStrategy
{
	private static int[] tbl_bar1_s1_3 = new int[]{
			15,27,36,44,50,55,59,62,66,68,
			71,73,75,77,78,80,81,82,83,84,
			85,86,87,88,88,89,90,90,91,91,
			92,92,93,93,93,94,94,95,95,95,
			95,96,96,96,97,97,97,97,98,98
	}; //寻找药剂概率

	private static int[] tbl_bar1_s12_3 = new int[]{
			13,19,24,29,32,35,37,39,41,42,
			44,45,46,47,47,49,49,50,50,51,
			51,52,52,53,53,53,54,54,55,55,
			55,55,56,56,56,56,56,57,57,57,
			57,57,57,57,58,58,58,58,58,58
	}; //寻找物品概率

	private static int[] tbl_bar1_s30_1 = new int[]{
			20,26,32,38,44,50,56,62,69,76,
			83,90,97,104,111,118,126,134,142,150,
			158,166,175,184,193,202,211,220,230,240,
			250,260,270,280,290,300,310,320,330,340,
			350,360,370,380,390,400,410,420,430,440
	}; //战斗狂嗥最小伤害

	private static int[] tbl_bar2_s1_1 = new int[]{
			3,6,9,11,12,13,14,15,16,17,
			17,18,18,19,19,20,20,20,20,21,
			21,21,21,22,22,22,22,22,22,22,
			23,23,23,23,23,23,23,23,23,23,
			23,24,24,24,24,24,24,24,24,24
	}; //武器掌握一击必杀率

	private static int[] tbl_bar2_s24_1 = new int[]{
			13,18,22,25,28,30,32,33,35,36,
			37,38,39,40,40,41,41,42,42,43,
			43,43,44,44,44,45,45,45,46,46,
			46,46,46,46,46,47,47,47,47,47,
			47,48,48,48,48,48,48,48,49,49
	}; //加速

	private static int[] tbl_bar2_s30_3 = new int[]{
			12,21,28,35,40,44,47,49,52,54,
			56,58,60,61,62,64,64,65,66,67,
			68,68,69,70,70,71,72,72,72,72,
			73,73,74,74,74,75,75,76,76,76,
			76,76,76,76,77,77,77,77,78,78
	}; //自然抵抗

	private static float[] tbl_bar3_s6_1 = new float[]{
			4.6f,7.3f,8.6f,10,11.3f,12,12.6f,13.3f,14,14,
			14.6f,14.6f,15.3f,16,16,16,16.6f,16.6f,16.6f,16.6f,
			17.3f,17.3f,17.3f,17.3f,17.3f,18,18,18,18,18,
			18,18,18.6f,18.6f,18.6f,18.6f,18.6f,18.6f,18.6f,18.6f,
			18.6f,18.6f,18.6f,18.6f,19.3f,19.3f,19.3f,19.3f,19.3f,19.3f
	}; //跳跃半径

	private static int[][] tbl_bar3_s24_3 = new int[][]{
			{7,47},{13,68},{18,84},{22,99},{25,110},{27,119},{29,126},{31,131},{33,138},{34,142},
			{35,147},{36,151},{37,155},{38,158},{39,160},{40,164},{40,165},{41,167},{41,169},{42,171},
			{42,173},{43,174},{43,176},{44,178},{44,178},{44,180},{45,182},{45,182},{45,183},{45,183},
			{46,185},{46,185},{46,187},{46,187},{46,187},{47,189},{47,189},{47,191},{47,191},{47,191},
			{47,191},{48,192},{48,192},{48,192},{48,194},{48,194},{48,194},{48,194},{49,196},{49,196},
	}; //狂乱攻击速度,移动速度

	private static float[] tbl_bar3_s30_2 = new float[]{
			2.6f,2.4f,2.2f,2.1f,2,1.9f,1.8f,1.7f,1.6f,1.6f,
			1.5f,1.5f,1.4f,1.4f,1.4f,1.4f,1.3f,1.3f,1.3f,1.3f,
			1.2f,1.2f,1.2f,1.2f,1.2f,1.2f,1.2f,1.1f,1.1f,1.1f,
			1.1f,1.1f,1.1f,1.1f,1.1f,1.1f,1.1f,1.1f,1,1,
			1,1,1,1,1,1,1,1,1,1
	}; //狂战士持续时间

	@Override
	protected String execGetSkillDescription(SkillTree theTree, Skill skill)
	{
		int p = skill.point;

		if (skill.id.equals("bar1_s1_1")) //狂嗥
		{
			float radius = upByFloat(16, 3.3f, new float[]{0.9f}, p);
			int duration = 3 + 1*(p-1);

			this.beginAppendFormatLine("敌人跑开 %1$s 码", radius);
			this.appendFormatLine("逃散持续 %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s1_3")) //寻找药剂
		{
			this.beginAppendFormatLine("%1$s%% 概率", tbl_bar1_s1_3[p-1]);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s6_1")) //嘲弄
		{
			int decrease = 5 + 2*(p-1);
			this.beginAppendFormatLine("目标伤害: -%1$s%%", decrease);
			this.appendFormatLine("目标命中率: -%1$s%%", decrease);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s6_2")) //大叫
		{
			int defence = 100 + 10*(p-1);
			int duration = 20 + 10*(p-1)
					+ 5*theTree.getPoint("bar1_s24_2")
					+ 5*theTree.getPoint("bar1_s30_2");

			this.beginAppendFormatLine("防御: +%1$s%%", defence);
			this.appendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 6");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s12_3")) //寻找物品
		{
			this.beginAppendFormatLine(" %1$s%% 概率", tbl_bar1_s12_3[p-1]);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s18_1")) //战嗥
		{
			float duration = upFloat2(12 + 2.4f*(p-1),2);
			int defenceDecrease = 50 + 2*(p-1);
			int damageDecrease = 25 + 1*(p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("防御: -%1$s%%", defenceDecrease);
			this.appendFormatLine("伤害: -%1$s%%", damageDecrease);
			this.endAppendLine("魔法消耗: 5");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s24_2")) //战斗体制
		{
			int duration = 30 + 10*(p-1)
					+ 5*theTree.getPoint("bar1_s6_2")
					+ 5*theTree.getPoint("bar1_s30_2");
			int upV = 35 + 3*(p-1);

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.appendFormatLine("最大耐力: %1$s%%", upV);
			this.appendFormatLine("最大生命: %1$s%%", upV);
			this.appendFormatLine("最大魔法: %1$s%%", upV);
			this.endAppendLine("魔法消耗: 7");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s24_3")) //残酷吓阻
		{
			float radius = cal_life_1(2,0.6f,0.7f,2,p);

			this.beginAppendLine("持续时间: 40 秒 ");
			this.appendFormatLine("半径: %1$s 码", radius);
			this.endAppendLine("魔法消耗: 4");

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s30_1")) //战斗狂嗥
		{
			int upLev = this.getUpLev(theTree, new String[]{"bar1_s1_1","bar1_s6_1","bar1_s18_1"});
			int damageMin = upByPercent3(tbl_bar1_s30_1[p-1],6,upLev);
			int damageMax = upByPercent3(tbl_bar1_s30_1[p-1]+10,6,upLev);

			float duration = upFloat2(1+0.2f*(p-1),2);
			if (duration > 10)
			{
				duration = 10;
			}

			int mana = 10 + 1*(p-1);

			this.beginAppendFormatLine("伤害: %1$s-%2$s", damageMin, damageMax);
			this.appendFormatLine("击晕时间: %1$s 秒", duration);
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("bar1_s30_2")) //战斗指挥
		{
			int duration = 5 + 10*(p-1)
					+ 5*theTree.getPoint("bar1_s6_2")
					+ 5*theTree.getPoint("bar1_s24_2");

			this.beginAppendFormatLine("持续时间: %1$s 秒 ", duration);
			this.endAppendLine("魔法消耗: 11");

			return buffer.toString();
		}
		else if (skill.id.equals("bar2_s1_1")
				||skill.id.equals("bar2_s1_2")
				||skill.id.equals("bar2_s1_3")
				||skill.id.equals("bar2_s6_1")
				||skill.id.equals("bar2_s6_2")
				||skill.id.equals("bar2_s6_3")) //武器掌握
		{
			int damage = 28 + 5*(p-1);
			int accuracy = 0;

			if (skill.id.equals("bar2_s1_1")
					||skill.id.equals("bar2_s1_2")
					||skill.id.equals("bar2_s1_3"))
			{
				accuracy = 28 + 8*(p-1);
			}
			else
			{
				accuracy = 30 + 8*(p-1);
			}

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendFormatLine("%1$s%% 概率一击必杀", tbl_bar2_s1_1[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("bar2_s12_1")) //增加耐力
		{
			int stamina = 30 + 15*(p-1);

			this.beginAppendFormatLine("耐力加成: +%1$s%%", stamina);

			return buffer.toString();
		}
		else if (skill.id.equals("bar2_s18_3")) //铁布衫
		{
			int defence = 30 + 10*(p-1);

			this.beginAppendFormatLine("防御加成: +%1$s%%", defence);

			return buffer.toString();
		}
		else if (skill.id.equals("bar2_s24_1")) //加速
		{
			this.beginAppendFormatLine("移动速度: +%1$s%%", tbl_bar2_s24_1[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("bar2_s30_3")) //自然抵抗
		{
			this.beginAppendFormatLine("元素抗性: +%1$s%%", tbl_bar2_s30_3[p-1]);

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s1_2")) //重击
		{
			int accuracy = 20 + 5*(p-1) + 5*theTree.getPoint("bar3_s18_2");
			int damage = 50 + 5*(p-1) + 5*theTree.getPoint("bar3_s12_2");

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("伤害: +%1$s", p);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s6_1")) //跳跃
		{
			this.beginAppendFormatLine("半径: %1$s 码", tbl_bar3_s6_1[p-1]);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s6_3")) //双手挥击
		{
			int damage = 10 * theTree.getPoint("bar3_s1_2");
			int accuracy = 15 + 5*(p-1);

			int mana;
			if (p == 1)
			{
				mana = 2;
			}
			else if (p>=2 && p<=5)
			{
				mana = 1;
			}
			else
			{
				mana = 0;
			}

			if (damage >0)
			{
				this.beginAppendFormatLine("伤害: +%1$s%%", damage);
				this.appendFormatLine("命中率: +%1$s%%", accuracy);
			}
			else
			{
				this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			}
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s12_2")) //击晕
		{
			int damage = 8 * theTree.getPoint("bar3_s1_2");
			int accuracy = 15 + 5*(p-1) + 5*theTree.getPoint("bar3_s18_2");

			float duration = upFloat2(1.2f + 0.2f*(p-1),2);
			int upLev = this.getUpLev(theTree, new String[]{"bar1_s30_1"});
			if (upLev > 0)
			{
				duration = upByPercent3(duration, 5, upLev);
			}
			if (duration > 10)
			{
				duration = 10;
			}

			if (damage >0)
			{
				this.beginAppendFormatLine("伤害: +%1$s%%", damage);
				this.appendFormatLine("命中率: %1$s%%", accuracy);
			}
			else
			{
				this.beginAppendFormatLine("命中率: %1$s%%", accuracy);
			}
			this.appendFormatLine("持续时间: %1$s 秒", duration);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s12_3")) //双手投掷
		{
			int damage = 8 * theTree.getPoint("bar3_s6_3");
			int accuracy = 20 + 10*(p-1);

			if (damage >0)
			{
				this.beginAppendFormatLine("伤害: +%1$s%%", damage);
				this.appendFormatLine("命中率: +%1$s%%", accuracy);
			}
			else
			{
				this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			}
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s18_1")) //跳跃攻击
		{
			int damage = 100 + 30*(p-1) + 10*theTree.getPoint("bar3_s6_1");
			int accuracy = 50 + 15*(p-1);

			this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.endAppendLine("魔法消耗: 9");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s18_2")) //专心
		{
			int magicDamage = theTree.getPoint("bar3_s30_2");
			int defence = 100 + 10*(p-1);
			int accuracy = 60 + 10*(p-1);
			int damage = 70 + 5*(p-1)
					+ 5*theTree.getPoint("bar3_s1_2")
					+ 10*this.getUpLev(theTree, new String[]{"bar1_s24_2"});

			if (magicDamage > 0)
			{
				this.beginAppendFormatLine("魔法伤害: +%1$s%%", magicDamage);
				this.appendFormatLine("防御加成: +%1$s%%", defence);
			}
			else
			{
				this.beginAppendFormatLine("防御加成: +%1$s%%", defence);
			}

			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.endAppendLine("魔法消耗: 2");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s24_3"))
		{
			int magicDamage = theTree.getPoint("bar3_s30_2");
			int damage = 90 + 5*(p-1)
					+ 8*theTree.getPoint("bar3_s6_3")
					+ 8*this.getUpLev(theTree, new String[]{"bar1_s6_1"});
			int accuracy = 100 + 7*(p-1);

			if (magicDamage > 0)
			{
				this.beginAppendFormatLine("魔法伤害: +%1$s%%", magicDamage);
				this.appendLine("持续时间: 6 秒");
			}
			else
			{
				this.beginAppendLine("持续时间: 6 秒");
			}
			this.appendFormatLine("伤害: +%1$s%%", damage);
			this.appendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("攻击速度: +7-%1$s%%", tbl_bar3_s24_3[p-1][0]);
			this.appendFormatLine("移动速度: +47-%1$s%%", tbl_bar3_s24_3[p-1][1]);
			this.endAppendLine("魔法消耗: 3");

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s30_1"))
		{
			int damage = -50 + 8*(p-1);
			int accuracy = 5*(p-1);
			int mana = upByValue2(25,0,1,p);

			if (damage < 0)
			{
				this.beginAppendFormatLine("伤害: %1$s%%", damage);
			}
			else
			{
				this.beginAppendFormatLine("伤害: +%1$s%%", damage);
			}
			if (accuracy > 0)
			{
				this.appendFormatLine("命中率: +%1$s%%", accuracy);
			}
			this.endAppendFormatLine("魔法消耗: %1$s", mana);

			return buffer.toString();
		}
		else if (skill.id.equals("bar3_s30_2"))
		{
			int accuracy = 100 + 15*(p-1);
			int magicDamage = 150 + 15*(p-1)
					+ 10*this.getUpLev(theTree, new String[]{"bar1_s1_1"})
					+ 10*this.getUpLev(theTree, new String[]{"bar1_s6_2"});

			this.beginAppendFormatLine("命中率: +%1$s%%", accuracy);
			this.appendFormatLine("魔法伤害: +%1$s%%", magicDamage);
			this.appendFormatLine("持续时间: %1$s 秒 ", tbl_bar3_s30_2[p-1]);
			this.endAppendLine("魔法消耗: 4");

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
		//旋风
		SkillBuildTemplate t1 = new SkillBuildTemplate("bar_template_1", "旋风\r\n野蛮人");
		t1.skillTemplates.put("bar1_s1_1", 1); //狂嗥
		t1.skillTemplates.put("bar1_s6_2", 20); //大叫
		t1.skillTemplates.put("bar1_s24_2", 20); //战斗体制
		t1.skillTemplates.put("bar2_s6_1", 20); //长棍掌握
		t1.skillTemplates.put("bar2_s12_1", 1); //增加耐力
		t1.skillTemplates.put("bar2_s18_3", 1); //铁布衫
		t1.skillTemplates.put("bar2_s30_3", 1); //自然抵抗
		t1.skillTemplates.put("bar3_s1_2", 1); //重击
		t1.skillTemplates.put("bar3_s6_1", 1); //跳跃
		t1.skillTemplates.put("bar3_s12_2", 1); //击晕
		t1.skillTemplates.put("bar3_s18_1", 1); //跳跃攻击
		t1.skillTemplates.put("bar3_s18_2", 1); //专心
		t1.skillTemplates.put("bar3_s30_1", 20); //旋风
		t1.skillTemplates.put("bar3_s30_2", 1); //狂战士

		//狂乱
		SkillBuildTemplate t2 = new SkillBuildTemplate("bar_template_2", "狂乱\r\n野蛮人");
		t2.skillTemplates.put("bar1_s1_1", 1); //狂嗥
		t2.skillTemplates.put("bar1_s6_2", 1); //大叫
		t2.skillTemplates.put("bar1_s24_2", 20); //战斗体制
		t2.skillTemplates.put("bar2_s1_1", 20); //剑系掌握
		t2.skillTemplates.put("bar2_s12_1", 1); //增加耐力
		t2.skillTemplates.put("bar2_s18_3", 1); //铁布衫
		t2.skillTemplates.put("bar2_s30_3", 1); //自然抵抗
		t2.skillTemplates.put("bar3_s1_2", 1); //重击
		t2.skillTemplates.put("bar3_s6_3", 20); //双手挥击
		t2.skillTemplates.put("bar3_s12_2", 1); //击晕
		t2.skillTemplates.put("bar3_s12_3", 1); //双手投掷
		t2.skillTemplates.put("bar3_s18_2", 1); //专心
		t2.skillTemplates.put("bar3_s24_3", 20); //狂乱
		t2.skillTemplates.put("bar3_s30_2", 1); //狂战士

		return new SkillBuildTemplate[]{t1, t2};
	}

}