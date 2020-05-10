package method_overloading;

public class Sample6 extends Sample5
{
	public static void add(int a,int b,int c)
	{
		System.out.println("addition="+(a+b+c));
	}
	public  void add()
	{
		System.out.println("sit for 3 hrs");
	}
	public static void main(String[] args)
	{
		add(2,3);
		add(3,4,5);
		Sample6 s6=new Sample6();
		s6.add();
		
	}

}
