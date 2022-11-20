package paramconstructor;

public class sample3 {
int num1;
int num2;

//user defined with 2 int parameter constructor
sample3(int a, int b)//local variables in 2nd method we not use  and we pass local variable to global  variable
 					// use of constructor at the end send information to global variable
{
num1=a;  // assign local variable a and b into global variable num1 and num2
num2=b;
}

public void addition()
{
System.out.println(num1+num2);	
}

public void mul() 
{
System.out.println(num1*num2);	
}

public static void main(String[] args)
{
sample3 s3=new sample3(10,20);
s3.addition();
s3.mul();

System.out.println("********n no of object create and in each object we provide input***************");
sample3 s4=new sample3(2,3); //2nd time new copy create 
s4.mul();

System.out.println("diff class");

sample4 s5=new sample4(100,50);
s5.sub();
}
}
