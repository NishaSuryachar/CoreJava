package nonprimitivetypecasting;

public class ElectronicsCommunication extends EngineeringCollege
{
	 String sub1;
     String sub2;
     String sub3;
	 ElectronicsCommunication(String college_name,int college_id,String college_address,String sub1,String sub2,String sub3)
	 {
	      super(college_name,college_id,college_address);
	      this.sub1=sub1;
	      this.sub2=sub2;
	      this.sub3=sub3;
	 }
	 public void streamDetails()
	 {
	    System.out.println("========ELECTRONICS COMMUNICATION ENGINEERING========");
	    System.out.println("college Name "+getCollegeName());
	    System.out.println("college Id "+getCollegeId());
	    System.out.println("college Address "+getCollegeAddress());
	    System.out.println("subject 1 is "+sub1);
    	System.out.println("subject 2 is "+sub2);
    	System.out.println("subject 3 is "+sub3);
	 }
}
