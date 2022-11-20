package nonstaticmethod;

public class sample4 { 
	public static void main(String[] args)
			{
		System.out.println("NON STATIC METHOD CALL MANY TIMES");
		  sample4 s4=new sample4();
		  s4.house1();
		  s4.house2();
		  s4.house2();
		  s4.house2();
		  s4.house2();//method call many times
			}
	public void house1()
	{
		int hno=3;
		String hname="sharda";
		System.out.println("house no is"+hno);
		System.out.println("house name"+hname);
		System.out.println("\n");
	}
	
	public void house2()
	{
		int hno=43;
		String hname="aai";
		System.out.println("house no is"+hno);
		System.out.println("house name"+hname);
		System.out.println("*************************");
	}

}
