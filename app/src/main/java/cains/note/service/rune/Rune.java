package cains.note.service.rune;

public final class Rune
{
	public String id;     //eg: El
	public String name;   //eg: 艾尔
	public String index;     //eg: 1#
	public String comment;
	public int requiredLv;

	public Rune(String id, String name, String index, String comment, int requiredLv)
	{
		this.id = id;
		this.name = name;
		this.index = index;
		this.comment = comment;
		this.requiredLv = requiredLv;
	}

	@Override
	public String toString()
	{
		return comment;
	}
}
