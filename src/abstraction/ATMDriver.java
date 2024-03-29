package abstraction;

import java.util.Scanner;

public class ATMDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ATM a=new Child();
		boolean exit=true;
		while(exit)
		{
        System.out.println("Enter your choice");
        System.out.println("1.WITHDRAW\n 2.GETBALANCE\n 3.DEPOSIT");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        {
        	a.withdraw();
        }
        break;
        case 2:
        {
        	a.getBalance();
        }
        break;
        case 3:
        {
        	a.deposit();
        }
        break;
        default:
        {
        	System.out.println("Invalid choice");
        }
        }
	}
}
}
