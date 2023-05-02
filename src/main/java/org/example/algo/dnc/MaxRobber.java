package org.example.algo.dnc;

/*
* there are N number of houses with some money in them
* adjacent houses cant be stolen
* Find the maximum value that can be stolen
* */


public class MaxRobber {


    private static int maxRobber(int[] a, int i) {
        if( i > a.length-1 )
            return 0;
        int opt1 = a[i] + maxRobber(a,i+2);
        int opt2 = maxRobber(a,i+1);
        return Math.max(opt1,opt2);
    }

    public static void main(String[] args) {
        int a[] = {6,7,1,30,8,2,4};
        System.out.println(maxRobber(a,0));
    }

}
