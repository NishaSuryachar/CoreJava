package collections;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args)
	{
		Hashtable<Integer,String> hs=new Hashtable();
		hs.put(1,"palav");
		hs.put(2,"bath");
		hs.put(3,"uppittu");
		hs.put(4,"pongal");
		hs.put(5,"biriyani");
		//hs.put(null,null);NullPointerException
		System.out.println(hs);
		System.out.println(hs.keySet());
		System.out.println(hs.values());
		System.out.println(hs.entrySet());
		System.out.println(hs.get(1));
		System.out.println(hs.remove(3,"uppittu"));
		hs.replace(2,"panner kurma");
		hs.putIfAbsent(6,"mushroom biriyani");
		System.out.println(hs);
		System.out.println("======keys=====");
		for(Integer key:hs.keySet())
		{
			System.out.println(key);
		}
		System.out.println("======values=====");
		for(String value:hs.values())
		{
			System.out.println(value);
		}
		System.out.println("======entries=====");
		for(Entry<Integer,String> e:hs.entrySet())
		{
			System.out.println(e);
		}
	}

}
