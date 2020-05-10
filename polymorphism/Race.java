package polymorphism;

public class Race
{
	public static void main(String[] args)
	{
		
		startrace(new Hero());
		startrace(new Duke());
		startrace(new Royalenfield());
		
	}
	public static void startrace(Bike b1)
	{
		b1.start();
	}

}
