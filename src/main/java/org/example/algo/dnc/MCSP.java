package org.example.algo.dnc;

public class MCSP {

    public static int mcsp(int a[][], int l, int r){
        if(l == -1 || r == -1)
            return Integer.MAX_VALUE;
        if(l == 0 || r == 0)
            return a[l][r];
        int opt = mcsp(a,l,r-1);
        int opt1 = mcsp(a,l-1,r);
        return a[l][r] + Math.min(opt,opt1);
    }

    public static void main(String[] args) {
        int a[][] = {{4,7,8,6,4},{6,7,3,9,2},{3,8,1,2,4},{7,1,7,3,7},{2,9,8,9,3}};

        System.out.println(mcsp(a,a[0].length-1,a.length-1));
    }
}
