package cains.note.service.formula;

import cains.note.service.base.AbstractItem;

public final class Formula extends AbstractItem
{
	public int[] fromImgId;
	public int toImgId;

	//Data Example:
	//
	//catId: armor
	//id : formula1
	//name: 1 拉尔 + 1 书尔 + 1 完美紫宝石 + 普通级杰出盔甲
	//type: 扩展级杰出盔甲
	//cls: 物品基础类型的升级
	public Formula(String catId, String id, String name, String type, String cls, int[] fromImgId, int toImgId)
	{
		super(catId, id, name, type, cls, null, null, null);

		this.fromImgId = fromImgId;
		this.toImgId = toImgId;
	}

}
