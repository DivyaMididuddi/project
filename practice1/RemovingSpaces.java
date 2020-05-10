package practice1;
import java.util.Scanner;

public class RemovingSpaces 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	String s2="";
	for(int i=0;i<=s1.length-1;i++)
	{
		s2=s2+s1[i];
		
	}
	System.out.println(s);
    System.out.println(s2);	
}
}
