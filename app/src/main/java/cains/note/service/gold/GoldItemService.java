package cains.note.service.gold;

import cains.note.data.gold.*;
import cains.note.service.base.*;

public final class GoldItemService extends AbstractService
{
	@Override
	protected void initData()
	{
		GoldData1.generate(this);
		GoldData2.generate(this);
		GoldData3.generate(this);
		GoldData4.generate(this);
	}
}
