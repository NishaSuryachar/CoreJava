package encapsulation;

import java.util.Scanner;

public class FacebookDriver
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username");
		String user_name=sc.next();
		System.out.println("enter user_id");
		int user_id=sc.nextInt();
		System.out.println("enter password");
		String password =sc.next();
		Facebook f1=new Facebook(user_name,user_id,password);
		System.out.println(f1.getUName());
		f1.setUName("seema");
		System.out.println(f1.getUId());
		f1.setPassword("seema1234");
		System.out.println(f1.getUName());
		
	}

}
