package practice1;
import java.util.Scanner;

public class Characterarray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  a string");
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.print(ch[i]);
		}
		
	}
	

}
