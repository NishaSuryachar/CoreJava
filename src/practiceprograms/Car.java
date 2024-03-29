package practiceprograms;

public class Car extends Vehicle
{
   int no_of_doors;
   Car(int no_of_wheels,int engine_no,double price,int no_of_doors)
   {
	   super(no_of_wheels,engine_no,price);
	   this.no_of_doors=no_of_doors;
   }
   public void CarDetails()
   {
	   System.out.println("====car Details======");
	   System.out.println("Wheels "+no_of_wheels);
	   System.out.println("Engine no "+engine_no);
	   System.out.println("price "+price);
	   System.out.println("doors "+ no_of_doors);

   }
   
}
