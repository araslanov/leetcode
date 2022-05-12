package com.wizeek.leetcode.p387;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(0, solution.firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution.firstUniqChar("aabb"));
    }
}
