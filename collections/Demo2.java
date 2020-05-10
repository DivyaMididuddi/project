package collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(0);
		a1.add('e');
		a1.add("hash");
		a1.add(7.8);
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
