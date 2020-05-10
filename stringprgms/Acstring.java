package stringprgms;

import java.util.Scanner;

public class Acstring 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		int l=s.length();
		for(int i=0;i<=l-1;i++)
		{
			if(Character.isAlphabetic(s.charAt(i)))
		    {
	        cnt++;			
     		}
			
			
		}
		System.out.println("no.of alphabets"+cnt);
		}
}
