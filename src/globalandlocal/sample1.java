package globalandlocal;

public class sample1 {

	int c=10;  //global variable
	//example of local and global variable

	public void m1()
	{   int a=2;              //local variable
		System.out.println(a); 
		System.out.println(c);
	}
	public void m2()
	{
		int b=3;
		System.out.println(b); 
		System.out.println(c);
	}
	
}

