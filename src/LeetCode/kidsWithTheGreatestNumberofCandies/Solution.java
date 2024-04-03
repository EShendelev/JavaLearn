package LeetCode.kidsWithTheGreatestNumberofCandies;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
import java.util.*;

public class Solution {
    int data = 0;




    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        Test test = new Test("test");
        Test test1 = new Test("test");

        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());

        Map<Test, String> a = new HashMap<>();
        a.put(test, "Hello");
        System.out.println(a.get(test1));


    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = maxValue(candies);
        for (int num : candies) {
            res.add((num + extraCandies) >= max);
        }
        return res;
    }

    private static int maxValue(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }



}
class Test {
    String data;

    Test(String data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        return data.equals(test.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}


