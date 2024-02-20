package findDigitsOther;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = scanner.nextInt();
        int[] array = new int[arrSize];

        System.out.println("Вводите числа по очереди");
        for (int i = 0; i < array.length; i++) {
            int a = scanner.nextInt();
            array[i] = a;
        }

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

        if (array[array.length - 1] != array[array.length - 2]) {
            System.out.println(array[array.length - 1] + ": " + 1);
        } else {
            System.out.println(array[array.length - 1] + ": " + count);
        }
    }
}
