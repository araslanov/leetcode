package com.wizeek.leetcode.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2019Test {

    private Solution2019 solution;

    @Before
    public void setUp() {
        solution = new Solution2019();
    }

    @Test
    public void test1() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(result, new int[]{0, 1});
    }

    @Test
    public void test2() {
        int[] result = solution.twoSum(new int[]{2, -7, -11, 20}, 9);
        assertArrayEquals(result, new int[]{2, 3});
    }

    @Test
    public void test3() {
        int[] result = solution.twoSum(new int[]{11, 0, -2, -6}, 9);
        assertArrayEquals(result, new int[]{0, 2});
    }

    @Test
    public void test4() {
        int[] result = solution.twoSum(new int[]{4, 5}, 9);
        assertArrayEquals(result, new int[]{0, 1});
    }
}
