//write a program to print names in array which has only four letters
import java.util.*;
public class Program5
{
	public static void main (String args[])
	{
		String data[]=new String[10];
		Scanner k=new Scanner(System.in);
		
		for(int i=0; i<data.length; i++)
		{
			System.out.println("enter the names : ");
			data[i]=k.next();
		}
		
		for(int i=0; i<data.length; i++)
		{
			if(data[i].length()==4)
				System.out.println("the name with 4 letters are : "+data[i]);
		}
	}
}