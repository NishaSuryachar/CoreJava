package collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo2 {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> vehicles=new LinkedHashMap();
		vehicles.put(1,"car");
		vehicles.put(2,"lorry");
		vehicles.put(3,"bus");
		vehicles.put(4,"auto");
		vehicles.put(5,"scooter");
		System.out.println(vehicles);
		System.out.println(vehicles.get(2));
		vehicles.putIfAbsent(6,"aeroplane");
		System.out.println(vehicles);
		vehicles.replace(3,"bike");
		vehicles.remove(4);
		System.out.println(vehicles);
		System.out.println("======keys=====");
		for(Integer key:vehicles.keySet())
		{
			System.out.println(key);
		}
		System.out.println("======values=====");
		for(String value:vehicles.values())
		{
			System.out.println(value);
		}
		System.out.println("======entries=====");
		for(Entry<Integer,String> e:vehicles.entrySet())
		{
			System.out.println(e);
		}
	}
}
