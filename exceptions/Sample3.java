package exceptions;

public class Sample3 
{
public static void main(String[] args) 
{
	int a=10;
     int b=2;
     try
     {
    	 System.out.println("in try block");
     }
     catch(ArithmeticException rv)
     {
    	 System.out.println("in catch block");
     }
     finally
     {
    	 System.out.println("in finally block");
     }
	
}
}
