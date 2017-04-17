package cains.note.service.affix;

import cains.note.service.base.AbstractItem;

public final class Affix  extends AbstractItem
{
	//name: 词缀名称
	//type: prefix or suffix
	//cls: 词缀代表的属性
	//comment1: 作用于 装备类型(级别和[范围])
	//comment2: 备注
	public Affix(String catId, String id, String name, String type, String attribute, String function, String comment)
	{
		super(catId, id, name, type, attribute, function, comment, null);
	}
}
