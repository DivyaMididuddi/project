package exceptions;

public class Student1 
{

	private int id;
	private String name;
	private String emailId;
	private String mobileno;
	
	public Student1(int id, String name, String emailId, String mobileno)
	{
		super();
		setId(id);
		setName(name);
		setEmailId(emailId);
		setMobileno(mobileno);
		
		
	}
	public void setId(int id)
	{
		if((id>=100)&&(id<=999))
		{
			this.id=id;
		}
		else
		{
			throw new InvalidDetailsException();
		}
	}
	public void setName(String name)
	{
		if(name.length()>=5)
		{
			this.name=name;
		}
		else
		{
			throw new InvalidDetailsException();
		}
		
	}
	public void setEmailId(String emailId )
	{
		if(emailId.contains("@"))
		{
			this.emailId=emailId;
		}
		else
		{
			throw new InvalidDetailsException();
		}
	}
	
	public void setMobileno  ( String mobileno)
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
	public int getId()
	{
		return this.id;
	}
	public String getname()
	{
		return this.name;
	}
	public String getemailId()
	{
		return this.emailId;
	}
	public String getmobileno()
	{
		return this.mobileno;
	}
	@Override
	public String toString()
	{
		return "student details are:- "+"id:"+this.id+  "name"+this.name  +"emailid"+this.emailId+  "mobileno"+this.mobileno;
	}

}
