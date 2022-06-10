package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution557_2Test {

    private Solution557_2 solution;

    @Before
    public void setUp() {
        solution = new Solution557_2();
    }

    @Test
    public void test1() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void test2() {
        assertEquals("God Ding", solution.reverseWords("doG gniD"));
    }
}
