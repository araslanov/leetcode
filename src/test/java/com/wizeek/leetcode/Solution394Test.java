package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution394Test {

    private Solution394 solution;

    @Before
    public void setUp() {
        solution = new Solution394();
    }

    @Test
    public void test1() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    public void test2() {
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }
}
