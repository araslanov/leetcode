package com.wizeek.leetcode.p7;

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
        assertEquals(321, solution.reverse(123));
    }

    @Test
    public void test2() {
        assertEquals(-321, solution.reverse(-123));
    }

    @Test
    public void test3() {
        assertEquals(21, solution.reverse(120));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.reverse(Integer.MAX_VALUE));
    }

    @Test
    public void test5() {
        assertEquals(0, solution.reverse(Integer.MIN_VALUE));
    }

    @Test
    public void test6() {
        assertEquals(0, solution.reverse(0));
    }

    @Test
    public void test7() {
        assertEquals(-1, solution.reverse(-1000000));
    }

    @Test
    public void test8() {
        assertEquals(109, solution.reverse(901000));
    }
}
