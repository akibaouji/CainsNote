package cains.note.service.crafted;

import cains.note.data.crafted.CraftedItemData;
import cains.note.service.base.AbstractService;

public class CraftedItemService extends AbstractService
{
	@Override
	protected void initData()
	{
		CraftedItemData.generate(this);
	}

}
