package cains.note.service.task;

import cains.note.service.base.AbstractItem;

public final class Task extends AbstractItem
{
	/* Base Class Data Example:
	 * 
	 * catId: episode1
	 * id: a1
	 * name: 邪恶洞穴
	 * type: 任务介绍
	 * cls: 		  任务给予
	 * comment1:      任务目标
	 * comment2:      任务奖励
	 * drop: null
	 */
	public Task(String catId, String id, String name, String description, String acception,
				String target, String reward)
	{
		super(catId, id, name, description, acception, target, reward, null);
	}

}
