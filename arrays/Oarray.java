package arrays;

import java.util.Scanner;

public class Oarray 
{
	public static void main(String[] args) 
	{
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
			System.out.println(a[i]);
			}
		}

	}
}