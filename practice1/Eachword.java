package practice1;
import java.util.Scanner;

public class Eachword 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		
		
	}

}
