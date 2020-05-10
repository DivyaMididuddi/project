package stringprgms;
import java.util.Scanner;

public class Stringpgm5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		int cnt=0;
		String s2=" ";
		String s1=sc.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
			cnt++;
		}
		
		System.out.println(s2);
		System.out.println("no.of objects created="+cnt);
		
		
	}

}
