package thread_pgms;

public class Football 
{
	synchronized public void pass()
	{
		System.out.println("pass the ball");
		notify();
	}
	 synchronized public void kick()
	{
		 try
		 {
		 wait();
		 }
		 catch(InterruptedException rv)
		 {
			 
		 }
		System.out.println("kick the ball ");
	}

}
