package defaultconstructor;

public class sample11 {
    
	sample11()
	{
		System.out.println("default construtor");
	}
	public void m3()
	{
		System.out.println("m3 method ");
	}
	public static void main(String[] args)
	{
		sample11 s11=new sample11();
		s11.m3();
		
	}
}
