package org.example.algo.dnc;

public class LCP {

    public static int lcp(String str, int index, int n){

        if(index>n)
            return 0;
        if(index == n)
            return 1;
        int i = 0;
        if(str.charAt(index) == str.charAt(n))
            i = 2  + lcp(str,index+1,n-1);
        int opt = lcp(str,index+1,n);
        int opt2 = lcp(str,index,n-1);
       return Math.max(i,Math.max(opt,opt2));
    }

    public static void main(String[] args) {
        String str = "GEEKSFORGEEKS";
        System.out.println(lcp(str,0,str.length()-1));
    }

}
