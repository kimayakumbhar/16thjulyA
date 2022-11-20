package nonstaticmethod;

public class sample10 {



  public static void main(String[] args)
  {
	  System.out.println("RUNNING NON STATIC METHOD FROM SAME CLASS");
	  System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	  sample10 s10=new sample10();
	  s10.k1();
	  
  }
  public void k1()
  {
	 String sname ="shi aaradhana society";
	 int nfamily=120;
	 int nrent=8;
	 int ncouple=10;
	 System.out.println("society name=" + sname);
	 System.out.println("no of family" + nfamily);
	 System.out.println("no of rent" + nrent);
	 System.out.println("no of couple" + ncouple);
  }
}
 