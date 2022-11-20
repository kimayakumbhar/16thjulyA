package globalandlocal;
 
public class globalvari {
	int b=1;
 static int a=10;
	public static void main(String[] args)
	{
		//int a=10;
		System.out.println(a);
		globalvari g= new globalvari();
		g.m1();
		
		System.out.println(g.b);
		
		
		
		//System.out.println(c);
	}
 public void m1() 
 {
	 System.out.println("jgj"+a);
	 System.out.println(b);
 }
 
 
}
