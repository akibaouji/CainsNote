package cains.note.service.green;

import cains.note.data.green.*;

import cains.note.service.base.*;

public final class GreenItemService extends AbstractService
{
	@Override
	protected void initData()
	{
		GreenData1.generate(this);
	}
	
}
