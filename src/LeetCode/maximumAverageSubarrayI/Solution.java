package LeetCode.maximumAverageSubarrayI;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4));
        System.out.println(new Solution().findMaxAverage(new int[] {5}, 1));
    }
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i + k <= nums.length; i++) {
            sum = sumForSubarray(nums, i, k+i);
            double currentAvg = (double) sum / k;
            if (maxAvg < currentAvg) {
                maxAvg = currentAvg;
            }
        }
        return maxAvg;
    }

    /**
     *  вычисляет сумму элементов подмассива включая start, но не включая finish
     * @param arr
     * @param start
     * @param finish
     * @return
     */
    public int sumForSubarray(int[] arr, int start, int finish) {
        int res = 0;
        while (start != finish) {
            res += arr[start++];
        }
        return res;
    }



}
