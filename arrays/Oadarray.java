package arrays;

import java.util.Scanner;

public class Oadarray
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);                                                
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter " +size+"values");
		for(int i=0;i<=size-1;i++)
		{
			
			a[i]=sc.nextInt();
		}
		for(int i=0;i<=size-1;i++)
		{
			if(i%2!=0)
			{
			sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
