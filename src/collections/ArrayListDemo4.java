package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {

	public static void main(String[] args)
	{
		ArrayList bag=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No Of Books");
		int n=sc.nextInt();
		System.out.println("Enter The Books you Want keep inside");
		for(int i=0;i<n;i++)
		{
			String str=sc.next();
			bag.add(str);
		}
	        System.out.println(bag);
	     
	}

}
