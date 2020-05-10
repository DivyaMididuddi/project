package thread_pgms;

public class Test4 extends Thread 
{
	Commonsource cs;

	public Test4(Commonsource cs) 
	{
		super();
		this.cs = cs;
	}
	@Override
	public void run()
	{
		cs.resource2();
	}
	
	

}
