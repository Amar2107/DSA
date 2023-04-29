package org.example.algo.recursion;

public class SumOfDigits {

    private static int sumOfDigits(int i) {
        if(i/10 == 0)
            return i;
        return sumOfDigits(i/10) + i%10;
    }


    public static void main(String[] args) {
        int d = 546;
        System.out.println(sumOfDigits(d));
    }

}
