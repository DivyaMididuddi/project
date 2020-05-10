package practice;

public class pattern {
	public static void main(String[] args)
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=4;j++)
			{
               if(i==j)
               {
System.out.print(i);            	   
               }
               else
               {
System.out.print('0');            	   
               }
			}
			System.out.println();
		}
	}

}
