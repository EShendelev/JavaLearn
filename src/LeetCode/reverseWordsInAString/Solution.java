package LeetCode.reverseWordsInAString;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        //Получим массив строк
        String[] strings = s.split(" ");
        List<String> resList = new ArrayList<>();

        //Проходим по массиву с конца
        for (int i = strings.length - 1; i >= 0; i-- ) {
            if (!strings[i].isBlank()) {
                //у каждого слова убираем лишние пробелы с начала и конца
                resList.add(strings[i].trim());
            } else {
                continue;
            }
        }
        return String.join(" ", resList);
    }
}
