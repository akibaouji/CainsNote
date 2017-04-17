package cains.note.service.green;

import cains.note.service.base.*;

public final class GreenItemCategory extends AbstractCategory
{
	public String comment; //套装说明

	public GreenItemCategory(String id, String name, int imgId, String comment)
	{
		super(id, name, imgId);
		this.comment = comment;
	}
}
