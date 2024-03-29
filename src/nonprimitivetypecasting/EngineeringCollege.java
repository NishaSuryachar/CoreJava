package nonprimitivetypecasting;

public class EngineeringCollege
{
    private String college_name;
    private int college_id;
    private String college_address;
    EngineeringCollege(String college_name,int college_id,String college_address)
    {
    	this.college_name=college_name;
    	this.college_id=college_id;
    	this.college_address=college_address;
    }
    public String getCollegeName()
    {
    	return college_name;
    }
    public int getCollegeId()
    {
    	return college_id;
    }
    public String getCollegeAddress()
    {
    	return college_address;
    }
}
