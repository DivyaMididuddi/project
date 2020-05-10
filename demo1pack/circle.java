package demo1pack;

public class circle {
	final double pi=3.14;
	int r;
	public circle(int r)
	{

		this.r=r;
	}
	public void getarea()
	{
		double area=pi*this.r*this.r;
		System.out.println("area of circle="+area);
	}

}
