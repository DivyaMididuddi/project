package priorityqueue;

import java.util.PriorityQueue;
import java.util.ListIterator;

public class PriorityQueuepgm4 
{	public static void main(String[] args) 
{
	PriorityQueue d1=new PriorityQueue();
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
