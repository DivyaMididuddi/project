package stringprgms;
import java.util.Scanner;

public class Stringpgm9 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	System.out.println("enter character elements");
	System.out.println("enter"+size+"values");
	String s1=sc.next();
	char[] ch=s1.toCharArray();
	for(int i=0;i<=size-1;i++)
	{
		 char ch1=ch[i];
		 System.out.print("\t"+ch1);
	}
	
	
}
}

