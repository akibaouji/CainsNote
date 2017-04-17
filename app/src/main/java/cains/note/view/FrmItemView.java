package cains.note.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.widget.TextView;

import cains.note.view.R;
import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.base.*;
import cains.note.service.green.GreenItem;
import cains.note.service.green.GreenItemCategory;

public class FrmItemView extends ItemActivityBase
{
    @Override
    protected void initViewSpecial()
    {
        //设置名称栏的字体颜色,金或者绿
        TextView lblGoldName = (TextView)findViewById(R.id.lbl_gold_name);
        Resources resource = (Resources) getBaseContext().getResources();
        ColorStateList csl = null;
        if (Global.mode.equals(Constant.GOLD_MODE))
        {
            csl = (ColorStateList) resource.getColorStateList(R.color.gold);
        }
        else if (Global.mode.equals(Constant.GREEN_MODE))
        {
            csl = (ColorStateList) resource.getColorStateList(R.color.green);
        }
        if (csl != null)
        {
            lblGoldName.setTextColor(csl);
        }

        loadImage(R.id.img_gold_monster, "monster.png");

        TextView lbl = (TextView)findViewById(R.id.lbl_gold_monster);
        lbl.setText("以下怪物是/否可以得到");

    }

    @Override
    protected void bindItem(AbstractItem itm)
    {
        loadImage(R.id.img_gold_item, Global.mode + "/" + Global.category + "/" + itm.id + ".png");

        TextView lbl = (TextView)findViewById(R.id.lbl_gold_name);
        lbl.setText(itm.name);

        lbl = (TextView)findViewById(R.id.lbl_gold_type);
        lbl.setText(itm.type);

        lbl = (TextView)findViewById(R.id.lbl_gold_cls);
        lbl.setText(itm.cls);

        lbl = (TextView)findViewById(R.id.lbl_gold_comment1);
        lbl.setText(itm.comment1);

        lbl = (TextView)findViewById(R.id.lbl_gold_comment2);
        lbl.setText(itm.comment2);

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_m1);
        lbl.setText(( (byte)(itm.drop[0]&0x40) == 0x40 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_m2);
        lbl.setText(( (byte)(itm.drop[0]&0x20) == 0x20 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_m3);
        lbl.setText(( (byte)(itm.drop[0]&0x10) == 0x10 ? "是":"否"));

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_d1);
        lbl.setText(( (byte)(itm.drop[0]&0x04) == 0x04 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_d2);
        lbl.setText(( (byte)(itm.drop[0]&0x02) == 0x02 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_d3);
        lbl.setText(( (byte)(itm.drop[0]&0x01) == 0x01 ? "是":"否"));

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_p1);
        lbl.setText(( (byte)(itm.drop[1]&0x40) == 0x40 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_p2);
        lbl.setText(( (byte)(itm.drop[1]&0x20) == 0x20 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_p3);
        lbl.setText(( (byte)(itm.drop[1]&0x10) == 0x10 ? "是":"否"));

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_l1);
        lbl.setText(( (byte)(itm.drop[1]&0x04) == 0x04 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_l2);
        lbl.setText(( (byte)(itm.drop[1]&0x02) == 0x02 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_l3);
        lbl.setText(( (byte)(itm.drop[1]&0x01) == 0x01 ? "是":"否"));

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_b1);
        lbl.setText(( (byte)(itm.drop[2]&0x40) == 0x40 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_b2);
        lbl.setText(( (byte)(itm.drop[2]&0x20) == 0x20 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_b3);
        lbl.setText(( (byte)(itm.drop[2]&0x10) == 0x10 ? "是":"否"));

        lbl = (TextView)findViewById(R.id.lbl_gold_monster_h1);
        lbl.setText(( (byte)(itm.drop[2]&0x04) == 0x04 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_h2);
        lbl.setText(( (byte)(itm.drop[2]&0x02) == 0x02 ? "是":"否"));
        lbl = (TextView)findViewById(R.id.lbl_gold_monster_h3);
        lbl.setText(( (byte)(itm.drop[2]&0x01) == 0x01 ? "是":"否"));

        //该装备在套装中的说明
        if (itm instanceof GreenItem)
        {
            GreenItem gItm = (GreenItem)itm;
            lbl = (TextView)findViewById(R.id.lbl_green_setComment);
            lbl.setText(gItm.setComment);
        }

        //套装整体说明
        if (category instanceof GreenItemCategory)
        {
            GreenItemCategory cat = (GreenItemCategory)category;
            lbl = (TextView)findViewById(R.id.lbl_green_comment);
            lbl.setText(cat.comment);
        }
    }

    @Override
    protected void initLayoutId()
    {
        this.frmId = R.layout.frmitemview;
    }


}
