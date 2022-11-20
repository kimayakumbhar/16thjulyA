package withparamater;

public class sample20 {
 public static void main(String[] args)
 {
	 System.out.println("addi");
	 sample20.t1(3,7);
	 sample20 s20=new sample20();
	 s20.t2(90,34);
	 
 }
 public static void t1(int a, int b)
 {
	 System.out.println(a+b);
	 
 }
 public void t2(int p1, int p2)
 
 {
	 System.out.println(p1+p2);
 }
}
