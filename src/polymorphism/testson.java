package polymorphism;

public class testson {
public static void main(String[] args)
{
	
	System.out.println("example of run time polymorphism");
	System.out.println("when object creation is complete it is binding of superclass methods");

father f=new father();
f.car();
f.money();
f.home();
System.out.println("***********************************");

System.out.println("when object creation is complete it is binding of subclass methods");
son s=new son();
s.bike();
s.car();
s.money();

}
}
