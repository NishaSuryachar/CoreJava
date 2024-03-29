package practiceprograms;

public class BagDriver
{
	public static void main(String[] args)
	{
    Bagy b1=new Bagy("pink",234.90);
    b1.addBook(new Booky("abc",21,678.90));
    b1.bagyDetails();
    b1.b.bookDetails();
    System.out.println(b1.b.getBname());
    b1.removeBook();
	}   
}
