package cains.note.service.skill;

import java.util.*;

import cains.note.data.skill.SkillData;
import cains.note.global.Global;
import cains.note.service.base.AbstractService;

public final class SkillService extends AbstractService
{
	private List<SkillPanel> panels;
	
	@Override
	protected void initData()
	{
		this.panels = new ArrayList<SkillPanel>();
		SkillData.generate(this.panels);
	}
	
	public SkillPanel getSkillPanel()
	{
		for(SkillPanel panel : panels)
		{
			if (panel.id.equals(Global.id))
			{
				return panel;
			}
		}
		return null;
	}
	
	public SkillPanel getSkillPanel(String id)
	{
		for(SkillPanel panel : panels)
		{
			if (panel.id.equals(id))
			{
				return panel;
			}
		}
		return null;
	}
	
	public Skill getSkill(String skillId)
	{
		for(SkillPanel panel : panels)
		{
			Skill rtn = panel.getSkill(skillId);
			if (rtn != null)
			{
				return rtn;
			}
		}
		return null;
	}
}
