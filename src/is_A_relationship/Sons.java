package is_A_relationship;

public class Sons extends Fathers
{
   String name="smiths";
   int age=8;
   public void display()
   {
	  System.out.println("The son Name is "+this.name);   
	  System.out.println("The son Age is "+this.age);   
	  System.out.println("The Father name is "+super.name);   
	  System.out.println("The Father age is "+super.age);   
   }
}
