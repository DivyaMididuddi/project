package thread_pgms;

public class Player1 extends Thread
{
	Football fb;

	public Player1(Football fb)
	{
		super();
		this.fb = fb;
	}
	@Override
	public void run()
	{
		fb.kick();
	}

}
