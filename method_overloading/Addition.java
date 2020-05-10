package method_overloading;

public class Addition
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(double a,int b)
	{
		System.out.println(a+b);
		
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args)
	{
		add(2,3);
		add(3.1,7);
		add(8,6.8);
		add(2,3,4);
		
	}
	

}
