package cains.note.service.story;

import cains.note.service.base.AbstractItem;

public final class Story extends AbstractItem
{
	public Story(String catId, String id, String name, String content)
	{
		super(catId, id, name, null, null, content, null, null);
	}

}
