package thread_pgms;

public class Test3 extends Thread 
{
	Commonsource cs;

	public Test3(Commonsource cs) 
	{
		super();
		this.cs = cs;
	}
	@Override
	public void run()
	{
		cs.resource1();
	}

}
