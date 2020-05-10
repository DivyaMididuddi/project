package practice2;
import java.util.Scanner;

public class Wordispresent 
{
public static void main(String[] args) 
{
	int cnt=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a sentence");
	String s=sc.nextLine();
	System.out.println("enter a word to be searched");
	String s1=sc.next();
	String s2[]=s.split(" ");
	for(int i=0;i<=s2.length-1;i++)
	{
		if(s1.equals(s2[i]))
    {
			cnt++;
    }
    
	
	}
	if(cnt==1)
	{
		System.out.println("word is present");
	}
	else
	{
		System.out.println("word is not present");
	}
	
	
}
}
