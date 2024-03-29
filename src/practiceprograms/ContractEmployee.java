package practiceprograms;

public class ContractEmployee extends Employee
{
    private String agency_name;
    ContractEmployee(int emp_id,String emp_name,int emp_age,String agency_name)
    {
    	super(emp_id,emp_name,emp_age);
    	this.agency_name=agency_name;
    }
    public void ContractEmployeeDetails()
    {
    	System.out.println("=====contract employee details=====");
    	System.out.println("emp name "+super.getEmpName());
    	System.out.println("emp age "+super.getEmpAge());
    	System.out.println("emp id "+super.getEmpId());
    	System.out.println("agency name "+agency_name);
    }
    
}
