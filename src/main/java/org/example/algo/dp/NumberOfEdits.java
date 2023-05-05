package org.example.algo.dp;

public class NumberOfEdits {

    static Integer dp[][];
    NumberOfEdits(int i1,int i2){
        dp = new Integer[i1+1][i2+1];

    }

    public static int numberOfEditsTD(String s1, String s2, int index1, int index2){
        if(dp[index1][index2] == null) {
            if (index1 == s1.length())
                dp[index1][index2] =  s2.length() - index2;
            else if (index2 == s2.length())
                dp[index1][index2] = s1.length() - index1;

            else if (s1.charAt(index1) == s2.charAt(index2))
                dp[index1][index2] = numberOfEditsTD(s1, s2, index1 + 1, index2 + 1);

            else {
                int insert = numberOfEditsTD(s1, s2, index1 + 1, index2);
                int delete = numberOfEditsTD(s1, s2, index1, index2 + 1);
                int replace = numberOfEditsTD(s1, s2, index1 + 1, index2 + 1);
                dp[index1][index2] = 1+Math.min(insert, Math.min(delete, replace));
            }
        }
        return dp[index1][index2];
    }



    public static int numberOfEditsBU(String s1,String s2, int i1,int i2){
        int dp[][]  = new int[s1.length()][s2.length()];
        for(i1=0;i1<s1.length();i1++)
            dp[i1][0] = i1;
        for(i2=0;i2<s2.length();i2++)
            dp[0][i2] = i2;

        for(i1 = 1;i1<s1.length();i1++){
            for (i2 = 1;i2<s2.length();i2++)
            {
                if(s1.charAt(i1 - 1) == s2.charAt(i2 - 1))
                    dp[i1][i2] = dp[i1 - 1 ][i2 - 1];
                else{
                    dp[i1][i2] = 1 + Math.min(dp[i1-1][i2],
                            Math.min(dp[i1][i2-1],dp[i1-1][i2-1]));
                }
            }
        }
        return dp[s1.length()-1][s2.length()-1];
    }


    public static void main(String[] args) {
        String s1 = "table";
        String s2 = "tbres";
        NumberOfEdits nf = new NumberOfEdits(s1.length(),s2.length());
        System.out.println(numberOfEditsTD(s1,s2,0,0));
        System.out.println("Bottom UP");
        System.out.println(numberOfEditsBU(s1,s2,0,0));
    }
}
