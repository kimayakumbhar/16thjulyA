package stringclassimp;

public class sample4 {

	public static void main(String[] args)
	{
		String s1="my name is abc";
		String[] ar=s1.split("");  // my  name  is  abc
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}
}

// m
//y
//n
//a
//m
//e
//i
//s
//a
//b
//c