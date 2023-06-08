package com.shopping.chocomart.Misc.hashmap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();
        hmap.put("aaz", 0);
        hmap.put("vishal", 10);
        hmap.put("sachin", 30);
        hmap.put("vaibhav", 20);
        hmap.put("abc", 10);
        hmap.put("abb", 30);
        hmap.put("aab", 20);
        hmap.put("zza", 0);
        //1.  sort the values by creating a list- it will only help to print the values in sorted order
        List<Integer> valueList= new ArrayList<>(hmap.values());
        Collections.sort(valueList); // Sort the List of values

        System.out.println(valueList);

        //2.sort the values of hashmap custom in desc order - use COMPARATOR
        List<String> entryKeysList= new ArrayList<>(hmap.keySet()); //have keysList created
        Comparator<String> customComparatoronValues = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                return Integer.compare(hmap.get(o1),hmap.get(o2));
            }
            // customComparatoronValues c1= (o1,o2)->   Integer.compare(hmap.get(o1),hmap.get(o2));

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        Collections.sort(entryKeysList,customComparatoronValues);
        Map<String,Integer> sortedValueMap= new LinkedHashMap<>(); //keys are sorted based on values
        for(String entryKey: entryKeysList ){
            sortedValueMap.put(entryKey, hmap.get(entryKey));
        }
        System.out.println("1  PRINTING LINKED HASHMAP based on sorted hash map");
        for(Map.Entry<String,Integer> entrySetofSortedMap:sortedValueMap.entrySet()){
            System.out.println(entrySetofSortedMap);
        }

        System.out.println(" 2   PRINTING LINKED HASHMAP based on sorted hash map");
        System.out.println("Printing entrySetofSortedMap in key-value line by line");
         for(String key:sortedValueMap.keySet()){
             System.out.println(key+":"+ sortedValueMap.get(key));
        }
    }
}
