package constructoroverloading;

public class sample1 {

	// constructor overloading
	int num1;
	int num2;
	String name;
	 
	// without parameter
	sample1()
	{
		num1=12;
		num2=13;
		
	}
	
	sample1(int a , int b)
	{
		
		num1=a;
		num2=b;
	}
	
	sample1(String s1)
	{
		
		name=s1;
	}
	public void add()
	{
		System.out.println(num1+num2);
	
		
	}
	public void name()
	{
		
		System.out.println(name);
	}
	

	public static void main(String[] args)
{
sample1 s1=new sample1();
s1.add();

System.out.println("**********************");

sample1 s2=new sample1(2,4);
s2.add();

System.out.println("**********************");


sample1 s3=new sample1("kimu");
s3.name();



}}


