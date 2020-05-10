package thread_pgms;

public class Sample1 implements Runnable

{
	@Override
	public void run()
	{
		this.chair();
	}
	public void chair()
	{
		System.out.println("big chair");
	}

}
