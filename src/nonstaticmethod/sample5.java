package nonstaticmethod;

public class sample5{
	
public static void main(String[]args)
{
System.out.println("RUNNING NON-STATIC METHOD FROM DIFFRENT CLASS MEANS SAMPLE6 CLASS");
sample6 s5=new sample6();
s5.p1(); //non-static method call
s5.p2();
}
}