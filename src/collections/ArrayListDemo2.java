package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args)
	{
		ArrayList a2=new ArrayList();
		a2.add(25);
		a2.add("Apple");
		a2.add(4.5);
		a2.add('n');
		a2.add(25);
		a2.add(false);
		System.out.println(a2);//[25, Apple, 4.5, n, 25, false]
		System.out.println(a2.size());//6
		System.out.println(a2.get(3));//n
		a2.add(4,"gold");
		System.out.println(a2);
		ArrayList a3=new ArrayList();
		System.out.println("================");
		a3.add("pine apple");
		a3.add(890);
		System.out.println(a3);
		a3.add(a2);
		System.out.println(a3);
		System.out.println(a3.size());
		System.out.println(a3.get(2));
		
	}

}
