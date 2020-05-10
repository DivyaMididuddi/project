package inbuilt_libraries;

public class Car 
{
	String bn;
	int ts;
	double m;
	String color;
	public Car(String bn, int ts, double m, String color) 
	{
		super();
		this.bn = bn;
		this.ts = ts;
		this.m = m;
		this.color = color;
	}
	@Override
	public String toString()
	{
		return bn;
	}
	@Override
	public boolean equals(Object o1)
	{
		Car rv=(Car)o1;
		return this.m==rv.m;
		
	}
	
	

	

}
