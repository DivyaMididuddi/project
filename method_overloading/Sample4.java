package method_overloading;

public class Sample4 extends Sample3
{
	protected static void add(int a,int b,int c)
	{
		System.out.println("addition="+(a+b+c));
	}
	
	
	
	public static void main(String[] args)
	{
		add('a',2);
		
		add(2,6,9);
		
	}

}
