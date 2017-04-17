package cains.note.service.skill;

public final class Skill
{
	public int point;                        //技能点数
	public String id;                        //技能ID
	public int level;                        //所需等级
	public String name;                      //技能名称
	public String comment;                   //技能描述
	public String comment2;                  //技能描述2
	public String effect;                    //技能效果
	public String enhanceDescription;        //技能强化描述
	public Skill[] preSkill;                 //先修技能
	public int imgId;
	public int imgIdShadow;
	private static final int MAX_LEVEL = 50;

	public Skill (String id, int level, String name, String comment, String comment2, String effect, String enhanceDescription, Skill[] preSkill, int imgId, int imgIdShadow)
	{
		this.id = id;
		this.name = name;
		this.level = level;
		this.comment = comment;
		this.comment2 = comment2;
		this.effect = effect;
		this.enhanceDescription = enhanceDescription;
		this.preSkill = preSkill;
		this.imgId = imgId;
		this.imgIdShadow = imgIdShadow;
	}

	public void increasePoint()
	{
		this.point++;
		if (this.point > MAX_LEVEL)
		{
			this.point = MAX_LEVEL;
		}
	}

	public void increasePoint(int value)
	{
		this.point += value;
		if (this.point > MAX_LEVEL)
		{
			this.point = MAX_LEVEL;
		}
	}

	public void decreasePoint()
	{
		this.point--;
		if (this.point < 0)
		{
			this.point = 0;
		}
	}

	public void decreasePoint(int value)
	{
		this.point -= value;
		if (this.point < 0)
		{
			this.point = 0;
		}
	}

	public void clearPoints()
	{
		this.point = 0;
	}

	public boolean ifPreSkillFufilled()
	{
		if (preSkill == null)  //no pre-skill required
		{
			return true;
		}

		for (Skill s : preSkill)
		{
			if (s.point == 0)
			{
				return false;
			}
		}
		return true;
	}

	public String getPreSkillList()
	{
		if (this.preSkill == null)
		{
			return "无";
		}
		else
		{
			StringBuffer rtn = new StringBuffer();
			int i = 0;
			for (Skill s : this.preSkill)
			{
				if (i == this.preSkill.length - 1)
				{
					rtn.append(s.name);
				}
				else
				{
					rtn.append(s.name+"\r\n");
				}
				i++;
			}
			return rtn.toString();
		}
	}
}
