package leetcodeandcodewars.leetcode;
/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */

import static com.google.common.math.IntMath.gcd;

public class GcdOfStrings {
    //наибольший общий делитель
    public static String gcdOfStrings(String str1, String str2) {
        //Если строки не равны при склеивании в любом порядке, значит, они не состоят из повторений одной общей подстроки.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength); //возвращаем первые gcdLength из str1
    }

    public static void main (String[] args){
System.out.println(gcdOfStrings("ABCABC", "ABC"));

    }
}


