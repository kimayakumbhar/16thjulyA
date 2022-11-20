package switchstatement;

public class sample18 {
public static void s1()
{
	int num=1600;
	if(num>-100)
		if(num>-500)
			if(num>-1000)
				if(num>-1500) {
					System.out.println("no is greater than -1500");
				}else
				{
					System.out.println("no is greater than -1000");
					
				}else
				{
					System.out.println("no is greater than -500");
				}else
				{
					System.out.println("no is greater than -100");
				}
	else
	{
		System.out.println("invalid no");
	}
	}




}

