package multiparameter;

public class sample2 {
public static void main(String[] args)
{
System.out.println("passing only string parameter in same class ");	
name("laxmi" , "kumbhar");
sample2 s2= new sample2();
s2.name1("kumbhar");

}
public static void name(String s , String b)
{
System.out.println(s +"" +b);	
}
public void name1(String r)
{
System.out.println(r);	
}
}
