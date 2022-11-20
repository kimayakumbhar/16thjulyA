package globalandlocal;

public class sample3 {
	 static int a=10;
	 static float b=1.12f;// static global variable
     
public static void main(String[] args)
{
	
	System.out.println("example of static global variable");
  
   // static global variable call from same class
   System.out.println(a);   // variable name
   System.out.println(b);k1();
   
   System.out.println("********************************************");
   
   //static global variable call from diff class
   System.out.println(sample4.b);
   
}



public static void k1()
{
System.out.println(a);	
}
public void k2()
{
System.out.println(b);	
}

}
