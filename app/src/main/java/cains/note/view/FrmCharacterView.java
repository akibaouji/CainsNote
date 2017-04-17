package cains.note.view;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.ServiceFactory;
import cains.note.service.base.ServiceMediator;
import cains.note.service.character.Character;
import cains.note.service.skill.*;
import cains.note.utility.StringUtility;

public class FrmCharacterView extends ItemActivityBase
{
	private int[] barTitleId = new int[]{
			R.id.txtCharacterSkillBar1,
			R.id.txtCharacterSkillBar2,
			R.id.txtCharacterSkillBar3
	};

	private int[][] barId = new int[][]{
			{R.id.barCharacterSkill1_1,R.id.barCharacterSkill1_2,R.id.barCharacterSkill1_3,R.id.barCharacterSkill1_4,R.id.barCharacterSkill1_5,R.id.barCharacterSkill1_6,R.id.barCharacterSkill1_7,R.id.barCharacterSkill1_8,R.id.barCharacterSkill1_9,R.id.barCharacterSkill1_10},
			{R.id.barCharacterSkill2_1,R.id.barCharacterSkill2_2,R.id.barCharacterSkill2_3,R.id.barCharacterSkill2_4,R.id.barCharacterSkill2_5,R.id.barCharacterSkill2_6,R.id.barCharacterSkill2_7,R.id.barCharacterSkill2_8,R.id.barCharacterSkill2_9,R.id.barCharacterSkill2_10},
			{R.id.barCharacterSkill3_1,R.id.barCharacterSkill3_2,R.id.barCharacterSkill3_3,R.id.barCharacterSkill3_4,R.id.barCharacterSkill3_5,R.id.barCharacterSkill3_6,R.id.barCharacterSkill3_7,R.id.barCharacterSkill3_8,R.id.barCharacterSkill3_9,R.id.barCharacterSkill3_10}
	};


	@Override
	protected void bindItem(AbstractItem itm)
	{
		Character chr = (Character)itm;
		//角色名称
		TextView txt = (TextView)findViewById(R.id.txtCharacterName);
		txt.setText(chr.name);
		//角色图片
		loadImage(R.id.imgCharacter, "character/" + itm.id + ".jpg");
		//角色介绍
		txt = (TextView)findViewById(R.id.txtCharacterCls);
		txt.setText(chr.cls);
		//历史背景
		txt = (TextView)findViewById(R.id.txtCharacterComment1);
		txt.setText(chr.comment1);
		//特点和能力
		txt = (TextView)findViewById(R.id.txtCharacterComment2);
		txt.setText(chr.comment2);

		//基本属性
		txt = (TextView)findViewById(R.id.txtCharacterInitStrength); //力量
		txt.setText(String.valueOf(chr.initProperty[0]));
		txt = (TextView)findViewById(R.id.txtCharacterInitDexity); //敏捷
		txt.setText(String.valueOf(chr.initProperty[1]));
		txt = (TextView)findViewById(R.id.txtCharacterInitVitality); //体力
		txt.setText(String.valueOf(chr.initProperty[2]));
		txt = (TextView)findViewById(R.id.txtCharacterInitMana); //精力
		txt.setText(String.valueOf(chr.initProperty[3]));

		//初始属性
		txt = (TextView)findViewById(R.id.txtCharacterInitLife); //力量
		txt.setText(String.valueOf(chr.initProperty2[0][0]));
		txt = (TextView)findViewById(R.id.txtCharacterLifePerLev);
		txt.setText(String.valueOf(chr.initProperty2[0][1]));

		txt = (TextView)findViewById(R.id.txtCharacterInitStamina); //耐力
		txt.setText(String.valueOf(chr.initProperty2[1][0]));
		txt = (TextView)findViewById(R.id.txtCharacterStaminaPerLev);
		txt.setText(String.valueOf(chr.initProperty2[1][1]));

		txt = (TextView)findViewById(R.id.txtCharacterInitMana2); //法力
		txt.setText(String.valueOf(chr.initProperty2[2][0]));
		txt = (TextView)findViewById(R.id.txtCharacterManaPerLev);
		txt.setText(String.valueOf(chr.initProperty2[2][1]));

		//属性点数效果
		String s = "1 体力 = %1$s 生命\r\n1 体力 = %2$s 耐力\r\n1 精力 = %3$s 法力 ";
		txt = (TextView)findViewById(R.id.txtCharacterPropertyEffect);
		txt.setText(String.format(s, String.valueOf(chr.propertyEffect[0]),
				String.valueOf(chr.propertyEffect[1]),
				String.valueOf(chr.propertyEffect[2])));

		//角色技能
		txt = (TextView)findViewById(R.id.txtCharacterSkillBarTitle);
		txt.setText(chr.name + "技能");

		//通过中介者获取技能树面板
		SkillPanel panel = (SkillPanel)ServiceMediator.getInstance().getData(Constant.DATA_TYPE_SKILLPANEL, Global.id, null);

		bindSkillTree(panel, 0);
		bindSkillTree(panel, 1);
		bindSkillTree(panel, 2);
	}

	@Override
	protected void initViewSpecial()
	{
		setTransparentButtonBackground(R.id.btnSkillSimulator);
		setBackgroundResource(R.id.btnSkillSimulator, R.drawable.skillsimulator);

		bindOnTouchEvent(new int[]{R.id.btnSkillSimulator});
		bindClickEvent(new int[]{R.id.btnSkillSimulator});
	}

	@Override
	protected void onReturnButtonClick()
	{
		navigate(FrmCharacterList.class); //返回角色列表
	}

	@Override
	protected boolean onCtrlTouch(View v, MotionEvent event)
	{
		if (v.getId() == R.id.btnSkillSimulator)
		{
			int id1 = R.drawable.skillsimulator;
			int id2 = R.drawable.skillsimulator2;

			ImageButton btn = (ImageButton)findViewById(v.getId());
			if(event.getAction() == MotionEvent.ACTION_UP)
			{
				//松开
				btn.setBackgroundResource(id1);
			}
			else if(event.getAction() == MotionEvent.ACTION_DOWN)
			{
				//按下
				btn.setBackgroundResource(id2);
			}
		}
		return false;
	}

	@Override
	protected void onCtrlClick(View v)
	{
		if (v.getId() == R.id.btnSkillSimulator)
		{
			Global.mode = Constant.SKILL_MODE;
			navigate(FrmSkillView.class);
		}
	}

	private void bindSkillTree(SkillPanel panel , int treeIndex)
	{
		SkillTree tree = panel.getTreeOfIndex(treeIndex);
		TextView txt = (TextView)findViewById(barTitleId[treeIndex]);
		txt.setText(StringUtility.replaceBlank(tree.treeName));

		Skill s;
		CtrlSkillBar bar;
		int barIndex = 0;
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				s = tree.getSkill(i, j);
				if (s != null)
				{
					bar = (CtrlSkillBar)findViewById(barId[treeIndex][barIndex]);
					bar.bind(s);
					barIndex++;
				}
			}
		}
	}

	@Override
	protected void initLayoutId()
	{
		Global.mode = Constant.CHAR_MODE; //to avoid the mode change when skipping from skill emulator

		this.frmId = R.layout.frmcharacterview;
	}

}
