package defaultconstructor;

public class sample2 {
	public void m2()
	{
		System.out.println("running non static regular method m2 from same class");
	}
public static void main(String[]  args)
{
	// default constructor  ==copy all members of class and store into object
	sample2 s2=new sample2(); //
	s2.m2();
	
	//sample2-->constructor name-->> classname
}
}
