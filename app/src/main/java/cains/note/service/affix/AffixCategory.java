package cains.note.service.affix;

import cains.note.service.base.AbstractCategory;

public final class AffixCategory extends AbstractCategory
{
	public String affixType; 
	
	public AffixCategory(String id, String name, String affixType, int imgId)
	{
		super(id, name, imgId);
		this.affixType = affixType;
	}

}
