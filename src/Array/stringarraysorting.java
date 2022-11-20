package Array;

import java.util.Arrays;

public class stringarraysorting {
 
	public static void main(String[] args)
	{
		String[] ar = new String[5];
		ar[0]="rekha";
		ar[1]="sunil";
		ar[2]="gukula";
		ar[3]="laxmi";
		ar[4]="anil";
		
		//Array.sort(ar);
		System.out.println("print original data");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		//System.out.println("*********************");
		
		Arrays.sort(ar);
		System.out.println("*****************sort***************");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
	}
}
