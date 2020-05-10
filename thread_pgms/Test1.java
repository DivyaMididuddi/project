package thread_pgms;

public class Test1 
{
	public static void main(String[] args)
	{
		Demo1 d1=new Demo1();
		Sample1 s1=new Sample1();
		Thread t1=new Thread(d1);
		t1.start();
		Thread t2=new Thread(s1);
		t2.start();
	}

}
