package Interface_Implementation;


  // implementation class
	public class demo2 implements demo
	
	{	
		public void m1()
		{
			System.out.println(a);
			System.out.println("method m1 from demo class is completed in implementation class demo2");
		}
		
		public void m2()
		{
			//System.out.println(a);
			System.out.println("method m2 from demo class is completed in implementation class demo2");
		}
	

	public static void main(String[] args)
	{
	 demo2 d2=new demo2();
	 d2.m1();
	 d2. m2();
	 
	}}
