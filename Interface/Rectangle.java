package Interface;

public class Rectangle extends Shape
{
	int l;
	int b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public void findarea()
	{
		int area=this.l*this.b;
		System.out.println("area of rectangle"+area);
	}

}
