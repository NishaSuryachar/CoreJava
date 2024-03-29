package nonprimitivetypecasting;

public class PermanentEmployee extends Employee
{
	String company_Name;
    PermanentEmployee(int emp_id,String emp_name,int emp_age,String company_Name)
    {
    	super(emp_id,emp_name,emp_age);
    	this.company_Name=company_Name;
    }
    public void PermanentEmployeeDetails()
    {
    	System.out.println("======Contract Employee Details========");
    	System.out.println("Employee Name "+emp_name);
    	System.out.println("Employee id "+emp_id);
    	System.out.println("Employee Age "+emp_age);
    	System.out.println("Company Name "+company_Name);
    }
}
