package practice;

public class time {
public static void main(String[] args)
{
	clock c1=new clock(2,24,56);
	int rhrs=c1.gethrs();
	int rmin=c1.getmin();
	int rsec=c1.getsec();
	System.out.println(rhrs+":"+rmin+":"+rsec);
	c1.sethrs(5);
	c1.setmin(45);
	c1.setsec(22);
	int rhrs1=c1.gethrs();
	int rmin1=c1.getmin();
	int rsec1=c1.getsec();
	System.out.println(rhrs1+":"+rmin1+":"+rsec1);
	
}
}
