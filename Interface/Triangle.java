package Interface;

public class Triangle extends Shape
{
	int b;
	int h;
	public Triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public void findarea()
	{
		double area=0.5*b*h;
		System.out.println("area of triangle"+area);
	}

}
