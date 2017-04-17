package cains.note.service.skill;

import java.util.*;

public final class SkillPanel
{
	private List<SkillTree> trees = new ArrayList<SkillTree>();
	private AbstractSkillStrategy skillStrategy;

	public String id;

	public SkillPanel(String id, AbstractSkillStrategy skillStrategy)
	{
		this.id = id;
		this.skillStrategy = skillStrategy;
	}

	public void addSkillTree(SkillTree tree)
	{
		//set the context
		tree.setStrategy(skillStrategy);
		tree.myPanel = this;

		//add to container
		trees.add(tree);
	}

	public SkillTree getTreeOfIndex(int index)
	{
		return trees.get(index);
	}

	public SkillTree getTreeOfName(String name)
	{
		for (SkillTree tree : trees)
		{
			if (tree.treeName.equals(name))
			{
				return tree;
			}
		}
		return null;
	}

	public Skill getSkill(String skillId)
	{
		for (SkillTree tree : trees)
		{
			Skill rtn = tree.getSkill(skillId);
			if (rtn != null)
			{
				return rtn;
			}
		}
		return null;
	}

	public int getPointCountOfAllTrees()
	{
		int rtn = 0;
		for (SkillTree tree : trees)
		{
			rtn += tree.getPointCount();
		}
		return rtn;
	}

	public void clearPointsOfTree(int index)
	{
		SkillTree tree = getTreeOfIndex(index);
		if (tree != null)
		{
			tree.clearAllPoints();
		}
	}

	public void clearAllPoints()
	{
		for (SkillTree tree : trees)
		{
			tree.clearAllPoints();
		}
	}

	public void setPointForSkill(String skillId, int point)
	{
		Skill s;
		for (SkillTree tree : trees)
		{
			s = tree.getSkill(skillId);
			if (s == null)
			{
				continue;
			}
			else
			{
				s.point = point;
			}
		}
	}

	public void setBuildTemplate(SkillBuildTemplate t)
	{
		if (t == null)
		{
			return;
		}
		else
		{
			clearAllPoints();
			for (String key : t.skillTemplates.keySet())
			{
				setPointForSkill(key, t.skillTemplates.get(key));
			}
		}
	}

	public SkillBuildTemplate[] getBuildTemplates()
	{
		return skillStrategy.getBuildTemplates();
	}
}
