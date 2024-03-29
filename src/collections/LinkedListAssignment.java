package collections;

import java.util.LinkedList;

public class LinkedListAssignment {

	public static void main(String[] args)
	{
		LinkedList veggies=new LinkedList();
		veggies.add("onion");
		veggies.add("Tomoto");
		veggies.add("Carrot");
		veggies.add("pototo");
		veggies.add("Beans");
		veggies.add("Chilly");
		System.out.println(veggies);
		for(Object o:veggies)
		{
			System.out.println(o);
		}
		veggies.remove("Carrot");
		System.out.println(veggies);
	}

}
