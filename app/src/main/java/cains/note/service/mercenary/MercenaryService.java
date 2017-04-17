package cains.note.service.mercenary;

import cains.note.data.mercenary.MercenaryData;
import cains.note.service.base.AbstractService;

public final class MercenaryService extends AbstractService
{
	@Override
	protected void initData()
	{
		MercenaryData.generate(this);
	}

}
