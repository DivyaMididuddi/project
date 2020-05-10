package arrays;
import java.util.Scanner;
public class Arraypgm12
{
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		System.out.println("enter num to be compared");
		int numk=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter"+ size +"values");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<=size-1;j++)
		{
		  int 	d=a[j];
		  if(d<numk)
		  {
			  cnt++;
		  }
			
		}
		System.out.println("number of elements less than the given element are "+cnt);
		
		
	}
	

}
