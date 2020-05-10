package file_pgms;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Sample1 
{

	public static void main(String[] args) throws Exception
	{
		File f1=new File("E:/filestorage/student.ser");
		FileInputStream fis=new FileInputStream(f1);
		ObjectInputStream ois =new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();
		s1.info();
		ois.close();
		fis.close();
		
		
	}
}
