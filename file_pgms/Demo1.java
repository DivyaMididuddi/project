package file_pgms;



	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.ObjectOutputStream;

	public class Demo1
	{
		public static void main(String[] args) throws Exception
		
		{
			System.out.println("main starts");
			Student s1=new Student(34,"divya",67.05);
			File f1=new File("E:/filestorage/student.ser");
			FileOutputStream fos=new FileOutputStream(f1);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			System.out.println("serializable is complete");
			
		}

	}


