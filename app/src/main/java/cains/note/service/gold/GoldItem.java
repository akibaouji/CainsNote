package cains.note.service.gold;

import cains.note.service.base.*;

public final class GoldItem extends AbstractItem
{
	public GoldItem(String catId, String id, String name, String type, String cls, 
            String comment1, String comment2, byte[] drop)
	{
		super(catId, id, name, type, cls, comment1, comment2, drop);
	}
}
