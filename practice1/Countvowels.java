package practice1;

import java.util.Scanner;

public class Countvowels 
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
			{
				cnt++;
			}
		}
		System.out.println("no of vowels   present are"+cnt);
		
	}

}
