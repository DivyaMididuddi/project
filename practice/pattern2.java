package practice;

public class pattern2 {
public static void main(String[] args)
{
	int num1=6;
	int num2=0;
	for(int i=1;i<=6;i++)
	{
		num1--;
		num2++;
		
		for(int j=1;j<=num1;j++)
		{
		
			System.out.print('1');
			
		}
		for(int k=1;k<=num2;k++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	}
}
