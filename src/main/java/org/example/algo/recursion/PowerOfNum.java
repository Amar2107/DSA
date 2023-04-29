package org.example.algo.recursion;

public class PowerOfNum {

    private static int powerOfNum(int i,int p) {
        if(p == 0)
            return 1;
       if(p == 1)
           return i;
        return i*powerOfNum(i,p-1);
    }

    public static void main(String[] args) {
        System.out.println((int)48%18);
        System.out.println(powerOfNum(2,6));
    }

}
