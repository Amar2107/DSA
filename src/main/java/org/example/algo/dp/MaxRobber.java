package org.example.algo.dp;

import java.util.Arrays;

public class MaxRobber {

    static int dp[];
    MaxRobber(int n){
        dp = new int[n];
        for(int i=0;i<n;i++)
            dp[i] = -1;
    }

    public static int maxvalue(int i,int[] a){
        if(i>a.length-1)
            return 0;

        if(dp[i] == -1)
            dp[i] = Math.max(maxvalue(i+1,a),a[i]+maxvalue(i+2,a));

        return dp[i];
    }



    public static int maxvalueBU(int[] a){
         dp = new int[a.length+2];
        dp[a.length] = 0;
        for(int i=a.length-1;i>=0;i--)
            dp[i] = Math.max((a[i]+dp[i+2]),dp[i+1]);
        return dp[0];
    }

    public static void main(String[] args) {
        MaxRobber mr = new MaxRobber(7);
        System.out.println(maxvalue(0,new int[]{6,7,1,30,8,2,4}));

        System.out.println(Arrays.toString(dp));

        System.out.println(maxvalueBU(new int[]{6,7,1,30,8,2,4}));

        System.out.println(Arrays.toString(dp));
    }

}
