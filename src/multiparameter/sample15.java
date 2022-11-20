package multiparameter;

public class sample15 {


	//6. method with parameter
	
	public static void main(String[] args) 
	{		
		addition(16670,20111);
		addition(510, 960);
		System.out.println("**********************************");
		sample15 s15=new sample15();
		s15.sub(400000, 0);
		
	
			}
	public static void addition(int num1, int num2)    
	{				
		System.out.println(num1+num2);     
	}
	public void sub(int num1, int num2)   
	{
		System.out.println(num1-num2);    
	}
	
}
