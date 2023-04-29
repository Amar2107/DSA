package org.example.algo.sort;

public class InsertionSort {

    static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int temp = a[i], j=i;
            while(j>0 && a[j-1]>temp){
                a[j] = a[j-1];
                j--;
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        int a[] = Util.a;
        insertionSort(a);
        Util.printArray(a);
    }

}
