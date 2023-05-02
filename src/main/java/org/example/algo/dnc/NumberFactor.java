package org.example.algo.dnc;

/*
* write a program to calculate no of ways a number can be represented using only 1,3,4
*
* eg: 5 = {1,1,1,1,1} , {1,4}, {4,1} , {1,1,3}, {1,3,1}, {3,1,1}
*   o/p = 6 ways
*
* Trick: f(4) = 4 ways[{4},{3+1},{1,3},{1,1,1,1}]
*         similarly f(2) = 1 way
*                   f(1) = 1 way
* f(4), f(2), f(1) because 5-1 = 4, 5-3 = 2, 5-4 = 1
*
* */


public class NumberFactor {


    private static int countNoOfWays(int i) {
        if(i ==0 || i == 1 || i == 2) // 0 = 1default, 1 ={1}, 2 = {1,1}
            return 1;
        if (i ==3 )
            return 2; //{1,1,1} {3}

        int sub1 = countNoOfWays(i-4);
        int sub2 = countNoOfWays(i-3);
        int sub3 = countNoOfWays(i-1);

        return sub1+sub2+sub3;
    }


    public static void main(String[] args) {
        System.out.println(countNoOfWays(6));
    }

}
