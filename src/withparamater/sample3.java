package withparamater;

public class sample3 {

	public static void main(String[] args)
	{
		System.out.println("METHOD WITH  PASSING PARAMETER ");
		add(4,3);
		add(900,12000);
		System.out.println("***********************");
		sub(6,3);
		sub(45,50);
		
		sample4.add1(8,5); //static regular method call add1 from different class sample4
		
		sample4 s4=new sample4(); //non-static regular method sub1 call from different class sample4

		s4.sub1(23,12);		
	}
	
	public static void add(int a ,int b) //method with 2 integer parameter
	{
		System.out.println(a+b);
	}
	
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
