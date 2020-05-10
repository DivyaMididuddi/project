package stringprgms;
import java.util.Scanner;

public class Stringpgm2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		
		String s3=" ";
		String[] sArray=s1.split(" ");
		for(int i=0;i<=sArray.length-1;i++)
		{
			 s3=s3+reverse(sArray[i]);
		}
		System.out.println(s3);
		}
		
		public static String  reverse(String str)
		{
			String s2=" ";
			for(int j=str.length()-1;j>=0;j--)
			{
				char ch=str.charAt(j);
				s2=s2+ch;
				
				
			}
			return  s2;
			
			
		}
		
	
	}



