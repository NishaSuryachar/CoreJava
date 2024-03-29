package has_A_relationship;

public class Employee 
{
   private String emp_name;//r/w
   private int emp_id;//r
   private long cno;//r
   Employee(String emp_name,int emp_id,long cno)
   {
	   this.emp_name=emp_name;
	   this.emp_id=emp_id;
	   this.cno=cno;
   }
   public String getEmpName()
   {
	   return emp_name;
   }
   public void setEmpName(String emp_name)
   {
	   this.emp_name=emp_name;
   }
   public int getEmpId()
   {
	   return emp_id;
   }
   public long getCNo()
   {
	   return cno;
   }
}
