package com.wizeek.leetcode.p3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2019_2Test {

    private Solution2019_2 solution;

    @Before
    public void setUp() {
        solution = new Solution2019_2();
    }

    @Test
    public void test1() {
        assertEquals(7, solution.lengthOfLongestSubstring("qwerqtyu"));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.lengthOfLongestSubstring("abaabaaabbbbca"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.lengthOfLongestSubstring("aba"));
    }

    @Test
    public void test4() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test6() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }
}
