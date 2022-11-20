package controlstatement;

public class sample9 {

	public static void main(String[] args)
	{
		sample9 s9=new sample9();
		s9.v1(2020);
	
	}
	public void v1(int year)
	{
		if(year%4==0)
		{
			System.out.println("it is leap year");
		}
		else
		{
			System.out.println("it it no leap year");
		}
	}
}
