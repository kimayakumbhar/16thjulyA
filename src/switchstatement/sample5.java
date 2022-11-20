package switchstatement;

public class sample5 {
public static void main(String[] args)
{
int a=5;int b=15;int result;
System.out.println("arithemaic operation");
switch(2)
{

case 1:
	result=a+b;
	System.out.println("sum" +result);
    break;
    
case 2:
	result=a-b;
	System.out.println("sub" +result);
    break;
    
case 3:
	result=a*b;
	System.out.println("mul" +result);
    break;
case 4:
	result=a/b;
	System.out.println("div" +result);
    break;
default:System.out.println("wrong input");
}

}}
