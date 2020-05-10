package stringprgms;
import java.util.Scanner;

public class Arraypgm13
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=1;j<=100;j++)
		{
			int status=0;
			for(int k=0;k<=size-1;k++)
			{
				if(j==a[k])
				{
					status=1;
					break;
				}
			}
			if(status==0)
			{
				System.out.print(j);
				System.out.print(" ");
			}
		}
		
	}

}
