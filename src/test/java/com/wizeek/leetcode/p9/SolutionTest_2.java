package com.wizeek.leetcode.p9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest_2 {

    private Solution_2 solution;

    @Before
    public void setUp() {
        solution = new Solution_2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isPalindrome(121));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isPalindrome(-121));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isPalindrome(10));
    }

    @Test
    public void test4() {
        assertEquals(false, solution.isPalindrome(1_234_421));
    }

    @Test
    public void test5() {
        assertEquals(false, solution.isPalindrome(2_000_000_009));
    }
}
