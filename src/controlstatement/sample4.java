package controlstatement;

public class sample4 {
public static void main(String[] args)
{
	int prelium=450;
	int main=1600;
//System.out.println("nested if");	

if(prelium>=300)
{
System.out.println("eligible for main exam");	

      if(main>=700)
      {
	      System.out.println("he got selected");
      }
      else
      {
    	  
    	System.out.println("rejected for main exam");  
      }
      
}
  else
  {
	  System.out.println("not eligible for main exam");
  }

}
}
