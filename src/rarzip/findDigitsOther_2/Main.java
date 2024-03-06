package rarzip.findDigitsOther_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите размер массива");
            int arrSize = scanner.nextInt();
            int[] array = new int[arrSize];
            int[] result = new int[101];

            System.out.println("Вводите числа по очереди от 1 до 100");
            for (int i = 0; i < array.length; i++) {
                int a = scanner.nextInt();
                array[i] = a;
            }

            for (int j : array) {
                result[j]++;
            }

            for (int i = 0; i < result.length; i++) {
                if (result[i] != 0) {
                    System.out.println("Кол-во " + i + " : " + result[i]);
                }
            }
        }

    }
}
