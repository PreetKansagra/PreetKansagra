//write a program to calculate some arithmetic operation using oops
import java.util.*;
public class Program11
{
public static void main(String pp[])
{	
	ProgramEleven d=new ProgramEleven();
	d.sum(6,6,6);
}
public void sum(int a,int b)
{
	System.out.println("The sum is "+(a+b));
}
public void sum(int a,int b,int c)
{
	System.out.println("the sum is "+(a+b+c));
}
public void sum(double a,double b)
{
	System.out.println("the sum of the decimal number is "+(a+b));
}
}