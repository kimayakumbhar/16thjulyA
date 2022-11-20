package Logicalprogram;

import java.util.Scanner;

public class factorialno
{
public static void main (String[] args)
{
	System.out.println("enter user input");
	Scanner scan=new Scanner(System.in);
	
	int num=scan.nextInt();  //it accept only int value

	int fact=1;
	
	for(int i=num;i>=1;i--)
	{

	    // 24
	fact=fact*i;  
	}
	System.out.println(fact);
}

}