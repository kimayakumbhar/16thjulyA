package nonstaticmethod;

public class sample3 {
public static void main(String[] args)
{
 System.out.println("NON STATIC METHOD CALL FROM SAME CLASS");
 sample3 s=new sample3();
 s.c1();
 s.c2();
 
}
	public void c1()
	{
		System.out.println("class one");
	}
	public void c2()
	{
		System.out.println("class two");
	}
}
