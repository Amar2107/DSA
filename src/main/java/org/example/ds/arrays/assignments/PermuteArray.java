package org.example.ds.arrays.assignments;

import java.util.Set;
import java.util.TreeSet;

public class PermuteArray {

    private static boolean permutation(int[] a1, int[] a2) {
        Set<Integer> tset1 = new TreeSet<>();
        Set<Integer> tset2 = new TreeSet<>();

        for (int i = 0;i<a1.length;i++)
            tset1.add(i);

        for (int i = 0;i<a2.length;i++)
            tset2.add(i);

        return tset1.equals(tset2);
    }

    private static boolean permutation1(int[] a1, int[] a2) {

        int sum1=0,sum2=0,mul1=1,mul2=1;
        for (int i = 0;i<a1.length;i++){
            sum1 += a1[i];
            sum2 += a2[i];
            mul1 += a1[i];
            mul2 += a2[i];

        }
        return ( (sum1 == sum1) && (mul1 == mul2) );
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,2,3,4};
        System.out.println(permutation(array1, array2));
        System.out.println(permutation1(array1, array2));
    }
}
