package practice1;

import java.util.Scanner;

public class Countvowels1 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		
		int l=s.length()-s.replaceAll("[AEIOUaeiou]", "").length();
		System.out.println("no of vowels present are"+l);
		
	}

}
