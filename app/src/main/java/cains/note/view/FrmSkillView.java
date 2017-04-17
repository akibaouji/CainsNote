package cains.note.view;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import cains.note.service.base.ServiceFactory;
import cains.note.service.skill.*;
import cains.note.global.Constant;
import cains.note.pattern.*;

public class FrmSkillView extends ActivityBase implements OnTouchListener, OnClickListener, IObserver
{
	private int currentTreeIndex = 0;
	private SkillPanel panel;
	private Button btnSkillPoint;
	private int upMode = Constant.SKILL_UP_MODE_UP;
	private int upValue = 1;
	private SkillBuildTemplate[] templates;
	private int currentTemplateIndex = -1;

	private int[][] viewIds = new int[][]{
			{R.id.btnSkill1_1, R.id.btnSkill1_2, R.id.btnSkill1_3},
			{R.id.btnSkill6_1, R.id.btnSkill6_2, R.id.btnSkill6_3},
			{R.id.btnSkill12_1, R.id.btnSkill12_2, R.id.btnSkill12_3},
			{R.id.btnSkill18_1, R.id.btnSkill18_2, R.id.btnSkill18_3},
			{R.id.btnSkill24_1, R.id.btnSkill24_2, R.id.btnSkill24_3},
			{R.id.btnSkill30_1, R.id.btnSkill30_2, R.id.btnSkill30_3},
	};

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		//assign resource
		setContentView(R.layout.frmskillview);

		//工具栏
		setTransparentButtonBackground(R.id.btnClearPoints);
		setBackgroundResource(R.id.btnClearPoints, R.drawable.clear);
		setTransparentButtonBackground(R.id.btnSkillUpValue);
		setBackgroundResource(R.id.btnSkillUpValue, R.drawable.skillupvalue);
		setTransparentButtonBackground(R.id.btnSkillUpMode);
		setBackgroundResource(R.id.btnSkillUpMode, R.drawable.skillupmode);
		setTransparentButtonBackground(R.id.btnSkillTemplate);
		setBackgroundResource(R.id.btnSkillTemplate, R.drawable.skilltemplate);

		//bind events
		bindEvents();

		//data bind
		SkillService srv = (SkillService)ServiceFactory.getInstance().getCurrentService();
		panel = srv.getSkillPanel();
		bindSkillTabHeader();
		bindCurrentSkillTree();

		//get templates
		templates = panel.getBuildTemplates();
		currentTemplateIndex = -1;

