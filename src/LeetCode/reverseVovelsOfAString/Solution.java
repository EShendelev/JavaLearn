package LeetCode.reverseVovelsOfAString;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?source=submission-ac

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        String[] arrS = s.split("");
        String[] vovelsArr = new String[] {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
        Set<String> vovels = new HashSet<>(Arrays.asList(vovelsArr));
        //два указателя на начало и конец
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
        //двигаем указатели в поисках гласных
        //если оба указывают на гласные, меняем местами
            if (vovels.contains(arrS[i])) {
                if (vovels.contains(arrS[j])) {
                    String firstVovel = arrS[i];
                    String secondVovel = arrS[j];
                    arrS[i] = secondVovel;
                    arrS[j] = firstVovel;
                    i++;
                    j--;
                } else {
                    j--;
                }
            } else {
                i++;
            }
        }
        return String.join("", arrS);
     }
}
