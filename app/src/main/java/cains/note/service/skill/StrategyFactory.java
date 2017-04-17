package cains.note.service.skill;

import java.util.HashMap;

public final class StrategyFactory
{
	private static StrategyFactory me;
	
	private HashMap<String, AbstractSkillStrategy> dic = new HashMap<String, AbstractSkillStrategy>();
	
	private StrategyFactory()
	{
		dic.put("amazon", new AmaSkillStrategy());
		dic.put("necromancer", new NecSkillStrategy());
		dic.put("druid", new DruSkillStrategy());
		dic.put("barbarian", new BarSkillStrategy());
		dic.put("assassin", new AssSkillStrategy());
		dic.put("paladin", new PalSkillStrategy());
		dic.put("sorceress", new SorSkillStrategy());
	}
	
	public static StrategyFactory getInstance()
	{
		if (me == null)
		{
			me = new StrategyFactory();
		}
		return me;
	}
	
	public AbstractSkillStrategy getStrategy(String id)
	{
		return dic.get(id);
	}
}
