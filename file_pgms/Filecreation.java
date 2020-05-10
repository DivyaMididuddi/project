package file_pgms;
import java .io.File;

public class Filecreation 
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("E:/filestorage/data.txt");
		boolean st=f1.createNewFile();
		System.out.println(st);
		
	}

}
