package org.example.algo.greedy;

import java.util.Arrays;

public class CoinChange {



    static void coinChangeProblem(int[] coins, int N) {
        Arrays.sort(coins);
        int index = coins.length-1;
        while(true) {
            int coinValue = coins[index];
            index--;
            int maxAmount = (N/coinValue)*coinValue;
            if (maxAmount>0) {
                System.out.println("Coin value: "+coinValue+" taken count: "+(N/coinValue));
                N = N - maxAmount;
            }
            if (N == 0) break;
        }
    }



    public void coinChange1(int[] coins, int amt){
        Arrays.sort(coins);
        int index = coins.length-1;
        while (true){
            int coinVal = coins[index];
            index --;
            int max = (amt/coinVal)*coinVal;
            if(max>0){
                System.out.println("Coin value "+coinVal+" taken count  "+(amt/coinVal));
                amt = amt - max;
            }
            if(amt == 0) break;
        }
    }


    public int coinChange(int[] coins, int amount){
        if (amount ==0)
            return 0;
        Arrays.sort(coins);
        int v=0, n = coins.length-1;
        int coinToUse = coins[n];
        while(amount!=0){
            if(coinToUse<= amount) {
                System.out.println("coin being used "+coinToUse+" amount "+amount);
                amount = amount - coinToUse;
                v++;
            }
            else {
                System.out.println(" amount "+amount+" greater than the coin "+coinToUse );
                if(n-1 >=0) {
                    n = n-1;
                    coinToUse = coins[n];
                    System.out.println("Coin changed to "+coinToUse);
                }
                else {
                    v = -1;
                    break;
                }
            }
        }
        return v;
    }

    public static void main(String[] args) {
        CoinChange cc = new CoinChange();
//        int n = cc.coinChange(new int[]{186,419,83,408},6249);
//        System.out.println("No of iterations "+n);
        coinChangeProblem(new int[]{186,419,83,408},6249);

    }
}
