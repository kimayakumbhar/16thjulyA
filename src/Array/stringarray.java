package Array;

public class stringarray {
 
	public static void main(String[] args)
	{
		//step1:array declaration
		String[] ar=new String[5]; 
		
		//step2: array initilization
		ar[0]="rahul";
		ar[1]="ganesh";
		ar[2]="suresh";
		ar[3]="mahesh";
		ar[4]="ramesh";
		//ar[5]="priya";
		
		//step3:array usage
		System.out.println(ar[4]);
		System.out.println(ar[0]);
		System.out.println(ar.length);
		System.out.println(ar.length-1);
	    System.out.println("***************************");
	    System.out.println("print all info in array");
	    
	   
	    
	    //          ;i<=5-1;
	    for(int i=0;i<=ar.length-1;i++)
	    {
	    	System.out.println(ar[i]);
	    }
	    
		System.out.println("print all info into reverse order");
		    
		       // 5-1;5>=0;i--
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
	
	
		
	}
	
	
