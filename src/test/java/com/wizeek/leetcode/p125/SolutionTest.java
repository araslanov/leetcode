package com.wizeek.leetcode.p125;

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
        assertEquals(true, solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isPalindrome("race a car"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.isPalindrome(" "));
    }
}
