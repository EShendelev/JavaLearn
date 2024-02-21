package findDigitsOther_1;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        Integer arrSize = scanner.nextInt();
        Integer[] array = new Integer[arrSize];

        System.out.println("Вводите числа по очереди");
        for (int i = 0; i < array.length; i++) {
            int a = scanner.nextInt();
            array[i] = a;
        }

        
        System.out.println(Arrays.toString(array)); 
        System.out.println(Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }
}
