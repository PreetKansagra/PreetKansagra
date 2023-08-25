//write a java program to find largest number from an array
import java.util.*;
public class Program6
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		int data[]=new int[6];
		
		for(int i=0; i<data.length; i++)
		{
			System.out.println("enter the value");
			data[i]=k.nextInt();
		}
		int max=data[0];
		for(int i=0; i<data.length; i++)
		{
				if(max<data[i])
				max=data[i];
		}
		System.out.println("the maximum number is"+max);
	
	}
}