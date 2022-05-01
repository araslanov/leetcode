package com.wizeek.leetcode.p680;

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
        assertEquals(true, solution.validPalindrome("aba"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.validPalindrome("abca"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.validPalindrome("abc"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution.validPalindrome("a"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution.validPalindrome("abccb"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution.validPalindrome("bccba"));
    }

    @Test
    public void test7() {
        assertEquals(true, solution.validPalindrome("ab"));
    }
}
