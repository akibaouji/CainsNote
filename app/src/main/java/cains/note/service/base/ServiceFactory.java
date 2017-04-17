package cains.note.service.base;

import java.util.HashMap;

import cains.note.service.affix.AffixService;
import cains.note.service.character.CharacterService;
import cains.note.service.crafted.CraftedItemService;
import cains.note.service.formula.FormulaService;
import cains.note.service.gold.*;
import cains.note.service.green.*;
import cains.note.service.mercenary.MercenaryService;
import cains.note.service.monster.*;
import cains.note.service.npc.NpcService;
import cains.note.service.questitem.QuestItemService;
import cains.note.service.rune.*;
import cains.note.service.skill.SkillService;
import cains.note.service.story.StoryService;
import cains.note.service.task.TaskService;
import cains.note.global.*;

public final class ServiceFactory
{
	private static ServiceFactory _me;

	private HashMap<String, AbstractService> _dic;
	
	private ServiceFactory()
	{
		_dic = new HashMap<String, AbstractService>();;
		
		_dic.put(Constant.GOLD_MODE, new GoldItemService());
		_dic.put(Constant.GREEN_MODE, new GreenItemService());
		_dic.put(Constant.RUNE_MODE, new RuneWordService());
		_dic.put(Constant.MONSTER_MODE, new MonsterService());
		_dic.put(Constant.NPC_MODE, new NpcService());
		_dic.put(Constant.TASK_MODE, new TaskService());
		_dic.put(Constant.STORY_MODE, new StoryService());
		_dic.put(Constant.SKILL_MODE, new SkillService());
		_dic.put(Constant.CHAR_MODE, new CharacterService());
		_dic.put(Constant.QUESTITEM_MODE, new QuestItemService());
		_dic.put(Constant.AFFIX_MODE, new AffixService());
		_dic.put(Constant.FORMULA_MODE, new FormulaService());
		_dic.put(Constant.MERCENARY_MODE, new MercenaryService());
		_dic.put(Constant.CRAFTED_MODE, new CraftedItemService());
	}
	
	public static ServiceFactory getInstance()
	{
		if (_me == null)
		{
			_me = new ServiceFactory();
		}
		
		return _me;
	}
	
	public AbstractService getCurrentService()
	{
		return _dic.get(Global.mode);
	}
}
