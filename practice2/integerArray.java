package practice2;
import java.util.Scanner;

public class integerArray
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	System.out.println("enter"+ size +" values");
	int i[]=new int[size];
	for(int j=0;j<=i.length-1;j++)
	{
		i[j]=sc.nextInt();
		System.out.println(i[j]);
	}
	
	}
	
}
