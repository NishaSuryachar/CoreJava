package encapsulation;

public class Facebook
{
   private String user_name;//r/w
   private int user_id;//r
   private String password;//w
   Facebook(String user_name,int user_id,String password)
   {
	   this.user_name=user_name;
	   this.user_id=user_id;
	   this.password=password;
   }
   public String getUName()
   {
	   return user_name;
   }
   public void setUName(String user_name)
   {
	   this.user_name=user_name;
   }
   public int getUId()
   {
	   return user_id;
   }
   public void setPassword(String password)
   {
	   this.password=password;
   }
  }
