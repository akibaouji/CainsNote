package cains.note.view;

import android.widget.TextView;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.story.Story;

public class FrmStoryView extends ItemActivityBase
{
	@Override
	protected void bindItem(AbstractItem itm)
	{
		Story story = (Story)itm;
		loadImage(R.id.img_story, Global.mode + "/" + Global.category + "/" + story.id + ".jpg"); //图像
		TextView lbl = (TextView)findViewById(R.id.lbl_story_name);
		lbl.setText(story.name); //名称
		lbl = (TextView)findViewById(R.id.lbl_story_comment1);
		lbl.setText(story.comment1);  //内容
	}

	@Override
	protected void initViewSpecial()
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmstoryview;
	}

}
