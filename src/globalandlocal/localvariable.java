package globalandlocal;

public class localvariable {
 
	public static void main(String[] args)
	{
		int a=3;
		System.out.println(a);
		
		globalvari v=new globalvari(); //non-static global variable access in diff class
		System.out.println(v.b);
	}
	
}