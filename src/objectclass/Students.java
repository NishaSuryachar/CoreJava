package objectclass;

public class Students
{
  int id;
  String sname;
  Students(int id,String sname)
  {
	   this.id=id;
	   this.sname=sname;
  }
    public boolean equals(Object o)
    {
    	Students s=(Students)o;
    	return this.id==s.id && this.sname.equals(s.sname);
    }
	public static void main(String[] args)
	{
		Students s1=new Students(12,"Nisha");
		Students s2=new Students(12,"Nisha");
		Students s3=new Students(13,"amrutha");
		Students s4=new Students(18,"ananya");
		System.out.println(s1.equals(s2));//iam comparing the state(variable) of an object//true
		System.out.println(s2.equals(s3));//iam comparing the state(variable) of an object//false
		System.out.println(s3.equals(s4));//false
	}

}
//equals() comparing the reference of an object i want to compare the state(variable) of an object so i override the equals method