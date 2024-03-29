package practiceprograms;

public class PageDriver {

	public static void main(String[] args)
	{
		Book b1=new Book("abc",123,124.78,"fasi",new Page("ayuit",123));
		b1.bookDetails();
		System.out.println(b1.bname);
		System.out.println(b1.bid);
		System.out.println(b1.price);
		System.out.println(b1.author);
		System.out.println();
		b1.p.displayPageDetails();
		System.out.println(b1.p.getPageTitle());
		System.out.println(b1.p.getPage_no());
	}

}
