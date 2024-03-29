package practiceprograms;

public class Employee
{
   private int emp_id;
   private  String emp_name;
   private int emp_age;
   Employee(int emp_id,String emp_name,int emp_age)
   {
	   this.emp_id=emp_id;
	   this.emp_name=emp_name;
	   this.emp_age=emp_age;
   }
   public int getEmpId()
   {
	   return emp_id;
   }
   public String getEmpName()
   {
	   return emp_name;
   }
   public int getEmpAge()
   {
	   return emp_age;
   } 
    
}
