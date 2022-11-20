package multiparameter;

public class sample1 {
	public static void main(String[] args)
	{
		System.out.println("passing integer data as a parameter");
		m1(1,5);
		sample1 s1=new sample1();
		s1.m2(12,23);
	}
	public static void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	public void m2(int x, int y)
	{
		System.out.println(x-y);
	}

}
