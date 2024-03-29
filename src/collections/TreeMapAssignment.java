package collections;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapAssignment {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> tr=new TreeMap();
		tr.put(1,"onion");
		tr.put(2,"tomoto");
		tr.put(3,"pototo");
		tr.put(4,"carrot");
		tr.put(5,"beans");
		System.out.println(tr);
		System.out.println("======keys=====");
		for(Integer key:tr.keySet())
		{
			System.out.println(key);
		}
		System.out.println("======values=====");
		for(String value:tr.values())
		{
			System.out.println(value);
		}
		System.out.println("======entries=====");
		for(Entry<Integer,String> e:tr.entrySet())
		{
			System.out.println(e);
		}

	}

}
