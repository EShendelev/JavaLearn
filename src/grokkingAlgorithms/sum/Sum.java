package grokkingAlgorithms.sum;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(new int[] {2, 4, 6}));
    }

    static int sum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
