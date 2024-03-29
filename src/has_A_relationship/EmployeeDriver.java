package has_A_relationship;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Company Name");
		String name=sc.next();
		Company c=new Company(name);
		boolean exit=true;
		while(true)
		{
			System.out.println("1.ADDEMPLOYEE\n 2.REMOVEEMPLOYEE\n 3.UPDATEEMPLOYEE\n 4.EMPLOYEEDETAILS\n 5.exit");
			System.out.println("Please Enter your Choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter the Employee Name");
			       String emp_name=sc.next();
			       System.out.println("Enter Employee Id");
			       int emp_id=sc.nextInt();
			       System.out.println("Enter Employee Contact Number");
			       long cno=sc.nextLong();
				   c.addEmployee(new Employee(emp_name,emp_id,cno));
		        }
			    break;
			    case 2:
			    {
			    	c.removeEmployee();
			    }
			    break;
			    case 3:
			    {
			    	c.updateEmployee();
			    }
			    break;
			    case 4:
			    {
			    	c.empDetails();
			    }
			    break;
			    case 5:
			    {
			    	exit=false;
			    }
			    break;
			    default:
			    {
			    	System.out.println("Invalid Choice");
			    }
			    
		    }
	     }

      }
}	
