package cains.note.data.task;

import cains.note.service.task.*;
import cains.note.view.R;

public final class TaskData
{
	private TaskData()
	{
	}

	public static void generate(TaskService srv)
	{
		TaskBox box = new TaskBox();
		box.category = new TaskCategory("episode1", "第一幕\r\n修女的悲恸", R.drawable.episode1);
		box.items.add(new Task(box.category.id, Rsc.RES_TA1_1, Rsc.RES_TA1_2, Rsc.RES_TA1_3, Rsc.RES_TA1_4, Rsc.RES_TA1_5, Rsc.RES_TA1_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TA2_1, Rsc.RES_TA2_2, Rsc.RES_TA2_3, Rsc.RES_TA2_4, Rsc.RES_TA2_5, Rsc.RES_TA2_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TA3_1, Rsc.RES_TA3_2, Rsc.RES_TA3_3, Rsc.RES_TA3_4, Rsc.RES_TA3_5, Rsc.RES_TA3_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TA4_1, Rsc.RES_TA4_2, Rsc.RES_TA4_3, Rsc.RES_TA4_4, Rsc.RES_TA4_5, Rsc.RES_TA4_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TA5_1, Rsc.RES_TA5_2, Rsc.RES_TA5_3, Rsc.RES_TA5_4, Rsc.RES_TA5_5, Rsc.RES_TA5_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TA6_1, Rsc.RES_TA6_2, Rsc.RES_TA6_3, Rsc.RES_TA6_4, Rsc.RES_TA6_5, Rsc.RES_TA6_6));
		srv.addItemBox(box);

		box = new TaskBox();
		box.category = new TaskCategory("episode2", "第二幕\r\n沙漠的旅程", R.drawable.episode2);
		box.items.add(new Task(box.category.id, Rsc.RES_TB1_1, Rsc.RES_TB1_2, Rsc.RES_TB1_3, Rsc.RES_TB1_4, Rsc.RES_TB1_5, Rsc.RES_TB1_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TB2_1, Rsc.RES_TB2_2, Rsc.RES_TB2_3, Rsc.RES_TB2_4, Rsc.RES_TB2_5, Rsc.RES_TB2_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TB3_1, Rsc.RES_TB3_2, Rsc.RES_TB3_3, Rsc.RES_TB3_4, Rsc.RES_TB3_5, Rsc.RES_TB3_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TB4_1, Rsc.RES_TB4_2, Rsc.RES_TB4_3, Rsc.RES_TB4_4, Rsc.RES_TB4_5, Rsc.RES_TB4_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TB5_1, Rsc.RES_TB5_2, Rsc.RES_TB5_3, Rsc.RES_TB5_4, Rsc.RES_TB5_5, Rsc.RES_TB5_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TB6_1, Rsc.RES_TB6_2, Rsc.RES_TB6_3, Rsc.RES_TB6_4, Rsc.RES_TB6_5, Rsc.RES_TB6_6));
		srv.addItemBox(box);

		box = new TaskBox();
		box.category = new TaskCategory("episode3", "第三幕\r\n墨菲斯托的丛林", R.drawable.episode3);
		box.items.add(new Task(box.category.id, Rsc.RES_TC1_1, Rsc.RES_TC1_2, Rsc.RES_TC1_3, Rsc.RES_TC1_4, Rsc.RES_TC1_5, Rsc.RES_TC1_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TC2_1, Rsc.RES_TC2_2, Rsc.RES_TC2_3, Rsc.RES_TC2_4, Rsc.RES_TC2_5, Rsc.RES_TC2_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TC3_1, Rsc.RES_TC3_2, Rsc.RES_TC3_3, Rsc.RES_TC3_4, Rsc.RES_TC3_5, Rsc.RES_TC3_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TC4_1, Rsc.RES_TC4_2, Rsc.RES_TC4_3, Rsc.RES_TC4_4, Rsc.RES_TC4_5, Rsc.RES_TC4_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TC5_1, Rsc.RES_TC5_2, Rsc.RES_TC5_3, Rsc.RES_TC5_4, Rsc.RES_TC5_5, Rsc.RES_TC5_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TC5_1, Rsc.RES_TC6_2, Rsc.RES_TC6_3, Rsc.RES_TC6_4, Rsc.RES_TC6_5, Rsc.RES_TC6_6));
		srv.addItemBox(box);

		box = new TaskBox();
		box.category = new TaskCategory("episode4", "第四幕\r\n进入地狱", R.drawable.episode4);
		box.items.add(new Task(box.category.id, Rsc.RES_TD1_1, Rsc.RES_TD1_2, Rsc.RES_TD1_3, Rsc.RES_TD1_4, Rsc.RES_TD1_5, Rsc.RES_TD1_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TD2_1, Rsc.RES_TD2_2, Rsc.RES_TD2_3, Rsc.RES_TD2_4, Rsc.RES_TD2_5, Rsc.RES_TD2_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TD3_1, Rsc.RES_TD3_2, Rsc.RES_TD3_3, Rsc.RES_TD3_4, Rsc.RES_TD3_5, Rsc.RES_TD3_6));
		srv.addItemBox(box);

		box = new TaskBox();
		box.category = new TaskCategory("episode5", "第五幕\r\n寻找巴尔", R.drawable.episode5);
		box.items.add(new Task(box.category.id, Rsc.RES_TE1_1, Rsc.RES_TE1_2, Rsc.RES_TE1_3, Rsc.RES_TE1_4, Rsc.RES_TE1_5, Rsc.RES_TE1_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TE2_1, Rsc.RES_TE2_2, Rsc.RES_TE2_3, Rsc.RES_TE2_4, Rsc.RES_TE2_5, Rsc.RES_TE2_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TE3_1, Rsc.RES_TE3_2, Rsc.RES_TE3_3, Rsc.RES_TE3_4, Rsc.RES_TE3_5, Rsc.RES_TE3_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TE4_1, Rsc.RES_TE4_2, Rsc.RES_TE4_3, Rsc.RES_TE4_4, Rsc.RES_TE4_5, Rsc.RES_TE4_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TE5_1, Rsc.RES_TE5_2, Rsc.RES_TE5_3, Rsc.RES_TE5_4, Rsc.RES_TE5_5, Rsc.RES_TE5_6));
		box.items.add(new Task(box.category.id, Rsc.RES_TE6_1, Rsc.RES_TE6_2, Rsc.RES_TE6_3, Rsc.RES_TE6_4, Rsc.RES_TE6_5, Rsc.RES_TE6_6));
		srv.addItemBox(box);

	}
}
