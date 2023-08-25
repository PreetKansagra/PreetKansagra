//write a program to find the power using oops concept in java
import java.util.*;
public class Program8
{
	public static void main(String args[])
	{
		Scanner k=new Scanner (System.in);
		int n;
		int p;
		int result=1;
		System.out.print("Enter the number : ");
		n=k.nextInt();
		System.out.print("Enter the power : ");
		p=k.nextInt();
		
		for(int i=1; i<=p; i++)
		{
			result=result*n;
		}
		System.out.println("the power is : "+result);
	}
}