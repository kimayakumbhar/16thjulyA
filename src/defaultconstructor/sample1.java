package defaultconstructor;

public class sample1 {
	
	//example1: default constructor
	
		//default constructor  --> provided by compiler   --> same class 
		//use:  use to copy all the data into object
//		sample1()
//		{
//			
//		}	


	public void m1()
	{
		
		System.out.println("running non-static regular method m1 from same class");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("default constructor call from same class");
		sample1 s1=new sample1();
		s1.m1();
		
		//sample1-->class name-->datatype
		//s1-->object name-->to identify or refer object
		//new-->keyword-->to create  blank or empty object
		//sample1-->classname-->constructor-->use to copy all the data into object
		
	}
}


