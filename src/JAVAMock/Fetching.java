package JAVAMock;

import java.util.Scanner;

public class Fetching {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		System.out.println("elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements printing");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even "+a[i]);
			}
			else
			{
				System.out.println("odd "+a[i]);
			}
		}

	}

}
