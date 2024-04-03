package LeetCode.palindromeNumber;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(-1));
    }

    public boolean isPalindrome(int x) {
        int temp = 0;
        int pre = x;
        while (pre > 0) {
            int pop = pre % 10;
            temp = temp * 10 + pop;
            pre /= 10;
        }

        return temp == x;
    }
}
