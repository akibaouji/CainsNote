package cains.note.service.affix;

import cains.note.data.affix.AffixData;
import cains.note.service.base.AbstractService;

public final class AffixService extends AbstractService
{
	@Override
	protected void initData()
	{
		AffixData.generate(this);
	}

}
