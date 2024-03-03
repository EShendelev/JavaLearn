package sorting.mergeSort;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        int[] sortArr = mergeSort(arr);
        System.out.println("start Array: " + Arrays.toString(arr));
        System.out.println("sorted Array: " + Arrays.toString(sortArr));
    }

    static int[] mergeSort(int[] target) {
        if (target.length < 2) {
            return target;
        } else {

            int middle = (target.length) / 2;
            int[] left = mergeSort(Arrays.copyOfRange(target, 0, middle));//sort left array
            int[] right = mergeSort(Arrays.copyOfRange(target, middle, target.length));//sort right array
            return merge(left, right);  //return merge array
        }
    }

    static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int r = 0, l = 0, i = 0;
        while (l < left.length || r < right.length) {
            if (l != left.length && r != right.length) {
                if (left[l] <= right[r]) {
                    merged[i] = left[l];
                    l++;
                    i++;
                } else {
                    merged[i] = right[r];
                    r++;
                    i++;
                }
            } else if (l != left.length) {
                merged[i] = left[l];
                l++;
                i++;
            } else {
                merged[i] = right[r];
                r++;
                i++;
            }
        }

        return merged;
    }
}
