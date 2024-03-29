package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hs=new HashMap();
		hs.put(1,"apple");
		hs.put(2,"orange");
		hs.put(3,"grapes");
		hs.put(4,"banana");
		hs.put(5,"papaya");
		hs.put(null,null);
		System.out.println(hs);
		System.out.println(hs.get(2));//orange
		System.out.println(hs.get(6));
		System.out.println(hs.values());
		System.out.println(hs.keySet());
		System.out.println(hs.entrySet());
		System.out.println(hs.containsKey(5));//true
		System.out.println(hs.containsKey(6));//false
		System.out.println(hs.containsValue("banana"));//true
		System.out.println(hs.containsValue("kiwi"));//false
		System.out.println(hs.replace(3,"avacado"));
		System.out.println(hs);
		HashMap hs1=new HashMap();
		hs1.put(7,"straberry");
		hs1.put(6,"dragon");
	   hs1.putAll(hs);
	   System.out.println(hs1);
	   System.out.println(hs.remove(1));//apple
	   System.out.println(hs.remove(5,"papaya"));//boolean true
	   System.out.println("=======keys=====");
	   for(Integer keys:hs.keySet())
	   {
		   System.out.println(keys);
	   }
	   System.out.println("=======values=====");
	   for(String values:hs.values())
	   {
		   System.out.println(values);
	   }
	   System.out.println("=======Entry=====");
	   for(Entry<Integer,String> s:hs.entrySet())
	   {
		   System.out.println(s);
	   }
	}

}
