package exceptions;

public class Sample1
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try
		{
			display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("interrupt is catched and resolved");
			
		}
	}
	public static void display()throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("hi");
	}

}
