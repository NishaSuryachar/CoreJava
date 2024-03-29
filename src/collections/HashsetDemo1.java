package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo1 {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(4.5);
		hs.add('p');
		hs.add(false);
		hs.add("Aerplane");
		hs.add("Aerplane");
		System.out.println(hs);
		System.out.println(hs.remove('p'));
		System.out.println(hs);
		HashSet hs2=new HashSet();
		hs2.add("mango");
		hs2.add("orange");
		hs2.add(hs);
		System.out.println(hs2);
		System.out.println(hs.removeAll(hs));
		System.out.println(hs);
		System.out.println("=====printing using for each loop========");
		for(Object o:hs2)
		{
			System.out.println(o);
		}
		System.out.println("=====printing using iterator loop========");
		Iterator itr=hs2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		}
	

}
