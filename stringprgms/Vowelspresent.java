package stringprgms;
import java.util.Scanner;

public class Vowelspresent
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.next();
	for(int i=0;i<=s.length()-1;i++)
	{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("vowels are:"+ch);
		}
		
	}
	
	
}
}
