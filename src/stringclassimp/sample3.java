package stringclassimp;

public class sample3 {

	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="ABCD";
		String s3="VELOCITY";
		String s4="my name is rahul";
		String s5="";
		String s6="abcabcb";
		
		// SUBSTRING
		System.out.println(s1.substring(5));// ity
		System.out.println(s1.substring(3,6)); // oci
		System.out.println(s3.substring(3,7)); //OCITS
		
		// CONCAT()
		System.out.println(s1+s3);
		System.out.println(s1.concat(s3));
		
		// replace
	
		System.out.println(s4.replace("rahul", "yash"));
		System.out.println("____________________");
	
		// length
		System.out.println(s1.length());
		
		//toUpperCase
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toUpperCase());
		
		//toLowercase
		System.out.println(s3.toLowerCase());
		
		//equals
		System.out.println(s1.equals(s3));
		
		
		//equalsIgnorecase
		
		System.out.println(s1.equalsIgnoreCase(s3)); // true -->case sensitive
		
		//contain
		System.out.println(s4.contains("is"));  //true
		System.out.println("_________________________________________");
		
		//isEmpty
		System.out.println(s1.isEmpty()); //false
		System.out.println(s5.isEmpty());
		
		
		//charAt
		System.out.println(s1.charAt(3));   //o
		System.out.println(s1.charAt(1));
		
		//indexOf
		System.out.println(s1.indexOf('o'));
		System.out.println(s2.indexOf('B')); //ABCD INDEX IS 1
		
		//lastIndexOf
		System.out.println(s6.lastIndexOf('a'));
		
		//startWith
		System.out.println(s4.startsWith("my"));
		
		//endsWith
		System.out.println(s4.endsWith("rahul"));
		
		
		
		
		
		
	}
}
