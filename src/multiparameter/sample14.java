package multiparameter;

public class sample14 {

 public static void main(String[] args)
 {
	 System.out.println("passing int string char float from same class");
	 v1(1,"sai",'B',67.45f);
 }
 
 public static void v1(int k, String l,char m ,float n)
 {
	 System.out.println(" student roll no is " + " " +k );
     System.out.println(" student name is " + " " +l); 
     System.out.println(" grade is " + " " +m);
     System.out.println(" per is " + " " +n);
 }
}

