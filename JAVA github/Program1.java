//write a program see  if the number is duck or not 

import java.util.*;
public class Program1
{
	public static void main(String args[])
	{
		int rem;
        int c = 0;
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = k.nextInt();
        while(num > 0)
        {
            rem = num % 10;
            if(rem == 0) 
            {
                c++;
            }
            num = num / 10;
        }
        if(c >= 1)
        {
            System.out.println("Duck number");
        }
        else
        {
            System.out.println("Not a duck number");
        }
	}
}