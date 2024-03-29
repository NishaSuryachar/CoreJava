package encapsulation;

public class Bank
{
   private String bank_name;//r
   private String bank_manager_name;//r/w
   private String branch;//r/w
   private String bank_head_office;//r
   Bank(String bank_name,String bank_manager_name,String branch,String bank_head_office)
   {
	  this.bank_name=bank_name;
	  this.bank_manager_name=bank_manager_name;
	  this.branch=branch;
	  this.bank_head_office=bank_head_office;
   }
   public String getBName()
   {
	   return bank_name;
   }
   public String getMName()
   {
	   return bank_manager_name;
   }
   public void setMName(String bank_manager_name)
   {
	   this.bank_manager_name=bank_manager_name;
   }
   public String getBranch()
   {
	   return branch;
   }
   public void setBranch(String branch)
   {
	   this.branch=branch;
   }
   public String getHoffice()
   {
	   return bank_head_office;
   }
}
