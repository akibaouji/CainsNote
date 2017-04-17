package cains.note.service.skill;

public final class SkillTree
{
	public SkillPanel myPanel;
	public String treeName;
	public String comment;

	public Skill[][] skillMatrix;  //技能矩阵

	private AbstractSkillStrategy skillStrategy;

	public SkillTree(String treeName, Skill[][] skillMatrix)
	{
		this.treeName = treeName;
		this.skillMatrix = skillMatrix;
	}

	public boolean ifExistSkill(int x, int y)
	{
		return (skillMatrix[x][y] == null);
	}

	public Skill getSkill(int x, int y)
	{
		return skillMatrix[x][y];
	}

	public Skill getSkill(String skillId)
	{
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (skillMatrix[i][j] != null)
				{
					if (skillMatrix[i][j].id.equals(skillId))
					{
						return skillMatrix[i][j];
					}
				}
			}
		}
		return null;
	}

	public int getPoint(int x, int y)
	{
		if (skillMatrix[x][y] != null)
		{
			return skillMatrix[x][y].point;
		}
		else
		{
			return 0;
		}
	}

	public int getPoint(String skillId)
	{
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (skillMatrix[i][j] != null)
				{
					if (skillMatrix[i][j].id.equals(skillId))
					{
						return skillMatrix[i][j].point;
					}
				}
			}
		}
		return 0;
	}

	public int getPointCount()
	{
		int rtn = 0;
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (skillMatrix[i][j] != null)
				{
					rtn += skillMatrix[i][j].point;
				}
			}
		}
		return rtn;
	}

	public String getSkillName(int x, int y)
	{
		if (skillMatrix[x][y] != null)
		{
			return skillMatrix[x][y].name;
		}
		else
		{
			return "";
		}
	}

	public void setPoint(int x, int y, int value)
	{
		if (skillMatrix[x][y] != null)
		{
			skillMatrix[x][y].point = value;
		}
	}

	public void increasePoint(int x, int y)
	{
		if (skillMatrix[x][y] != null)
		{
			skillMatrix[x][y].increasePoint();
		}
	}

	public void increasePoint(int x, int y, int value)
	{
		if (skillMatrix[x][y] != null)
		{
			skillMatrix[x][y].increasePoint(value);
		}
	}

	public void decreasePoint(int x, int y)
	{
		if (skillMatrix[x][y] != null)
		{
			skillMatrix[x][y].decreasePoint();
		}
	}

	public void decreasePoint(int x, int y,  int value)
	{
		if (skillMatrix[x][y] != null)
		{
			skillMatrix[x][y].decreasePoint(value);
		}
	}

	public String getSkillDescription(Skill skill)
	{
		return this.skillStrategy.getSkillDescription(this, skill);
	}

	public String getSkillDescription(String skillId)
	{
		Skill skill = getSkill(skillId);
		if (skill == null)
		{
			return "";
		}
		else
		{
			return this.skillStrategy.getSkillDescription(this, skill);
		}
	}

	public void clearAllPoints()
	{
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (skillMatrix[i][j] != null)
				{
					skillMatrix[i][j].clearPoints();
				}
			}
		}
	}

	void setStrategy(AbstractSkillStrategy strategy)
	{
		this.skillStrategy = strategy;
	}
}
