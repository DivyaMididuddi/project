package practice1;

import java.util.Scanner;

public class Charcount 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println("enter a character to be searched");
		char ch=sc.next().charAt(0);
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch==s.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println("no of times character is present is"+cnt);
		
	}
	

}
