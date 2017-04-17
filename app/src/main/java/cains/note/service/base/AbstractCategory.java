package cains.note.service.base;

public abstract class AbstractCategory
{
	public String id;  //类别ID
	public String name; //类别名称
	public int imgId; //类别图标ID

	public AbstractCategory(String id, String name, int imgId)
	{
		this.id = id;
		this.name = name;
		this.imgId = imgId;
	}
}
