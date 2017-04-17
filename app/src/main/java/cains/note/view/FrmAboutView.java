package cains.note.view;

import android.widget.TextView;

public class FrmAboutView extends SimpleActivityBase
{
	@Override
	protected void assignViewIds()
	{
		this.frmId = R.layout.frmaboutview;
		this.quitBtnId = R.id.btnAboutRtn;
	}

	@Override
	protected void showContent()
	{
		loadImage(R.id.img_about_logo, "icon.png");
		TextView lbl = (TextView)findViewById(R.id.lbl_about_title);
        lbl.setText(" " + getResources().getString(R.string.app_name)
        		+ "\r\n " +  getResources().getString(R.string.app_version));
        
        loadImage(R.id.img_about_developer, "hade.png");
	}

	@Override
	protected void initViewSpecial()
	{
	}

}
