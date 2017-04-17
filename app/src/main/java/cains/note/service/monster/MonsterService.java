package cains.note.service.monster;

import cains.note.data.monster.MonsterData;
import cains.note.service.base.AbstractService;

public final class MonsterService extends AbstractService
{
	@Override
	protected void initData()
	{
		MonsterData.generate(this);
	}

}
