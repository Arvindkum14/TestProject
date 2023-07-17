package com;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/*
 * Java Program to create ConcurrentHashSet from ConcurrentHashMap
 * This code requires JDK 8 because we use newKeySet() method
 * which is only available in ConcurrentHashMap class from JDK 8. 
 */
public class HashMapDemo {

  public static void main(String[] args) throws Exception {

	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "One");
	        map.put(2, "Two");
	 
	        // 1. Using an iterator
	        Iterator<Integer> itr = map.keySet().iterator();
	        while (itr.hasNext())
	        {
	            Integer key = itr.next();
	            String value = map.get(key);
	            System.out.println(key + "=" + value);
	        }
	 
	        // 2. For-each loop
	        for (Integer key: map.keySet()) {
	            System.out.println(key + "=" + map.get(key));
	        }
	 
	        // 3. Java 8 - Iterator.forEachRemaining()
	        map.keySet()
	            .iterator()
	            .forEachRemaining(key -> System.out.println(key + "=" + map.get(key)));
	 
	        // 4. Java 8 - Stream.forEach()
	        map.keySet().stream()
	            .forEach(key -> System.out.println(key + "=" + map.get(key)));
	 
	        // 5. Java 8 - Stream.of() + toArray() + forEach()
	        Stream.of(map.keySet().toArray())
	            .forEach(key -> System.out.println(key + "=" + map.get(key)));
	    }

}
