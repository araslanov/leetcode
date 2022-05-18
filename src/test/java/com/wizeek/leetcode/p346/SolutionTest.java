package com.wizeek.leetcode.p346;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        Solution solution = new Solution(3);

        assertEquals(1.0, solution.next(1), 0.0001);
        assertEquals(5.5, solution.next(10), 0.0001);
        assertEquals(4.6667, solution.next(3), 0.0001);
        assertEquals(6.0, solution.next(5), 0.0001);
    }
}
