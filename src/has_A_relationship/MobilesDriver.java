package has_A_relationship;

import java.util.Scanner;

public class MobilesDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile brand");
        String brand=sc.next();
        System.out.println("Enter the color");
        String color=sc.next();
        System.out.println("Enter the price");
        double price=sc.nextDouble();
		Mobiles m=new Mobiles(brand,color,price);
		boolean exit=true;
		while(true)
		{
			System.out.println("1.ADDEARPHONE\n 2.REMOVEEARPHONE\n 3.UPDATEEARPHONE\n 4.EARPHONEDETAILS\n 5.EXIT");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter Earphone brand");
			    String ebrand=sc.next();
	            System.out.println("Enter the Earphone color");
	            String ecolor=sc.next();
	            System.out.println("Enter the Earphone price");
	            double eprice=sc.nextDouble();
	            m.addEarPhone(new Earphone(ebrand,ecolor,eprice));
	        }
			break;
			case 2:
			{
				m.removeEarphone();
			}
			break;
			case 3:
			{
				m.updateEarphones();
			}
			break;
			case 4:
			{
				m.earPhoneDetails();
			}
            break;
			case 5:
			{
				exit=false;
			}
			break;
			default:
			{
				System.out.println("Invalid Choice");
			}
			}
	        }
		}
}
