package org.example.algo.dnc;

/*
* given 2 strings find out no of edits required to make the two strings same
* table -> tble = insert
* tgable -> table = delete
* trble -> table = replace
* */

public class NumberOfEdits {

    public static int noOfEdits(String str1,int index1, String str2, int index2){
        if(index1 == str1.length())
            return str2.length() -index2;
        if(index2 == str2.length())
            return str1.length() -index1;
        if (str1.charAt(index1) == str2.charAt(index2))
            return noOfEdits(str1,index1+1,str2,index2+1);
        else{
            int delete = 1 + noOfEdits(str1,index1,str2,index2+1);
            int insert = 1 + noOfEdits(str1,index1+1,str2,index2);
            int replace = 1 + noOfEdits(str1,index1+1,str2,index2+1);
            return Math.min(Math.min(delete , insert) , replace);
        }
    }


    public static void main(String[] args) {
        System.out.println(noOfEdits("table",0,"tbres",0));
    }

}
