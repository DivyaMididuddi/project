package thread_pgms;

public class Player2 extends Thread 
{
	Football fb;

	public Player2(Football fb)
	{
		super();
		this.fb = fb;
	}
	@Override
	public void run()
	{
		fb.pass();
	}

}
