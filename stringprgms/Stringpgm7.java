package stringprgms;
import java.util.Scanner;
public class Stringpgm7 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			int k=s2.indexOf(ch);
			if(k==-1)
			{
				s2=s2+ch;
			}
		}
		System.out.println("given string"+s1);
		System.out.println("string without duplicate:"+s2);
		
	}

}
