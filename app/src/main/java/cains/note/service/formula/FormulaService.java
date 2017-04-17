package cains.note.service.formula;

import cains.note.data.formula.FormulaData;
import cains.note.service.base.AbstractService;

public class FormulaService extends AbstractService
{
	@Override
	protected void initData()
	{
		FormulaData.generate(this);
	}

}
