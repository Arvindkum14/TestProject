package com;


import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Java Program to create ConcurrentHashSet from ConcurrentHashMap
 * This code requires JDK 8 because we use newKeySet() method
 * which is only available in ConcurrentHashMap class from JDK 8. 
 */
public class ConcurrentHashMapDemo {

  public static void main(String[] args) throws Exception {

    // step 1 - create a concurrent hashmap (optional)
    ConcurrentHashMap<String, Integer> wordLengh = new ConcurrentHashMap<>();

    // step 2 - create a set from map by using newKeySet() method
    // provide size to prevent resizing and better performance
    Set<String> words = ConcurrentHashMap.newKeySet(wordLengh.size());

    // step 3 - you can add elements into set
    words.add("Java");
    words.add("JavaScript");

    // step 4 - you can remove elements from set
    words.remove("JavaScript");

    // step 5 - you can also pass this set to any method expecting set
    System.out.println(words);

  }

}
