package pgmstrings;
import java.util.Scanner;

public class Vcstring 
{
public static void main(String[] args)
{
	int cnt1=0;
	int cnt2=0;
	Scanner sc=new Scanner(System.in);
	String s;
	
	System.out.println("enter the string");
	s=sc.next();
	int l=s.length();
	for(int i=0;i<=l-1;i++)
	{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			cnt1++;
		}
		else
		{
			cnt2++;
		}
	}
	System.out.println("no.of vowels are:"+cnt1);
	System.out.println("no.of consonants are:"+cnt2); 
	
	
}
}
