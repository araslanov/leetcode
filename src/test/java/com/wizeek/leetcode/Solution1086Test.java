package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1086Test {

    private Solution1086 solution;

    @Before
    public void setUp() {
        solution = new Solution1086();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{1, 87}, {2, 88}}, solution.highFive(
                new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{1, 100}, {7, 100}}, solution.highFive(
                new int[][]{{1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}}));
    }
}
