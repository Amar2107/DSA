package org.example.ds.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class LecArrayList {

    /*
    * Arrays size is fixed at the time of declaration ArrayList can increase its size dynamically
    * Arrays are always type safe, but we can use generics to accept any type of data in ArrayList
    * Performance wise Arrays are faster as there is overhead of resizing while inserting elements
    * into ArrayLists
    *
    * Memory:
    * ArrayList has a size of 10 by default after initiation
    * (1 for java8 but when insertion is performed it resizes to 10)
    * capacity increases by a factor of 1.5 or 2(depending on the version of jdk)
    * after deleting any elements the capacity remains same
    *
    * */


    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(10); // ------> O(1)
        al.add(1,20); //------> O(N) space: O(1)
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.get(0)); //--------> O(1)

        for(Integer i : al)
            System.out.print(i+" "); // -------> O(N)
    }

}
