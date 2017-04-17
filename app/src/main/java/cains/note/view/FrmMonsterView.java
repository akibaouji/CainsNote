package cains.note.view;

import android.widget.TextView;
import cains.note.global.Constant;
import cains.note.global.Global;
import cains.note.service.base.AbstractItem;
import cains.note.service.monster.*;
import cains.note.service.rune.RuneDic;


public class FrmMonsterView extends ItemActivityBase
{
    protected void bindItem(AbstractItem itm)
    {
        RuneDic dic = RuneDic.getInstance();

        Monster m = (Monster)itm;
        GifView v = (GifView)findViewById(R.id.img_monster);
        if (Global.drawpattern == Constant.IMG_PATTERN_GIF)
        {
            v.setMode(Constant.IMG_PATTERN_GIF);
            loadGif(R.id.img_monster, Global.mode + "/" + Global.category + "/" + m.id + ".gif"); //GIF图像
        }
        else
        {
            v.setMode(Constant.IMG_PATTERN_PNG);
            loadImage(R.id.img_monster, Global.mode + "/" + Global.category + "/" + m.id + ".png"); //PNG图像
        }
        TextView lbl = (TextView)findViewById(R.id.lbl_monster_name);
        lbl.setText(m.name); //名称
        lbl = (TextView)findViewById(R.id.lbl_monster_type);
        lbl.setText(m.type); //类型

        loadImage(R.id.img_monster_skill1, "skill.png");
        lbl = (TextView)findViewById(R.id.lbl_monster_comment1); //介绍
        lbl.setText(m.comment1);
        lbl = (TextView)findViewById(R.id.lbl_monster_cls); //固有属性
        lbl.setText(m.cls);
        loadImage(R.id.img_monster_skill2, "attack.png");
        lbl = (TextView)findViewById(R.id.lbl_monster_comment2); //攻击属性
        lbl.setText(m.comment2);
        loadImage(R.id.img_monster_special, "special.png");
        lbl = (TextView)findViewById(R.id.lbl_monster_special); //特殊能力
        lbl.setText(m.special);

        //怪物属性
        loadImage(R.id.img_monster_property, "monster2.png");
        //Part1
        lbl = (TextView)findViewById(R.id.lbl_monster_normal_life); //生命(普通)
        lbl.setText(m.life[0]);
        lbl = (TextView)findViewById(R.id.lbl_monster_normal_pos); //位置(普通)
        lbl.setText(m.area[0]);


        lbl = (TextView)findViewById(R.id.lbl_monster_nightmare_life); //生命(噩梦)
        lbl.setText(m.life[1]);
        lbl = (TextView)findViewById(R.id.lbl_monster_nightmare_pos); //位置(噩梦)
        lbl.setText(m.area[1]);


        lbl = (TextView)findViewById(R.id.lbl_monster_hell_life); //生命(地狱)
        lbl.setText(m.life[2]);
        lbl = (TextView)findViewById(R.id.lbl_monster_hell_pos); //位置(地狱)
        lbl.setText(m.area[2]);

        //Part2
        lbl = (TextView)findViewById(R.id.lbl_monster_normal_minions); //随从(普通)
        lbl.setText(m.minions[0]);
        lbl = (TextView)findViewById(R.id.lbl_monster_normal_rune); //符文(普通)
        lbl.setText(dic.getRuneNameById(m.rune[0]));

        lbl = (TextView)findViewById(R.id.lbl_monster_nightmare_minions); //随从(噩梦)
        lbl.setText(m.minions[1]);
        lbl = (TextView)findViewById(R.id.lbl_monster_nightmare_rune); //符文(噩梦)
        lbl.setText(dic.getRuneNameById(m.rune[1]));

        lbl = (TextView)findViewById(R.id.lbl_monster_hell_minions); //随从(地狱)
        lbl.setText(m.minions[2]);
        lbl = (TextView)findViewById(R.id.lbl_monster_hell_rune); //符文(地狱)
        lbl.setText(dic.getRuneNameById(m.rune[2]));

        //怪物抗性
        loadImage(R.id.img_monster_resistance, "resistance.png");
        String[] res = m.resistance[0].split("[,]");
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_ice_normal); //冰(普通)
        lbl.setText(res[0]);
        setResistanceTextColor(lbl, R.color.blue);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_fire_normal); //火(普通)
        lbl.setText(res[1]);
        setResistanceTextColor(lbl, R.color.red);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_light_normal); //电(普通)
        lbl.setText(res[2]);
        setResistanceTextColor(lbl, R.color.yellow);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_magic_normal); //魔(普通)
        lbl.setText(res[3]);
        setResistanceTextColor(lbl, R.color.orange3);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_physical_normal); //物(普通)
        lbl.setText(res[4]);
        setResistanceTextColor(lbl, R.color.white);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_poison_normal); //毒(普通)
        lbl.setText(res[5]);
        setResistanceTextColor(lbl, R.color.green);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_damage_normal); //伤害效果(普通)
        lbl.setText(m.damageEffect[0]);

        res = m.resistance[1].split("[,]");
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_ice_nightmare); //冰(噩梦)
        lbl.setText(res[0]);
        setResistanceTextColor(lbl, R.color.blue);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_fire_nightmare); //火(噩梦)
        lbl.setText(res[1]);
        setResistanceTextColor(lbl, R.color.red);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_light_nightmare); //电(噩梦)
        lbl.setText(res[2]);
        setResistanceTextColor(lbl, R.color.yellow);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_magic_nightmare); //魔(噩梦)
        lbl.setText(res[3]);
        setResistanceTextColor(lbl, R.color.orange3);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_physical_nightmare); //物(噩梦)
        lbl.setText(res[4]);
        setResistanceTextColor(lbl, R.color.white);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_poison_nightmare); //毒(噩梦)
        lbl.setText(res[5]);
        setResistanceTextColor(lbl, R.color.green);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_damage_nightmare); //伤害效果(噩梦)
        lbl.setText(m.damageEffect[1]);

        res = m.resistance[2].split("[,]");
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_ice_hell); //冰(地狱)
        lbl.setText(res[0]);
        setResistanceTextColor(lbl, R.color.blue);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_fire_hell); //火(地狱)
        lbl.setText(res[1]);
        setResistanceTextColor(lbl, R.color.red);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_light_hell); //电(地狱)
        lbl.setText(res[2]);
        setResistanceTextColor(lbl, R.color.yellow);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_magic_hell); //魔(地狱)
        lbl.setText(res[3]);
        setResistanceTextColor(lbl, R.color.orange3);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_physical_hell); //物(地狱)
        lbl.setText(res[4]);
        setResistanceTextColor(lbl, R.color.white);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_poison_hell); //毒(地狱)
        lbl.setText(res[5]);
        setResistanceTextColor(lbl, R.color.green);
        lbl = (TextView)findViewById(R.id.lbl_monster_resistance_damage_hell); //伤害效果(地狱)
        lbl.setText(m.damageEffect[2]);
    }

    protected void initViewSpecial()
    {
    }

    private void setResistanceTextColor(TextView v, int highlightColor)
    {
        try
        {
            int value = Integer.parseInt(v.getText().toString());
            if (value >= 100)
            {
                setTextColor(v, highlightColor);
            }
            else
            {
                setTextColor(v, R.color.grey);
            }
        }
        catch (Exception e)
        {
            v.setTextColor(R.color.grey);
        }
    }

    @Override
    protected void initLayoutId()
    {
        this.frmId = R.layout.frmmonsterview;
    }

}

