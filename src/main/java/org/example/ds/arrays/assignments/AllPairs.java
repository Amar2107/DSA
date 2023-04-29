package org.example.ds.arrays.assignments;

import java.util.HashMap;
import java.util.Map;

public class AllPairs {

    public static String pairSum(int[] a, int sum) {
        // TODO

        Map<Integer,Integer> hmap = new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            int diff = sum - a[i];
            if(hmap.get(a[i]) == null) {
                hmap.put(diff, a[i]);
                System.out.println("Diff "+diff+" a[i] "+a[i]);
            }
            else
                System.out.println(" key "+a[i]+" value "+hmap.get(a[i]));
        }
        System.out.println(hmap);
        return "";
    }
    public static void main(String[] args) {
        pairSum(new int[]{2, 4, 3, 5, 6, -2, 4, 7, 8, 9},7);
    }
}
