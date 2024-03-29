package practiceprograms;

import java.util.Scanner;

public class pg10
{
    public static void validate(int age) throws AgeNotFoundException 
    {
    	if(age>=18)
    	{
    		System.out.println("eligible to vote");
    	}
    	else
    	{
    		throw new  AgeNotFoundException();
    	}
    }
public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		try 
		{
		validate(age);
		}
		catch(AgeNotFoundException e)
		{
			System.out.println("Exception Handled");
		}

     }
}
