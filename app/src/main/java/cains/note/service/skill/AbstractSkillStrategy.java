package cains.note.service.skill;

import java.math.BigDecimal;

public abstract class AbstractSkillStrategy
{
	protected StringBuffer buffer = new StringBuffer();

	public final String getSkillDescription(SkillTree theTree, Skill skill)
	{
		try
		{
			if (skill == null)
			{
				return null;
			}
			else
			{
				if (skill.point == 0)
				{
					return "";
				}
				else
				{
					return execGetSkillDescription(theTree, skill);
				}
			}
		}
		catch (Exception ex)
		{
			return "?";
		}
	}

	public abstract SkillBuildTemplate[] getBuildTemplates();

	protected abstract String execGetSkillDescription(SkillTree theTree, Skill skill);

	protected void beginAppendLine(String s)
	{
		buffer.setLength(0);
		buffer.append(s + "\r\n");
	}

	protected void beginAppendFormatLine(String format, int v1, int v2)
	{
		beginAppendLine(String.format(format, String.valueOf(v1), String.valueOf(v2)));
	}

	protected void beginAppendFormatLine(String format, int v1)
	{
		beginAppendLine(String.format(format, String.valueOf(v1)));
	}

	protected void beginAppendFormatLine(String format, float v1)
	{
		beginAppendLine(String.format(format, String.valueOf(v1)));
	}

	protected void appendLine(String s)
	{
		buffer.append(s + "\r\n");
	}

	protected void appendFormatLine(String format, int v1, int v2)
	{
		this.appendLine(String.format(format, String.valueOf(v1), String.valueOf(v2)));
	}

	protected void appendFormatLine(String format, int v1)
	{
		this.appendLine(String.format(format, String.valueOf(v1)));
	}

	protected void appendFormatLine(String format, float v1, float v2)
	{
		this.appendLine(String.format(format, String.valueOf(v1), String.valueOf(v2)));
	}

	protected void appendFormatLine(String format, float v1)
	{
		this.appendLine(String.format(format, String.valueOf(v1)));
	}

	protected void endAppendLine(String s)
	{
		buffer.append(s);
	}

	protected void endAppendFormatLine(String format, int v1, int v2)
	{
		endAppendLine(String.format(format, String.valueOf(v1), String.valueOf(v2)));
	}

	protected void endAppendFormatLine(String format, float v1, float v2)
	{
		endAppendLine(String.format(format, String.valueOf(v1), String.valueOf(v2)));
	}

	protected void endAppendFormatLine(String format, int v1)
	{
		endAppendLine(String.format(format, String.valueOf(v1)));
	}

	protected void endAppendFormatLine(String format, float v1)
	{
		endAppendLine(String.format(format, String.valueOf(v1)));
	}

	//四舍五入
	protected int upByPercent(int v, int percent)
	{
		float f = ((float)(100 + percent))/100;
		BigDecimal d = new BigDecimal((float)(v * f)).setScale(0, BigDecimal.ROUND_HALF_UP);
		return d.intValue();
	}

	//直接取整
	protected int upByPercent2(int v, int percent)
	{
		float f = ((float)(100 + percent))/100;
		return (int)Math.floor((float)(v * f));
	}

	protected float upByPercent2(float v, int percent)
	{
		float f = ((float)(100 + percent))/100;
		return upFloat2((float)(v * f),1);
	}

	//向上取整
	protected int upByPercent2_ceil(int v, int percent)
	{
		float f = ((float)(100 + percent))/100;
		return (int)Math.ceil((float)(v * f));
	}

	//向上取整
	protected float upByPercent2_ceil(float v, int percent)
	{
		float f = ((float)(100 + percent))/100;
		return upFloat4((float)(v * f),1);
	}

	//直接取整
	protected int upByPercent3(int v, int percentPerLev, int upLev)
	{
		float f = ((float)(100 + percentPerLev * upLev))/100;
		return (int)Math.floor((float)(v * f));
	}

	//保留1位小数
	protected float upByPercent3(float v, int percentPerLev, int upLev)
	{
		float f = ((float)(100 + percentPerLev * upLev))/100;
		return upFloat3((float)(v * f), 1);
	}

	/**
	 *
	 * @param v                    原始值
	 * @param percentPerLev        每级加成百分比
	 * @param upLev                加成级数
	 * @return                     更新值
	 */
	protected int upByPercent4(int v, int percentPerLev, int upLev)
	{
		float f = (float)(percentPerLev)/100;
		float fv = (float)(v * f);
		int rtn = v;
		float tmp;
		for (int i = 0; i<upLev; i++)
		{
			tmp = (float)(rtn + fv);
			rtn = (int)Math.ceil((float)(tmp)); //向上取整
		}

		return rtn;
	}

