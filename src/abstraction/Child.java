package abstraction;

import java.util.Scanner;

public class Child extends ATM
{
	Scanner sc=new Scanner(System.in);
	int password=8899;
	Double balance=25000.00;
	public void withdraw()
	{
		System.out.println("Enter the password");
    	int pass=sc.nextInt();
    	if(pass==password)
    	{
    		System.out.println("Enter the Amount you Want To Withdraw");
    		int Amount=sc.nextInt();
    		if(Amount<balance)
    		{
    			System.out.println("Amount Successfully withdraw");
    			balance=balance-Amount;
    		//	System.out.println("your Account Balance is "+balance);
    			
    		}
    		else
    		{
    			System.out.println("Insufficient Balance");
    		}
    	}
    	else
    	{
    		System.out.println("You Have Entered Wrong Password");
    	}	
		
		
	}
	
	public void getBalance()
	{
		System.out.println("Enter the password");
    	int pass=sc.nextInt();
    	if(pass==password)
    	{
    		
    		System.out.println("your Account Balance is "+balance);
    	}
    	else
    	{
    		System.out.println("You Have Entered Wrong Password");
    	}
	}
	
	public void deposit()
	{
		System.out.println("Enter the password");
    	int pass=sc.nextInt();
    	if(pass==password)
    	{
    		System.out.println("Enter The Amount You Want To Deposit");
    		int Amount=sc.nextInt();
    		balance=balance+Amount;
    		System.out.println("Successfully Deposited");
    		//System.out.println("your Account Balance is "+balance);
    		
    	}
    	else
    	{
    		System.out.println("You Have Entered Wrong Password");
    	}	
	}
}
