package org.example.algo.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BucketSort {

    private static double jGetBuckets(int l){
        return Math.ceil(Math.sqrt(l));
    }

    private static int getMax(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void bucketSort(int[] a) {
        int numberOfBuckets = (int) jGetBuckets(a.length);
        int maxElem = getMax(a);

        ArrayList<Integer>[] buckets= new ArrayList[numberOfBuckets];
        for (int i=0;i<buckets.length;i++)
            buckets[i] = new ArrayList<>();

        for(int i : a){
            int index =(int) Math.ceil((float)i*numberOfBuckets/(float) maxElem);
            buckets[index-1].add(i);
        }

        for (int i=0;i<buckets.length;i++)
            Collections.sort(buckets[i]);

        int v=0;
        for (ArrayList<Integer> bucket : buckets){
            for (int value: bucket)
                a[v++] = value;
        }
    }


    public static void main(String[] args) {
        int a[] = Util.a;
        bucketSort(a);
        Util.printArray(a);
    }


}
