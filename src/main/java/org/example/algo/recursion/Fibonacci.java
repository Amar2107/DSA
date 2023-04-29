package org.example.algo.recursion;
/*
* a = 0
* b = 1
* c = a + b
* a = b
* b = c
* */
public class Fibonacci {


    public static int fibonacci(int n){
        if(n<0)
            return -1;
        if(n == 0 || n == 1)
            return n;
        return fibonacci(n-1)+ fibonacci(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

}
