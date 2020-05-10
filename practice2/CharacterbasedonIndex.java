package practice2;
import java.util.Scanner;

public class CharacterbasedonIndex 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		System.out.println("enter the index number u want ");
		int index=sc.nextInt();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i==index)
			{
				System.out.println("desired character is:"+s.charAt(i));
			}
		}
		
	}

}
