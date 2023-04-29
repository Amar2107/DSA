package org.example.algo.sort;

import java.util.Arrays;

public class BubbleSort {


    public static int[] bubbleSort(int a[]){
        for(int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1]){
                    a =Util.swap(a,j,j+1);
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = Util.a;
        a = bubbleSort(a);
        Util.printArray(a);
    }

}
