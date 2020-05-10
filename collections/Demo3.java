package collections;
import java.util.ArrayList;
import java.util.ListIterator;

public class Demo3 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(6);
		a1.add('7');		
		a1.add("man");
		ListIterator l1=a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		while(l1.hasPrevious())
		{
			System.out.println(l1.previous());
		}
	}

}
