package sorting.quickSort2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(qsort(new int[]{3, 2, 6, 1, 4, 5})));
        System.out.println(Arrays.toString(qsort(new int[]{-2, 0, 3, 3, 4, 5})));
        System.out.println(Arrays.toString(qsort(new int[]{9, 22, 6, 17, -87, 5})));
        System.out.println(Arrays.toString(qsort(new int[]{3})));
        System.out.println(Arrays.toString(qsort(new int[]{})));
    }

    static int[] qsort(int[] arr) {
        //Базовый случай
        if (arr.length < 2) {
            return arr;
        }

        int len = arr.length;
        int[] left = new int[0];
        int[] right = new int[0];
        int pivot = arr[(int) (Math.random() * (len - 1))]; // по хорошему нужно брать случайный
        int i = 0;

        return qsort(arr);
    }
        //соединяем левый с правым начиная с левого.
        
}

