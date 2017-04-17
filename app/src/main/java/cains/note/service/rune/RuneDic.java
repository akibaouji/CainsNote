package cains.note.service.rune;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class RuneDic
{
	private static RuneDic _me;
	private HashMap<String, Rune> dic = new HashMap<String, Rune>();

	private RuneDic()
	{
		dic.put("El", new Rune("El","艾尔","1#","武器：+50 命中率, +1 光明度\r\n防具：+15 防御, +1 光明度",11));
		dic.put("Eld", new Rune("Eld","艾德","2#","武器：175% 伤害力对不死系怪物 +50 命中率对不死系怪物\r\n防具：15% 体力耗费减慢/提升抵挡率 7%(盾牌)",11));
		dic.put("Tir", new Rune("Tir","特尔","3#","武器：每杀一个怪物得到 2点Mana\r\n防具：每杀一个怪物得到 2点Mana",13));
		dic.put("Nef", new Rune("Nef","那夫","4#","武器：震退敌人\r\n防具：对远距离攻击 +30 防御",13));
		dic.put("Eth", new Rune("Eth","爱斯","5#","武器：-25% 目标防御\r\n防具：Mana恢复速度提升 15%",15));
		dic.put("Ith", new Rune("Ith","伊司","6#","武器：+9 最大伤害力\r\n防具：15% 伤害转换到法力",15));
		dic.put("Tal", new Rune("Tal","塔尔","7#","武器：+75 毒攻击，效果持续 5 秒\r\n防具：抗毒属性提升 30%/抗毒属性提升 35%（盾牌）",17));
		dic.put("Ral", new Rune("Ral","拉尔","8#","武器：增加 5-30火系伤害\r\n防具：抗火属性提升 30%/抗火属性提升 35%（盾牌）",19));
		dic.put("Ort", new Rune("Ort","欧特","9#","武器：增加 1-50闪电伤害\r\n防具：抗电属性提升/30%抗电属性提升 35%（盾牌）",21));
		dic.put("Thul", new Rune("Thul","书尔","10#","武器：+3-14 冰伤害，效果持续 3 秒\r\n防具：抗冰属性提升 30%/抗冰属性提升 35%（盾牌）",23));
		dic.put("Amn", new Rune("Amn","安姆","11#","武器：每次命中偷取 7% 生命\r\n防具：攻击者受到 14点反伤害",25));
		dic.put("Sol", new Rune("Sol","索尔","12#","武器：+9 最小伤害力\r\n防具：减少物理伤害 7",27));
		dic.put("Shael", new Rune("Shael","夏","13#","武器：20% 提升攻击速度\r\n防具：20% 快速恢复打击/20% 快速抵挡率(盾牌)",29));
		dic.put("Dol", new Rune("Dol","多尔","14#","武器：被击中怪物有 25%几率因恐惧而逃跑\r\n防具：自动恢复生命 +7",31));
		dic.put("Hel", new Rune("Hel","海尔","15#","武器：装备要求 -20%\r\n防具：装备要求 -15%",33));
		dic.put("Io", new Rune("Io","破","16#","武器：+10 体力 (Vitality)\r\n防具：+10 体力 (Vitality)",35));
		dic.put("Lum", new Rune("Lum","卢姆","17#","武器：+10 精力 (Energy)\r\n防具：+10 精力 (Energy)",37));
		dic.put("Ko", new Rune("Ko","科","18#","武器：+10 敏捷 (Dexterity)\r\n防具：+10 敏捷 (Dexterity)",39));
		dic.put("Fal", new Rune("Fal","法尔","19#","武器：+10 力量 (Strength)\r\n防具：+10 力量 (Strength)",41));
		dic.put("Lem", new Rune("Lem","蓝姆","20#","武器：75% 得到额外金钱\r\n防具：50% 得到额外金钱",43));
		dic.put("Pul", new Rune("Pul","普尔","21#","武器：+75% 伤害力对恶魔, +100 命中率对恶魔\r\n防具：30% 提升防御力",45));
		dic.put("Um", new Rune("Um","乌姆","22#","武器：25% 概率造成伤口\r\n防具：所有抗性+15(盔甲/头盔) +22(盾牌)",47));
		dic.put("Mal", new Rune("Mal","马尔","23#","武器：防止怪物治疗\r\n防具：所受魔法伤害减少 7",49));
		dic.put("Ist", new Rune("Ist","伊司特","24#","武器：获得魔法物品几率提升 30%\r\n防具：获得魔法物品几率提升 25%",51));
		dic.put("Gul", new Rune("Gul","古尔","25#","武器：20% 提升攻击命中率\r\n防具：+5% 毒抗上限",53));
		dic.put("Vex", new Rune("Vex","伐克斯","26#","武器：每次命中偷取 7% 法力\r\n防具：+5% 火抗上限",55));
		dic.put("Ohm", new Rune("Ohm","欧姆","27#","武器：伤害提升 50%\r\n防具：+5% 冰抗上限",57));
		dic.put("Lo", new Rune("Lo","罗","28#","武器：20% 概率双倍打击 (Deadly Strike)\r\n防具：+5% 电抗上限",59));
		dic.put("Sur", new Rune("Sur","瑟","29#","武器：命中后使目标失明\r\n防具：提升法力上限 5%/+50 点法力(盾牌)",61));
		dic.put("Ber", new Rune("Ber","贝","30#","武器：20% 概率决定性打击 (Crushing Blow)\r\n防具：减少物理伤害 8%",63));
		dic.put("Jah", new Rune("Jah","乔","31#","武器：忽略目标防御\r\n防具：提升生命上限 5%/+50 生命(盾牌)",65));
		dic.put("Cham", new Rune("Cham","查姆","32#","武器：冰冻目标 +3\r\n防具：永不冰冻",67));
		dic.put("Zod", new Rune("Zod","萨德","33#","武器：永不磨损\r\n防具：永不磨损",69));
	}

	public static RuneDic getInstance()
	{
		if (_me == null)
		{
			_me = new RuneDic();
		}
		return _me;
	}

	//eg: Ith + El + Eth -> 伊司(6#) + 艾尔(1#) + 爱斯(5#)
	public String buildWord(String key)
	{
		String rtn = "";
		List<Rune> lst = getRuneList(key);

		for (Rune r : lst)
		{
			rtn += r.name + "(" + r.index + ") + ";
		}
		if (rtn.endsWith(" + "))
		{
			rtn = rtn.substring(0, rtn.length() - 3);
		}
		return rtn;
	}

	public List<Rune> getRuneList(String key)
	{
		String[] ruins = key.split("[+]");
		String id;
		List<Rune> rtn = new ArrayList<Rune>();
		for (String s : ruins)
		{
			id = s.trim();
			Rune r = getRuneById(id);
			if (r != null)
			{
				rtn.add(r);
			}
		}
		return rtn;
	}

	public Rune getRuneById(String id)
	{
		return dic.get(id);
	}

	public String getRuneNameById(String id)
	{
		if (id == null)
		{
			return "无";
		}
		else
		{
			Rune r = dic.get(id);
			if (r == null)
			{
				return "无";
			}
			return r.name + "(" + r.index + ")";
		}
	}
}
