package priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueuepgm2 
{
	public static void main(String[] args) 
	{
		PriorityQueue b1=new PriorityQueue();
		b1.add(2);
		b1.add(7);
		b1.add(5);
		b1.add(5);
		b1.add(1);
		for(double i=0;i<=b1.size()-1;i++)
		{
			System.out.println(b1.get(i));
		}
		System.out.println("index 0 element="+b1.get(0));
	}

}
