//write a program to swap last two digits of an array 
import java.util.*;
public class Program4
{
	public static void main(String args[])
	{
		Scanner k=new Scanner(System.in);
		int array[]= new int[5];
		
		for (int i=0; i<array.length; i++)
		{
			System.out.print("enter the value :");
			array[i]=k.nextInt();
		}
		
		System.out.println("entered values are as follow");
		for(int i=0; i<array.length; i++)
		{
			System.out.println("the value you entered is : "+array[i]);
		}
		int temp=array[array.length-1];
		array[array.length-1]=array[array.length-2]; 
		array[array.length-2]=temp;
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println("the new value after swapping is : "+array[i]);
		}
	}
}