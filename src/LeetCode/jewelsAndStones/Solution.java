package LeetCode.jewelsAndStones;



public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for (String s : stones.split("")) {
            if (jewels.contains(s)) {
                res++;
            }
        }
        return res;
    }
}
