package org.example.algo.dp;

public class NumberFactor {


    static int[] dp;

    NumberFactor(int n){
        dp = new int[n];
        for (int i = 0;i<n;i++)
            dp[i] = -1;
    }

    private static int numberFactor(int n) {
        if(n == 0 || n == 1 || n == 2)
            return 1;
        if(n == 3)
            return 2;
        else if (dp[n-1]!=-1)
            return dp[n-1];
        else {
            int rec1 = numberFactor(n-4);
            int rec2 = numberFactor(n-3);
            int rec3 = numberFactor(n-1);
            dp[n-1] = rec1+ rec2 + rec3;
        }
        return dp[n-1];
    }

    public static int numberFactorBU(int n){
        int a[] = new int[n+1];
        a[0] = a[1] = a[2] =  1;
        a[3] = 2;
        for(int i=4;i<=n;i++){
            a[i] = a[i-4] + a[i-3] + a[i-1];
        }
        return a[n];
    }


    public static void main(String[] args) {
        int n= 6;
        NumberFactor nf = new NumberFactor(n);
        System.out.println(numberFactor(n));
        System.out.println("Bottom UP "+numberFactorBU(n));
    }

}
