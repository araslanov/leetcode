package com.wizeek.leetcode.p5;

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
        assertEquals("bab", solution.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        assertEquals("bb", solution.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        assertEquals("a", solution.longestPalindrome("abc"));
    }

    @Test
    public void test4() {
        assertEquals("bassab", solution.longestPalindrome("baabassabed"));
    }

    @Test
    public void test5() {
        assertEquals("cbc", solution.longestPalindrome("cbcb"));
    }

    @Test
    public void test6() {
        assertEquals("bab", solution.longestPalindrome("cbab"));
    }
}
