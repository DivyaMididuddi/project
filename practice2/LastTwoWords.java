
package practice2;
import java.util.Scanner;

public class LastTwoWords
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("enter  a sentence");
	String s=sc.nextLine();
	String s1[]=s.split(" ");
	for(int i=0;i<=s1.length-1;i++)
	{
		int index=i;
		if((index==s1.length-2)||(index==s1.length-1))
		{
			System.out.println(s1[index]);
		}
	}
	
	}

}
