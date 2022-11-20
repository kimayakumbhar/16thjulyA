package nonstaticmethod;

public class sample9 {
  public  void s1()
  {
	 
	  String name="puna";
	  int population=400000;
	  System.out.println("name of city"  + name);
	  System.out.println("population"  +population);
	  
  }

  public  void s2()
  {
	 
	  String name="mumbai";
	  int population=500000;
	  System.out.println("\n");
	  System.out.println("name of city" +name);
	  System.out.println("population" +population);
	  
  }

public static void main(String[] args)
{
sample9 s9= new sample9();
s9.s1();	
s9.s2();
}}
