package Array;

public class chararray {
 
 public static void main(String[] args)
 {
	 char[] ar= new char[5];
	 
	 ar[0]='A';
	 ar[1]='B';
	 ar[2]='C';
	 ar[3]='p';
	 ar[4]='E';
	 
	 System.out.println(ar.length);
	 System.out.println(ar[1]);
	 
	 System.out.println("***********print all info in array*************");
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
   System.out.println("**********print in reverse order*************");
   
   for(int i=ar.length-1;i>=0;i--)
   {
	   System.out.println(ar[i]);
   }
	 
 }
 
}
