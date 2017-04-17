package cains.note.view;

import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import cains.note.global.Constant;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.ServiceMediator;
import cains.note.service.mercenary.Mercenary;
import cains.note.service.skill.Skill;

public class FrmMercenaryView extends ItemActivityBase
{
	private int[] skillBarId = new int[]{R.id.barSkill1,R.id.barSkill2,R.id.barSkill3,R.id.barSkill4,
			R.id.barSkill5,R.id.barSkill6,R.id.barSkill7};
	private int[] imgId = new int[]{R.id.imgItem1, R.id.imgItem2, R.id.imgItem3, R.id.imgItem4, R.id.imgItem5};

	@Override
	protected void bindItem(AbstractItem itm)
	{
		Mercenary mer = (Mercenary)itm;
		//角色名称
		TextView txt = (TextView)findViewById(R.id.txtName);
		txt.setText(mer.name);
		//角色图片
		loadImage(R.id.imgMercenary, "mercenary/" + mer.id + ".png");
		//介绍
		txt = (TextView)findViewById(R.id.txtType);
		txt.setText(mer.type);
		//属性
		txt = (TextView)findViewById(R.id.txtStrength);
		txt.setText(String.valueOf(mer.upPoints[0]));
		txt = (TextView)findViewById(R.id.txtDexity);
		txt.setText(String.valueOf(mer.upPoints[1]));
		txt = (TextView)findViewById(R.id.txtDefence);
		txt.setText(String.valueOf(mer.upPoints[2]));
		txt = (TextView)findViewById(R.id.txtLife);
		txt.setText(String.valueOf(mer.upPoints[3]));
		txt = (TextView)findViewById(R.id.txtResistance);
		txt.setText(String.valueOf(mer.upPoints[4]));
		//备注
		txt = (TextView)findViewById(R.id.txtComment);
		txt.setText(String.valueOf(mer.comment1));

		//可装备物品
		for (int i = 0; i<mer.items.length; i++)
		{
			ImageView img = (ImageView)findViewById(imgId[i]);
			img.setImageResource(mer.items[i]);
		}

		//技能
		txt = (TextView)findViewById(R.id.txtCls);
		txt.setText(String.valueOf(mer.cls));
		int i;
		for (i = 0; i<mer.skillIds.length; i++)
		{
			Skill skill = (Skill)ServiceMediator.getInstance().getData(Constant.DATA_TYPE_SKILL, mer.skillIds[i], null);
			if (skill != null)
			{
				CtrlSkillBar ctrl = (CtrlSkillBar)findViewById(skillBarId[i]);
				ctrl.bind(skill);
			}
		}
		for (int j = i; j < skillBarId.length; j++)
		{
			CtrlSkillBar ctrl = (CtrlSkillBar)findViewById(skillBarId[j]);
			LayoutParams params = ctrl.getLayoutParams();
			params.height = 0;
			ctrl.setLayoutParams(params);
			ctrl.requestLayout();
		}
	}

	@Override
	protected void initLayoutId()
	{
		this.frmId = R.layout.frmmercenaryview;
	}

	@Override
	protected void initViewSpecial()
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected int getCurrentItemIndex()
	{
		return 0;  //没有名称列表,永远只有一项物品
	}

	@Override
	protected void onReturnButtonClick()
	{
		navigate(FrmCategoryList.class); //没有名称列表,直接返回索引
	}

	@Override
	protected void assignViewIds()
	{
		this.quitBtnId = R.id.btn_quit;
		this.returnBtnId = R.id.btn_return;
		this.previousPageBtnId = VIEW_ID_NULL;
		this.nextPageBtnId = VIEW_ID_NULL;
	}
}
