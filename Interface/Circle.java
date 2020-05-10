package Interface;
public class Circle extends Shape
{
	final double pi=3.14;
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	public void findarea()
	{
		double area=pi*this.r*this.r;
		System.out.println("area of circle"+area);
		
	}

}
