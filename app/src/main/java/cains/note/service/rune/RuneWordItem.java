package cains.note.service.rune;

import cains.note.service.base.AbstractItem;

public final class RuneWordItem extends AbstractItem
{
	//eg:
	//category: ancients_pledge
	//id: ancients_pledge
	//name: Ancient’s Pledge\r\n远古誓言
	//type: 3 孔盾牌
	//cls: Ral + Ort + Tal
	public RuneWordItem(String key, String name, String type,
						String word, String comment1, String comment2)
	{
		super(key, key, name, type, word, comment1, comment2, null);
	}
}
