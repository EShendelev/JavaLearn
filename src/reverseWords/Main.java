//Complete the function that accepts a string parameter,
//and reverses each word in the string.
//All spaces in the string should be retained.
package reverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String a = "This is an example!";
        String b = "double  spaces";
        String c = "   ";
        System.out.println(reverseWords(a));
        System.out.println(reverseWords(b));
        System.out.println(reverseWords(c));
    }

    public static String reverseWords(final String original)
    {
        if (original.isBlank()) {
            return original;
        }
        String[] a = original.split(" ");
        for (int i = 0; i < a.length; i++) {
            StringBuilder sr = new StringBuilder();
            sr.append(a[i]).reverse();
            a[i] = sr.toString();
        }
        return String.join(" ", a);
    }
}
