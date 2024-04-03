package LeetCode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().twoSum(new int[] {2,7, 11, 15}, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int comp = target - current;

            if (m.containsKey(comp)) {
                return new int[] {m.get(comp), i};
            }

            m.put(current, i);
        }
        return null;
    }
}
