package cains.note.service.npc;

import cains.note.service.base.AbstractItem;

public final class Npc extends AbstractItem
{
	/* Base Class Data Example:
	 * catId: episode1
	 * id: a1
	 * name: 阿卡拉
	 * type: 魔法装备商人
	 * cls: 		  自我介绍
	 * comment1:      罗格的牧师, 一个正统的女人, 当你需要帮助的时候, 可以从她那里了解更多的信息.
	 * comment2:      治疗 - 阿卡拉可以免费的恢复你的生命, 法力, 耐力.
    				  交易 - 法杖, 权杖, 手杖, 书本, 卷轴, 钥匙和药水.
	 * drop: null
	 */
	public Npc(String catId, String id, String name, String type, String cls, String comment1, String comment2)
	{
		super(catId, id, name, type, cls, comment1, comment2, null);
	}

	@Override
	public String getDisplayName()
	{
		return name;
	}
}
