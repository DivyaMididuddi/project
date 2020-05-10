package stringprgms;
import java.util.Scanner;
public class Countcharacter 
{
	public static void main(String[] args)
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		System.out.println("enter character");
		String ch=sc.next();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(ch.charAt(0)==s.charAt(i))
			{
				cnt++;
			}
		}
		System.out.println("no.of times char is present"+cnt);
		
	}

}
