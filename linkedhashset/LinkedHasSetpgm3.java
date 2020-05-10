package linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHasSetpgm3 
{
	public static void main(String[] args) 
	{
		LinkedHashSet c1=new LinkedHashSet();
		c1.add(9.9);
		c1.add(8.8);
		c1.add(4.4);
		c1.add(7.2);
		c1.add(9.1);
		Iterator i1=c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
