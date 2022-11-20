package Logicalprogram;

public class example9_palindromestring {

	public static void main(String[] args)
	{
	String orgname="EYE";
	String revname="";

	for(int i=orgname.length()-1;i>=0;i--)   

	{
	  revname=revname+orgname.charAt(i);
	  
	}
	if(orgname.equals(revname))
	{
	System.out.println("given string is palindrome");
	}
	else
	{
	System.out.println("given string is no palindrome");
	}
	}

	
}
