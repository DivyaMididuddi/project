package thread_pgms;

public class Demo extends Thread
{
	@Override
	public void run()
	{
		this.walk();
	}
	public void walk()
	{
		System.out.println("walk");
	}

}
