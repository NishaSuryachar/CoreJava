package has_A_relationship;

public class Hotel
{
   String hname;
   String haddress;
   Swiggy s;
   Hotel(String hname,String address)
   {
	   this.hname=hname;
	   this.haddress=address;
   }
   public void Delivery(Swiggy s)
   {
	   this.s=s;
   }
   public void hotelDetails()
   {
	   System.out.println();
	    System.out.println("*******Hotel Details*********");
	    System.out.println(hname);
	    System.out.println(haddress);
	    System.out.println();
   }
}
