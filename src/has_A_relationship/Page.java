package has_A_relationship;

public class Page 
{
   private String page_title;//r
   private int page_no;//r
   Page(String page_title,int page_no)
   {
	   this.page_title=page_title;
	   this.page_no=page_no;
   } 
   public String getPage_title()
   {
	   return page_title;
   }
   public int getPage_no()
   {
	   return page_no;
   }
   public void pageDetails()
   {
	   System.out.println("****PAGE DETAILS****");
	   System.out.println(page_title);
	   System.out.println(page_no);
   }
}
