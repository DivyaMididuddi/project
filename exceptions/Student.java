package exceptions;

public class Student 
{
	private int id;
	private String name;
	private String emailId;
	private String mobileno;
	
	public Student(int id, String name, String emailId, String mobileno)
	{
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.mobileno = mobileno;
		number();
		
		
	}
	
	@Override
	public String toString()
	{
		return "student details are:- "+"id:"+this.id+  "name"+this.name  +"emailid"+this.emailId+  "mobileno"+this.mobileno;
	}
	public void number()
	
	{
		if(mobileno.length()==10)
		{
		for(int i=0;i<=9;i++)
		{
			if((mobileno.charAt(i)>='0')&&(mobileno.charAt(i)<='9'))
			{
			
				
			}
			else
			{
				throw new InvalidDetailsException();
			}
		}
		
		
		}
	}
	public void changedetails()
	{
		
		if((id>=100)&&(id<=999)&&(name.length()>=5)&&(emailId.contains("@"))&&(mobileno.length()==10))
		   {
			
			
			this.id=id;
			this.name=name;
			this.emailId=emailId;
			this.mobileno=mobileno;
			}
				else
				{
					throw new InvalidDetailsException();
				}
		 	}
			
		}
		
		
	
	
	


