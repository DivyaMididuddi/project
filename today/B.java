package today;

public class B extends A{
	int j;
	int k;
	public B(int i,int j)
	{
		super(i);
		this.j=j;
	
		System.out.println(this.j);
	}
	public B(int i,int j,int k)
	{
		this(i,j);
		this.k=k;
		System.out.println(this.k);
	}
	public static void main(String[] args)
	{
	  B b1=new B(2,4,8);
	}

}
