package cains.note.data.gold;

import cains.note.view.R;
import cains.note.service.gold.GoldItem;
import cains.note.service.gold.GoldItemBox;
import cains.note.service.gold.GoldItemCategory;
import cains.note.service.gold.GoldItemService;

public class GoldData4
{
	private GoldData4()
	{
	}

	public static void generate(GoldItemService srv)
	{
		GoldItemBox box = new GoldItemBox();
		box.category = new GoldItemCategory("amulets", "项链-Amulets", R.drawable.amulets);


		/* 諾科藍遺物 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_NOKOZAN_RELIC_1,Rsc4.RES_NOKOZAN_RELIC_2,Rsc4.RES_NOKOZAN_RELIC_3,Rsc4.RES_NOKOZAN_RELIC_4,Rsc4.RES_NOKOZAN_RELIC_5,Rsc4.RES_NOKOZAN_RELIC_6,Rsc4.RES_NOKOZAN_RELIC_7));
		/* 艾利屈之眼 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_THE_EYE_OF_ETLICH_1,Rsc4.RES_THE_EYE_OF_ETLICH_2,Rsc4.RES_THE_EYE_OF_ETLICH_3,Rsc4.RES_THE_EYE_OF_ETLICH_4,Rsc4.RES_THE_EYE_OF_ETLICH_5,Rsc4.RES_THE_EYE_OF_ETLICH_6,Rsc4.RES_THE_EYE_OF_ETLICH_7));
		/* 瑪哈姆橡木古董 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_THE_MAHIM_OAK_CURIO_1,Rsc4.RES_THE_MAHIM_OAK_CURIO_2,Rsc4.RES_THE_MAHIM_OAK_CURIO_3,Rsc4.RES_THE_MAHIM_OAK_CURIO_4,Rsc4.RES_THE_MAHIM_OAK_CURIO_5,Rsc4.RES_THE_MAHIM_OAK_CURIO_6,Rsc4.RES_THE_MAHIM_OAK_CURIO_7));
		/* 貓眼 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_THE_CATS_EYE_1,Rsc4.RES_THE_CATS_EYE_2,Rsc4.RES_THE_CATS_EYE_3,Rsc4.RES_THE_CATS_EYE_4,Rsc4.RES_THE_CATS_EYE_5,Rsc4.RES_THE_CATS_EYE_6,Rsc4.RES_THE_CATS_EYE_7));
		/* 旭日 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_THE_RISING_SUN_1,Rsc4.RES_THE_RISING_SUN_2,Rsc4.RES_THE_RISING_SUN_3,Rsc4.RES_THE_RISING_SUN_4,Rsc4.RES_THE_RISING_SUN_5,Rsc4.RES_THE_RISING_SUN_6,Rsc4.RES_THE_RISING_SUN_7));
		/* 新月 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_CRESCENT_MOON_1,Rsc4.RES_CRESCENT_MOON_2,Rsc4.RES_CRESCENT_MOON_3,Rsc4.RES_CRESCENT_MOON_4,Rsc4.RES_CRESCENT_MOON_5,Rsc4.RES_CRESCENT_MOON_6,Rsc4.RES_CRESCENT_MOON_7));
		/* 馬拉的萬花筒 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_MARAS_KALEIDOSCOPE_1,Rsc4.RES_MARAS_KALEIDOSCOPE_2,Rsc4.RES_MARAS_KALEIDOSCOPE_3,Rsc4.RES_MARAS_KALEIDOSCOPE_4,Rsc4.RES_MARAS_KALEIDOSCOPE_5,Rsc4.RES_MARAS_KALEIDOSCOPE_6,Rsc4.RES_MARAS_KALEIDOSCOPE_7));
		/* 亞特瑪的聖甲蟲 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_ATMAS_SCARAB_1,Rsc4.RES_ATMAS_SCARAB_2,Rsc4.RES_ATMAS_SCARAB_3,Rsc4.RES_ATMAS_SCARAB_4,Rsc4.RES_ATMAS_SCARAB_5,Rsc4.RES_ATMAS_SCARAB_6,Rsc4.RES_ATMAS_SCARAB_7));
		/* 大君之怒 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_HIGHLORDS_WRATH_1,Rsc4.RES_HIGHLORDS_WRATH_2,Rsc4.RES_HIGHLORDS_WRATH_3,Rsc4.RES_HIGHLORDS_WRATH_4,Rsc4.RES_HIGHLORDS_WRATH_5,Rsc4.RES_HIGHLORDS_WRATH_6,Rsc4.RES_HIGHLORDS_WRATH_7));
		/* 薩拉森的機會 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_SARACENS_CHANCE_1,Rsc4.RES_SARACENS_CHANCE_2,Rsc4.RES_SARACENS_CHANCE_3,Rsc4.RES_SARACENS_CHANCE_4,Rsc4.RES_SARACENS_CHANCE_5,Rsc4.RES_SARACENS_CHANCE_6,Rsc4.RES_SARACENS_CHANCE_7));
		/* 炙天使之韵 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_SERAPHS_HYMN_1,Rsc4.RES_SERAPHS_HYMN_2,Rsc4.RES_SERAPHS_HYMN_3,Rsc4.RES_SERAPHS_HYMN_4,Rsc4.RES_SERAPHS_HYMN_5,Rsc4.RES_SERAPHS_HYMN_6,Rsc4.RES_SERAPHS_HYMN_7));
		/* 金属网格 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_METALGRID_1,Rsc4.RES_METALGRID_2,Rsc4.RES_METALGRID_3,Rsc4.RES_METALGRID_4,Rsc4.RES_METALGRID_5,Rsc4.RES_METALGRID_6,Rsc4.RES_METALGRID_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("ring", "戒指-Rings", R.drawable.ring);


		/* 拿各的戒指 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_NAGELRING_1,Rsc4.RES_NAGELRING_2,Rsc4.RES_NAGELRING_3,Rsc4.RES_NAGELRING_4,Rsc4.RES_NAGELRING_5,Rsc4.RES_NAGELRING_6,Rsc4.RES_NAGELRING_7));
		/* 瑪那得的治療 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_MANALD_HEAL_1,Rsc4.RES_MANALD_HEAL_2,Rsc4.RES_MANALD_HEAL_3,Rsc4.RES_MANALD_HEAL_4,Rsc4.RES_MANALD_HEAL_5,Rsc4.RES_MANALD_HEAL_6,Rsc4.RES_MANALD_HEAL_7));
		/* 喬丹之石 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_STONE_OF_JORDAN_1,Rsc4.RES_STONE_OF_JORDAN_2,Rsc4.RES_STONE_OF_JORDAN_3,Rsc4.RES_STONE_OF_JORDAN_4,Rsc4.RES_STONE_OF_JORDAN_5,Rsc4.RES_STONE_OF_JORDAN_6,Rsc4.RES_STONE_OF_JORDAN_7));
		/* 布尔凯索的婚戒 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_BUL_KATHOS_WEDDING_BAND_1,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_2,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_3,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_4,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_5,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_6,Rsc4.RES_BUL_KATHOS_WEDDING_BAND_7));
		/* 矮人之星 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_DWARF_STAR_1,Rsc4.RES_DWARF_STAR_2,Rsc4.RES_DWARF_STAR_3,Rsc4.RES_DWARF_STAR_4,Rsc4.RES_DWARF_STAR_5,Rsc4.RES_DWARF_STAR_6,Rsc4.RES_DWARF_STAR_7));
		/* 烏鴉之霜 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAVEN_FROST_1,Rsc4.RES_RAVEN_FROST_2,Rsc4.RES_RAVEN_FROST_3,Rsc4.RES_RAVEN_FROST_4,Rsc4.RES_RAVEN_FROST_5,Rsc4.RES_RAVEN_FROST_6,Rsc4.RES_RAVEN_FROST_7));
		/* 大自然的和平 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_NATURES_PEACE_1,Rsc4.RES_NATURES_PEACE_2,Rsc4.RES_NATURES_PEACE_3,Rsc4.RES_NATURES_PEACE_4,Rsc4.RES_NATURES_PEACE_5,Rsc4.RES_NATURES_PEACE_6,Rsc4.RES_NATURES_PEACE_7));
		/* 鬼火投射者 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_WISP_PROJECTOR_1,Rsc4.RES_WISP_PROJECTOR_2,Rsc4.RES_WISP_PROJECTOR_3,Rsc4.RES_WISP_PROJECTOR_4,Rsc4.RES_WISP_PROJECTOR_5,Rsc4.RES_WISP_PROJECTOR_6,Rsc4.RES_WISP_PROJECTOR_7));
		/* 腐肉之风 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_CARRION_WIND_1,Rsc4.RES_CARRION_WIND_2,Rsc4.RES_CARRION_WIND_3,Rsc4.RES_CARRION_WIND_4,Rsc4.RES_CARRION_WIND_5,Rsc4.RES_CARRION_WIND_6,Rsc4.RES_CARRION_WIND_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("jewels", "珠宝-Jewels", R.drawable.jewels);


		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET_1,Rsc4.RES_RAINBOW_FACET_2,Rsc4.RES_RAINBOW_FACET_3,Rsc4.RES_RAINBOW_FACET_4,Rsc4.RES_RAINBOW_FACET_5,Rsc4.RES_RAINBOW_FACET_6,Rsc4.RES_RAINBOW_FACET_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET2_1,Rsc4.RES_RAINBOW_FACET2_2,Rsc4.RES_RAINBOW_FACET2_3,Rsc4.RES_RAINBOW_FACET2_4,Rsc4.RES_RAINBOW_FACET2_5,Rsc4.RES_RAINBOW_FACET2_6,Rsc4.RES_RAINBOW_FACET2_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET3_1,Rsc4.RES_RAINBOW_FACET3_2,Rsc4.RES_RAINBOW_FACET3_3,Rsc4.RES_RAINBOW_FACET3_4,Rsc4.RES_RAINBOW_FACET3_5,Rsc4.RES_RAINBOW_FACET3_6,Rsc4.RES_RAINBOW_FACET3_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET4_1,Rsc4.RES_RAINBOW_FACET4_2,Rsc4.RES_RAINBOW_FACET4_3,Rsc4.RES_RAINBOW_FACET4_4,Rsc4.RES_RAINBOW_FACET4_5,Rsc4.RES_RAINBOW_FACET4_6,Rsc4.RES_RAINBOW_FACET4_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET5_1,Rsc4.RES_RAINBOW_FACET5_2,Rsc4.RES_RAINBOW_FACET5_3,Rsc4.RES_RAINBOW_FACET5_4,Rsc4.RES_RAINBOW_FACET5_5,Rsc4.RES_RAINBOW_FACET5_6,Rsc4.RES_RAINBOW_FACET5_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET6_1,Rsc4.RES_RAINBOW_FACET6_2,Rsc4.RES_RAINBOW_FACET6_3,Rsc4.RES_RAINBOW_FACET6_4,Rsc4.RES_RAINBOW_FACET6_5,Rsc4.RES_RAINBOW_FACET6_6,Rsc4.RES_RAINBOW_FACET6_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET7_1,Rsc4.RES_RAINBOW_FACET7_2,Rsc4.RES_RAINBOW_FACET7_3,Rsc4.RES_RAINBOW_FACET7_4,Rsc4.RES_RAINBOW_FACET7_5,Rsc4.RES_RAINBOW_FACET7_6,Rsc4.RES_RAINBOW_FACET7_7));
		/* 彩虹刻面 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_RAINBOW_FACET8_1,Rsc4.RES_RAINBOW_FACET8_2,Rsc4.RES_RAINBOW_FACET8_3,Rsc4.RES_RAINBOW_FACET8_4,Rsc4.RES_RAINBOW_FACET8_5,Rsc4.RES_RAINBOW_FACET8_6,Rsc4.RES_RAINBOW_FACET8_7));

		srv.addItemBox(box);

		box = new GoldItemBox();
		box.category = new GoldItemCategory("charm", "护身符-Charms", R.drawable.charm);


		/* 毁灭 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_ANNIHILUS_1,Rsc4.RES_ANNIHILUS_2,Rsc4.RES_ANNIHILUS_3,Rsc4.RES_ANNIHILUS_4,Rsc4.RES_ANNIHILUS_5,Rsc4.RES_ANNIHILUS_6,Rsc4.RES_ANNIHILUS_7));
		/* 地狱火炬 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_HELLTORCH_1,Rsc4.RES_HELLTORCH_2,Rsc4.RES_HELLTORCH_3,Rsc4.RES_HELLTORCH_4,Rsc4.RES_HELLTORCH_5,Rsc4.RES_HELLTORCH_6,Rsc4.RES_HELLTORCH_7));
		/* 吉黑得的运气 */
		box.items.add(new GoldItem(box.category.id, Rsc4.RES_GHEEDS_FORTUNE_1,Rsc4.RES_GHEEDS_FORTUNE_2,Rsc4.RES_GHEEDS_FORTUNE_3,Rsc4.RES_GHEEDS_FORTUNE_4,Rsc4.RES_GHEEDS_FORTUNE_5,Rsc4.RES_GHEEDS_FORTUNE_6,Rsc4.RES_GHEEDS_FORTUNE_7));

		srv.addItemBox(box);
	}
}
