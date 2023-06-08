package com.shopping.chocomart.Misc.hashmap;

public class HashCodeGoodPractisesToAvoidHashMap {
    public static void main(String args[]) {

            System.out.println("hashCollision possible in hashmap, hashtable, linkedhashmap, ConcurrentHashmap etc");
        System.out.println("hashCollision Reason:Bad implementation of hashcode()");
            /*eg: {(10,ant),(21,dollar),(44,doll),(15,apple),(20,salt),(30,pepper),(40,sugar),(13,see),(52,an)} //9elements
            Haschode(): h(x)=mod 10 ,
                    h(10)=0
                    h(21)=1
                    h(44)=4
                    h(15)=5
                    h(13)=3
                    h(52)=2
                    h(20)=h(30)=h(40)=0
              map storage
              0=>(10,ant)-> (20,salt)->(30,pepper)->(40,sugar)
              1=>(21,dollar)
              2=>(52,an)
              3=>(13,see)
              4=>(44,doll)
              5=>(15,apple)
             https://javarevisited.blogspot.com/2016/01/how-does-java-hashmap-or-linkedhahsmap-handles.html#axzz8075xpQHn

            How its Handled: separate chaining and open addressing.
          *****  separate chaining: *************
            classes in Java handle collision by chaining HashMap collisions,
             Java8 has started using a balanced tree instead of a linked list to store map entries
             which ended in the same bucket due to a collision if collided entries >8

            how to resolve: Good approach of hashcode= use good logic like PrimeNumbers included,
            for equals() implementation- for object type key, perform equals check for all beans
          Refer to Person() class for good implementation

          *****open addressing*******
          https://en.wikipedia.org/wiki/Hash_table#/media/File:Hash_table_5_0_1_1_1_1_1_SP.svg
             */

        /*If a key in a HashMap is mutable, what can go wrong with the map
        What happens when two different objects with the same hash code are added to a HashMap?
        Can a null key be added to a HashMap?
        Can a HashMap key be mutable? => MutableKeyDemo
        What is the time complexity of HashMap operations such as put, get, and remove?
                How does HashMap handle collisions? Can you explain the difference between separate chaining and open addressing?
                What happens when the load factor of a HashMap is exceeded?
        Can two threads safely modify a HashMap at the same time?
                Can a HashMap have duplicate values?
                Can a HashMap be sorted?
        How can you iterate over the keys and values of a HashMap?*/

    // ConcurrentHashMap ensures thread-safety by dividing the map into multiple segments,
        // with each segment being guarded by its own lock. It uses a technique called "lock striping" to divide the map into smaller segments, each of which is guarded by a separate lock.
        // This allows multiple threads to access different segments of the map concurrently without blocking each othe
    }
}

