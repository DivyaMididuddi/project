package exceptions;

public class Sample2 
{
	public static void main(String[] args)
	{
		System.out.println("main starts");
		try
		{
			division();
		}
		catch(ArithmeticException rv)
		{
			System.out.println("b value cannot be zero");
		
		}
		
	}
	public static void division()
	{
		int a=10;
		int b=0;
		System.out.println("division"+a/b);
	}

}
