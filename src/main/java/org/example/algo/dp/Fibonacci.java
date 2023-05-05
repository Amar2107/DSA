package org.example.algo.dp;

import java.util.ArrayList;

public class Fibonacci {

    static int memo[];

    Fibonacci(){}
    Fibonacci(int n){
        memo = new int[n];
        for (int i=0;i<n;i++)
            memo[i] = -1;
    }


    public static int fibonacci(int n){
        if(n == 1)
            return 0;
        if(n==2)
            return 1;
        if(memo[n-1] == -1) {
            //System.out.println(n+" Result not present in memo ");
            memo[n-1] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        //System.out.println(n+" Result present in memo "+memo[n-1]);
        return memo[n-1];
    }


    public static int fibonacciTab(int n){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);
        for(int i=2;i<n;i++){
            int a  = al.get(i-2);
            int b = al.get(i-1);
            al.add(a+b);
        }
        return al.get(n-1);
    }


    public static void main(String[] args) {
        int n=11;
        Fibonacci fibonacci = new Fibonacci(n);
        System.out.println(fibonacci(n));
        System.out.println(fibonacciTab(n));
    }

}
