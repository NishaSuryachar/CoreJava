package has_A_relationship;

import java.util.Scanner;

public class Company
{
   String company_name;
   Employee e;
   Company(String company_name)
   {
	   this.company_name=company_name;
   }
   public void addEmployee(Employee e)
   {
	   if(this.e==null)
	   {
		   this.e=e;
		   System.out.println("Employee Successfully Added");
	   }
	   else
	   {
		   System.out.println("Employee already present");
	   }
	}
   public void removeEmployee()
   {
	   if(e==null)
	   {
		   System.out.println("There is No Employee To Remove");
	   }
	   else
	   {
		   e=null;
		   System.out.println("Employee Successfully Removed");
	   }
   }
   public void updateEmployee()
   {
	   if(e==null)
	   {
		   System.out.println("There is No Employee To Update");
	   }
	   else
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter The Name You Want To Update");
		   String new_name=sc.next();
		   e.setEmpName(new_name);
		   System.out.println("The Name is Update Suceessfully!!!");
		   System.out.println("The updated Name is "+new_name);
	   }
   }
   public void empDetails() 
   {
	if(e==null)
	{
		System.out.println("There is NO Employee To Show The Details");
	}
	else
	{
		System.out.println("***********Employee Details************");
		System.out.println("The Name of The Employee is "+e.getEmpName());
		System.out.println("The Employee Id is "+e.getEmpId());
		System.out.println("The Contact Number of Employee is "+e.getCNo());
	}
   }
}
