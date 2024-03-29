package collections;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args)
	{
		TreeMap<Integer,String> tr=new TreeMap();
		tr.put(1,"onion");
		tr.put(5,"tomoto");
		tr.put(4,"pototo");
		tr.put(3,"carrot");
		tr.put(2,"beans");
		tr.put(10, null);
		System.out.println(tr);
		System.out.println(tr.get(2));
		System.out.println(tr.keySet());
		System.out.println(tr.values());
		System.out.println(tr.entrySet());
		System.out.println(tr.containsKey(2));
		System.out.println(tr.containsValue("beans"));
		tr.putIfAbsent(6,"bitterguard");
		System.out.println(tr);
		System.out.println(tr.replace(5,"brinjal"));
		System.out.println(tr);
		TreeMap tr1=new TreeMap();
		tr1.put(7,"cauliflower");
		tr1.put(8,"chilly");
		tr1.putAll(tr);
		System.out.println(tr1);
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
