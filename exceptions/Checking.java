package exceptions;
import java.util.Scanner;

public class Checking 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		while(true)
		{
			
		try
		{
		System.out.println("division"+a/b);
		break;
		
		}
		
		catch(ArithmeticException rv)
		{
			
			System.out.println("second number cannot be zero");
			System.out.println("enter second number");
			b=sc.nextInt();
			
			
			
		}
		
		
		}
		
	}

}
