package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) 
	{
		LinkedList cars=new LinkedList();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("i10");
		cars.add("Thar");
		cars.add("Duster");
		System.out.println(cars);
		System.out.println("=========Printing using for Loop=========");
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		System.out.println("=========Printing using forEach Loop=========");
		for(Object o:cars)
		{
			System.out.println(o);
		}
		System.out.println("=========Printing using Iterator Loop=========");
		Iterator itr=cars.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
}
