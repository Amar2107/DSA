package org.example.algo.recursion;

public class Palindrome {

    private static int isPalindrome(int i) {
        if( i/10 == 0)
            return i;
        else
            return isPalindrome(i/10)*10 + i%10;
    }

    public static void main(String[] args) {
        int d = 435;
        System.out.println(isPalindrome(d));
    }



}
