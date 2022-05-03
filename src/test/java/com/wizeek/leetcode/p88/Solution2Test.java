package com.wizeek.leetcode.p88;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution2Test {

    private Solution2 solution;

    @Before
    public void setUp() {
        solution = new Solution2();
    }

    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};

        solution.merge(nums1, 3, new int[]{2, 5, 6}, 3);

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1};

        solution.merge(nums1, 1, new int[]{}, 0);

        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{0};

        solution.merge(nums1, 0, new int[]{1}, 1);

        assertArrayEquals(new int[]{1}, nums1);
    }
}
