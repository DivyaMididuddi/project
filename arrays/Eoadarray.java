package arrays;

import java.util.Scanner;

public class Eoadarray 
{	
	public static void main(String[] args) 
{
	int sum1=0;
	int sum2=0;
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
		if(i%2==0)
		{
		
			sum1=sum1+a[i];
		}
		else
		{
			sum2=sum2+a[i];
		}
		
		
		
	}
	System.out.println("even sum="+sum1);
	System.out.println("odd sum="+sum2);
	
	
}

}
