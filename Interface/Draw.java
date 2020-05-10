package Interface;

public class Draw
{
	public static void main(String[] args)
	{
		displayarea(new Circle(2));
		displayarea(new Rectangle(2,3));
		displayarea(new Triangle(6,7));
		
	}
	public static void displayarea(Circle c1)
	{
		c1.findarea();
	}
    public static void displayarea(Rectangle r1)
    {
    	r1.findarea();
    	
    }
    public static void displayarea(Triangle t1)
    {
    	t1.findarea();
    }
}
