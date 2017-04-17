package cains.note.service.base;

public abstract class AbstractItem
{
	public String catId; //类型ID
	public String id;    //物品ID
	public String name;  //物品名称
	public String type;  //物品类型
	public String cls;   //物品级别(普通,扩展,精华)
	public String comment1; //物品描述1(白色)
	public String comment2; //物品描述2(蓝色)
	//物品掉落
	public byte[] drop;      //XXXX XXXX | XXXX XXXX | XXXX XXXX
	//M    D      P    L      B    H

	//                 MSB
	//in the order of: RFU normal nightmare hell

	public AbstractItem(String catId, String id, String name, String type, String cls,
						String comment1, String comment2, byte[] drop)
	{
		this.catId = catId;
		this.id = id;
		this.name = name;
		this.type = type;
		this.cls = cls;
		this.comment1 = comment1;
		this.comment2 = comment2;
		this.drop = drop;
	}

	public String getDisplayName()
	{
		try
		{
			String[] arr = name.split("\r\n");
			return arr[1];
		}
		catch (Exception ex)
		{
			return name;
		}
	}
}
