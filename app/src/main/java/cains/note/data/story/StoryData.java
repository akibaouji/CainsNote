package cains.note.data.story;

import cains.note.service.story.*;
import cains.note.view.R;

public final class StoryData
{
	private StoryData()
	{
	}

	public static void generate(StoryService srv)
	{
		StoryBox box = new StoryBox();
		box.category = new StoryCategory("chronicle", "暗黑年鑒", R.drawable.chronicle);
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE1_1, Rsc.RES_CHRONICLE1_2, Rsc.RES_CHRONICLE1_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE2_1, Rsc.RES_CHRONICLE2_2, Rsc.RES_CHRONICLE2_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE3_1, Rsc.RES_CHRONICLE3_2, Rsc.RES_CHRONICLE3_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE4_1, Rsc.RES_CHRONICLE4_2, Rsc.RES_CHRONICLE4_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE5_1, Rsc.RES_CHRONICLE5_2, Rsc.RES_CHRONICLE5_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE6_1, Rsc.RES_CHRONICLE6_2, Rsc.RES_CHRONICLE6_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE7_1, Rsc.RES_CHRONICLE7_2, Rsc.RES_CHRONICLE7_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE8_1, Rsc.RES_CHRONICLE8_2, Rsc.RES_CHRONICLE8_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE9_1, Rsc.RES_CHRONICLE9_2, Rsc.RES_CHRONICLE9_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE10_1, Rsc.RES_CHRONICLE10_2, Rsc.RES_CHRONICLE10_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE11_1, Rsc.RES_CHRONICLE11_2, Rsc.RES_CHRONICLE11_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE12_1, Rsc.RES_CHRONICLE12_2, Rsc.RES_CHRONICLE12_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE13_1, Rsc.RES_CHRONICLE13_2, Rsc.RES_CHRONICLE13_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE14_1, Rsc.RES_CHRONICLE14_2, Rsc.RES_CHRONICLE14_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE15_1, Rsc.RES_CHRONICLE15_2, Rsc.RES_CHRONICLE15_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE16_1, Rsc.RES_CHRONICLE16_2, Rsc.RES_CHRONICLE16_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE17_1, Rsc.RES_CHRONICLE17_2, Rsc.RES_CHRONICLE17_3));
		box.items.add(new Story(box.category.id, Rsc.RES_CHRONICLE18_1, Rsc.RES_CHRONICLE18_2, Rsc.RES_CHRONICLE18_3));
		srv.addItemBox(box);

		box = new StoryBox();
		box.category = new StoryCategory("matter", "暗黑事典", R.drawable.matter);
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER1_1, Rsc.RES_MATTER1_2, Rsc.RES_MATTER1_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER2_1, Rsc.RES_MATTER2_2, Rsc.RES_MATTER2_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER3_1, Rsc.RES_MATTER3_2, Rsc.RES_MATTER3_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER4_1, Rsc.RES_MATTER4_2, Rsc.RES_MATTER4_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER5_1, Rsc.RES_MATTER5_2, Rsc.RES_MATTER5_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER6_1, Rsc.RES_MATTER6_2, Rsc.RES_MATTER6_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER7_1, Rsc.RES_MATTER7_2, Rsc.RES_MATTER7_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER8_1, Rsc.RES_MATTER8_2, Rsc.RES_MATTER8_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER9_1, Rsc.RES_MATTER9_2, Rsc.RES_MATTER9_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER10_1, Rsc.RES_MATTER10_2, Rsc.RES_MATTER10_3));
		box.items.add(new Story(box.category.id, Rsc.RES_MATTER11_1, Rsc.RES_MATTER11_2, Rsc.RES_MATTER11_3));
		srv.addItemBox(box);

	}
}
