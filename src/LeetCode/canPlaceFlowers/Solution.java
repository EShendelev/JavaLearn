package LeetCode.canPlaceFlowers;

//решение из solutions
//https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
public class Solution {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 1, 0, 0}, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int totalUsablePlot = (int) Math.ceil(len / 2.0);
        if (totalUsablePlot < n) {
            return false;
        }

        int usedPlot = 0;
        int availablePlot = 0;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 1) {
                usedPlot++;
                i++;
            } else {
                boolean prevOccupied = i == 0 || flowerbed[i - 1] == 0;
                boolean nextOccupied = i == len - 1 || flowerbed[i + 1] == 0;

                if (prevOccupied && nextOccupied) {
                    flowerbed[i] = 1;
                    availablePlot++;
                    i++;
                }
            }
        }
        return availablePlot >= n;
    }
}