	/**
	 * 在baseValue基础上,每级增加v的percentPerLev%
	 *
	 * @param baseValue
	 * @param v
	 * @param percentPerLev
	 * @param upLev
	 * @return
	 */
	protected int upByPercent5(int baseValue, int v, int percentPerLev, int upLev)
	{
		float upValue = (float)((float)(v * percentPerLev * upLev)/100);
		return (int)Math.floor((float)(baseValue + upValue));
	}

	/**
	 * 获取最终值
	 * 适用于在原值基础上,第一级+XXX,之后每级+XXX的情况
	 *
	 * @param v             原始值
	 * @param upValueLv1    第一级加成值
	 * @param upValueLvX    之后每级加成值
	 * @param lv            加成等级
	 * @return              最终值
	 */
	protected int upByValue(int v, int upValueLv1, int upValueLvX, int lv)
	{
		if (lv == 0)
		{
			return v; //无加成
		}
		else
		{
			return v + getUpValue(upValueLv1, upValueLvX, lv);
		}
	}

	/**
	 * 获取总加成量
	 * 适用于第一级+XXX,之后每级+XXX的情况
	 *
	 * @param upValueLv1    第一级加成值
	 * @param upValueLvX    之后每级加成值
	 * @param lv            加成等级
	 * @return              总加成值
	 */
	protected int getUpValue(int upValueLv1, int upValueLvX, int lv)
	{
		if (lv == 0)
		{
			return 0; //无加成
		}
		else
		{
			return (upValueLv1 + upValueLvX*(lv-1));
		}
	}

	/**
	 * 获取最终值
	 * 适用于在原值基础上,在奇数等级加到下一级时+XXX,在偶数等级加到下一级时+XXX的情况
	 *
	 * @param v            原值
	 * @param oddUpValue   偶数级加值
	 * @param evenValue    奇数级加值
	 * @param lv           级数
	 * @return
	 */
	protected int upByValue2(int baseValue, int oddValue, int evenValue, int lv)
	{
		int rtn = baseValue;
		for (int i = 2; i <= lv; i++)
		{
			if ((i-1)%2 == 0)
			{
				rtn += evenValue;
			}
			else
			{
				rtn += oddValue;
			}
		}
		return rtn;

	}

	/**
	 * 获取最终值
	 * 适用于在原值基础上,在奇数等级加到下一级时+XXX,在偶数等级加到下一级时+XXX的情况
	 *
	 * @param v            原值
	 * @param oddUpValue   偶数级加值
	 * @param evenValue    奇数级加值
	 * @param lv           级数
	 * @return
	 */
	protected float upByValue2(float baseValue, float oddValue, float evenValue, int lv)
	{
		float rtn = baseValue;
		for (int i = 2; i <= lv; i++)
		{
			if ((i-1)%2 == 0)
			{
				rtn += evenValue;
			}
			else
			{
				rtn += oddValue;
			}
		}
		return upFloat2(rtn,2);
	}

	/**
	 * 获取最终值
	 * 适用于: +16,+17,+17,+17,+17,+16 ,+17,+17,+17,+17,+16 这种情况 (每隔一定间隔会出现一次特殊增长)
	 *
	 *
	 * @param baseValue
	 * @param specialV     普通增长(16)
	 * @param regularV     特殊增长(17)
	 * @param step         间隔(4)
	 * @param lv
	 * @return
	 */
	protected int upByValue3(int baseValue, int specialV, int regularV, int step, int lv)
	{
		int rtn = baseValue;
		int limit = step;
		for (int i = 2; i <= lv; i++)
		{
			if (limit == step)
			{
				rtn += specialV;
				limit = 0;
			}
			else
			{
				rtn += regularV;
				limit++;
			}
		}
		return rtn;
	}

	/**
	 * 获取最终值
	 * 适用于: +19,+19,+19,+19,+20,+19,+19,+19,+19,+20 (每隔一定间隔会出现一次特殊增长)
	 *
	 * @param baseValue
	 * @param regularV        普通增长(19)
	 * @param specialV        特殊增长(20)
	 * @param step            间隔(4)
	 * @param lv
	 * @return
	 */
	protected int upByValue4(int baseValue, int regularV, int specialV, int step, int lv)
	{
		int rtn = baseValue;
		int limit = 0;
		for (int i = 2; i <= lv; i++)
		{
			if (limit == step)
			{
				rtn += specialV;
				limit = 0;
			}
			else
			{
				rtn += regularV;
				limit++;
			}
		}
		return rtn;
	}

