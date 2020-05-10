package practice1;
import java.util.Scanner;

public class Largestnumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s=sc.nextLine();
		String sArray[]=s.split(" ");
		int big=sArray[0].length();
		int index=0;
		for(int i=1;i<=sArray.length-1;i++)
		{
			int tempbig=sArray[i].length()-1;
			if(big<tempbig)
			{
				big=tempbig;
				index=i;
			}
		}
		System.out.println("largest  substring is"+sArray[index]);
		
	}

}
