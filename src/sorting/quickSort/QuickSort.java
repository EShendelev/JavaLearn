package sorting.quickSort;

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
        int leftIdx = 0, rightIdx = 0, i = 0;

        while (i < len) {
            if (arr[i] < pivot) {
                left = add(left, arr[i]);
                leftIdx++;
            } else if (arr[i] > pivot) {
                right = add(right, arr[i]);
                rightIdx++;
            }
            i++;
        }
        //соединяем левый с правым начиная с левого.
        return merge(qsort(left), qsort(right), pivot);
    }

    static int[] merge(int[] left, int[] right, int pivot) {
        int[] result = new int[left.length + 1 + right.length];
        int leftIdx = 0, rightIdx = 0;
        int maxLen = Math.max(left.length, right.length);
        for (int i = 0; i < maxLen; i++) {
            if (leftIdx < left.length && rightIdx < right.length) {
                result[i] = left[leftIdx];
                //при вставке правого массива остаавляем место под опорный элемент
                result[1 + i + left.length] = right[rightIdx];
                leftIdx++;
                rightIdx++;
            } else if (leftIdx < left.length && rightIdx >= leftIdx) {
                result[i] = left[leftIdx];
                leftIdx++;
            } else if (rightIdx < right.length) {
                result[1 + i + left.length] = right[rightIdx];
                rightIdx++;
            }
        }
        result[left.length] = pivot;
        return result;
    }

    static int[] add(int[] arr, int element) {
        int[] res = new int[arr.length + 1];
        if (arr.length < 1) {
            res[arr.length] = element;
            return res;
        }
        int i = 0;
        for (int item : arr) {
            res[i] = item;
            i++;
        }
        res[arr.length] = element;
        return res;
    }
}
