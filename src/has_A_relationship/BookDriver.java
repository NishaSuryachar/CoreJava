package has_A_relationship;

public class BookDriver {

	public static void main(String[] args)
	{
		Book b=new Book("Wings of fire",12,170,"Abdul kalam",new Page("AutoBiography of abdul kalam",180));
		b.bookDetails();
		System.out.println();
		b.p.pageDetails();
		System.out.println();
		System.out.println(b.bname);
		System.out.println(b.bid);
		System.out.println(b.price);
		System.out.println(b.author);
		System.out.println(b.p.getPage_title());
		System.out.println(b.p.getPage_no());
	}

}
