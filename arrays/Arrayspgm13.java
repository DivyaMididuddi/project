package arrays;
import java.util.Scanner;

public class Arrayspgm13
{

	public static void main(String[] args)
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter"+size+"temperatures");
		for(int i=0;i<=size-1;i++ )
		{
			a[i]=sc.nextInt();		
		}
		for(int j=0;j<=size-1;j++)
		{
			int d=a[j];
			if(d<0)
			{
				cnt++;
			}
		}
		System.out.println("no.of negative temperatures are"+cnt);
	}
}
