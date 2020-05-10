package practice2;
import java.util.Scanner;

public class ReverseEachWord
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String finalstring=reverseString(s1[0]);
		for(int i=1;i<=s1.length-1;i++)
		{
			String s2=reverseString(s1[i]);
			finalstring=finalstring+" "+s2;
		}
		System.out.println("reversed string is:"+finalstring);
		
	}
	public static String reverseString(String s1)
	{
		String s2="";
		for(int j=s1.length()-1;j>=0;j--)
		{
			char ch=s1.charAt(j);
			s2=s2+ch;
		}
		return s2;
	}

}
