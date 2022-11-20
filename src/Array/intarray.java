package Array;

public class intarray {
  public static void main(String[] args)
  {
	  int[] ar=new int[2];
	  
	   ar[0]=13;
	   ar[1]=12;
	   
	   System.out.println(ar[0]);
	   
	   System.out.println("********print all info ************");
	   for(int i=0;i<=1;i++)
	   {
		   System.out.println(ar[i]);
	   }
	   System.out.println( +ar.length-1);
	   
	   System.out.println("****************reverse****************");
	   for(int i=ar.length-1;i>=0;i--)
	   {
		   System.out.println(ar[i]);
	   }
  }
}
