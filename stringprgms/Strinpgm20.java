package stringprgms;
import java.util.Scanner;

public class Strinpgm20 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to reverse");
		String s1=sc.nextLine();
		String s2[]=s1.split(" ");
		String s3= " ";
		for(int i=0;i<=s2.length-1;i++)
		{
			s3=s3+reverse(s2[i]);
			
		}
		s3=s3.trim();
		System.out.println("reversed string is"+s3);
		
	}
	public static String reverse(String s2)
	{
		String rev=" ";
		for(int j=s2.length()-1;j>=0;j--)
		{
		rev=rev+s2.charAt(j);
			
		}
		return rev;
	}

}
