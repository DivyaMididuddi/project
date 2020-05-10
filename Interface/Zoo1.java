package Interface;

public class Zoo1 
{
	public static void main(String[] args)
	{
		Zoo1 z1=new Zoo1();
		
		z1.makesounds(new Lion());
		z1.makesounds(new Tiger());
		
	}

public   void makesounds(Animal a1)//upcasting     
{
	a1.noise();
}
}
