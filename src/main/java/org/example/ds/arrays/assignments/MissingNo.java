package org.example.ds.arrays.assignments;

public class MissingNo {


    private static void missingNumber(int[] a) {

        int first = a[0];
        int last = a[a.length - 1];

        double total = (last*(last+first))/2;
        double sum= 0.0;
        for(int i=0;i<a.length;i++)
            sum += a[i];

        System.out.println(sum);

        System.out.println(total-sum);

    }

    public static void main(String[] args) {
        int a[] =  {1, 2, 3, 4, 5, 6, 8, 9, 10};
        missingNumber(a);
    }
}
