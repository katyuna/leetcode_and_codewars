package leetcodeandcodewars.leetcode;

/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = 0;
        for (int candie : candies) {
            maximum = Math.max(maximum, candie);
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; ++i) {
            if (candies[i] + extraCandies >= maximum){
                result.add(true);
            }else result.add(false);

        }
        return result;
    }


    public static void main (String[] args){
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.println(result);  // [true, true, true, false, true]

    }
}