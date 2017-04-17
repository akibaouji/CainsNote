package cains.note.service.questitem;

import cains.note.data.questitem.QuestItemData;
import cains.note.service.base.AbstractService;

public final class QuestItemService extends AbstractService
{
	@Override
	protected void initData()
	{
		QuestItemData.generate(this);
	}

}
