package collections;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args)
	{
		HashMap hs=new HashMap();
		hs.put(1,"apple");
		hs.put(2,"apple");
		hs.put(3,"mango");
		hs.put(4,"orange");
		hs.put(5,"banana");
		hs.put(null, null);
		System.out.println(hs);
		HashMap hs1=new HashMap();
		hs1.put(6,"dragon");
		hs1.put(7,"kiwi");
		System.out.println(hs1);
		hs1.putAll(hs);
		System.out.println(hs1);
		hs1.remove(1);
		System.out.println(hs1);
		
	}

}
