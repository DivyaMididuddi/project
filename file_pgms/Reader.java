package file_pgms;
import java.io.File;
import java.io.FileReader;

public class Reader 
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("E:/filestorage/data.txt");
		FileReader fr=new FileReader(f1);
		
	    char a[]=new char[(int)f1.length()];
		fr.read(a);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("redaing is done");
		
	}

}
