package accessspecifires;

public class public1 {

	public int i;
	
	public public1()
	{
		i=6;
		
	}
	public void m1()
	{
		System.out.println(i);

	}
	public static void main(String[] args)
	{
		public1 p1=new public1();
		p1.m1();
		System.out.println(p1.i);
	}
}



