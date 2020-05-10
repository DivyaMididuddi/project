package practice;

public class Abobj2 
{
	public static void main(String[] args)
	{
		Abobj o1=new Abobj1();
		o1.run();
	
		o1.sleep1();
		Abobj1 o2=(Abobj1)o1;
		o2.sleep();
		
		
	}

}
