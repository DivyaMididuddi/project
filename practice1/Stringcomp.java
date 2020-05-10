package practice1;
import java.util.Scanner;

public class Stringcomp
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		System.out.println("enter second string");
		String s2=sc.next();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
		
	}

}
