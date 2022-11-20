package Array;

public class intarraysorting {

	public static void main(String[] args)
	{
		
		int [] ar=new int[4];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
              System.out.println("length is " +ar.length);
		
		System.out.println("original data");
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);
		}
	
	    System.out.println("print data in asending order");
	  
	    for(int i=0;i<=ar.length-1;i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
	    System.out.println("print data in dsending order");
		  
		    for(int i=ar.length-1;i>=0;i--)
		    {
		    	System.out.println(ar[i]);
		    }
		    
		    System.out.println("samllest no in array " +ar[0]);
		    System.out.println("highest no in array " +ar[ar.length-1]);
	    
	    
	}
	
	  
	  
}
