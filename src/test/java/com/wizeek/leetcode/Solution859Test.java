package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution859Test {

    private Solution859 solution;

    @Before
    public void setUp() {
        solution = new Solution859();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.buddyStrings("ab", "ba"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.buddyStrings("ab", "ab"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.buddyStrings("aa", "aa"));
    }
}
