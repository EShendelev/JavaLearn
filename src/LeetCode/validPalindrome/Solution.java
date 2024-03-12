package LeetCode.validPalindrome;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome("`l;`` 1o1 ??;l`"));
    }


    public static boolean isPalindrome(String s) {
        String withoutSpace = s.replaceAll(" ", "").replaceAll("\\pP", "")
                .replaceAll("`", "").toLowerCase();
        String[] str = withoutSpace.split("");
        int len = str.length - 1;
        for (int i = 0; i <= len/2 ; i++) {
            if (!str[i].equals(str[len - i])) {
                return false;
            }
        }
        return true;
    }
}
