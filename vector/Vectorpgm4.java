package vector;

import java.util.Vector;
import java.util.ListIterator;

public class Vectorpgm4 
{
	public static void main(String[] args) 
	{
		Vector d1=new Vector();
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
		System.out.println("****************************");
		while(i1.hasPrevious())
		{
			System.out.println(i1.previous());
		}
		

	}
}
