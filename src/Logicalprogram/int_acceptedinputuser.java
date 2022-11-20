package Logicalprogram;

import java.util.Scanner;

public class int_acceptedinputuser {

	public static void main(String[] args)
	{
	Scanner s1= new Scanner(System.in);	
	System.out.println("enter number");
	int input1 =s1.nextInt();  //accept from user input
	System.out.println("entered value is " +input1);
	System.out.println("input1*2= " +input1*2);
	System.out.println("square is " +input1*input1);
	}
}
