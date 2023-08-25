//write a program to print patterns
import java.util.*;

public class Program17
{
	public static void main(String kk[])
	{
		int m=4;
		int n=4;
		//to print a hollow rectangle
		System.out.println("this is a hollow rectangle :");
		for(int i=1; i<=m; i++){
			for(int j=1; j<=n; j++){
				if (i == 1 || i == m || j == 1 || j == n ){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}					
			}
			System.out.println();
		}
		//to print half pyramid 
		System.out.println("the is a half pyramid :");
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//reverse half pyramid
		System.out.println("this is a reverse half pyramid :");
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//inverted half pyramid
		System.out.println("this is a reverse half pyramid :");
	}
}