package encapsulation;

public class Student 
{
    private String sname="karthik";//r//w
    private int sid=12;//r
    private int age=23;//w
    public String getName()
    {
    	return sname;
    }
    public void setName(String sname)
    {
    	this.sname=sname;
    }
    public int getSid()
    {
        return sid;
    }
    public void setAge(int age)
    {
    	this.age=age;
    }
 }
