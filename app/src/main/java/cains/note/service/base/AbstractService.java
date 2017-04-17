package cains.note.service.base;

import java.util.ArrayList;
import java.util.List;

import cains.note.global.Global;

public abstract class AbstractService
{
	protected List<AbstractItemBox> _boxLst;
	
	public AbstractService()
	{
		_boxLst = new ArrayList<AbstractItemBox>();
		
		initData();
	}
	
	public void addItemBox(AbstractItemBox box)
	{
		_boxLst.add(box);
	}
	
	public List<AbstractCategory> getCategories()
	{
		List<AbstractCategory> rtn = new ArrayList<AbstractCategory>();
		for (AbstractItemBox box : _boxLst)
		{
			rtn.add(box.category);
		}
		return rtn;
	}
	
	public List<AbstractItem> getItems(String category)
	{
		AbstractItemBox box = getBoxByCategory(category);
		return box.items;
	}
	
	public AbstractItemBox getBoxByCategory(String categoryId)
	{
		for (AbstractItemBox box : _boxLst)
		{
			if (box.category.id.equals(categoryId))
			{
				return box;
			}
		}
		
		return null;
	}
	
	public int getCurrentItemIdx(List<AbstractItem> items)
	{
		int idx = 0;
		for (AbstractItem itm : items)
		{
			if (itm.id.equals(Global.id))
			{
				return idx;
			}
			idx ++;
		}
		return idx;
	}
	
	protected abstract void initData();
}
