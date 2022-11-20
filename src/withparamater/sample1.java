package withparamater;

public class sample1 {

	public static void main(String[] args)
	{
		System.out.println("METHOD WITHOUT PARAMETER");
		m1(); //method name
		
		sample2.m2();//classname.methodname
		
	    sample1 s1=new sample1(); //create object of same class
	    s1.m3();                 // objectname.method name
	    
	    sample2 s2= new sample2(); //create object of diff class
	    s2.m4();                 // diff class object name.method name()
		
	}
	public static void m1() //static regular method
	{
		System.out.println("running static regular method m1 from same class");
		
	}
	public void m3()//non-static regular method
	{
		System.out.println("running non-static regular method m3 from same class");
	}
	
}
	