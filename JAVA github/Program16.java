//write a program to find if the name is palindrome or not 
import java.util.*;

public class Palindrome
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		String num;
		String reverse="";

		System.out.print("Enter the number : ");
		num=k.nextLine();
		int length=num.length();

		
		for(int i=length-1; i>=0; i--)
		{
			reverse=reverse + num.charAt(i);
		}
		if (num.equals(reverse))
			System.out.println("The number is palindrome");
		else 
			System.out.println("The number is not palindrome");
	}
}