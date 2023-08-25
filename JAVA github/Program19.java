//write a program to sort an array
import java.util.*;
public class Program19
{
	public static void main(String kk[])
	{
		int data[]=new int[10];
		Scanner k=new Scanner(System.in);
		
		for(int i=0; i<data.length; i++)
		{
			System.out.print("enter the number : ");
			data[i]=k.nextInt();
		}
		
		for(int i=0; i<data.length; i++)
		{
			for(int j=0; j<data.length; j++)
			{
				if(data[i]<data[j])
				{
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}

		}
		
		for (int i:data)
		{
			System.out.print(i+" ");
		}

	}
}
}