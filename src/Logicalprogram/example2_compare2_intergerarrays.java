
package Logicalprogram;
import java.util.Arrays;
public class example2_compare2_intergerarrays
{
public static void main(String[] args)
{

int ar1[]={1,2,3};
int ar2[]={2,3,4};
int ar3[]={4,5,6};
int ar4[]={1,2,3};
System.out.println(Arrays.equals(ar1,ar2));
System.out.println(Arrays.equals(ar2,ar3));
System.out.println(Arrays.equals(ar3,ar1));
System.out.println(Arrays.equals(ar1,ar4));

}}