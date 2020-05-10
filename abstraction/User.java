package abstraction;

public class User
{
	public static void main(String[] args) 
	{
		Bikes  h1=Helper.getobject();
		h1.start();
		Helper1 h2=new Helper1();
		Bikes b1=h2.getobject1();
		b1.start();
		
		
	}

}
