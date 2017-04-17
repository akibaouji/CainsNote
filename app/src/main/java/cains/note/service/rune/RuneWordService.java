package cains.note.service.rune;

import cains.note.data.rune.RuneWordData;
import cains.note.service.base.AbstractService;

public final class RuneWordService extends AbstractService
{

	@Override
	protected void initData()
	{
		RuneDic.getInstance();
		RuneWordData.generate(this);
	}

}
