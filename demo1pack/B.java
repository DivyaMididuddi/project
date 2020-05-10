package demo1pack;

public class B extends A {
	int j;
	public B(int i,int j)
	{
		super(i);
		this.j=j;
		
	}
	public void details()
	{
		System.out.println("classb"+this.j);
		System.out.println("classa"+this.i);
		
	}

}
