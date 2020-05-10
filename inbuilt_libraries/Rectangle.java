package inbuilt_libraries;

public class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) 
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int area()
	{
		int area=this.length*this.breadth;
		return area;
	}
	@Override
	public String toString()
	{
		return "area of rect:"+this.area();
	}
	@Override
	public boolean equals(Object o1)
	
	{
		Rectangle rv=(Rectangle)o1; 
		return (this.length==rv.length)&&(this.breadth==rv.breadth);
	}
	

}
