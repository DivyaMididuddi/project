package stringprgms;
import java.util.Scanner;

public class Stringpgm1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		String s2=reverse(s1);
		System.out.println(s2);
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
			
		  
	}
	public  static String reverse(String s2)
	{
		String rev="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev=rev+s2.charAt(i);
		}
		return rev;
	}
}
		
		
		
	


