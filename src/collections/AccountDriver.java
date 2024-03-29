package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AccountDriver {

	public static void main(String[] args) 
	{
		ArrayList<Account> bank=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of accounts");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Account Number");
			int accno=sc.nextInt();
			System.out.println("Enter the Account Balance");
			double balance=sc.nextDouble();
			System.out.println("Enter the password");
			String pass=sc.next();
			bank.add(new Account(accno,balance,pass));
		}
			System.out.println("=========Printing using forEach Loop=========");
			for(Account a:bank)
			{
				System.out.println("Account No:"+a.accno);
				System.out.println("Account balanc:"+a.balance);
				System.out.println("password:"+a.pass);
			}
			
		
      }
}
