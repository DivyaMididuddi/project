package arraylist;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListpgm4 
{
	public static void main(String[] args) 
	{
		ArrayList d1=new ArrayList();
		d1.add("shireeesha");
		d1.add("harshini");
		d1.add("chandana");
		d1.add("div");
		d1.add("yash");
		ListIterator i1=d1.listIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		
	}

}
