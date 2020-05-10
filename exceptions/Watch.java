package exceptions;

public class Watch 
{
	private int hrs;
	private int mins;
	private int secs;
	public Watch(int hrs, int mins, int secs)
	{
		super();
		this.hrs = hrs;
		this.mins = mins;
		this.secs = secs;
	}
	@Override
	public String toString()
	{
		return "time:-"+"hrs:"+this.hrs+"mins:"+this.mins+"secs"+this.secs;
	}
	public void changetime()
	{
		if((hrs>=0)&&(hrs<=23)&&(mins>=0)&&(mins<=59)&&(secs>=0)&&(secs<=59))
		{
			this.hrs=hrs;
			this.mins=mins;
			this.secs=secs;
		}
		else
		{
			throw new InvalidtimeException();
		}
	}

}
