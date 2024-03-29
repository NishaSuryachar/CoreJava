package practiceprograms;

public class PermanentEmployee extends Employee
{

	private String company_name;
	 PermanentEmployee(int emp_id,String emp_name,int emp_age,String company_name)
    {
    	super(emp_id,emp_name,emp_age);
    	this.company_name=company_name;
    }
    public void PermanentEmployeeDetails()
    {
    	System.out.println("=====Permanent employee details=====");
    	System.out.println("emp name "+super.getEmpName());
    	System.out.println("emp age "+super.getEmpAge());
    	System.out.println("emp id "+super.getEmpId());
    	System.out.println("company name "+company_name);
    }
    
}
