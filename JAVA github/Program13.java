//write a program to find how many name starts with vowels in an array
import java.util.*;

public class Program13
{
	public static void main(String mm[])
	{
		Scanner k=new Scanner(System.in);
		String data[]=new String[10];
		
		for(int i=0; i<data.length; i++)
		{
			System.out.println("enter the name");
			data[i]=k.next();
		}
		
		int count=0;
		
		for(int i=0; i<data.length;i++)
		{
			char c=data[i].charAt(0);
			if( c=='A' || c=='E' || c=='I' || c=='O' || c=='U'|| c=='a'|| c=='e'|| c=='i'|| c=='o'||c=='u')
				count++;
		}
		
		System.out.println("The numebr of names starting with the vowels are "+count );
	}
}