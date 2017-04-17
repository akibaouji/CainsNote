package cains.note.view;

import android.widget.TextView;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.questitem.QuestItem;

public class FrmQuestItemView extends ItemActivityBase
{
	@Override
	protected void bindItem(AbstractItem itm)
	{
		QuestItem questItm = (QuestItem)itm;
		loadImage(R.id.img_questitem, Global.mode + "/" + Global.category + "/" + itm.id + ".png");
		TextView lbl = (TextView)findViewById(R.id.lbl_questitem_name);
		lbl.setText(" " + questItm.name);
		lbl = (TextView)findViewById(R.id.lbl_questitem_type);
		lbl.setText(questItm.type);
		lbl = (TextView)findViewById(R.id.lbl_questitem_cls);
		lbl.setText(questItm.cls);
		lbl = (TextView)findViewById(R.id.lbl_questitem_comment1);
		lbl.setText(questItm.comment1);
		lbl = (TextView)findViewById(R.id.lbl_questitem_comment2);
		lbl.setText(questItm.comment2);
	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmquestitemview;
	}

	@Override
	protected void initViewSpecial()
	{
		// TODO Auto-generated method stub
		
	}

}
