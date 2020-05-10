package stringprgms;
import java.util.Scanner;

public class Strimgpgm11
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of string");
	int size=sc.nextInt();
	System.out.println("enter"+size+"elements");
	int[] i1=new int[size];
	int[] i2=new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<=size-1;i++)
	{
		i1[i]=sc.nextInt();
		
		
	}
	System.out.println("first string elements are:");
	for(int k=0;k<=size-1;k++)
	{
		System.out.println(i1[k]);
	}
	System.out.println("\n"+"********************");
	System.out.println("copied string elements are:");
	for(int j=0;j<=size-1;j++)
	{
		i2[j]=i1[j];
		System.out.println(i2[j]);
	}
	
	
	
	
}
}
