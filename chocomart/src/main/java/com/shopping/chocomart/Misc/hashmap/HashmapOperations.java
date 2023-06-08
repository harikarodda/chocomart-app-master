package com.shopping.chocomart.Misc.hashmap;

import javafx.collections.transformation.SortedList;

import java.util.*;


public class HashmapOperations {
public static void main(String[] args){
    HashMap<String, Integer> hmap = new HashMap<>();
    hmap.put("vishal", 10);
    hmap.put("sachin", 30);
    hmap.put("vaibhav", 20);
    hmap.put("abc", 10);
    hmap.put("abb", 30);
    hmap.put("aab", 20);
    hmap.put(null,12);
    hmap.put("xx",null);


    System.out.println("basic test:" +hmap.get(null)+" test2:"+hmap.get("xx"));

    System.out.println("basic test3:"+hmap.get("fff")); //throws exception
    //Test2 and test3 both returned null==>AMBIGUITY if actually key existed with value paired as null OR if the key doesnt Exist
    //Print Map
    for(String key: hmap.keySet()){
        System.out.println(key+":"+hmap.get(key));
    }
    hmap.remove("vaibhav");
    for(Map.Entry<String, Integer> keyPair: hmap.entrySet()){
        System.out.println(keyPair);
    }
    hmap.put("xxxx", 00);
    // QUESTION: sort a HashMap by its keys or values in Java?
    // my try 1: get keys- sort keys List -> ->iterate over this list to add values from original map==WONT WORK*****
    List<String> keylist=new ArrayList<String>();
    for(String key: hmap.keySet()){
        keylist.add(key);
    }
    //Collections.sort(keylist);
    HashMap<String, Integer> hmapSortedwithKeys = new HashMap<>();
     for(String sortedkey: keylist){
         System.out.println("sortedkey:"+sortedkey);
         hmapSortedwithKeys.put(sortedkey, hmap.get(sortedkey));
     }
    System.out.println("******sortedMapwithKeys printway1******");
     for(Map.Entry<String,Integer> keyPair2:hmapSortedwithKeys.entrySet()){
         System.out.println("sortedMapwithKeys:"+keyPair2);
     }

    /*System.out.println("******sortedMapwithKeys printway1******");
    for(Map.Entry<String,Integer> keyPair2:hmapSortedwithKeys.entrySet()){
        System.out.println("sortedMapwithKeys:"+keyPair2);
    }*/
    System.out.println("******sortedMapwithKeys printway 2******");
    for(String keyElement: hmapSortedwithKeys.keySet()){
        System.out.println(keyElement+hmapSortedwithKeys.get(keyElement));
    } //hehe again when we insert to hashmap-we again loose the order of insertion :D

    //WAY 1 use Linked HASHMAP
    LinkedHashMap<String, Integer> sortedHmap = new LinkedHashMap<>(); // Create a new LinkedHashMap to store the sorted entries
    for (String key : keylist) {
        sortedHmap.put(key, hmap.get(key)); // Copy the entries from the original LinkedHashMap to the sorted LinkedHashMap in the sorted order of keys
    }
    System.out.println("sortedHmap usingLinkedHashMap"+sortedHmap); // Print the sorted LinkedHashMap

    //WAY2: Using a custom Comparator:
    List<String> keys = new ArrayList<>(hmap.keySet());
     Comparator<String> keyComparator= new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return  Integer.compare(o1.length(),o2.length());
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    };
    Collections.sort(keys, keyComparator); //we are doing custom comparision of the keys using comparator
    LinkedHashMap<String, Integer> sortedHashmap2 = new LinkedHashMap<>(); // Create a new LinkedHashMap to store the sorted entries
    for (String key : keys) {
        sortedHashmap2.put(key, hmap.get(key)); // Copy the entries from the original HashMap to the sorted LinkedHashMap in the sorted order of keys
    }

    System.out.println(sortedHmap); // Print the sorted LinkedHashMap


    }
}









