package composition;

public class Book 
{
	String title;
	int pages;
	public Book(String title, int pages)
	{
		this.title=title;
		this.pages=pages;
	}
   public void openbook()
   {
	   System.out.println("open book");
	   System.out.println("title"+this.title);
   }
   public void turnpage()
   {
	   System.out.println("turn page");
   }
   public void closebook()
   {
	   System.out.println("close book");
   }
}
