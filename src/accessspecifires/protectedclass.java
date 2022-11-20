package accessspecifires;

public class protectedclass {

	protected int num;
	protected String l;
	
	protected protectedclass ()
	{
		num=10;
		l="laxmi";
	}
	protected void name()
	{
		System.out.println(num);
	}
	
	public static void main(String[] args)
	{
	
		
	protectedclass p1=new protectedclass();
	p1.name();
	System.out.println(p1.num);
	}
}
