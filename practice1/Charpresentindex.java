package practice1;
import java.util.Scanner;

public class Charpresentindex 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.next();
	System.out.println("enter a character to be searched");
	char ch=sc.next().charAt(0);
	for(int i=0;i<=s.length()-1;i++)
	{
		if(ch==s.charAt(i))
		{
			System.out.println("index number is"+ i);
		}
	}
	
}
}
