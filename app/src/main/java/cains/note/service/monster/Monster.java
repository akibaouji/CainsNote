package cains.note.service.monster;

import cains.note.service.base.AbstractItem;

public final class Monster extends AbstractItem
{
	public String special;            //特殊能力

	//三难度怪物属性{普通,噩梦,地狱}
	public String[] life;             //生命值
	public String[] resistance;         //抗性
	public String[] damageEffect;        //伤害效果
	public String[] area;             //出现位置
	public String[] minions;             //随从数量
	public String[] rune;             //最高等级符文掉落

	/* Base Class Data Example:
	 * catId: episode1
	 * id: corpsefire
	 * name: 尸体发火 corpsefire
	 * type: 僵尸
	 * cls: 幽灵一击
	 * comment1:  尸体发火是一个守卫邪恶洞穴的暗金怪物(僵尸).它可能是玩家开始暗黑破坏神2历险时,遇到第一个暗金怪物.因此,它总会掉落2件或2件以上的魔法装备.
	 * comment2: (攻击属性)
	 * drop: null
	 * life: {"28 - 48","1,653 - 2,361","11,532 - 16,476"}
	 * resistance {"20,20,20,0,0,50", "20,20,20,0,0,75", "120,20,20,0,50,75"}
	 * damageEffect {100, 75, 50}
	 * area {"邪恶洞穴 (4)", "邪恶洞穴 (39)", "邪恶洞穴 (82)"}
	 * minions {5, 6, 7}
	 * rune {null,"Io","Cham"}
	 */
	public Monster(String catId, String id, String name, String type, String cls,
				   String comment1, String comment2, String[] life, String[] resistance,
				   String[] damageEffect, String[] area, String[] minions, String[] rune, String special)
	{
		super(catId, id, name, type, cls, comment1, comment2, null);

		this.life = life;
		this.resistance = resistance;
		this.damageEffect = damageEffect;
		this.area = area;
		this.minions = minions;
		this.rune = rune;
		this.special = special;
	}

	@Override
	public String getDisplayName()
	{
		try
		{
			int pos = name.indexOf("(");
			return name.substring(0, pos);
		}
		catch (Exception ex)
		{
			return name;
		}
	}
}
