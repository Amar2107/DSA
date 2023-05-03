package org.example.algo.dnc;

public class LCS {


    public static int lcs(String str1, int index1, String str2, int index2){
        if(index1 == str1.length() || index2 == str2.length())
            return 0;
        int opt=0;
        if(str1.charAt(index1) == str2.charAt(index2))
            opt =  1+lcs(str1,index1+1,str2,index2+1);

        int opt1 = lcs(str1,index1+1,str2,index2);
        int opt2 = lcs(str1,index1,str2,index2+1);
        return Math.max(opt,Math.max(opt1,opt2));
    }


    public static void main(String[] args) {
        System.out.println(lcs("elephant",0,"erepat",0));
    }

}
