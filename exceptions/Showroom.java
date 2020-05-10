package exceptions;

import java.util.Scanner;

public class Showroom 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter hours");
	int hrs=sc.nextInt();
	System.out.println("enter mins");
	int mins=sc.nextInt();
	System.out.println("enter secs");
	int secs=sc.nextInt();
	

	while(true)
	{
	try
	{
		Watch w1=new Watch(hrs,mins,secs);
		System.out.println(w1);
		
		w1.changetime();
		break;
	}
	catch(InvalidtimeException rv)
	{
		System.out.println("entered time is invalid");
		System.out.println("re-enter hrs");
		
		 hrs=sc.nextInt();
		System.out.println("re-enter mins");
		  mins=sc.nextInt();
		System.out.println("re-enter secs");
		  secs=sc.nextInt();
		  
		  
	}
	
	
	}
	
}
}
