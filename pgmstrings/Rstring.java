package pgmstrings;
import java.util.Scanner;

public class Rstring
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		String r="";
		System.out.println("Enter a string to enter");
		s=sc.next();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
					
		}
		
		System.out.println("reverse of the string="+r);
		
	}
	

}
