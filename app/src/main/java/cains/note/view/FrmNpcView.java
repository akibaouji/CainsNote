package cains.note.view;

import android.widget.TextView;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.npc.Npc;

public class FrmNpcView extends ItemActivityBase
{
	@Override
	protected void bindItem(AbstractItem itm)
	{
		Npc npc = (Npc)itm;

		loadImage(R.id.img_npc, Global.mode + "/" + Global.category + "/" + npc.id + ".png"); //图像
		TextView lbl = (TextView)findViewById(R.id.lbl_npc_name);
		lbl.setText(npc.name); //名称
		lbl = (TextView)findViewById(R.id.lbl_npc_type);
		lbl.setText(npc.type); //类型

		loadImage(R.id.img_npc_comment1, "npc.png"); //comment1
		lbl = (TextView)findViewById(R.id.lbl_npc_comment1);
		lbl.setText(npc.comment1);

		loadImage(R.id.img_npc_comment2, "trade.png"); //comment2
		lbl = (TextView)findViewById(R.id.lbl_npc_comment2);
		lbl.setText(npc.comment2);

		loadImage(R.id.img_npc_cls, "selfintro.png"); //自我介绍
		lbl = (TextView)findViewById(R.id.lbl_npc_cls);
		lbl.setText(npc.cls);

	}

	@Override
	protected void initViewSpecial()
	{
	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmnpcview;
	}

}
