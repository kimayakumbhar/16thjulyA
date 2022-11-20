package accessspecifires;

public class default1 {

	int a;  //default
	
	default1(){
		a=2;    //default
		
	}
    void m2()    // default
    {
    	System.out.println("value of a is  "+a);
    }

    public static void main (String[] args)
    {
    	
    	System.out.println("this is example of dafault access specifires which data me"
    			+ "datamemeber of class means variables, methods,constructor access only in "
    			+ "package it cant access in other package");
    	
    	default1 t1=new default1();
    	t1.m2();
    	
    }
}
