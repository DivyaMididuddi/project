package method_overloading;

public class Sample2 
{
	public void add(int a,int b)
	{
		System.out.println("addition="+(a+b));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("addition="+(a+b+c));
	}
	public static void main(String[] args)
	{
		Sample2 s2=new Sample2();
		
		s2.add(3,4);
		s2.add(3,4,5);
	}

}
