package polymorphism;

public class sample2 {
public static void main(String[] args)
{
	
	System.out.println("*****example of compile time polymorphism******");
	System.out.println("in compile time polymorphism method declaration is going to binded"
			+ "to its defination at compilation time it depend upon argument/parameter ");
sample1 s1=new sample1(); 
s1.addition(2,3);   //binding of 2 parameter  addition method
s1.addition(1,2,3);  //binding of 3 parameter addition method
}
}
