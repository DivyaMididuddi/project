package method_overloading;

public class Sample7 
{
	public static void main(int a)
	{
		System.out.println("show a="+a);
	}
	public static void main()
	{
		System.out.println("dont show");
	}
	public static void main(String[] args)
	{
		main(7);
		main();
		
	}

}
