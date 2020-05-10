package practice2;
import java.util.Scanner;

public class UpperndLowercase 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.next();
	String us=s.toUpperCase();
	String ls=s.toLowerCase();
	System.out.println("original string is:"+s);
	System.out.println("uppercase string is:"+us);
	System.out.println("lowercase string is:"+ls);
	
}
}
