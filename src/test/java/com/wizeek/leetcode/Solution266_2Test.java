package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution266_2Test {

    private Solution266_2 solution;

    @Before
    public void setUp() {
        solution = new Solution266_2();
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
