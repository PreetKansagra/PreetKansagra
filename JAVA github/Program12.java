//write a program to search a name in an array
import java.util.*;

public class Program12
{
	public static void main(String mm[])
	{
		String names[]=new String[3];
		String n;
		Scanner k=new Scanner(System.in);
		
		for(int i=0; i<names.length; i++)
		{
			System.out.print("enter the name : ");
			names[i]=k.next();
		}
		System.out.print("enter the  name you want to search: ");
		n=k.next();
		boolean check=false;
		
		for(int i=0; i<names.length; i++)
		{
			if (names[i].equalsIgnoreCase(n))
				check=true;
		}
		if(check)
			System.out.println("name is present");
		else
			System.out.println("not present");

		
	}
}