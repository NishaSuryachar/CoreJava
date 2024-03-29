package collections;

import java.util.Scanner;
import java.util.TreeMap;

public class ContactBook
{
	Scanner sc=new Scanner(System.in);
    TreeMap<String,Contact> tr=new TreeMap();
    public void addContact(Contact c)
    {
    	if(tr.containsKey(c.cname))
    	{
    		System.out.println("Contact already exist");
    	}
    	else
    	{
    		tr.put(c.cname,c);
    		System.out.println("Contact created");
    	}
    }
    public void removeContact(String cname)
    {
    	Contact c=tr.remove(cname);
    	if(c==null)
    	{
    		System.out.println("contact doesn't exist");
    	}
    	else
    	{
    		System.out.println("contact removed");
    	}
    }
    public void contactDetails(String cname)
    {
    	if(tr.containsKey(cname))
    	{
    		System.out.println("Contact found");
    		System.out.println("=====Contact Details====");
    	}
    	else
    	{
    		System.out.println("contact not found");
    	}
    }
    
}
