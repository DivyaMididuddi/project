package practice2;

import java.util.Scanner;

public class NexttoLastWord
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter  a sentence");
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	System.out.println("next to last word of string is:"+s1[s1.length-2]);
	}
}
