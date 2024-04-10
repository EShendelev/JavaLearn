package LeetCode.maximumNumberofVowelsinaSubstringofGivenLength;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxVowels("abciiidef", 3));
        System.out.println(new Solution().maxVowels("", 1));
        System.out.println(new Solution().maxVowels("weallloveyou", 7));
    }
    public int maxVowels(String s, int k) {
        Set<Character> vovels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        if (s.length() < 2) return 0;
        int counOfVovelsInWindow = 0;
        //количество гласных в первом положении окна
        for (int i = 0; i < k; i++) {
            if (vovels.contains(s.charAt(i))) {
                counOfVovelsInWindow++;
            }
        }
        int maxCount = counOfVovelsInWindow;
        //проверяем наличие гласных на границах окна и меняем количество гласных в окне. При необходимости
        //обновляем максимум
        for (int i = k; i < s.length(); i++) {
            if (vovels.contains(s.charAt(i))) {
                counOfVovelsInWindow++;
            }
            if (vovels.contains(s.charAt(i - k))) {
                counOfVovelsInWindow--;
            }
            maxCount = Math.max(counOfVovelsInWindow, maxCount);
        }
        return maxCount;
    }
}
