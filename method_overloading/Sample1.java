package method_overloading;

public class Sample1 
{
	
	public static void add(int a,int b)
	{
		System.out.println("addition="+(a+b));
	}
	public Sample1(int a,int b) 
	{
		sub(a,b);
	}
	public void sub(int a,int b)
	{
		
		System.out.println("subtraction="+(a-b));
	}
	public static void add(int a,int b,int c)
	{
		System.out.println("addition="+(a+b+c));
	}
	public void sub(double a,int b)
	{
		System.out.println("subtraction="+(a-b));
	}
	public static void main(String[] args)
	{
		add(2,3);
		Sample1 s1=new Sample1(5,2);
		
		add(2,3,4);
		s1.sub(6.1,4);
		
	}

}
