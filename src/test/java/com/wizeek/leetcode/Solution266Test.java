package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution266Test {

    private Solution266 solution;

    @Before
    public void setUp() {
        solution = new Solution266();
    }

    @Test
    public void test1() {
        assertEquals(false, solution.canPermutePalindrome("code"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.canPermutePalindrome("aab"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.canPermutePalindrome("carerac"));
    }
}
