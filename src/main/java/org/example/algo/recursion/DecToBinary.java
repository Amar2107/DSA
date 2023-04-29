package org.example.algo.recursion;

public class DecToBinary {

    private static int decTOBinary(int i) {
        if(i<0)
            return -1;
        if(i == 1)
            return 1;
        return decTOBinary(i/2)*10+i%2;
    }

    public static String reverse(String str)
    {
        if(str.length() == 1)
            return str.charAt(0)+"";
        return str.charAt(str.length()-1)+""+reverse(str.substring(0,str.length()-1));
    }

    /*
    *
    * */
    static char first(String str) {
        if(Character.isUpperCase(str.charAt(str.length()-1)))
            return str.charAt(str.length()-1);

        return first(str.substring(0,str.length()-1));
    }

    public static String capitalizeWord(String str) {

        if(str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if(str.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((str.substring(str.length()-2, str.length()-1).equals(" "))) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1))+ chr;
    }

    public static boolean isPalindrome(String s){
        if(s.length() == 1 || s.length() == 0)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1));
        return false;
    }


    public static void main(String[] args) {

        //System.out.println(decTOBinary(12));
        System.out.println(reverse("Java"));
        System.out.println(first("arasThama"));
        System.out.println(capitalizeWord("i love java"));
        System.out.println(isPalindrome("Mayaya"));
    }


}
