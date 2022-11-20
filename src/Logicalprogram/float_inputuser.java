package Logicalprogram;

import java.util.Scanner;

public class float_inputuser {

	public static void main(String[] args)
	{
		Scanner s=new  Scanner(System.in); //input from sacnner
		System.out.println("enter float value?");
		float f=s.nextFloat(); // accept from user input
		System.out.println(" float value is "+f);
		System.out.println("square is " +f*f);
		
	}
}
