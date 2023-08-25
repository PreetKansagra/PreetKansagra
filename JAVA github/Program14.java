import java.util.*;

public class Program14
{
	public static void main(String args[])
	{
		int n;
		int fact=1;
		Scanner k=new Scanner(System.in);
		System.out.println("enter the number");
		n=k.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
}