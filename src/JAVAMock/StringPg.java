package JAVAMock;

import java.util.Scanner;

public class StringPg {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(true)
		{
		System.out.println("Enter the string you want reverse");
		String str=sc.next();
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
        if(reverse.equals(str))
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("not");
        }
        exit=false;
		}
	
		
	}

}
