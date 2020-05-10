package file_pgms;
import java.io.File;
import java.io.FileWriter;

public class Writer 
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("E:/filestorage/data.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("java\r\n");
		fw.write("html\r\n");
		fw.write("sql\r\n");
		fw.flush();
		System.out.println("writing is done");
	}

}
