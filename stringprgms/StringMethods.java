package stringprgms;

public class StringMethods 
{
	public static void main(String[] args)
	{
		String s1="javadeveloper";
		int i1=s1.indexOf('a');
		System.out.println(i1);
		int i2=s1.indexOf('a',2);
		System.out.println(i2);
		int i3=s1.indexOf('a',4);
		System.out.println(i3);
		String s2="html";
		char[] ch=s2.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
