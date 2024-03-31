package sorting.quickSort2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 2, 6, 1, 4, 5};
        int[] arr2 = new int[]{-2, 0, 3, 3, 4, 5};
        int[] arr3 = new int[]{-2, 0, 3, 3, 4, 5};
        int[] arr4 = new int[]{9, 22, 6, 17, -87, 5};
        int[] arr5 = new int[]{3};
        int[] arr6 = new int[]{};
        qsort(arr1, 0, arr1.length - 1);
        qsort(arr2, 0, arr2.length - 1);
        qsort(arr3, 0, arr3.length - 1);
        qsort(arr4, 0, arr4.length - 1);
        qsort(arr5, 0, arr5.length - 1);
        qsort(arr6, 0, arr6.length - 1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        System.out.println(Arrays.toString(arr6));
    }

    //"карьера программиста. с. 101"

    static void qsort(int[] arr, int startIdx, int finishIdx) {
        if (arr.length < 2) return;
        int index = partition(arr, startIdx, finishIdx);
        if (startIdx < finishIdx) {
            qsort(arr, startIdx, index - 1); //сортировка левого подмассива
            qsort(arr, index, finishIdx); //сортировка правого подмассива
        }
    }


    static int partition(int[] arr, int startIdx, int finishIdx) {
        int pivot = arr[(finishIdx + startIdx) / 2]; //выбор центрального индекса за опорный элемент
        while (startIdx <= finishIdx) {
            while (arr[startIdx] < pivot) startIdx++; //ищется слева элемент который должен остаться на месте
            while (arr[finishIdx] > pivot) finishIdx--; //ищется справа элемент который должен остаться на месте
            //оставшиейся меняются местами
            if (startIdx <= finishIdx) {
                swap(arr, startIdx, finishIdx);
                startIdx++;
                finishIdx--;
            }
        }
        //возвращается индекс опорного элемента
        return startIdx;
    }

    static void swap(int[] arr, int startIdx, int finishIdx) {
        int a = arr[startIdx];
        int b = arr[finishIdx];
        arr[startIdx] = b;
        arr[finishIdx] = a;
    }

}

