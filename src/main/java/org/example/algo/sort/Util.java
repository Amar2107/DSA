package org.example.algo.sort;

import java.util.Arrays;

public class Util {

    public static int a[] = {9,5,6,1,2,3,4};

    public static int[] swap(int a[], int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
        return a;
    }

    public static void printArray(int a[]){
        System.out.println(Arrays.toString(a));
    }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
