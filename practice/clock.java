package practice;

public class clock {
	private  int hrs;
	private  int min;
	private  int sec;
	public clock(int hrs,int min,int sec)
	{
	sethrs(hrs);
	setmin(min);
	setsec(sec);
	}
	public void sethrs(int hrs)
	{
		if((hrs>=0)&&(hrs<=23))
		{
			this.hrs=hrs;
		}
		else
		{
			//throw exception
		}
	}
	public void setmin(int min)
	{
		if((min>=0)&&(min<=60))
		{
			this.min=min;
		}
		else
		{

			//throw exception
		}
		
	}
	public void setsec(int sec)
	{
		if((sec>=0)&&(sec<=60))
		{
			this.sec=sec;
		}
		else
		{
//throw exception			
		}
		
	}
	public int gethrs()
	{
		return hrs;
		
	}
	public int getmin()
	{
		return min;
	}
	public int getsec()
	{
		return sec;
	}

}
