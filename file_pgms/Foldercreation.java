package file_pgms;
import java.io.File;

public class Foldercreation 
{
	public static void main(String[] args) 
	{
		File f1=new File("E:/filestorage");
		boolean st=f1.mkdir();
		System.out.println(st);
		
	}

}
