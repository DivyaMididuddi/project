package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListpgm3 
{
	public static void main(String[] args) 
	{
		ArrayList c1=new ArrayList();
		c1.add(9.9);
		c1.add(8.8);
		c1.add(4.4);
		c1.add(2.2);
		c1.add(1.1);
		Iterator i1=c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
