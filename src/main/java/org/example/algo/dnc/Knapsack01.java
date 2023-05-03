package org.example.algo.dnc;

public class Knapsack01 {


    private static int knapSack(int w, int[] weight, int[] profit, int n) {
        if(n == 0 || w == 0)
            return 0;

        if(weight[n] > w)
            return knapSack(w,weight,profit,n-1);

        int opt1 = profit[n]+ knapSack(w-weight[n],weight,profit,n-1); // taking the current element and adjusting params accordingly
        int opt2 = knapSack(w,weight,profit,n-1); // not taking params and just incrementing the counter
        return Math.max(opt1,opt2);
    }

    public static void main(String[] args) {
        int profit[] = new int[] { 31, 26, 17, 72 };
        int weight[] = new int[] { 3, 1, 2, 5 };
        int W = 7;
        int n = profit.length-1;
        System.out.println(knapSack(W, weight, profit, n));
    }


}
