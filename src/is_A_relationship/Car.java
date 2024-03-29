package is_A_relationship;

public class Car extends Vehicle
{
   int no_of_doors;
   Car(int no_of_wheels,double price,int engine_no,int no_of_doors)
   {
	   super(no_of_wheels,price,engine_no);
	   this.no_of_doors=no_of_doors;
   }
   public void carDetails()
   {
	   System.out.println("==========car Details==========");
	   System.out.println("No of wheels for car is "+no_of_wheels);
	   System.out.println("price of the Car"+price);
	   System.out.println("The engine No of the car is "+engine_no);
	   System.out.println("No of doors for the Car is "+no_of_doors);
   }
}
