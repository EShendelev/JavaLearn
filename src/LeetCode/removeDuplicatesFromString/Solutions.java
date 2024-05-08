package LeetCode.removeDuplicatesFromString;

public class Solutions {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        //если пустой - вернет 0, если 1 элемент - 1
        if (len  < 2) {
            return len;
        }

        int res = 1;
        for (int i = 1; i <= len - 1; i++) {
            if (nums[i-1] != nums[i]) {
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}
