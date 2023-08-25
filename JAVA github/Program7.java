//write a program to find volume of sphere, cuboid and cube using polymorphism

import java.util.*;
public class Program7
{
public static void main (String args[])
{	
	ProgramSeven d=new ProgramSeven();
	d.volume(8);
}
public void volume(double pi,int r)
{
	System.out.println("The volume of sphere is : "+(4/3*pi*r*r*r));
}
public void volume(int l,int b,int h)
{
	System.out.println("the volume is : "+(l*b*h));
}
public void volume(int a)
{
	System.out.println("the volume of the cube : "+(a*a*a));
}
}