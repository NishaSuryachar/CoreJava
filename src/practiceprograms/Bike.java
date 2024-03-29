package practiceprograms;

public class Bike extends Vehicle
{
	   
	   Bike(int no_of_wheels,int engine_no,double price)
	   {
		   super(no_of_wheels,engine_no,price);
		   
	   }
	   public void BikeDetails()
	   {
		   System.out.println("====Bike Details======");
		   System.out.println("Wheels "+no_of_wheels);
		   System.out.println("Engine no "+engine_no);
		   System.out.println("price "+price);
		   

        }
}
