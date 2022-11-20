package switchstatement;

public class sample15 {
	public static void main(String[] args) {
		int age=114;
		if(age<=40)
			if(age<=18)
				if(age<1)
				{
					System.out.println("it is baby");
				}
				else
				{
					System.out.println("he is child");
				}
			else 
			{
				System.out.println("he is young");
			}
		else
		{
			System.out.println("too old");
		}
	}

}
