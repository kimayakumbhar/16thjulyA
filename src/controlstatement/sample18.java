package controlstatement;

public class sample18 {
 public static void m2(int marks)
 {
String grade;
if(marks>=75)
{
grade="distinciton";

}
else if(marks>=75 & marks<=69)
{
	grade="first class";
	
}
else if(marks<=69 & marks>=60)
{
	grade="second class";	

}
else if(marks<=60 & marks>=50)
{
	
	grade="third class";
}
else if(marks<=35 & marks>=50)
{
	grade="pass";	
}
else
{
	grade="fail";	
}

System.out.println("class is " +grade);

}
}
