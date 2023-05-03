package org.example.algo.dnc;

import java.util.Arrays;

public class RotatedArr {

    public static int binary(int a[], int k){
        int l=0,h=a.length-1;
        while (l<h){
            int mid = l + (h-l)/2;
            if(a[mid] == k)
                return mid;
            else if (k>a[mid])
                l = mid + 1;
            else
                h = mid -1;
        }
        return -1;
    }


    public static int findRotatedIndex(int[] arr, int num) {
        int mid=0;
        if(arr.length%2!=0)
             mid =(arr.length/2)+1;
         else
             mid = arr.length/2;

        int res = binary(Arrays.copyOfRange(arr,0,mid),num);
        int res2 = 0;
        if (res == -1) {
            res2 = binary(Arrays.copyOfRange(arr, mid, arr.length), num);
            if(res2 == -1)
                return -1;
            else
                return mid + res2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findRotatedIndex(new int[]{6, 7, 8, 9, 1, 2, 3, 4},3));

        System.out.println(findRotatedIndex(new int[]{37, 44, 66, 102, 10, 22},14));
    }
}
