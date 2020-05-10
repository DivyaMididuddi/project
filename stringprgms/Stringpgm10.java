package stringprgms;
import java.util.Scanner;

public class Stringpgm10
{
public static void main(String[] args) 

{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	System.out.println("enter"+size+"elements");
	int[] i1=new int[size];
	for(int i=0;i<=size-1;i++)
	{
		i1[i]=sc.nextInt();
	}
	System.out.println("enter elemnet to search");
	int e=sc.nextInt();
	int cnt=0;
	for(int i=0;i<=size-1;i++)
	{
	  if(e==i1[i])
	  {
		 cnt=1;
		 break;
	  }
	}
	
	if(cnt==1)
	{
		System.out.println("element is present");
	}
	else
	{
		System.out.println("element is not present");
	}
}
}
