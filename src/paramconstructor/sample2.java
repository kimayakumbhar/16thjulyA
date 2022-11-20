package paramconstructor;

public class sample2 {
int a;  // global variable
int b;


// user defined constructor	-->provided by user-->diff class
// use1:to initialize global variable
// use2:copy all members of class into object
sample2() //without or zero parameter
{
a=3;
b=7;
}
public void sub()
{
System.out.println(a-b);	
}
}
