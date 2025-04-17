package leetcodeandcodewars.leetcode;
/*
У вас есть длинная клумба, на которой некоторые участки засажены, а некоторые нет. Однако цветы нельзя сажать на соседних участках.

Дан целочисленный массив flowerbed, содержащий 0 и 1, где 0 означает пусто, а 1 означает не пусто, и целое число n, верните true, если n новых цветов можно посадить на клумбе, не нарушая правила отсутствия смежных цветов, и false в противном случае.
 */

public class Flowerbed {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        int counter = 0;
        for (int i = 0; i < flowerbed.length - 2; i++) {
            if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
                counter = counter + 1;
            }
        }
        if (n == counter) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1, 0, 0, 1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
