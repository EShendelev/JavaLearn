package findDigitsOther;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize + 1];

        System.out.println("Вводите числа по очереди от 1 до 100");
        for (int i = 0; i < array.length - 1; i++) {
            int a = scanner.nextInt();
            array[i] = a;
        }

        array[array.length - 1] = 105;

        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                System.out.println(array[i] + ": " + count);
                count = 1;
            }
        }
    }
}
