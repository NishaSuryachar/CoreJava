package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args)
	{
		LinkedHashSet hs=new LinkedHashSet();
		hs.add("Apple");
		hs.add(10);
		hs.add("orange");
		hs.add("jackfruit");
		hs.add("kiwi");
		hs.add("dragon");
		System.out.println(hs);
		LinkedHashSet hs1=new LinkedHashSet();
		hs1.add("i10");
		hs1.add("sedan");
		hs1.add("duster");
		System.out.println(hs1);
		System.out.println(hs1.add(hs));
		System.out.println(hs1.remove("sedan"));
		System.out.println(hs1.removeAll(hs1));
		System.out.println(hs);
		System.out.println("=======for each loop======");
		for(Object o:hs)
		{
			System.out.println(o);
		}
		System.out.println("=======iterator ()======");
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}

}
