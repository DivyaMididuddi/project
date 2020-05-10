package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListpgm4 
{
	public static void main(String[] args) 
	{
		LinkedList d1=new LinkedList();
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
