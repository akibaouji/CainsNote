package cains.note.view;

import java.util.ArrayList;
import java.util.List;

import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.rune.Rune;
import cains.note.service.rune.RuneDic;

public class FrmRuneWordView extends ItemActivityBase
{
	@Override
	protected void assignViewIds()
	{
		this.quitBtnId = R.id.btn_quit;
		this.returnBtnId = R.id.btn_return;
		this.previousPageBtnId = VIEW_ID_NULL;
		this.nextPageBtnId = VIEW_ID_NULL;
	}

	protected void bindItem(AbstractItem itm)
	{
		int[] imgIds = new int[] {R.id.img_rune1, R.id.img_rune2, R.id.img_rune3, R.id.img_rune4, R.id.img_rune5, R.id.img_rune6};
		int[] singleImgIds = new int[]{R.id.img_rune_single1, R.id.img_rune_single2, R.id.img_rune_single3, R.id.img_rune_single4, R.id.img_rune_single5, R.id.img_rune_single6};
		int[] singleTextViewIds = new int[]{R.id.lbl_rune_single1, R.id.lbl_rune_single2, R.id.lbl_rune_single3, R.id.lbl_rune_single4, R.id.lbl_rune_single5, R.id.lbl_rune_single6};

		List<Rune> runes = RuneDic.getInstance().getRuneList(itm.cls);
		List<Rune> distinctRunes = new ArrayList<Rune>();
		int i = 0;
		for (Rune r : runes)
		{
			loadImage(imgIds[i++], Global.mode + "/" + r.id.toLowerCase() + ".png");
			if (!distinctRunes.contains(r))
			{
				distinctRunes.add(r);
			}
		}

		setText(R.id.lbl_rune_name, itm.name);
		setText(R.id.lbl_rune_type, itm.type);
		setText(R.id.lbl_rune_word, RuneDic.getInstance().buildWord(itm.cls));
		setText(R.id.lbl_rune_comment1, itm.comment1);
		if (!itm.comment2.equals(""))
		{
			setText(R.id.lbl_rune_comment2, "点评:\r\n" + itm.comment2);
		}

		i = 0;
		for (Rune r : distinctRunes)
		{
			loadImage(singleImgIds[i], Global.mode + "/" + r.id.toLowerCase() + ".png");
			setText(singleTextViewIds[i++], r.name + "(" + r.id + ")\r\n" + r.comment);
		}
	}

	protected void initViewSpecial()
	{
	}

	@Override
	protected void onReturnButtonClick()
	{
		navigate(FrmCategoryList.class); //符文之语没有名称列表,直接返回索引
	}

	@Override
	protected int getCurrentItemIndex()
	{
		return 0;  //符文之语没有名称列表,永远只有一项物品
	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmrwview;
	}
}

