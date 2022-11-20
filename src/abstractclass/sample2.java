package abstractclass;


//concrete class /sub class or complete class


public class sample2 extends sample1 {

	public void m3()
	{
		System.out.println("method m3 completed in concrete class");
	}
	public void m4()
	{
		System.out.println("method m4 completed in concrete class");
	}
	public static void main(String[] args)
	{
		sample2 s2=new sample2();
		s2.m1();
		s2.m2();
		s2.m3();
		s2.m4();
	}
}
