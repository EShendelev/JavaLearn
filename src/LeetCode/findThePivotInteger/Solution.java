
package LeetCode.findThePivotInteger;
//https://leetcode.com/problems/find-the-pivot-integer/description/?envType=daily-question&envId=2024-03-13

//не понял условие, не догнал чисто математически. Подсмотрел
public class Solution {
    public static void main(String[] args) {

    }

    public static int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        int sqrtOfSum = (int) Math.sqrt(sum);

        if (sqrtOfSum * sqrtOfSum == sum) {
            return sqrtOfSum;
        }
        
        return -1;
    }
}
