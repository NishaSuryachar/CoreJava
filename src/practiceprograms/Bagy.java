package practiceprograms;

public class Bagy
{
   String bagcolor;
   double bagprice;
   Booky b;
   Bagy(String bagcolor,double bagprice)
   {
	   this.bagcolor=bagcolor;
	   this.bagprice=bagprice;
   }
   public void addBook(Booky b)
   {
	   this.b=b;
   }
   public void removeBook()
   {
	   b=null;
   }
   public void bagyDetails()
   {
	   System.out.println("====bagy details=====");
	   System.out.println(bagcolor);
	   System.out.println(bagprice);
	   System.out.println(b.getBname());
   }
}
