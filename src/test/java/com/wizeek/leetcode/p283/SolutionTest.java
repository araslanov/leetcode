package com.wizeek.leetcode.p283;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[] array = new int[]{0, 1, 0, 3, 12};

        solution.moveZeroes(array);

        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, array);
    }

    @Test
    public void test2() {
        int[] array = new int[]{0};

        solution.moveZeroes(array);

        assertArrayEquals(new int[]{0}, array);
    }

    @Test
    public void test3() {
        int[] array = new int[]{0, 0, 1, 0, 1};

        solution.moveZeroes(array);

        assertArrayEquals(new int[]{1, 1, 0, 0, 0}, array);
    }
}
