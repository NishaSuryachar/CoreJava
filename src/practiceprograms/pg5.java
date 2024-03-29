package practiceprograms;

import java.util.Scanner;

public class pg5 {

	public static void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial is "+fact);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the factorial number");
		int n=sc.nextInt();
		factorial(n);
	}

}
