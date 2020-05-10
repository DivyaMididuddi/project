package exceptions;

public class InvalidDetailsException extends RuntimeException 
{
	@Override
	public String toString()
	{
		return "exceptions.Student:the id should be between [100-999],the name should be greater than 5 characters,"
				+ "emailid should contain @ symbol and mobileno should be only 10 digits";
	}

}
