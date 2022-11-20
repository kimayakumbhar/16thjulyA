package nonstaticmethod;

public class sample11 {

	public static void main(String[] args)
	{
		System.out.println("student info");
		sample11 s11=new sample11();
		s11.w12();
	}
	public void w12()
	{   String sname;
	    char c;
	    int cstudent;
	    float per;
        sname="sai";
        c='C';	
        cstudent=1500;
        per=70.9f;
	    System.out.println("student name=" +sname);
	    System.out.println("Grade:"+c);
	    System.out.println("student count::"+cstudent);
	    System.out.println("student percentage="+per+"%");
	    
		
	}
}
