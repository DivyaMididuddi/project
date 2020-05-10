package stringprgms;
import java.util.Scanner;

public class Stringpgm6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
		String  s2="";
		char[] ch=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			s2=s2+ch[i];
		}
		System.out.println(s2);
	}

}
