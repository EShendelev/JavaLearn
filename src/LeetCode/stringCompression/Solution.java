package LeetCode.stringCompression;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        char[] c1 = new char[] {'a','a','b','b','c','c','c'};
        char[] c2 = new char[] {'a','a','a','b','b','a','a'};

        System.out.println(new Solution().compress(c1));
        System.out.println(new Solution().compress(c2));
        System.out.println(c1);
        System.out.println(new Solution().compress(new char[] {'a'}));
    }

    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            count++;
            if (i + 1 >= chars.length || chars[i] != chars[i+1]){
                sb.append(chars[i]);
                if (count > 1) {
                    sb.append(count);
                }
                count = 0;
            }
        }
        for (int i = 0; i < sb.length(); i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}
