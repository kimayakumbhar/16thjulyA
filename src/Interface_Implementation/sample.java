package Interface_Implementation;

public class sample implements interfacei1,interfacei2 {

	
		public void m1()
		{
			System.out.println("method m1 from interface interfacei1 completed in IC ");
		}
		
		public void m2()
		{
			System.out.println("method m2 from interface interfacei1 completed in IC ");
		}
		
		public void m3()
		{
			System.out.println("mehod m3 from interface interfacei2 completed in IC");
			
		}
		public void m4()
		{
			System.out.println("method m4 from interface interfacei2 completed in IC");
		}
	


   public static void main(String[] args)
   {
	sample s1=new sample();
	s1.m1();
	s1.m2();
	s1.m3();
	s1.m4();
	
   }
   }
   
