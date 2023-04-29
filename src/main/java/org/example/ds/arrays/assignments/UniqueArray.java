package org.example.ds.arrays.assignments;

import java.util.HashSet;
import java.util.Set;

public class UniqueArray {


    private static boolean isUnique(int[] a) {
        Set<Integer> mySet = new HashSet<>();
        for(int i=0;i<a.length;i++)
            mySet.add(a[i]);
        return mySet.size() == a.length;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        System.out.println( isUnique(a));
    }

}
