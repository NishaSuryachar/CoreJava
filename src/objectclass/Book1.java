package objectclass;

public class Book1
{
	   String bname;
	   int bid;
	   double price;
	   Book1(String bname,int bid,double price)
	   {
		   this.bname=bname;
		   this.bid=bid;
		   this.price=price;
	   }   
	   public String toString()
	   {
		   return " bname = "+bname +" bid = "+bid+ " price = "+price ;  
	   }
	public static void main(String[] args)
	{
		 Book1 b=new Book1("Abc",12,20.0);
		 System.out.println(b);//iam print state(variable) of the object

	}

}
// here  iam overriding the toString() because instead of returning the reference i want to print state(variable) of the object