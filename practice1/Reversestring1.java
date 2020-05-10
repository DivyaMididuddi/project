package practice1;

import java.util.Scanner;

public class Reversestring1 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		String s1=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		System.out.println("given string "+ s);
		System.out.println("reverse of a string"+ s1);
	}
}
