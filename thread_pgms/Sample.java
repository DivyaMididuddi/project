package thread_pgms;

public class Sample extends Thread
{
	@Override
	public void run()
	{
		this.move();
		this.sleep();
	}
	public void move()
	{
		System.out.println("move");
	}
	public void sleep()
	{
		System.out.println("sleep");
	}

}
