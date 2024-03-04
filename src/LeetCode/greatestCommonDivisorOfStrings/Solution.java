package LeetCode.greatestCommonDivisorOfStrings;

public class Solution {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));

    }
    public static String gcdOfStrings(String str1, String str2) {
        if ((str1 + str2).equals(str2 + str1)) {
            int gcd = gcd(str1.length(), str2.length());
            return str1.substring(0, gcd);
        }
        return "";
    }

    private static int gcd(int a, int b) {
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
