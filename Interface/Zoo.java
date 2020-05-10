package Interface;

public class Zoo 
{
	public static void main(String[] args) 
	{
		Lion l1=new Lion();
		l1.noise();
		Tiger t1=new Tiger();
		t1.noise();
		makesound(new Lion());
		makesound(new Tiger());
		
	}
	public static void makesound(Lion l2)
	{
		l2.noise();
	}
	public static void makesound(Tiger t2)
	{
		t2.noise();
	}
	

}
