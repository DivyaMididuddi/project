package exceptions;
import java.util.Scanner;


public class Checking2
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	try
	{
	Thread.sleep(3000);
	System.out.println("hello");
	}
	catch(InterruptedException rv)
	{
		System.out.println("its ok");
	}
	
	
}
}
