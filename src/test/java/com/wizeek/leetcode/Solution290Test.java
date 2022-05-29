package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution290Test {

    private Solution290 solution;

    @Before
    public void setUp() {
        solution = new Solution290();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.wordPattern("aaaa", "dog cat cat dog"));
    }
}
