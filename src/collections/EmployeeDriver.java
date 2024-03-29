package collections;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) 
	{
		Company c1=new Company();
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter Your Choice");
			System.out.println(" 1.ADDEMPLOYEE\n 2.REMOVEEMPLOYEE\n 3.EMPLOYEEDETAILS\n 4.UPDATEEMPLOYEEDETAIL\n 5.EXIT");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				c1.addEmployee();
			}
			break;
			case 2:
			{
				System.out.println("Enter The Employee Name You Want To Remove");
				String ename=sc.next();
				c1.RemoveEmployee(ename);
			}
			break;
			case 3:
			{
				System.out.println("Enter The Employee Name to see the Details");
				String ename=sc.next();
				c1.EmployeeDetails(ename);
			}
			break;
			case 4:
			{
				System.out.println("Enter The Employee Name You Want To Update");
				String ename=sc.next();
				c1.UpdateEmployeeDetail(ename);
			}
			break;
			case 5:
			{
				exit=false;
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
