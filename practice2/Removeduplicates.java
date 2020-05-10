package practice2;
import java.util.Scanner;

public class Removeduplicates 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		String s1="";
	
		for(int i=0;i<=s.length()-1;i++)
		{
			
			char ch=s.charAt(i);
			int k=s1.indexOf(ch);
			if(k==-1)
			{
				s1=s1+ch;
			}
			
		}
		System.out.println("string without duplicates:"+s1);
		
	}

}
