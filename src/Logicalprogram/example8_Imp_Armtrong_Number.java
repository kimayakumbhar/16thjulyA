package Logicalprogram;

public class example8_Imp_Armtrong_Number {

	public static void main(String[] args)
	{
	int num=153;
	int sum=0;
	              //153/10-->15.3 but here read int value only so accept 15
	for(int i=num;i>0;i=i/10)

	{ int rem=i%10;             //1st-->153/10=3
	  sum=sum+(rem*rem*rem) ;  //0+27
	}
   if(num==sum)
   {
	   System.out.println("given no "+sum +" is armstrong number");
   }
   else
   {
	   System.out.println("given no "+sum +"is not armstorng number");
   }
}
}