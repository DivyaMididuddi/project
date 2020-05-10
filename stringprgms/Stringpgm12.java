package stringprgms;

import java.util.Scanner;

public class Stringpgm12 
{
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of first string");
	int size1=sc.nextInt();
	System.out.println("enter size of second string");
	int size2=sc.nextInt();
	
	int[] i1=new int[size1];
	
	int[]  i2=new int[size2];
	int size3=size1+size2;
	int[] i3=new int[size3];
	System.out.println("enter first array"+size1+"elements");
	
	for(int i=0;i<=size1-1;i++)
	{
		i1[i]=sc.nextInt();	
	}
	System.out.println("first string elements are:");
	for(int k=0;k<=size1-1;k++)
	{
		System.out.println(i1[k]);
	}
	System.out.println("enter second array"+size2+"elements");
	
	

	for(int j=0;j<=size2-1;j++)
	{
		i2[j]=sc.nextInt();	
	}
	System.out.println("second sstring elements are:");
	for(int l=0;l<=size2-1;l++)
	{
		System.out.println(i2[l]);
	}
   for(int d=0;d<=size1-1;d++)
  {
	i3[d]=i1[d];

  }
   int e=i1.length;
   for(int f=0;f<=size2-1;f++)
   {
	   i3[e]=i2[f];
	   e++;
   }
   System.out.println("third string elements are");
   for(int m=0;m<=size3-1;m++)
   {
	   System.out.println(i3[m]);
   }
}
}