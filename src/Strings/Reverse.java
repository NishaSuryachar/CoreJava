package Strings;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(true)
		{
		System.out.println("Enter the String you Want to reverse");
		String str=sc.nextLine();
		String reverse="";
		//System.out.println(str);
		for(int i=str.length()-1;i>=0;i--) 
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		if(str.equals(reverse))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
}
