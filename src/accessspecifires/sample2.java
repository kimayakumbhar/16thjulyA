package accessspecifires;

public class sample2 {
	
	int num;  //default access specifiers
	
	sample2()  //default
	{
		num=10;
	}
	 void m1()      // default access specifiers
	{
		System.out.println(num);
	}
	 
public static void main (String[] args)
{
	System.out.println("example of default access specifires");
sample2 s1=new sample2();
s1.m1();

System.out.println(s1.num);
}
}
