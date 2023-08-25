//write a java program to take input of subject and find the average and percentage 
import java.util.*;

public class Program15
{
	public static void main(String kk[])
	{
		int marks[]=new int[5];
		int total=0;
		Scanner k=new Scanner(System.in);
		
		for(int i=0; i<marks.length; i++)
		{
			System.out.println("enter the marks of subject : " );
			marks[i]=k.nextInt();
		}
		
		for(int i=0; i<marks.length; i++)
		{
			total=total+marks[i];
		}
		float Percentage=total/marks.length;
		
		System.out.println("the percentage of the student is: "+Percentage);
	}
}