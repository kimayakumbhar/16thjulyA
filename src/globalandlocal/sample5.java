package globalandlocal;

public class sample5 {
	
	int c=50;
	int b=1;//
	int d=100;//non-static global variable
	
public static void main(String[] args)
{
System.out.println("example of non static global variable");

System.out.println("non-static global variable call from same class");

sample5 s5=new sample5();  // create object of same class
//System.out.println(s5.d); 
s5.m2();
//object name.variable name
//System.out.println(c);

System.out.println("**********************************************");
System.out.println("non-static method call from diff class");
sample6 s6=new sample6();  // create object of diff class
System.out.println(s6.d);  // diff object name.variable name
}

public static void m1()  //static regular method
{sample5 s5=new sample5();
System.out.println(s5.c);

}
public void m2()         // non-static regular method
{
System.out.println(d);	
}
}
