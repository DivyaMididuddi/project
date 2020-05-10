package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListpgm3
{
	public static void main(String[] args) 
	{
		LinkedList c1=new LinkedList();
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
