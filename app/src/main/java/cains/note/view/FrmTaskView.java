package cains.note.view;

import android.widget.TextView;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.task.Task;

public class FrmTaskView extends ItemActivityBase
{
	@Override
	protected void bindItem(AbstractItem itm)
	{
		Task task = (Task)itm;
		loadImage(R.id.img_task, Global.mode + "/" + Global.category + "/" + task.id + ".png"); //图像
		TextView lbl = (TextView)findViewById(R.id.lbl_task_name);
		lbl.setText(task.name); //名称
		lbl = (TextView)findViewById(R.id.lbl_task_type);
		lbl.setText(task.type); //任务介绍
		lbl = (TextView)findViewById(R.id.lbl_task_cls);
		lbl.setText(task.cls);  //任务给予
		lbl = (TextView)findViewById(R.id.lbl_task_comment1);
		lbl.setText(task.comment1);  //任务目标
		lbl = (TextView)findViewById(R.id.lbl_task_comment2);
		lbl.setText(task.comment2);  //任务奖励
	}

	@Override
	protected void initViewSpecial()
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmtaskview;
	}

}
