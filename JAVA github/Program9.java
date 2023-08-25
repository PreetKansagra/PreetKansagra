//write a java progaram to find area of circle, rectangle and triangle using oops concept
import java.util.*;
public class Program9
{
public static void main (String args[])
{	
	ProgramNine d=new ProgramNine();
	d.area(8);
}
public void area(int r)
{
	System.out.println("The of area circle is : "+((22*r*r)/7));
}
public void volume(double l,double b)
{
	System.out.println("the area of rectangle is : "+(l*b));
}
public void volume(int h,int b)
{
	System.out.println("the area of triangle is : "+((h*b)/2));
}
}