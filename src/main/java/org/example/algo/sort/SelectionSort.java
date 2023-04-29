package org.example.algo.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;
        for(int i = 0;i<n-1;i++) {
            int min = i;
            for (int j = i+1;j<n;j++){
                if(a[min]>a[j])
                    min = j;
            }
            if(min!=i)
            {
                int temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String[] args) {
        int a[] = {9,5,6,1,2,3,4};
         selectionSort(a);
        //System.out.println(Arrays.toString(a));

        printArray(a);
    }

}
