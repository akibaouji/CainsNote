package cains.note.service.questitem;

import cains.note.service.base.AbstractItem;

public final class QuestItem extends AbstractItem
{
	/* Base Class Data Example:
	 * catId: questitem
	 * id: qi1
	 * name:          卡里姆的意愿
	 * type: 		  守护者(任务名或作用)
	 * cls: 		  崔凡克的议会成员(掉落)
	 * comment1:      单手伤害:1-15\r\n范围:1\r\n武器基础攻速:[-10]\r\n需求力量:-\r\n需求敏捷:-\r\n耐久度:30\r\n需求等级:-
	 * comment2:      50%提升攻击速度\r\n加1-40闪电伤害\r\n+40攻击准确率\r\n6%生命于击中时偷取\r\n6%魔法于击中时偷取
	 * drop:		  null
	 */
	public QuestItem(String id, String name, String quest,
					 String drop, String comment1, String comment2)
	{
		super("questitem", id, name, quest, drop, comment1, comment2, null);
	}

}
