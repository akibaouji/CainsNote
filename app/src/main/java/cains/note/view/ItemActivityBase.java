package cains.note.view;

import java.util.List;

import cains.note.global.Global;
import cains.note.service.base.AbstractCategory;
import cains.note.service.base.AbstractItem;
import cains.note.service.base.AbstractService;
import cains.note.service.base.ServiceFactory;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageButton;
import android.widget.ScrollView;

public abstract class ItemActivityBase extends ActivityBase  implements OnTouchListener, OnClickListener
{
	protected int frmId = VIEW_ID_NULL;
	protected int previousPageBtnId = VIEW_ID_NULL;
	protected int nextPageBtnId = VIEW_ID_NULL;
	protected int quitBtnId = VIEW_ID_NULL;
	protected int returnBtnId = VIEW_ID_NULL;

	protected List<AbstractItem> items;
	protected AbstractCategory category;
	protected AbstractService srv;
	protected int currentIdx = 0;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		initLayoutId();
		assignViewIds();

		setContentView(frmId);

		//prepare the item view context
		srv = ServiceFactory.getInstance().getCurrentService();
		category = srv.getBoxByCategory(Global.category).category;
		items = srv.getItems(Global.category);
		currentIdx = getCurrentItemIndex();

		initView();

		bindEvents();

	}

	@Override
	public boolean onTouch(View v, MotionEvent event)
	{
		try
		{
			int id1;
			int id2;

			int id = v.getId();
			if (id == returnBtnId)
			{
				id1 = R.drawable.buttonreturn;
				id2 = R.drawable.buttonreturn2;
			}
			else if (id == quitBtnId)
			{
				id1 = R.drawable.buttonquit;
				id2 = R.drawable.buttonquit2;
			}
			else if (id == previousPageBtnId)
			{
				id1 = R.drawable.buttonprepage;
				id2 = R.drawable.buttonprepage2;
			}
			else if (id == nextPageBtnId)
			{
				id1 = R.drawable.buttonnextpage;
				id2 = R.drawable.buttonnextpage2;
			}
			else
			{
				return onCtrlTouch(v, event);
			}

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

			return false;
		}
		catch (Exception ex)
		{
			return false;
		}
	}

	@Override
	public void onClick(View v)
	{
		try
		{
			if (v.getId() == returnBtnId)
			{
				onReturnButtonClick();
			}
			else if (v.getId() == quitBtnId)
			{
				navigate(FrmMain.class);
			}
			else if (v.getId() == previousPageBtnId)
			{
				movePreviousItem();
			}
			else if (v.getId() == nextPageBtnId)
			{
				moveNextItem();
			}
			else
			{
				onCtrlClick(v);
			}
		}
		catch (Exception ex)
		{
			return;
		}
	}

	protected void onCtrlClick(View v)
	{
	}

	protected boolean onCtrlTouch(View v, MotionEvent event)
	{
		return false;
	}

	protected void bindEvents()
	{
		bindOnTouchEvent(new int[]{ returnBtnId, quitBtnId, previousPageBtnId, nextPageBtnId });
		bindClickEvent(new int[]{ returnBtnId, quitBtnId, previousPageBtnId, nextPageBtnId });
	}

	protected void refreshFooter()
	{
		ImageButton btnPrepage = (ImageButton)findViewById(previousPageBtnId);
		ImageButton btnNextpage = (ImageButton)findViewById(nextPageBtnId);
		if (this.currentIdx == 0)  //first
		{
			btnPrepage.setEnabled(false);
		}
		else
		{
			btnPrepage.setEnabled(true);
		}

		if (this.currentIdx == this.items.size()-1) //last
		{
			btnNextpage.setEnabled(false);
		}
		else
		{
			btnNextpage.setEnabled(true);
		}
	}

	//显示当前的项目详细信息
	protected abstract void bindItem(AbstractItem itm);

	//用来根据不同模式设置字体颜色等
	protected abstract void initViewSpecial();

	//设置Layout资源ID
	protected abstract void initLayoutId();

	protected void assignViewIds()
	{
		this.previousPageBtnId = R.id.btn_prepage;
		this.nextPageBtnId = R.id.btn_nextpage;
		this.quitBtnId = R.id.btn_quit;
		this.returnBtnId = R.id.btn_return;
	}

	protected void movePreviousItem()
	{
		currentIdx --;
		AbstractItem itm = items.get(currentIdx);
		Global.id  = itm.id; //set global item id

		initScrollPosition();

		bindItem(itm);

		refreshFooter();
	}

	protected void moveNextItem()
	{
		currentIdx ++;
		AbstractItem itm = items.get(currentIdx);
		Global.id  = itm.id; //set global item id

		initScrollPosition();

		bindItem(itm);

		refreshFooter();
	}

	protected void initScrollPosition()
	{
		ScrollView v = (ScrollView)findViewById(R.id.pnlScroll);
		if (v != null)
		{
			v.scrollTo(0, 0);
		}
	}

	/**
	 * 返回列表按钮按下
	 */
	protected void onReturnButtonClick()
	{
		navigate(FrmNameList.class);
	}

	/**
	 * 获取当前物品的索引
	 *
	 * @return
	 */
	protected int getCurrentItemIndex()
	{
		return srv.getCurrentItemIdx(items); //通过当前服务,返回当前物品索引
	}

	@Override
	protected final void initView()
	{
		this.initViewSpecial();

		if (returnBtnId != VIEW_ID_NULL)
		{
			setTransparentButtonBackground(returnBtnId);
			setBackgroundResource(returnBtnId, R.drawable.buttonreturn);
		}

		if (quitBtnId != VIEW_ID_NULL)
		{
			setTransparentButtonBackground(quitBtnId);
			setBackgroundResource(quitBtnId, R.drawable.buttonquit);
		}

		if (previousPageBtnId != VIEW_ID_NULL)
		{
			setTransparentButtonBackground(previousPageBtnId);
			setBackgroundResource(previousPageBtnId, R.drawable.buttonprepage);
		}

		if (nextPageBtnId != VIEW_ID_NULL)
		{
			setTransparentButtonBackground(nextPageBtnId);
			setBackgroundResource(nextPageBtnId, R.drawable.buttonnextpage);
		}

		AbstractItem itm = items.get(currentIdx);
		this.bindItem(itm);

		if ((previousPageBtnId != VIEW_ID_NULL) && (nextPageBtnId != VIEW_ID_NULL))
		{
			refreshFooter();
		}
	}

}
