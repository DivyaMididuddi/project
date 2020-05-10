package pgmstrings;
import java.util.Scanner;
public class Check1s
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int l=s.length();
		System.out.println("enter the letter to find");
		String ch=sc.next();
		
		if(s.contains(ch))
		{
			System.out.println("character is present ");
		}
		else
		{
			System.out.println("character is not present");
		}
		
	}

}
