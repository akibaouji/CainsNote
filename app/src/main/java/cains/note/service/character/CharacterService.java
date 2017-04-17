package cains.note.service.character;

import cains.note.data.character.CharacterData;
import cains.note.service.base.AbstractService;

public final class CharacterService extends AbstractService
{
	@Override
	protected void initData()
	{
		CharacterData.generate(this);
	}
}
