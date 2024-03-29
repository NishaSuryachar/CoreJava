package encapsulation;
import java.util.Scanner;

public class BankDriver
{
    public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Bank Name");
	     String bank_name=sc.nextLine();
	     System.out.println("Enter Bank_manager_name");
	     String bank_manager_name=sc.nextLine();
	     System.out.println("Enter Branch");
	     String branch=sc.nextLine();
	     System.out.println("Enter Bank_head_office");
	     String bank_head_office=sc.nextLine();
	     Bank b1=new Bank(bank_name,bank_manager_name,branch,bank_head_office);
	     System.out.println(b1.getBName());
	     System.out.println(b1.getMName());
	     System.out.println("the Branch manager Name after updated");
	     b1.setMName("Ram");
	     System.out.println(b1.getMName());
	     System.out.println(b1.getBranch());
	     b1.setBranch("SBI basavanagudi branch");
	     System.out.println("updated branch is");
	     System.out.println(b1.getBranch());
	     System.out.println(b1.getHoffice());
	 }

}
