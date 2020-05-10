package practice1;
import java.util.Scanner;

public class CountofeachCharacter 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	
	for(int i=0;i<=s.length()-1;i++)
	{
		int cnt=0;
		char ch=s.charAt(i);
		for(int j=0;j<=s.length()-1;j++)
		{
			
		if(ch==s.charAt(j))
		{
			cnt++;
		}
		
		}
		System.out.println("character is "+ch+" no of times "+cnt);
	}
	
}
}
