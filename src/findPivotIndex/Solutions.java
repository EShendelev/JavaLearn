package findPivotIndex;

public class Solutions {
    public static void main(String[] args) {
        System.out.println(new Solutions().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(new Solutions().pivotIndex(new int[]{2, 1, -1}));
        System.out.println(new Solutions().pivotIndex(new int[]{1, 2, 3}));
    }

    public int pivotIndex(int[] nums) {
        int lIdx = 0;
        int rIdx = nums.length - 1;
        int leftSum = 0;
        int rightSum = nums[rIdx];
        for (int i = 0; i <= nums.length /2; i++) {
            if (leftSum > rightSum) {
                rIdx--;
                rightSum += nums[rIdx];
            } else if (rightSum > leftSum) {
                leftSum += nums[lIdx];
                lIdx++;
            }
        }
        if (leftSum == rightSum) {
            return lIdx;
        }
        return -1;
    }
}
