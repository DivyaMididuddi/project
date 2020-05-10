package collections;
import java.util.ArrayList;

public class Demo1 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		a1.add(8);
		a1.add("java");
		a1.add('%');
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}
	}

}
