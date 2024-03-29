package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add("apple");
		ts.add("orange");
		ts.add("pine apple");
		ts.add("avocado");
		ts.add("banana");
		System.out.println(ts);
		TreeSet ts1=new TreeSet();
		ts1.add("pototo");
		ts1.add("tomoto");
		ts1.add("brinjal");
		ts1.add("brinjal");
		System.out.println(ts1);
		System.out.println(ts.addAll(ts1));
		System.out.println(ts);
		ts.remove("orange");
		System.out.println(ts);
		ts1.removeAll(ts1);
		System.out.println(ts1);
		System.out.println(ts);
		System.out.println("=======for each loop======");
		for(Object o:ts) 
		{
			System.out.println(o);
		}		
		System.out.println("=======iterator ()======");
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
