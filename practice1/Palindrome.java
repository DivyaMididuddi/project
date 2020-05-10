package practice1;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args)
	{
		int cnt=0;
		String s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String s1=sc.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
			
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("given string is palindrome");
		}
		
		else
		{
			System.out.println("string is not a palindrome");
		}
	
	
	}
}
