package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Company 
{
   ArrayList<Employee> c=new ArrayList();
   Scanner sc=new Scanner(System.in);
   public void addEmployee()
   {
	   System.out.println("Enter The Employee Name");
	   String ename=sc.next();
	   System.out.println("Enter The Employee Id");
	   int eid=sc.nextInt();
	   System.out.println("Enter the salary");
	   double salary=sc.nextDouble();
	   c.add(new Employee(ename,eid,salary));
	   System.out.println("Employee Added successfully");
   }
   public void RemoveEmployee(String ename)
   {
	   if(c.size()==0)
	   {
		   System.out.println("Employee doesn't exist");
		   return;
	   }
	   for(Employee e:c)
	   {
		   if(e.ename.equals(ename))
		   {
			  c.remove(e);
			  System.out.println("Employee successfully removed");
			  return;
		   }
	   }
	   System.out.println("Employee doesn't exist in the company");
   }
   public void EmployeeDetails(String ename)
   {
	   if(c.size()==0)
	   {
           System.out.println("Employee doesn't exist");
           return;
	   }
	   for(Employee e:c)
	   {
		   if(e.ename.equals(ename))
		   {
               System.out.println("=====Employee Details=====");
               System.out.println("Employee Name "+e.ename);
               System.out.println("Employee Id "+e.eid);
               System.out.println("Employee Salary "+e.salary);
               return;
		   }
	   }
	   System.out.println("Employee doesn't exist in the company");
   }
   public void UpdateEmployeeDetail(String ename)
   {
	   if(c.size()==0)
	   {
		   System.out.println("Employee doesn't exist");
           return;
	   }
	   for(Employee e:c)
	   {
		   if(e.ename.equals(ename))
		   {
		   System.out.println("Enter the Employee New Name you want To Update");
		   String new_ename=sc.next();
           e.ename=new_ename;
           System.out.println("Employee Name After Updated is "+e.ename);
		   return;
	       }
        }
   System.out.println("Employee doesn't exist in the company");
  }
}















