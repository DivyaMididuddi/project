package stringprgms;

import java.util.Scanner;

public class Stringpgm4 
{
	public static void main(String[] args) 
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s1=sc.nextLine();
	String s4=" ";
	String s3=" ";
	String[] sArray=s1.split(" ");
	for(int i=sArray.length-1;i>=0;i--)
	{
		 s3=s3+reverse(sArray[i]);
	}
	for(int k=0;k<=s3.length()-1;k++)
	{	
	  s4=s4+s3.charAt(k);
	}
	System.out.println(s4);
	}
	
	public static String  reverse(String str)
	{
		String s2=" ";
		for(int j=0;j<=str.length()-1;j++)
		{
			char ch=str.charAt(j);
			s2=s2+ch;
			
			
		}
		return  s2;
}
}
