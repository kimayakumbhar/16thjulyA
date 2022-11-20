package globalandlocal;

public class static1 {
   int a=3;
 float b=1.34f;
   
  public void m1()
  {   
	  System.out.println(a);
  }
  public static void m2()
  {   static1 s1=new static1();
	  System.out.println(s1.b);
  }
  public static void main (String[] args)
  {   
	 
	m2();
	static1 s1=new static1();
	s1.m1();
	
  }
}
