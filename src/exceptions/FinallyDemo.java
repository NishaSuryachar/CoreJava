package exceptions;

import java.util.Scanner;

public class FinallyDemo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Enter B");
		int b=sc.nextInt();
	    try
		{
			int c=a/b;
			System.out.println(c);
		}
	    catch(Exception e)
	    {
	    	System.out.println("Exception Handled");
	    }
		finally
		{
			System.out.println("Finally Block");
		}
	}

}
