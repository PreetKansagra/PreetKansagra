//write a program to find simple interest using oops 
import java.util.*;
public class Program18
{
	int p;int r;int t;
	double si;
	
	public static void main(String args[])
	{
		Simpleinterest m=new Simpleinterest();
		m.input();
		m.calculate();
		m.show();
	}
	public void input()
	{
		Scanner k=new Scanner(System.in);
		System.out.print("eneter the p : ");
		p=k.nextInt();
		System.out.print("eneter the r : ");
		r=k.nextInt();
		System.out.print("eneter the t : ");
		t=k.nextInt();
	}
	
	public void calculate()
	{
		si=p*r*t/100;
	}
	
	public void show()
	{
		System.out.print("the simple interest is : "+si);
	}
	
	
}
