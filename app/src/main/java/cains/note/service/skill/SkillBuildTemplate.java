package cains.note.service.skill;

import java.util.HashMap;

public final class SkillBuildTemplate
{
	public String id;
	public String name;

	public HashMap<String, Integer> skillTemplates;

	public SkillBuildTemplate(String id, String name)
	{
		this.id = id;
		this.name = name;
		this.skillTemplates = new HashMap<String, Integer>();
	}
}
