package exceptions;

import java.util.Scanner;

public class ArithmeticExceptionExample
{

	public static void main(String[] args) 
	{
		boolean exit=true;
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A");
		int a=sc.nextInt();
		System.out.println("Enter the B");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println(c);
		}
	    catch(ArithmeticException e)
		{
	    	System.out.println("Cannot Divide By Zero");
		}
	}
	}
}
