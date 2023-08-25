//wap to encrypt a given string   by increasing the letter by two steps
import java.util.*;
public class Program10 
{
	public static void main(String dd[])
	{
		Scanner k=new Scanner(System.in);
		String n;
		System.out.print("enter the name : ");
		n=k.next();
		String res="";
		
		for(int i=0;i<n.length();i++)
		{
			int c=(int)n.charAt(i)+2;
			
			res=res+(char)c;
		}
		System.out.println("The result is "+res);
		}		
		
	}
}