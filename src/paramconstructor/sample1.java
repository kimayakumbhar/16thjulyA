package paramconstructor;

// example 2: user defined constructor --> without or zero parameter 

public class sample1 {
 //declaration
int num1;  //global variable
int num2;

//step2: initialization

	//user defined constructor without parameter value is fix here --> provided by user  --> same class
	//use1: to initialize global variable
	//use2: copy all the members of class into object

sample1()
{
num1=10;  //default values
num2=20;
}

// usage
public void addition()
{
System.out.println(num1+num2);	
}
public void mul()
{
System.out.println(num1*num2);	
}
public void div()
{
System.out.println(num1/num2);	
}
public static void main(String[] args)
{
	sample1 s1=new sample1();
	s1.addition();
	s1.mul();
	
	sample2 s2=new sample2();
	s2.sub();
	
	
}}

