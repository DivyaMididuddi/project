package practice;

public class Count {
	static   int cnt=0;
	public  Count()
	{
	cnt++;
	
	
	}
	
public static void main(String[] args)
{
	Count c1=new Count();
	Count c2=new Count();
	System.out.println(cnt);
	
}
}
