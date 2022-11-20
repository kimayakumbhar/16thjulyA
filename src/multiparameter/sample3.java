package multiparameter;

public class sample3 {
 public static void main(String[] args)
 {
	 System.out.println("passing int parameter from diff class");
	 sample4.a1(23, 45);
	 sample4 s4=new sample4();
	 s4.s1(5, 1);
 }
}
