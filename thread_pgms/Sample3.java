package thread_pgms;

public class Sample3
{
	public static void main(String[] args) 
	{
		Commonsource cs=new Commonsource();
		Test3 t1=new Test3(cs);
		Test4 t2=new Test4(cs);
		t1.start();
		t2.start();
		
		
	}

}
