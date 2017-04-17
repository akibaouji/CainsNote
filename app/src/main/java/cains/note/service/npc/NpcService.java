package cains.note.service.npc;

import cains.note.data.npc.NpcData;
import cains.note.service.base.AbstractService;

public final class NpcService extends AbstractService
{
	@Override
	protected void initData()
	{
		NpcData.generate(this);
	}

}
