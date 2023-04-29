package org.example.algo.recursion;

public class Factorial {

    private static int factorial(int i) {
        if(i < 0)
            return -1;
        if(i == 0)
            return 1;
        return i*factorial(i-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


}
