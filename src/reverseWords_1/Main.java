//Complete the function that accepts a string parameter,
//and reverses each word in the string.
//All spaces in the string should be retained.
//стащил из решений, для общего развития
package reverseWords_1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return original.isBlank() ? original : Stream.of(original.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
    }
}
