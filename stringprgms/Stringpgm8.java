package stringprgms;
import java.util.Scanner;

public class Stringpgm8 
{
	public static void main(String[] args)
	{
		int finalsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=sc.next();
	
		for(int i=0;i<=s1.length()-1;i++)
		{
				char ch1=s1.charAt(i);
				if(Character.isDigit(ch1))
				{
				String numberString=ch1+"";
				int number=Integer.parseInt(numberString);
				finalsum=finalsum+number;
			    }
	
		}
		System.out.println("sum of digits is"+finalsum);
		
	}
	

}
