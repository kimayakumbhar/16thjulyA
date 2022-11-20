package controlstatement;

//import java.net.StandardSocketOptions;

public class sample10 {
public static void  main(String[] args)
{
 int age=33;
  int weight=90;
  int hb=13;
  if(age>=18)
     if(weight>50)
    	 if(hb>12)
     {
    	 System.out.println("yor are eligible for blood donating");
    	 
     }
     else
     {
    	 System.out.println("you are not eligible for blood donating");
     }
  else
    {
	System.out.println("age must be greater than 18 ");  
    }
  }

}
