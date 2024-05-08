package LeetCode.jewelsAndStones;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test() {
        Solution solution = new Solution();
        String jewels = "aA";
        String stones = "aAAbbbb";
        int res = solution.numJewelsInStones(jewels, stones);
        assertEquals(3, res);
    }

    @Test
    public void test1() {
        Solution solution = new Solution();
        String jewels = "z";
        String stones = "ZZ";
        int res = solution.numJewelsInStones(jewels, stones);
        assertEquals(0, res);
    }
}