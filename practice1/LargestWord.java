package practice1;
import java.util.Scanner;

public class LargestWord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		String s2="";
		for(int i=0;i<=s1.length-1;i++)
		{
			for(int j=i+1;j<=s1.length-1;j++)
			{
				int temp=s1[i].length();
				if(temp<s1[j].length())
				{
					s2=s1[i];
					s1[i]=s1[j];
					s1[j]=s2;
				}
			}
		}
		System.out.println(s1[0]);
		
	}

}
