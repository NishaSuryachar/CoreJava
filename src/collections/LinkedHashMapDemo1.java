package collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapDemo1 {

	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String> map=new LinkedHashMap();
		map.put(1,"apple");
		map.put(3,"orange");
		map.put(2,"kiwi");
		map.put(4,"papaya");
		map.put(5,"watermelon");
		System.out.println(map);
		System.out.println(map.get(4));//papaya
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.containsKey(2));//true
        System.out.println(map.containsValue("papaya"));//true
        LinkedHashMap map1=new LinkedHashMap();
        map1.put(6,"jackfruit");
        map1.put(8,"mango");
        map1.putAll(map);
        System.out.println(map1);
        map1.putIfAbsent(7,"chikku");
        System.out.println(map1.putIfAbsent(7,"chikku"));
        System.out.println(map1);
        System.out.println(map1.replace(2,"maskmelon"));
        System.out.println(map1);
        System.out.println(map1.remove(5));//watermelon
        System.out.println(map1.remove(3, "orange"));//true
        System.out.println("====keys=====");
        for(Integer key:map.keySet())
        {
        	System.out.println(key);
        }
        System.out.println("====values=====");
        for(String value:map.values())
        {
        	System.out.println(value);
        }
        System.out.println("====entries=====");
        for(Entry<Integer,String> e:map.entrySet())
        {
        	System.out.println(e);
        }
	}

}
