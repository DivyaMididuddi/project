package Interface;

public class Draw1 
{
	public static void main(String[] args) 
	{
		displayarea(new Circle(3) );
		displayarea(new Rectangle(4,6));
		displayarea(new Triangle(4,6));
	}
	public static void displayarea(Shape s1)
	{
		s1.findarea();
	}

}
