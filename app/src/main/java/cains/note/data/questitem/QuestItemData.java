package cains.note.data.questitem;

import cains.note.service.questitem.*;

public final class QuestItemData
{
	private QuestItemData()
	{
	}

	public static void generate(QuestItemService srv)
	{
		QuestItemBox box = new QuestItemBox();
		box.category = new QuestItemCategory();
		//艾尼弗斯卷轴
		box.items.add(new QuestItem(Rsc.RES_QI1_1,Rsc.RES_QI1_2,Rsc.RES_QI1_3,Rsc.RES_QI1_4,Rsc.RES_QI1_5,Rsc.RES_QI1_6));
		//维特之腿
		box.items.add(new QuestItem(Rsc.RES_QI2_1,Rsc.RES_QI2_2,Rsc.RES_QI2_3,Rsc.RES_QI2_4,Rsc.RES_QI2_5,Rsc.RES_QI2_6));
		//赫拉迪克马勒斯
		box.items.add(new QuestItem(Rsc.RES_QI3_1,Rsc.RES_QI3_2,Rsc.RES_QI3_3,Rsc.RES_QI3_4,Rsc.RES_QI3_5,Rsc.RES_QI3_6));

		//技能之书
		box.items.add(new QuestItem(Rsc.RES_QI4_1,Rsc.RES_QI4_2,Rsc.RES_QI4_3,Rsc.RES_QI4_4,Rsc.RES_QI4_5,Rsc.RES_QI4_6));
		//赫拉迪克卷轴
		box.items.add(new QuestItem(Rsc.RES_QI5_1,Rsc.RES_QI5_2,Rsc.RES_QI5_3,Rsc.RES_QI5_4,Rsc.RES_QI5_5,Rsc.RES_QI5_6));
		//赫拉迪克方块
		box.items.add(new QuestItem(Rsc.RES_QI6_1,Rsc.RES_QI6_2,Rsc.RES_QI6_3,Rsc.RES_QI6_4,Rsc.RES_QI6_5,Rsc.RES_QI6_6));
		//国王之杖
		box.items.add(new QuestItem(Rsc.RES_QI7_1,Rsc.RES_QI7_2,Rsc.RES_QI7_3,Rsc.RES_QI7_4,Rsc.RES_QI7_5,Rsc.RES_QI7_6));
		//蝮蛇项链
		box.items.add(new QuestItem(Rsc.RES_QI8_1,Rsc.RES_QI8_2,Rsc.RES_QI8_3,Rsc.RES_QI8_4,Rsc.RES_QI8_5,Rsc.RES_QI8_6));
		//赫拉迪克法杖
		box.items.add(new QuestItem(Rsc.RES_QI9_1,Rsc.RES_QI9_2,Rsc.RES_QI9_3,Rsc.RES_QI9_4,Rsc.RES_QI9_5,Rsc.RES_QI9_6));

		//玉质小人雕像
		box.items.add(new QuestItem(Rsc.RES_QI10_1,Rsc.RES_QI10_2,Rsc.RES_QI10_3,Rsc.RES_QI10_4,Rsc.RES_QI10_5,Rsc.RES_QI10_6));
		//库亚的黄金鸟
		box.items.add(new QuestItem(Rsc.RES_QI11_1,Rsc.RES_QI11_2,Rsc.RES_QI11_3,Rsc.RES_QI11_4,Rsc.RES_QI11_5,Rsc.RES_QI11_6));
		//生命药剂
		box.items.add(new QuestItem(Rsc.RES_QI12_1,Rsc.RES_QI12_2,Rsc.RES_QI12_3,Rsc.RES_QI12_4,Rsc.RES_QI12_5,Rsc.RES_QI12_6));
		//吉得宾
		box.items.add(new QuestItem(Rsc.RES_QI13_1,Rsc.RES_QI13_2,Rsc.RES_QI13_3,Rsc.RES_QI13_4,Rsc.RES_QI13_5,Rsc.RES_QI13_6));
		//蓝·依森的古书
		box.items.add(new QuestItem(Rsc.RES_QI14_1,Rsc.RES_QI14_2,Rsc.RES_QI14_3,Rsc.RES_QI14_4,Rsc.RES_QI14_5,Rsc.RES_QI14_6));
		//卡里姆的眼球
		box.items.add(new QuestItem(Rsc.RES_QI15_1,Rsc.RES_QI15_2,Rsc.RES_QI15_3,Rsc.RES_QI15_4,Rsc.RES_QI15_5,Rsc.RES_QI15_6));
		//卡里姆的大脑
		box.items.add(new QuestItem(Rsc.RES_QI16_1,Rsc.RES_QI16_2,Rsc.RES_QI16_3,Rsc.RES_QI16_4,Rsc.RES_QI16_5,Rsc.RES_QI16_6));
		//卡里姆的心脏
		box.items.add(new QuestItem(Rsc.RES_QI17_1,Rsc.RES_QI17_2,Rsc.RES_QI17_3,Rsc.RES_QI17_4,Rsc.RES_QI17_5,Rsc.RES_QI17_6));
		//卡里姆链枷
		box.items.add(new QuestItem(Rsc.RES_QI18_1,Rsc.RES_QI18_2,Rsc.RES_QI18_3,Rsc.RES_QI18_4,Rsc.RES_QI18_5,Rsc.RES_QI18_6));
		//卡里姆的意愿
		box.items.add(new QuestItem(Rsc.RES_QI19_1,Rsc.RES_QI19_2,Rsc.RES_QI19_3,Rsc.RES_QI19_4,Rsc.RES_QI19_5,Rsc.RES_QI19_6));
		//墨菲斯托的灵魂石
		box.items.add(new QuestItem(Rsc.RES_QI20_1,Rsc.RES_QI20_2,Rsc.RES_QI20_3,Rsc.RES_QI20_4,Rsc.RES_QI20_5,Rsc.RES_QI20_6));

		//地狱熔炉之锤
		box.items.add(new QuestItem(Rsc.RES_QI21_1,Rsc.RES_QI21_2,Rsc.RES_QI21_3,Rsc.RES_QI21_4,Rsc.RES_QI21_5,Rsc.RES_QI21_6));

		//马拉的药剂
		box.items.add(new QuestItem(Rsc.RES_QI22_1,Rsc.RES_QI22_2,Rsc.RES_QI22_3,Rsc.RES_QI22_4,Rsc.RES_QI22_5,Rsc.RES_QI22_6));
		//抗性卷轴
		box.items.add(new QuestItem(Rsc.RES_QI23_1,Rsc.RES_QI23_2,Rsc.RES_QI23_3,Rsc.RES_QI23_4,Rsc.RES_QI23_5,Rsc.RES_QI23_6));
		//毁灭之钥
		box.items.add(new QuestItem(Rsc.RES_QI24_1,Rsc.RES_QI24_2,Rsc.RES_QI24_3,Rsc.RES_QI24_4,Rsc.RES_QI24_5,Rsc.RES_QI24_6));
		//憎恨之钥
		box.items.add(new QuestItem(Rsc.RES_QI25_1,Rsc.RES_QI25_2,Rsc.RES_QI25_3,Rsc.RES_QI25_4,Rsc.RES_QI25_5,Rsc.RES_QI25_6));
		//恐惧之钥
		box.items.add(new QuestItem(Rsc.RES_QI26_1,Rsc.RES_QI26_2,Rsc.RES_QI26_3,Rsc.RES_QI26_4,Rsc.RES_QI26_5,Rsc.RES_QI26_6));
		//迪亚波罗之角
		box.items.add(new QuestItem(Rsc.RES_QI27_1,Rsc.RES_QI27_2,Rsc.RES_QI27_3,Rsc.RES_QI27_4,Rsc.RES_QI27_5,Rsc.RES_QI27_6));
		//巴尔之眼
		box.items.add(new QuestItem(Rsc.RES_QI28_1,Rsc.RES_QI28_2,Rsc.RES_QI28_3,Rsc.RES_QI28_4,Rsc.RES_QI28_5,Rsc.RES_QI28_6));
		//墨菲斯托之脑
		box.items.add(new QuestItem(Rsc.RES_QI29_1,Rsc.RES_QI29_2,Rsc.RES_QI29_3,Rsc.RES_QI29_4,Rsc.RES_QI29_5,Rsc.RES_QI29_6));

		//恐惧之燃烧精华
		box.items.add(new QuestItem(Rsc.RES_QI30_1,Rsc.RES_QI30_2,Rsc.RES_QI30_3,Rsc.RES_QI30_4,Rsc.RES_QI30_5,Rsc.RES_QI30_6));
		//憎恨之电精华
		box.items.add(new QuestItem(Rsc.RES_QI31_1,Rsc.RES_QI31_2,Rsc.RES_QI31_3,Rsc.RES_QI31_4,Rsc.RES_QI31_5,Rsc.RES_QI31_6));
		//毁灭之溃烂精华
		box.items.add(new QuestItem(Rsc.RES_QI32_1,Rsc.RES_QI32_2,Rsc.RES_QI32_3,Rsc.RES_QI32_4,Rsc.RES_QI32_5,Rsc.RES_QI32_6));
		//痛苦之扭曲精华
		box.items.add(new QuestItem(Rsc.RES_QI33_1,Rsc.RES_QI33_2,Rsc.RES_QI33_3,Rsc.RES_QI33_4,Rsc.RES_QI33_5,Rsc.RES_QI33_6));
		//赦免标记
		box.items.add(new QuestItem(Rsc.RES_QI34_1,Rsc.RES_QI34_2,Rsc.RES_QI34_3,Rsc.RES_QI34_4,Rsc.RES_QI34_5,Rsc.RES_QI34_6));

		srv.addItemBox(box);
	}
}