	protected float upByValue4(float baseValue, float regularV, float specialV, int step, int lv)
	{
		float rtn = baseValue;
		int limit = 0;
		for (int i = 2; i <= lv; i++)
		{
			if (limit == step)
			{
				rtn += specialV;
				limit = 0;
			}
			else
			{
				rtn += regularV;
				limit++;
			}
		}
		return upFloat2(rtn,2);
	}

	/**
	 * 获取最终值
	 * 适用于: +27,+28,+27,+28,+28, +27,+28,+27,+28,+28, +27,+28,+27,+28,+28 (n个一组奇偶交替,但是最后两次增长相同)
	 *
	 * @param baseValue
	 * @param v1                 27 奇数增长
	 * @param v2                 28 偶数增长
	 * @param groupLen           5 (n)
	 * @param lv
	 * @return
	 */
	protected int upByValue5(int baseValue, int v1, int v2, int groupLen, int lv)
	{
		int rtn = baseValue;
		int indexInGroup = 0;
		int pre = 0;
		for (int i = 2; i <= lv; i++)
		{
			indexInGroup++;
			if  (indexInGroup == groupLen)
			{
				rtn += pre;
				indexInGroup = 0;
			}
			else
			{
				if (indexInGroup%2 != 0) //奇数
				{
					pre = v1;
					rtn += v1;
				}
				else  //偶数
				{
					pre = v2;
					rtn += v2;
				}
			}

		}
		return rtn;
	}

	/**
	 * 获取最终值
	 * 适用于: +38,+38,+39,+38,+39, +38,+38,+39,+38,+39, +38,+38,+39,+38,+39 (n个一组奇偶交替,但是前两次增长相同)
	 *
	 * @param baseValue
	 * @param v1                 38 奇数增长
	 * @param v2                 39 偶数增长
	 * @param groupLen           5 (n)
	 * @param lv
	 * @return
	 */
	protected int upByValue6(int baseValue, int v1, int v2, int groupLen, int lv)
	{
		int rtn = baseValue;
		int indexInGroup = 0;
		for (int i = 2; i <= lv; i++)
		{
			indexInGroup++;
			if  (indexInGroup == 1 || indexInGroup == 2)
			{
				rtn += v2;
			}
			else
			{
				if (indexInGroup%2 != 0) //奇数
				{
					rtn += v1;
				}
				else  //偶数
				{
					rtn += v2;
				}
			}
			if (indexInGroup == groupLen)
			{
				indexInGroup = 0;
			}

		}
		return rtn;
	}

	/**
	 * 获取最终值,适用于每groupLen级后,增长为v*n的情况.例如前8级+18,9-16级+36,17-24级+54
	 *
	 * @param baseValue
	 * @param v               16: 增长基数16
	 * @param groupLen        8: 8级一组
	 * @param lv
	 * @return
	 */
	protected int upByValue7(int baseValue, int v, int groupLen, int lv)
	{
		int rtn = baseValue;
		int groupNum = 1;
		int tempLen = 1;
		for (int i = 2; i <= lv; i++)
		{
			rtn += v*groupNum;
			tempLen++;
			if (tempLen == groupLen)
			{
				tempLen = 0;
				groupNum ++;
			}
		}
		return rtn;
	}

	/*
	适用于从某级开始增长值发生变化的情况
	例如: 从第2级起增长值为+2,从第6级起为+3,初始值为10

	级别   值     增值
	1      10
	2      12     +2
	3      14     +2
	4      16     +2
	5      18     +2
	6      21     +3
	7      24     +3
	8      27     +3
	9      30     +3

	则输入为: baseValue = 10, pattern = {{2,2},{6,3}}
	*/
	protected int upByValue8(int baseValue, int[][] pattern, int lv)
	{
		int rtn = baseValue;

		for (int i = 2; i <= lv; i++)
		{
			rtn += pickUpIncreaseValue(i, pattern);
		}

		return rtn;
	}

	protected float upByValue8(float baseValue, float[][] pattern, int lv)
	{
		float rtn = baseValue;

		for (int i = 2; i <= lv; i++)
		{
			rtn += upFloat2(pickUpIncreaseValue(i, pattern),2);
		}

		return upFloat2(rtn,2);
	}

	private int pickUpIncreaseValue(int lv, int[][] pattern)
	{
		for (int i = 0; i < pattern.length; i++)
		{
			if (i == pattern.length - 1)
			{
				return pattern[i][1];
			}

			if (lv >= pattern[i][0] && lv < pattern[i+1][0])
			{
				return pattern[i][1];
			}
		}
		return 0;
	}

