package nonprimitivetypecasting;

public class ContractEmployee extends Employee
{
    String agency_Name;
    ContractEmployee(int emp_id,String emp_name,int emp_age,String agency_Name)
    {
    	super(emp_id,emp_name,emp_age);
    	this.agency_Name=agency_Name;
    }
    public void ContractEmployeeDetails()
    {
    	System.out.println("======Contract Employee Details========");
    	System.out.println("Employee Name "+emp_name);
    	System.out.println("Employee id "+emp_id);
    	System.out.println("Employee Age "+emp_age);
    	System.out.println("Agency Name "+agency_Name);
    }
}
