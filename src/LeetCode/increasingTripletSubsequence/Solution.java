package LeetCode.increasingTripletSubsequence;
//https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
public class Solution {
    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,1,-2,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int middle = Integer.MAX_VALUE;
        for (int num : nums) {
            if (smallest < middle && middle < num) {
                return true;
            }

            if (smallest >= num) {
                smallest = num;
            } else {
                middle = num;
            }
        }
        return false;
    }
}
