package cains.note.service.green;

import cains.note.service.base.*;

public final class GreenItem extends AbstractItem
{
	public String setComment; //套装奖励说明

	public GreenItem(String catId, String id, String name, String type, String cls,
					 String comment1, String comment2, String setComment, byte[] drop)
	{
		super(catId, id, name, type, cls, comment1, comment2, drop);
		this.setComment = setComment;
	}
}
