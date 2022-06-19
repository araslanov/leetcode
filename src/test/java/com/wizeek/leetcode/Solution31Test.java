package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution31Test {

    private Solution31 solution;

    @Before
    public void setUp() {
        solution = new Solution31();
    }

    @Test
    public void test1() {
        int[] array = new int[]{1, 2, 3};
        solution.nextPermutation(array);
        assertArrayEquals(new int[]{1, 3, 2}, array);
    }

    @Test
    public void test2() {
        int[] array = new int[]{3, 2, 1};
        solution.nextPermutation(array);
        assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void test3() {
        int[] array = new int[]{1, 1, 5};
        solution.nextPermutation(array);
        assertArrayEquals(new int[]{1, 5, 1}, array);
    }

    @Test
    public void test4() {
        int[] array = new int[]{1, 2, 0, 3, 2, 0};
        solution.nextPermutation(array);
        assertArrayEquals(new int[]{1, 2, 2, 0, 0, 3}, array);
    }

    @Test
    public void test5() {
        int[] array = new int[]{2, 3, 1, 3, 3};
        solution.nextPermutation(array);
        assertArrayEquals(new int[]{2, 3, 3, 1, 3}, array);
    }
}
