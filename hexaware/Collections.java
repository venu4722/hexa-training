package com.hexaware;
import java.util.*;
public class Collections {
	public static void main(String args[]) {
		List list=new ArrayList();
		list.add("venu");
		list.add(1);
		list.add(null);
		list.add("uday");
		list.add(1);
		System.out.println("ArrayList:" + list);
		
		Set set=new HashSet();
		set.add("venu");
		set.add(1);
		set.add(null);
		set.add("uday");
		set.add(1);
		System.out.println("Set:"+ set);
		Map map =new HashMap();
		map.put("1", 1);
		map.put(2, "venu");
		map.put("venu", 3);
		map.put(3, "asha");
		System.out.println("Map:"+map);
		
		List list2=new LinkedList();
		list2.add(1);
		list2.add(3);
		list2.add(8);
		list2.add("5");
		System.out.println("linkedlist:"+ list2);
		
		List list4=new Vector<>();

	     // Add elements to the List
	     list4.add("Element 1");
	     list4.add("Element 2");
	     list4.add("Element 3");

	     // Print the List
	     System.out.println("List: " + list4);
	     List list3=new LinkedList();
	     list3.add(2);
	     
	}

}
