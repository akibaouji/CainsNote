package cains.note.service.base;

import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.skill.Skill;
import cains.note.service.skill.SkillPanel;
import cains.note.service.skill.SkillService;

public final class ServiceMediator
{
	private static ServiceMediator me;

	private ServiceMediator()
	{
	}

	public static ServiceMediator getInstance()
	{
		if (me == null)
		{
			me = new ServiceMediator();
		}
		return me;
	}

	public Object getData(int type, Object param1, Object param2)
	{
		String oldMode;
		SkillService srv;

		switch (type)
		{
			case Constant.DATA_TYPE_SKILLPANEL: //获取某角色的完整技能板
				oldMode = Global.mode;
				Global.mode = Constant.SKILL_MODE; //临时切换到SKILL模式
				srv = (SkillService)ServiceFactory.getInstance().getCurrentService();
				SkillPanel panel = srv.getSkillPanel((String)param1);
				Global.mode = oldMode; //切回原来的模式
				return panel;

			case Constant.DATA_TYPE_SKILL: //获取单一技能
				oldMode = Global.mode;
				Global.mode = Constant.SKILL_MODE; //临时切换到SKILL模式
				srv = (SkillService)ServiceFactory.getInstance().getCurrentService();
				Skill skill = srv.getSkill((String)param1);
				Global.mode = oldMode; //切回原来的模式
				return skill;

			default:
				return null;
		}
	}
}
