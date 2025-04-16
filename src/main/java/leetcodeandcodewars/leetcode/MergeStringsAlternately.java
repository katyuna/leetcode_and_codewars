package leetcodeandcodewars.leetcode;

/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MergeStringsAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String merged = "";
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                merged += word1.charAt(i);
            }
            if (i < word2.length()) {
                merged += word2.charAt(i);
            }
            i++;
        }

        return merged;
    }

    public static void main (String[] args){
        System.out.println(MergeStringsAlternately.mergeAlternately("qwe", "rty123"));

    }
}
