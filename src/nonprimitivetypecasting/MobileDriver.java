package nonprimitivetypecasting;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Mobile m=null;
		boolean exit=true;
		while(exit)
		{
		System.out.println("Enter your choice");
		System.out.println("1. SELECTMOBILE\n 2.MOBILEDETAILS");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			System.out.println("please select mobile Type");
			System.out.println("1.NOKIA\n 2.SAMSUNG\n 3.ONEPLUS\n 4.EXIT");
			int choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
			{
				m=new Nokia("Nokia","red","4GB",8.500);
				System.out.println("Nokia is selected!!!");
			}
			break;
			case 2:
			{
				m=new Samsung("Samsung","blue","16GB",12000);
				System.out.println("Samsung is selected!!!");
			}
			break;
			case 3:
			{
				m=new Oneplus("Oneplus","silver","32GB",40000.0);
				System.out.println("Oneplus is selected!!!");
			}
			break;
			}
		}
		break;
		case 2:
		{
			if(m==null)
			{
                 System.out.println("No mobile is selected");
            }
			else if(m instanceof Nokia)
			{
				Nokia n=(Nokia)m;
				n.NokiaDetails();
			}
			else if(m instanceof Samsung)
			{
				Samsung s=(Samsung)m;
				s.SamsungDetails();
			}
			else if(m instanceof Oneplus)
			{
				Oneplus o=(Oneplus)m;
				o.OneplusDetails();
			}
		}
		break;
		case 3:
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
