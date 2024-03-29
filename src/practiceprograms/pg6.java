package practiceprograms;

import java.util.Scanner;

public class pg6 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int no=n;
		int reverse=0;
		while(n!=0)
		{
			int last_digit=n%10;
			reverse=reverse*10+last_digit;
			n=n/10;
		}
		System.out.println(reverse);
		if(reverse==no)
		{
			System.out.println("palidrome");
		}
		else
		{
			System.out.println("Not palidrome");
		}
	}

}
