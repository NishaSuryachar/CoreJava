package practiceprograms;

import java.util.Scanner;
import java.util.TreeMap;

public class ContactBook
{
   Scanner sc=new Scanner(System.in);
   TreeMap<String,Contact> t1=new TreeMap();
   public void addContact(Contact c)
   {
	   if(t1.containsKey(c.cname))
	   {
		   System.out.println("Contact found");
		   return;
	   }
	   else
	   {
		   t1.put(c.cname, c);
		   System.out.println("contact created");
		   return;
	   }
	   
   }
   public void removeContact(String cname)
   {
	   Contact c=t1.remove(cname);
	   if(c==null)
	   {
		   System.out.println("Contact not found");
		   return;
	   }
	   else
	   {
		   System.out.println("contact removed");
	   }
   }
   public void showDetails(String cname)
   {
	   if(t1.containsKey(cname))
	   {
		   System.out.println("Contact found");
		   System.out.println(cname);
		   
	   }
	   else
	   {
		   System.out.println("Not found");
	   }
	   
   }
}
