package practice1;

import java.util.Scanner;

public class Rstringwocharat 
{
	public static void main(String[] args) 
	{
		String s2="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a string");
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s2=s2+ch[i];
		}
		System.out.println("reverse string is "+s2);
		
	}

}
