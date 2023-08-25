//write a program to see if the number is armstrong or not
import java.util.*;
public class Program2
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		int n; 
		int len=0;
		System.out.print("Enter the number : ");
		n=k.nextInt();
		int t1=n;
		

		while(t1 !=0)
		{
			t1=t1/10;
			len=len+1;
		}
		
		int t2=n, rem, arm=0;
		
		while(t2!=0)
		{
			rem=t2%10;
			int mul=1;
			
			for(int i=1; i<=len; i++)
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		
		}
		if(n==arm)
			System.out.print("number is an armstrong number ");
		else
			System.out.println("number is not armstrong number");
	}
}