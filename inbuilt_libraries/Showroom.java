package inbuilt_libraries;

public class Showroom
{
	public static void main(String[] args)
	{
		Car c1=new Car("audi",6,7.0,"black");
		Car c2=new Car("bmw",9,7.0,"grey");
		Car c3=new Car("jaguar",6,8.9,"blue");
		System.out.println(c1);
		System.out.println(c2);
		boolean status=c1.equals(c2);
		System.out.println(status);
		boolean st =c1.equals(c3);
		System.out.println(st);
		
	}

}
