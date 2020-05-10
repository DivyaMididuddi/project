package stringprgms;
import java.util.Scanner;

public class Stringpgm3 
{
	public static void main(String[] args) 
	{
	
	Scanner sc=new Scanner(System.in);
	int cnt=0;
	System.out.println("enter string");
	String s1=sc.nextLine();
	
	String s3=" ";
	String[] sArray=s1.split(" ");
	for(int i=0;i<=sArray.length-1;i++)
	{
		if(sArray[i]==" ")
       {
			
	   }
		else
		{
		 cnt++;
	    }
	}
	System.out.println(cnt);
	
	

}
}
