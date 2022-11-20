package accessspecifires;

public class private1 {

	private int a;
	
	
	private1(){ // constructor
		a=10;
	}
	private void m1()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{    System.out.println("in private access specifires member of class(variable,consturc"
			+ ",method) access onlly  within class" 
			);
		private1 p1=new private1();
		p1.m1();
	}
}
