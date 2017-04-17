package cains.note.service.story;

import cains.note.data.story.StoryData;
import cains.note.service.base.AbstractService;

public final class StoryService extends AbstractService
{
	@Override
	protected void initData()
	{
		StoryData.generate(this);
	}
}
