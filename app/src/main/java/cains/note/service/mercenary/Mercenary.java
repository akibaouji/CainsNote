package cains.note.service.mercenary;

import cains.note.service.base.AbstractItem;

public final class Mercenary extends AbstractItem
{
	public float[] upPoints; //升级加点
	public String[] skillIds; //技能ID
	public int[] items; //可用装备的RES ID

	//data example:
	//catId: episode1
	//id: rogue
	//name: 罗格弓箭手
	//type: 可以从村庄中的卡夏处雇佣到
	//cls: 冰箭/内视（降低敌人防御） 或 火箭/内视
	//comment1: 注意：这里的雇佣兵并不是亚玛逊，所以无法使用那些是有亚玛逊专用的物品
	//upPoints: {1, 2, 6.5f, 8, 1.5f}  -> +1 点强壮, +2 点敏捷, 防御力 +6.5, +8 点生命, 四防 +1.5
	//skillIds: {"ama2_s1_1","ama3_s1_3","ama3_s6_1"}
	//items: {resource id}
	public Mercenary(String catId, String id, String name, String type,
					 String cls, String comment1, float[] upPoints, String[] skillIds, int[] items)
	{
		super(catId, id, name, type, cls, comment1, null, null);

		this.upPoints = upPoints;
		this.skillIds = skillIds;
		this.items = items;
	}

}
