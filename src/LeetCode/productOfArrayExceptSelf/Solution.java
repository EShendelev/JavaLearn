package LeetCode.productOfArrayExceptSelf;

//https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
    }

    public static int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length - 1; i > -1; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
