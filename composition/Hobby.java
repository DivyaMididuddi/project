package composition;

public class Hobby 
{
	public static void main(String[] args)
	{
		Book b2=new Book("divya",2);
		Pen p2=new Pen("blue");
		Author a1=new Author(b2,p2,"chandana");
		
		a1.story();
		
	}

}
