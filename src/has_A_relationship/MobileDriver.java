package has_A_relationship;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the brand");
		String brand=sc.next();
		System.out.println("Enter the RAM");
		String ram=sc.next();
		System.out.println("Enter the price");
		double price=sc.nextDouble();
		System.out.println("Enter sim no");
		int simNo=sc.nextInt();
		System.out.println("Enter service provider");
		String service_provider=sc.next();
		Mobile m=new Mobile(brand,ram,price);
		m.insertSim(new Sim(simNo,service_provider));
		System.out.println();
		m.MobileDetails();
		System.out.println(m.s.getsimNo());
		m.s.simDetails();
		m.removeSim();
	}

}
