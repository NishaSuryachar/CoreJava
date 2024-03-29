package has_A_relationship;
 
import java.util.Scanner; 

public class HotelDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hotel name");
		String hname=sc.nextLine();
		System.out.println("Enter Hotel address");
		String haddress=sc.nextLine();
		System.out.println("Enter customer name");
		String cname=sc.nextLine();
		System.out.println("Enter cno");
	    Long cno=sc.nextLong();
		System.out.println("Enter customer address");
		String address=sc.next();
		Hotel h=new Hotel(hname,haddress);
		h.Delivery(new Swiggy(cname,cno,address));
		h.hotelDetails();
	    h.s.customerDetails();
	    System.out.println();
	    System.out.println(h.s.cname);
	    System.out.println(h.s.cno);
	    System.out.println(h.s.address);
	}

}
