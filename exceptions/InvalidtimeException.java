package exceptions;

public class InvalidtimeException extends RuntimeException
{
	@Override
	public String toString()
	{
		return "exceptions.IvalidtimeException:time must contain hrs:(0-23),mins:(0-59),secs:(0-59)";
	}

}
