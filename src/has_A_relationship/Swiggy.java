package has_A_relationship;

public class Swiggy 
{
    String cname;
    long cno;
    String address;
    Swiggy(String cname,long cno,String address)
    {
    	this.cname=cname;
    	this.cno=cno;
    	this.address=address;
    }
    public void customerDetails()
    {
    	System.out.println();
    	System.out.println("*******Customer Details*********");
    	System.out.println(cname);
    	System.out.println(cno);
    	System.out.println(address);
    }
}
