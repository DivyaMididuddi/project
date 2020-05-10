package exceptions;
import java.util.Scanner; 

public class Jsp 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter emailid");
		String emailId=sc.next();
		System.out.println("enter mobile no");
		String mobileno=sc.next();
		
		
		
		while(true)
		{
			
		try
		{
			
		Student s1=new Student(id,name,emailId,mobileno);
		System.out.println(s1);
		
		s1.changedetails();
		break;
		}
		catch(InvalidDetailsException rv)
		{
			System.out.println("entered details are invalid");
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter name");
			 name=sc.next();
			System.out.println("enter emailid");
			emailId=sc.next();
			System.out.println("enter mobile no");
			mobileno=sc.next();
			
		}
		}
		
		
	}

}
