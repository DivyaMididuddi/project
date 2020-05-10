package thread_pgms;

public class Properties 
{
	public static void main(String[] args) 
	{
		Thread t1=Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println("changed values are");
	    t1.setName("main thread");
		t1.setPriority(3);
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
	}

}
