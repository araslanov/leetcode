package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution242Test {

    private Solution242 solution;

    @Before
    public void setUp() {
        solution = new Solution242();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isAnagram("anagram", "nagaram"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isAnagram("rat", "car"));
    }
}
