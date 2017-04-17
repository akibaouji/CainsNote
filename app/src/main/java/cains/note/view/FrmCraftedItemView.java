package cains.note.view;

import android.widget.ImageView;
import android.widget.TextView;
import cains.note.service.base.AbstractItem;
import cains.note.service.crafted.*;

public class FrmCraftedItemView extends ItemActivityBase
{
	private int[] imgId = new int[]{R.id.imgCrafted1,R.id.imgCrafted2,R.id.imgCrafted3,R.id.imgCrafted4};
	
	@Override
	protected void bindItem(AbstractItem itm)
	{
		CraftedItem citm = (CraftedItem)itm;
		TextView txt = (TextView)findViewById(R.id.txtCraftedName);
		txt.setText(citm.name);
		
		txt = (TextView)findViewById(R.id.txtCraftedType);
		txt.setText(citm.type);
		
		txt = (TextView)findViewById(R.id.txtCraftedCls);
		txt.setText(citm.cls);
		
		txt = (TextView)findViewById(R.id.txtCraftedComment1);
		txt.setText(citm.comment1);
		
		ImageView img;
		for (int i = 0; i<citm.imgId.length; i++)
		{
			img = (ImageView)findViewById(imgId[i]);
			img.setImageResource(citm.imgId[i]);
		}
		
	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmcraftedview;
	}

	@Override
	protected void initViewSpecial()
	{
	}

}
