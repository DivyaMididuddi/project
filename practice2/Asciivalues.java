package practice2;
import java.util.Scanner;

public class Asciivalues 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			int j=(int)ch;
			System.out.println("ascii values of:"+ch+" are:"+j);
		}
		
	}

}
