package is_A_relationship;

import java.util.Scanner;

public class VehicleDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of wheels for car");
		int no_of_wheels=sc.nextInt();
		System.out.println("Enter the price of the car");
		double price=sc.nextDouble();
		System.out.println("Enter the engine no of the car");
		int engine_no=sc.nextInt();
		System.out.println("The no of doors for the car");
		int no_of_doors=sc.nextInt();
		Car c=new Car(no_of_wheels, price,engine_no,no_of_doors);
		System.out.println("Enter the no of wheels for Bike");
		int bwheels=sc.nextInt();
		System.out.println("Enter the price of the Bike");
		double bprice=sc.nextDouble();
		System.out.println("Enter the engine no of the Bike");
		int bengine_no=sc.nextInt();
		Bike b=new Bike(bwheels,bprice,bengine_no);
		c.carDetails();
		b.BikeDetails();
	}

}
