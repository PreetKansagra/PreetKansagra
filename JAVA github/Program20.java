//bufferedreader 
import java.io.*;
public class Program20
{
	public static void main (String args[]) throws Exception
	{
		String array[]=new String[10];
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the value of an array :- ");
				
		for(int i=0; i<array.length; i++)
		{
			System.out.print("enter the name : ");
			array[i]=obj.readLine();
		}
		
		System.out.println("the values that you entered are as follow :- ");

		for(int i=0; i<array.length; i++)
		{
			System.out.println("the array is :"+array[i]);   
		}
	}
}
}