package file_pgms;
import java.io.Serializable;

public class Student implements Serializable
{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks)
	{
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public void info()
	{
		System.out.println("id:"+this.id);
		System.out.println("name:"+this.name);
		System.out.println("marks:"+this.marks);
	}
	

}
