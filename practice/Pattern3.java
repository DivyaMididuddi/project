package practice;

public class Pattern3 
{
	public static void main(String[] args)
	{
		int space=-1;
		int space2=5;
		for(int i=5;i>=1;i--)
		{
			if(i>=3)
			{
				space++;
				space2=space2-2;
			}
			else
			{
				space--;
				space2=space2+2;
			}
			   for(int m=5;m>=1;m--)
			   {
				if(i!=3)
				{
					for(int j=1;j<=space;j++)
					{
						System.out.print("");
					}
					System.out.print(m);
					for(int k=1;k<=space2;k++)
					
					{
						System.out.print("");
					}
					System.out.print(m);
				}
				else
					
				{
					for(int j=1;j<=space;j++)
					{
						System.out.print("");
					}
					System.out.println(m);
					for(int k=1;k<=space2;k++)
					{
						System.out.print("");
					}
				}System.out.println();
		
				System.out.println();	
					
					
					
			   }
				
			
		}
		
		

		}
		
	}

