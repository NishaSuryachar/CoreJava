package abstraction;

public class Shapeabstract {

	public static void main(String[] args) 
	{
		Shape s=new Rectangle();
		s.draw();
		s.erase();
		s.painting();
		
	    System.out.println("============");
	    Shape s1=new Square();
		s1.draw();
		s1.erase();
		s1.painting();
	}

}
