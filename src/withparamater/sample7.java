package withparamater;

public class sample7 {

	public static void main(String[] args)
	{
	System.out.println("passing parameter in substraction program using diff class ");
	System.out.println("********************************************************");
	sample8.sub1(5000,1);
	sample8.sub1(-4,-17);
    System.out.println("*********************************************************************");
    
	sample8 s8=new sample8();
	s8.sub2(1,5000);
	s8.sub2(231,-400);
	s8.sub2(-14,-1000);
	s8.sub2(-1,5000);

	
}
}