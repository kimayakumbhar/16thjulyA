package controlstatement;

public class sample3 {
public static void main(String[] args)
{
int marks=6;
if(marks>=75)
{
System.out.println("distinciton");

}
else if(marks>=75 & marks<=69)
{
	System.out.println("first class");
	
}
else if(marks<=69 & marks>=60)
{
System.out.println("second class");	

}
else if(marks<=60 & marks>=50)
{
	
System.out.println("third class");
}
else if(marks<=35 & marks>=50)
{
System.out.println("pass");	
}
else
{
System.out.println("fail");	
}
}
}
