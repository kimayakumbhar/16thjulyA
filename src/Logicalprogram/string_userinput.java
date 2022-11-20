package Logicalprogram;

import java.util.Scanner;

public class string_userinput {

	public static void main(String[] args)
	{
		System.out.println("enter student name?");
		Scanner s =new Scanner(System.in); //accept input from user
	    String str =s.next();  //next() reads a word from the user
	    
	    
	    System.out.println("student name is "+str);
	    System.out.println("lenght is " +str.length());
		
		
		
	}
}
