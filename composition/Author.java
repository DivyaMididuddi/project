package composition;

public class Author 
{
	Book b1;
	Pen p1;
	String name;
	public Author(Book b1,Pen p1,String name)
	{
		this.b1=b1;
		this.p1=p1;
		this.name=name;
		
		
	}
	
	public void story()
	{
		b1.openbook();
		System.out.println("author"+this.name);
	
		for(int i=1;i<=b1.pages;i++)
		{
		p1.write();
		b1.turnpage();
		}
		b1.closebook();
	}
	
}
