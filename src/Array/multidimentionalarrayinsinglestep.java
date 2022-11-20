package Array;

public class multidimentionalarrayinsinglestep {

	public static void main(String[] args)
	{
		// 10 20
		// 30 40
		
		int [] [] ar= {{10,20},{30,40}};  // array declaration and defination in single step
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
