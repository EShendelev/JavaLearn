package LeetCode.removeDuplicatesFromString;

public class Solutions {
    public int removeDuplicates(int[] nums) {
        if (nums.length  < 2) {
            return nums.length;
        }
        int idx = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] != nums[i + 1]) {
                idx++;
                nums[idx] = nums[i + 1];
            }
        }
        return nums.length - idx;
    }
}
