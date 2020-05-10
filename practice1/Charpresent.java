package practice1;
import java.util.Scanner;

public class Charpresent 
{
	public static void main(String[] args)
	{
		int status=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println("enter the character to be searched");
		char ch=sc.next().charAt(0);
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch==s.charAt(i))
			{
				status=1;
				break;
			}
		}
		if(status==1)
		{
			System.out.println("given character is present in the string");
		}
		else
		{
			System.out.println("given character is not present in a string");
		}
		
	}

}
