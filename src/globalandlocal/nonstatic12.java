package globalandlocal;

public class nonstatic12 {
	int a=2;
	int b=6;//non-static
	
	public static void main(String[] args)
	{
		nonstatic12 c2=new nonstatic12();
		//System.out.println(c2.a);
		n1();
		c2.n2();
		
		
		
		
		
	}
	public static void n1()
	{
		nonstatic12 c2=new nonstatic12();
		System.out.println(c2.b);
		
	}
	public void n2()
	{
		//nonstatic12 c2=new nonstatic12();
		System.out.println(a);
		
		
	}
	
  
}
