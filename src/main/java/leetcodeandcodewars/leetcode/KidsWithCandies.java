package leetcodeandcodewars.leetcode;

/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */

import java.util.List;

public class KidsWithCandies {

    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] result = new boolean[candies.length];
        int max = 0;
        for (int i=0; i<candies.length; i++){
            if (candies[i]+extraCandies>candies[i+1]){

            }

        }


        return result;
    }

    public static void main (String[] args){
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        boolean[] result = kidsWithCandies(candies, extraCandies);
        System.out.println(result);  // [true, true, true, false, true]

    }
}