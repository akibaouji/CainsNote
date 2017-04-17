package cains.note.service.crafted;

import cains.note.service.base.AbstractItem;

public final class CraftedItem extends AbstractItem
{
	public int[] imgId;

	//data example:
	//catId: blooditems
	//id: blooditems_1
	//name: 头盔
	//type: 魔法的 头盔/无颊头盔/活动头盔
	//cls:	魔法的 头盔/无颊头盔/活动头盔 + 拉尔 8# + 完美的红紫石 + 任何珠宝
	//comment1: 5-10% 致命攻击 (1-4)% 击中偷取生命 +(10-20) 生命
	public CraftedItem(String catId, String id, String name, String type, String cls, String comment1, int[] imgId)
	{
		super(catId, id, name, type, cls, comment1, null, null);
		this.imgId = imgId;
	}

}
