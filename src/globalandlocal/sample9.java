package globalandlocal;

public class sample9 {
static int a=3;  
static int b=4;      

//static global variable
public static void main(String[] args)
{
	//sample9 s9=new sample9();
	System.out.println(a);
	System.out.println(b);
	System.out.println(b);
	
	
}
public static void a1()
{
System.out.println(b);	
}
public void a2()
{
System.out.println(b);	
}
}
