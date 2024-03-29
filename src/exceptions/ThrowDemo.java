package exceptions;

import java.util.Scanner;

public class ThrowDemo 
{
    public static void validate(int age) throws AgeNotFoundException
    {
    	if(age>=18)
    	{
    		System.out.println("Eligible to Vote");
    	}
    	else
    	{
    		throw new AgeNotFoundException();
    	}
    }
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		try 
		{
		validate(age);
		}
		catch(AgeNotFoundException e)
		{
			System.out.println("Exception Handled by caller");
		}
	}
}
