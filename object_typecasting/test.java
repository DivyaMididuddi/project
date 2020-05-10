package object_typecasting;

public class test {
	public static void main(String[] args)
	{
	    A a1=(A)new B();
	    System.out.println(a1.i);
	    B b1=(B)a1;
	    System.out.println(b1.i);
	    System.out.println(b1.j);
	     A a2=(A)new C();
	     System.out.println(a2.i);
	     C c1=(C)a2;
	     System.out.println(c1.i);
		    System.out.println(c1.k);
	     
	}

}

