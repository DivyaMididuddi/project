package practice1;
import java.util.Scanner;
public class Counteachvowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int cnt1=0;
		int cnt2=0;
		int cnt3=0;
		int cnt4=0;
		int cnt5=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if((ch=='a')||(ch=='A'))
			{
				cnt1++;
			}
			else if((ch=='e')||(ch=='E'))
			{
				cnt2++;
			}
			else if((ch=='I')||(ch=='i'))
			{
				cnt3++;
			}
			else if((ch=='o')||(ch=='O'))
			{
				cnt4++;
			}
			else if((ch=='u')||(ch=='U'))
			{
				cnt5++;
			}
			
		}
		System.out.println("no of a characters are"+cnt1);
		System.out.println("no of e characters are"+cnt2);
		System.out.println("no of i characters are"+cnt3);
		System.out.println("no of o characters are"+cnt4);
		System.out.println("no of u characters are"+cnt5);
		
	}

}