		//data refresh
		refreshHeaderTab();
		refreshToolbar();
	}

	protected void bindEvents()
	{
		bindOnTouchEvent(new int[]{ R.id.btnSkillUpMode, R.id.btnClearPoints, R.id.btnSkillUpValue, R.id.btnSkillTemplate});

		bindClickEvent(new int[]{ R.id.btnSkillUpMode, R.id.btnSkillTab1, R.id.btnSkillTab2, R.id.btnSkillTab3,
				R.id.btnClearPoints, R.id.btnSkillUpValue, R.id.btnSkillTemplate});
	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		int id, id1, id2;
		id = v.getId();
		if (id == R.id.btnClearPoints)
		{
			id1 = R.drawable.clear;
			id2 = R.drawable.clear2;
		}
		else if (id == R.id.btnSkillUpValue)
		{
			id1 = R.drawable.skillupvalue;
			id2 = R.drawable.skillupvalue2;
		}
		else if (id == R.id.btnSkillUpMode)
		{
			id1 = R.drawable.skillupmode;
			id2 = R.drawable.skillupmode2;
		}
		else if (id == R.id.btnSkillTemplate)
		{
			id1 = R.drawable.skilltemplate;
			id2 = R.drawable.skilltemplate2;
		}
		else
		{
			return false;
		}

		if (v instanceof ImageButton)
		{
			ImageButton imgbtn = (ImageButton)v;
			if(event.getAction() == MotionEvent.ACTION_UP)
			{
				//松开
				imgbtn.setBackgroundResource(id1);
			}
			else if(event.getAction() == MotionEvent.ACTION_DOWN)
			{
				//按下
				imgbtn.setBackgroundResource(id2);
			}
		}
		else if (v instanceof Button)
		{
			Button btn = (Button)v;
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
	public void onClick(View v)
	{
		if (v.getId() == R.id.btnSkillTab1)
		{
			currentTreeIndex = 0;
		}
		else if (v.getId() == R.id.btnSkillTab2)
		{
			currentTreeIndex = 1;
		}
		else if (v.getId() == R.id.btnSkillTab3)
		{
			currentTreeIndex = 2;
		}
		else if (v.getId() == R.id.btnSkillUpValue)
		{
			if (this.upValue == 1)
			{
				this.upValue = 5;
			}
			else if (this.upValue == 5)
			{
				this.upValue = 10;
			}
			else if (this.upValue == 10)
			{
				this.upValue = 20;
			}
			else if (this.upValue == 20)
			{
				this.upValue = 1;
			}
			assignUpModeAndValue();
			refreshToolbar();
			return;
		}
		else if (v.getId() == R.id.btnSkillUpMode)
		{
			if (this.upMode == Constant.SKILL_UP_MODE_UP)
			{
				this.upMode = Constant.SKILL_UP_MODE_DOWN;
			}
			else if (this.upMode == Constant.SKILL_UP_MODE_DOWN)
			{
				this.upMode = Constant.SKILL_UP_MODE_VIEW;
			}
			else if (this.upMode == Constant.SKILL_UP_MODE_VIEW)
			{
				this.upMode = Constant.SKILL_UP_MODE_UP;
			}
			assignUpModeAndValue();
			refreshToolbar();
			return;
		}
		else if (v.getId() == R.id.btnSkillTemplate)
		{
			assignTemplate();
			refreshToolbar();
		}
		else if (v.getId() == R.id.btnClearPoints)
		{
			panel.clearAllPoints();   //clear points
			currentTemplateIndex = -1; //clear template index

			refreshSkillViewInfo(null); //clear skill information view
			refreshToolbar();
		}
		else
		{
			return;
		}

		refreshHeaderTab();
		bindCurrentSkillTree();
	}


	@Override
	public void update(Object param)
	{
		refreshHeaderTab();
		refreshSkillViewInfo((Skill)param);
	}

	private void bindSkillTabHeader()
	{
		Button btnSkillTab1 = (Button)findViewById(R.id.btnSkillTab1);
		Button btnSkillTab2 = (Button)findViewById(R.id.btnSkillTab2);
		Button btnSkillTab3 = (Button)findViewById(R.id.btnSkillTab3);
		btnSkillPoint = (Button)findViewById(R.id.btnSkillPoint);

		btnSkillTab1.setText(panel.getTreeOfIndex(0).treeName);
		btnSkillTab2.setText(panel.getTreeOfIndex(1).treeName);
		btnSkillTab3.setText(panel.getTreeOfIndex(2).treeName);
		btnSkillPoint.setText(String.valueOf(panel.getPointCountOfAllTrees()));
	}

	private void bindCurrentSkillTree()
	{
		SkillTree tree = panel.getTreeOfIndex(currentTreeIndex);
		Skill[][] matrix = tree.skillMatrix;
		CtrlSkillButton btnSkill;

		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				btnSkill = (CtrlSkillButton)findViewById(viewIds[i][j]);
				btnSkill.bind(matrix[i][j]);
				btnSkill.setUpMode(this.upMode);
				btnSkill.setUpValue(this.upValue);
				btnSkill.addObserver(this);
			}
		}
	}

	private void refreshHeaderTab()
	{
		Button tab1 = (Button)findViewById(R.id.btnSkillTab1);
		Button tab2 = (Button)findViewById(R.id.btnSkillTab2);
		Button tab3 = (Button)findViewById(R.id.btnSkillTab3);

		if (currentTreeIndex == 0)
		{
			setTextColor(tab1, R.color.green);
			setTextColor(tab2, R.color.white);
			setTextColor(tab3, R.color.white);
			setBackgroundResource(R.id.btnSkillTab1, R.drawable.skilltab);
			setBackgroundResource(R.id.btnSkillTab2, R.drawable.skilltab2);
			setBackgroundResource(R.id.btnSkillTab3, R.drawable.skilltab2);
		}
		else if (currentTreeIndex == 1)
		{
			setTextColor(tab2, R.color.green);
			setTextColor(tab1, R.color.white);
			setTextColor(tab3, R.color.white);
			setBackgroundResource(R.id.btnSkillTab1, R.drawable.skilltab3);
			setBackgroundResource(R.id.btnSkillTab2, R.drawable.skilltab);
			setBackgroundResource(R.id.btnSkillTab3, R.drawable.skilltab2);
		}
		else if (currentTreeIndex == 2)
		{
			setTextColor(tab1, R.color.white);
			setTextColor(tab2, R.color.white);
			setTextColor(tab3, R.color.green);
			setBackgroundResource(R.id.btnSkillTab1, R.drawable.skilltab3);
			setBackgroundResource(R.id.btnSkillTab2, R.drawable.skilltab2);
			setBackgroundResource(R.id.btnSkillTab3, R.drawable.skilltab);
		}

		btnSkillPoint.setText(String.valueOf(panel.getPointCountOfAllTrees()));
	}

	private void assignUpModeAndValue()
	{
		CtrlSkillButton btnSkill;

		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				btnSkill = (CtrlSkillButton)findViewById(viewIds[i][j]);
				btnSkill.setUpMode(this.upMode);    //增加/减少
				btnSkill.setUpValue(this.upValue);  //每次增加/减少的技能点
			}
		}
	}

	private void assignTemplate()
	{
		if (templates == null)
		{
			return;
		}
		else
		{
			if (templates.length == 0)
			{
				return;
			}
			else
			{
				if (currentTemplateIndex == templates.length - 1) //current is the last template
				{
					currentTemplateIndex = -1; //reset
					panel.clearAllPoints();
				}
				else
				{
					currentTemplateIndex++;
					panel.setBuildTemplate(templates[currentTemplateIndex]);
				}
				return;
			}
		}
	}

	private void refreshSkillViewInfo(Skill skill)
	{
		//技能名称
		TextView txt = (TextView)findViewById(R.id.txtSkillViewName);
		if (skill != null)
		{
			txt.setText(skill.name);
		}
		else
		{
			txt.setText("");
		}

		//技能描述
		txt = (TextView)findViewById(R.id.txtSkillViewComment);
		if (skill != null)
		{
			txt.setText(skill.comment);
			if (skill.point > 0)
			{
				setTextColor(txt, R.color.white);
			}
			else
			{
				setTextColor(txt, R.color.red);
			}
		}
		else
		{
			txt.setText("");
		}

		//先修技能
		txt = (TextView)findViewById(R.id.txtSkillViewPreSkillTitle);
		if (skill != null)
		{
			txt.setText("先修技能");
		}
		else
		{
			txt.setText("");
		}

		txt = (TextView)findViewById(R.id.txtSkillViewPreSkill);
		if (skill != null)
		{
			txt.setText(skill.getPreSkillList());
			if (skill.ifPreSkillFufilled())
			{
				setTextColor(txt, R.color.green);
			}
			else
			{
				setTextColor(txt, R.color.red);
			}
		}
		else
		{
			txt.setText("");
		}

		//技能等级
		txt = (TextView)findViewById(R.id.txtSkillViewLevel);
		if (skill != null)
		{
			txt.setText("当前技能等级: " + String.valueOf(skill.point));
		}
		else
		{
			txt.setText("");
		}

		//技能描述
		txt = (TextView)findViewById(R.id.txtSkillViewDescription);
		if (skill != null)
		{
			txt.setText(panel.getTreeOfIndex(currentTreeIndex).getSkillDescription(skill));
		}
		else
		{
			txt.setText("");
		}

		//技能加成描述
		if (skill != null)
		{
			if (skill.enhanceDescription != null)
			{
				txt = (TextView)findViewById(R.id.txtSkillViewEnhanceTitle);
				txt.setText(skill.name + " 由以下技能得到额外加成:");
				txt =  (TextView)findViewById(R.id.txtSkillViewEnhanceContent);
				txt.setText(skill.enhanceDescription);
				if (skill.point > 0)
				{
					setTextColor(txt, R.color.white);
				}
				else
				{
					setTextColor(txt, R.color.red);
				}
			}
			else
			{
				txt = (TextView)findViewById(R.id.txtSkillViewEnhanceTitle);
				txt.setText("");
				txt =  (TextView)findViewById(R.id.txtSkillViewEnhanceContent);
				txt.setText("");
			}
		}
		else
		{
			txt = (TextView)findViewById(R.id.txtSkillViewEnhanceTitle);
			txt.setText("");
			txt =  (TextView)findViewById(R.id.txtSkillViewEnhanceContent);
			txt.setText("");
		}
	}

	private void refreshToolbar()
	{
		TextView txt = (TextView)findViewById(R.id.txtClearPointsComment);
		txt.setText("清空\r\n点数");

		txt = (TextView)findViewById(R.id.txtSkillUpValueComment);
		txt.setText("步进\r\n" + String.valueOf(this.upValue) + "点");

		txt = (TextView)findViewById(R.id.txtSkillUpModeComment);
		if (this.upMode == Constant.SKILL_UP_MODE_UP)
		{
			txt.setText("加点\r\n模式");
		}
		else if (this.upMode == Constant.SKILL_UP_MODE_DOWN)
		{
			txt.setText("减点\r\n模式");
		}
		else if (this.upMode == Constant.SKILL_UP_MODE_VIEW)
		{
			txt.setText("浏览\r\n模式");
		}

		txt = (TextView)findViewById(R.id.txtSkillTemplate);
		if (currentTemplateIndex == -1)
		{
			txt.setText("自由\r\n加点");
		}
		else
		{
			String name = templates[currentTemplateIndex].name;
			txt.setText(name);
		}
	}
}
