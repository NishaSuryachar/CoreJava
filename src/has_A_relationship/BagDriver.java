package has_A_relationship;

import java.util.Scanner;

public class BagDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bag color");
		String color=sc.next();
		System.out.println("Enter the bag price");
		double bag_price=sc.nextDouble();
		System.out.println("Enter the book name");
		String book_name=sc.next();
		System.out.println("Enter the book id");
		int book_id=sc.nextInt();
		System.out.println("Enter the book price");
		double price=sc.nextDouble();
		Bag b=new Bag(color,bag_price);
		b.addBook(new Books(book_name,book_id,price));
		System.out.println();
		b.bagDetails();
		b.b1.bookDetails();
        System.out.println();
		System.out.println(b.b1.getBookName());
		b.removeBook();
		System.out.println(b.b1.book_id);
	}

}
