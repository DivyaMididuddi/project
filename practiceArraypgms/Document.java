package practiceArraypgms;

public class Document 
{
	private int id;
	private String foldername;
	private String title;
	private int pages;
	public Document(int id, String foldername, String title, int pages)
	{
		super();
		this.id = id;
		this.foldername = foldername;
		this.title = title;
		this.pages = pages;
	}
	@Override
	public String toString()
	{
		return "id:"+this.id+"foldername:"+this.foldername+"title:"+this.title+" pages:"+this.pages;
	}
	public int getId()
	{
		return this.id;
	}
	public String getFolderName()
	{
		return this.foldername;
	}
	public String getTitle()
	{
		return this.title;
	}
	public int getPages()
	{
		return this.pages;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setFolderName(String foldername)
	{
		this.foldername=foldername;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setPages(int pages)
	{
		this.pages=pages;
	}
	
}
