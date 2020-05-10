package pgmstrings;
import java.util.Scanner;

public class CheckS 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		
		String s=sc.next();
		System.out.println("enter the letter to find");
		String d=sc.next();
		boolean st=s.contains(d);
		
			if(st)
			{
				System.out.println("character is presnt");
			}
			else
			{
				System.out.println("character is not present");
			}
		
		
		
			
		
	}

}
