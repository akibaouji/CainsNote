package cains.note.service.character;

import cains.note.service.base.AbstractItem;

public final class Character extends AbstractItem
{

	public int[] initProperty;      //初始状态点:力量,敏捷,体力,精力
	public float[][] initProperty2; //生命,耐力,法力 {初始,每级}
	public float[] propertyEffect;   //属性点数效果:生命,耐力,法力
	public int imgId;               //用于列表的图标ID

	/*
	 * Data Sample
	 *
	 * catId: character
	 * id: druid
	 * name: 德鲁伊
	 * type: 指挥大自然的力量,他可以召唤野生动物和强烈的风暴并肩作战
	 * cls:  介绍
	 * comment1: 历史背景
	 * comment2: 特点和能力
	 * initProperty : {15,20,25,20}
	 * initProperty2: {{55,1.5},{84,1},{20,2}}
	 * propertyEffect: {2,1,2}
	 * 
	 */
	public Character(String catId, String id, String name, String type, String cls,
					 String comment1, String comment2,
					 int[] initProperty, float[][] initProperty2, float[] propertyEffect, int imgId)
	{
		super(catId, id, name, type, cls, comment1, comment2, null);
		this.initProperty =initProperty;
		this.initProperty2 = initProperty2;
		this.propertyEffect = propertyEffect;
		this.imgId = imgId;
	}

}
