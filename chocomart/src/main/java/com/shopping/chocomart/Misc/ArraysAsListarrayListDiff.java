package com.shopping.chocomart.Misc;


import java.util.*;

public class ArraysAsListarrayListDiff {
    public static void main(String args[]) {
        String[] stringArray= new String[]{"A","B","C"};
        //2ways of ArrayList creation from array
        List stringArrayList =Arrays.asList(stringArray); //impacts original object-stringArray,-only provides wrapper

        stringArrayList.set(0,"1");
        System.out.println("ArraysList is: "+ stringArrayList.toString());
        System.out.println("stringArray is: "+ stringArrayList.toString());
        //stringArrayList.add("E"); //cannot add new elements
        List stringArrayListDirect = new ArrayList<>(Arrays.asList(stringArray)); //no impact to original object-stringArray
        stringArrayListDirect.add("Hi");
        System.out.println("stringArrayListDirect is: "+ stringArrayListDirect.toString());

      /*******Synchronized ArrayList or use CopyOnWriteArrayList***************/
        List<String> sal = new ArrayList<String>();

        // Adding elements to above List

        sal.add("Geeks");
        sal.add("for");
        sal.add("Geeks");
        sal.add("Computer");
        sal.add("Science");
        sal.add("Portal");

        // Printing the above non-synchronised List
        System.out.println(sal);
        Collections.synchronizedList(sal); //becomes synchronized
        synchronized (sal){
            Iterator<String> synchronizedArrayListIterator= sal.listIterator();
            while(synchronizedArrayListIterator.hasNext()) {
                System.out.println("sal objects:"+synchronizedArrayListIterator.next());
            }
        }

        /*******Difference between Arrays.binarySearch() and Collections.binarySearch() **************
        Collections.binarySearch()=> Returns index of key in sorted list sorted in asc order,
                                  =>If key is not present, the it returns "(-(insertion point) - 1)".
         Arrays.binarySearch() is used to search for an element in an array,
         while Collections.binarySearch() is used to search for an element in a list.
         https://www.geeksforgeeks.org/arrays-binarysearch-java-examples-set-1/
         */
        List<Integer> al = new ArrayList<Integer>();
        al.add(1);al.add(2);al.add(3);al.add(10);al.add(20);

        // 10 is present at index 3.
        int index = Collections.binarySearch(al, 10);
        System.out.println("BinarySearch for COLLECTIONS of element present"+ index);

        // 13 is not present. 13 would have been inserted at position 4. So the function returns (-4-1) which is -5.
        index = Collections.binarySearch(al, 13);
        System.out.println("BinarySearch for COLLECTIONS of element NOT present"+index);

        /**Arrays.fill() and Arrays.copyOf() in Java, Arrays.fill() is used to fill an existing array with a specific value,
         *  while Arrays.copyOf() is used to create a new array that is a copy of an existing array with an optional new length.**/
        int[] arrayX = new int[5];
        Arrays.fill(arrayX, 0);

        System.out.println("arrayX:"+Arrays.toString(arrayX));
        int[] originalArray = new int[5];
        Arrays.fill(originalArray, 5);
        int[] newArray = Arrays.copyOf(originalArray, 10);
        System.out.println("newArray:"+Arrays.toString(newArray));
        System.out.println("originalArray:"+Arrays.toString(originalArray));

        /***What is the difference between Arrays.equals() and Arrays.deepEquals() in Java?***/
/*Arrays.deepEquals() is necessary when comparing arrays of arrays or
                                        arrays of objects that contain other arrays or objects,
because Arrays.equals() only compares the references of the nested arrays or objects, not their contents.*/
        System.out.println("Arrays.DeepEquals() & Arrays.ewuals");
        Integer[][] array1 = {{1, 2}, {3, 4}};
        Integer[][] array2 = {{1, 2}, {3, 4}};
        boolean isEqual = Arrays.deepEquals(array1, array2);
        System.out.println("Arrays.Equals: "+isEqual);

        Integer[][] array3 = {{1, 2}, {3, 4}};
        Integer[][] array4 = {{1, 2}, {4, 4}};
        boolean isEqual2 = Arrays.deepEquals(array3, array4);
        System.out.println("Arrays.Equals: "+isEqual2);

        Integer[][] array5 = {{1, 2}, {3, 4}};
        Integer[][] array6 = {{1, 2}, {4, 4}};
        boolean isEqual3 = Arrays.equals(array5, array6);
        System.out.println("Arrays.Equals: "+isEqual3);


    }
}
