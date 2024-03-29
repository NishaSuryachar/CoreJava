package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(25);
		al.add("Apple");
		al.add(4.5);
		al.add('n');
		al.add(25);
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al);
		al.add(false);
		System.out.println(al);
		System.out.println(al.remove(2));
		System.out.println(al.remove("Apple"));
		System.out.println(al);
		System.out.println(al.removeAll(al));
		System.out.println(al);
		System.out.println("=====================");
		ArrayList a2=new ArrayList();
		a2.add(25);
		a2.add("Apple");
		a2.add(4.5);
		a2.add('n');
		a2.add(25);
		a2.add(false);
	    System.out.println(a2);
	    a2.add(2, "Mango");
	    System.out.println(a2);
		
	}

}
