package LeetCode.mergeStringAlternately;

public class Solution {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "d"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        String res = "";
        for (int i = 0; i < word1.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb = word1.length() < word2.length() ? sb.append(word2.substring(word1.length())) :
                sb.append(word1.substring(word2.length()));
        res = sb.toString();
        return res;

    }
}
