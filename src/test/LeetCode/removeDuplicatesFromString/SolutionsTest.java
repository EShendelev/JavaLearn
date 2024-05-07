package test.LeetCode.removeDuplicatesFromString;

import LeetCode.removeDuplicatesFromString.Solutions;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionsTest {
    @Test
    public void test1() {
        Solutions solutions = new Solutions();
        int a = solutions.removeDuplicates(new int[] {1, 1, 2});
        assertEquals(2, a);
    }

    @Test
    public void test2() {
        Solutions solutions = new Solutions();
        int a = solutions.removeDuplicates(new int[] {});
        assertEquals(0, a);
    }

    @Test
    public void test3() {
        Solutions solutions = new Solutions();
        int a = solutions.removeDuplicates(new int[] {1});
        assertEquals(1, a);
    }

    @Test
    public void test4() {
        Solutions solutions = new Solutions();
        int a = solutions.removeDuplicates(new int[] {1, 2});
        assertEquals(2, a);
    }

    @Test
    public void test5() {
        Solutions solutions = new Solutions();
        int a = solutions.removeDuplicates(new int[] {1, 1});
        assertEquals(1, a);
    }
}