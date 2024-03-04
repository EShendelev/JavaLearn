package LeetCode.mergeStringAlternately;

//https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "d"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int len = word1.length();

        if (len > word2.length()) len = word2.length();

        for (int i = 0; i < len; i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        if (word1.length() < word2.length()) {
            sb.append(word2.substring(word1.length()));
        } else {
            sb.append(word1.substring(word2.length()));
        }

        return sb.toString();

    }
}



