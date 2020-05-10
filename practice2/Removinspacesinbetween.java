package practice2;
import java.util.Scanner;

public class Removinspacesinbetween
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s="   "+sc.nextLine()+"   ";
	String s1=s.trim();
	System.out.println("given string"+s);
	System.out.println("string with spaces only in the sentence:"+s1);
	
}
}
