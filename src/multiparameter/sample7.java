package multiparameter;

public class sample7 {
	public static void main(String[] args)
	{
		System.out.println("passing integer and string parameter in same class");
		y("nilam",2);
		sample7 s7=new sample7();
		s7.y2("madhuri",3);
		
	}
	
	public static void y(String m, int a) //static method
	{
		System.out.println(m+" " +  "roll no is " +a);
	}
   public void y2(String m1 , int b )
   {
	   System.out.println(m1+ " " + "roll no is " +b);
   }
}
