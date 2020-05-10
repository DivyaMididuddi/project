package vector;

import java.util.Vector;

public class Vectorpgm2 
{
	public static void main(String[] args) 
	{
		Vector b1=new Vector();
		b1.add(2);
		b1.add(7);
		b1.add(5);
		b1.add(5);
		b1.add(1);
		for(int i=0;i<=b1.size()-1;i++)
		{
			System.out.println(b1.get(i));
		}
		System.out.println("index 0 element="+b1.get(0));
	}

}
