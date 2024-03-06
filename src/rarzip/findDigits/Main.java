package rarzip.findDigits;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива");
            int digit = scanner.nextInt();
            List<Integer> array = new ArrayList<>();

            System.out.println("Вводите числа по очереди");
            for (int i = 0; i < digit; i++) {
                int a = scanner.nextInt();
                array.add(a);
            }
            Map<Integer, Integer> digMap = new HashMap<>();

            System.out.println(array);

            for (int arrayElem : array) {
                int val = 0;
                if (digMap.containsKey(arrayElem)) {
                    val = digMap.get(arrayElem);
                }
                val++;
                digMap.put(arrayElem, val);
            }

            for (int key : digMap.keySet()) {
                System.out.printf("%d: %d\n", key, digMap.get(key));
            }
        }
        Example ex = new Example("rarzip.findDigits.Example");
        System.out.println(ex);
    }
}


class Example {
    String name;

    public Example(String name) {
        this.name = name;
    }
}