	private float pickUpIncreaseValue(int lv, float[][] pattern)
	{
		for (int i = 0; i < pattern.length; i++)
		{
			if (i == pattern.length - 1)
			{
				return pattern[i][1];
			}

			if (lv >= (int)pattern[i][0] && lv < (int)pattern[i+1][0])
			{
				return pattern[i][1];
			}
		}
		return 0;
	}

	/**
	 * 小数部分超过up的进位成整数,否则维持f
	 *
	 * @param f
	 * @param up
	 * @return
	 */
	protected float upFloat(float f, float up)
	{
		if (f > (float)((int)f + up))
		{
			return (float)((int)f + 1);
		}
		else
		{
			return (new BigDecimal(f).setScale(1, BigDecimal.ROUND_HALF_UP)).floatValue();
		}
	}

	//四舍五入,小数点后scale位进位,scale=1表示保留1位小数
	protected float upFloat2(float f, int scale)
	{
		scale = 1;
		return (new BigDecimal(f).setScale(scale, BigDecimal.ROUND_HALF_UP)).floatValue();
	}

	//直接舍弃,保留小数点后scale位,scale=1表示保留1位小数
	protected float upFloat3(float f, int scale)
	{
		scale = 1;
		return (new BigDecimal(f).setScale(scale, BigDecimal.ROUND_FLOOR)).floatValue();
	}

	//直接进位,保留小数点后scale位,scale=1表示保留1位小数
	protected float upFloat4(float f, int scale)
	{
		scale = 1;
		return (new BigDecimal(f).setScale(scale, BigDecimal.ROUND_CEILING)).floatValue();
	}

	//计算耗魔,在baseValue基础上每级增加v, 在0.4和0.9两个点上将进位0.1
	protected float cal_mana_1(float baseValue, float v, int lv)
	{
		float rtn = baseValue;
		for (int i = 2; i <= lv; i++)
		{
			rtn += v;
			float f = upFloat2((float)(rtn - (int)rtn),2);
			if ((f == 0.4f) || (f == 0.9f))
			{
				rtn += 0.1f;
				rtn = upFloat2(rtn,2);
			}
		}
		return upFloat2(rtn, 2);
	}

	//在baseValue基础上每级增加v, 在upPoints列出的点上,将进位0.1
	protected float upByFloat(float baseValue, float v, float[] upPoints, int lv)
	{
		float rtn = baseValue;
		for (int i = 2; i <= lv; i++)
		{
			rtn += v;
			float f = upFloat2((float)(rtn - (int)rtn),2);
			for (float p : upPoints)
			{
				if (p == f)
				{
					rtn += 0.1f;
					rtn = upFloat2(rtn,2);
					break;
				}
			}
		}
		return upFloat2(rtn, 2);
	}

	/**
	 * 适用如下增长规律 36,37,37,37,36,37,37,37,36 ...
	 * 上例step为3 (3个37)
	 * v1为36,v2为37
	 *
	 */
	protected int cal_life_1(int baseValue, int v1, int v2, int step, int lv)
	{
		int rtn = baseValue;
		if (lv == 1) return rtn;
		int k = 0;
		for (int i = 2; i<=lv; i++)
		{
			if (k == 0)
			{
				rtn += v1;
			}
			else
			{
				rtn += v2;
			}
			k++;
			if (k > step)
			{
				k = 0;
			}
		}
		return rtn;
	}

	protected float cal_life_1(float baseValue, float v1, float v2, int step, int lv)
	{
		float rtn = baseValue;
		if (lv == 1) return rtn;
		int k = 0;
		for (int i = 2; i<=lv; i++)
		{
			if (k == 0)
			{
				rtn += v1;
				rtn = upFloat2(rtn,2);
			}
			else
			{
				rtn += v2;
				rtn = upFloat2(rtn,2);
			}
			k++;
			if (k > step)
			{
				k = 0;
			}
		}
		return upFloat2(rtn, 2);
	}


	protected int getUpLev(SkillTree theTree, String[] skillIds)
	{
		int rtn = 0;
		Skill skill = null;

		for (String s : skillIds)
		{
			skill = theTree.getSkill(s);
			if (skill != null) //is skill from the tree
			{
				rtn += skill.point;
			}
			else
			{
				//search other trees for the skill
				SkillPanel panel = theTree.myPanel;
				SkillTree tree;
				for (int i = 0; i < 3; i++)
				{
					tree = panel.getTreeOfIndex(i);
					if (!tree.equals(theTree))
					{
						skill = tree.getSkill(s);
						if (skill != null)  //found it
						{
							rtn += skill.point;
							break;
						}
					}
				}
			}
		}
		return rtn;
	}

}
