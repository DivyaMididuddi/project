package practice2;
import java.util.Scanner;

public class Lengthofstringwithoutmethod 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.next();
	char ch[]=s.toCharArray();
	int i=ch.length;
	System.out.println("length of a string:"+i);
	
}
}
