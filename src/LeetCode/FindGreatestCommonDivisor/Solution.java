package LeetCode.FindGreatestCommonDivisor;

public class Solution {
    public static void main(String[] args) {
        System.out.println(gcd(1071, 462));
    }

    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= min) {
                min = nums[i];
            } else if(nums[i] >= max) {
                max = nums[i];
            }
        }

        return gcd(min, max);
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 1) {
            return b;
        } else if (b == 0 || a == 1) {
            return a;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int remain = max%min;
        if (remain == 0) {
            return min;
        }
        
        return gcd(min, remain);
    }

}
