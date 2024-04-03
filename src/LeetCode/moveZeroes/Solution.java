package LeetCode.moveZeroes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[] {0,1,0,3,12};
        new Solution().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int lastNotZeroIdx = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[lastNotZeroIdx];
                nums[lastNotZeroIdx] = temp;

                lastNotZeroIdx++;
            }
        }
    }
}
