package has_A_relationship;

public class Engine
{
   private int engine_no;//r
   private int cc;//r
   Engine(int engine_no,int cc)
   {
	   this.engine_no=engine_no;
	   this.cc=cc;
   }
   public int getEngine_no()
   {
	   return engine_no;
   }
   public int getCc()
   {
	   return cc;
   }
   public void engineDetails()
   {
	   System.out.println("=====Engine Details=====");
	   System.out.println("Engine no "+engine_no); 
	   System.out.println("cc is "+cc); 
   }
   
}
