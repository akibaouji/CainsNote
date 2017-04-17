package cains.note.service.task;

import cains.note.data.task.TaskData;
import cains.note.service.base.AbstractService;

public final class TaskService extends AbstractService
{
	@Override
	protected void initData()
	{
		TaskData.generate(this);
	}

}
