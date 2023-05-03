package org.example.algo.dnc;

import java.util.Arrays;

public class countZeroes {


    public static int countZeroes(int[] a) {
        int i=0;
        if(a.length == 0)
            return 0;
        if(a[a.length-1] == 0)
            i = 1+countZeroes(Arrays.copyOfRange(a, 0, a.length-1));
        else
            countZeroes(Arrays.copyOfRange(a, 0, a.length-1));
        return i;
    }



    public static void main(String[] args) {
        System.out.println(countZeroes(new int[]{1,1,1,1,0,0}));
        System.out.println(countZeroes(new int[]{1,0,0,0,0}));
        System.out.println(countZeroes(new int[]{0,0,0}));
        System.out.println(countZeroes(new int[]{1,1,1,1,1,1}));



//        int a[] = {1,1,1,1,0,0};
//        int b[] = Arrays.copyOfRange(a,0,a.length-2);
//        System.out.println(Arrays.toString(b));
    }

}
