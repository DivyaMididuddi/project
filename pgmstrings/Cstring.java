package pgmstrings;
import java.util.Scanner;

public class Cstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s= sc.next();
		int count=s.length();
		System.out.println("no.of elements"+count);
	}

}
