package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution17Test {

    private Solution17 solution;

    @Before
    public void setUp() {
        solution = new Solution17();
    }

    @Test
    public void test1() {
        List<String> result = solution.letterCombinations("23");

        assertEquals(9, result.size());
        assertEquals("ad", result.get(0));
        assertEquals("cf", result.get(8));
    }

    @Test
    public void test2() {
        List<String> result = solution.letterCombinations("");

        assertEquals(0, result.size());
    }

    @Test
    public void test3() {
        List<String> result = solution.letterCombinations("2");

        assertEquals(3, result.size());
        assertEquals("a", result.get(0));
        assertEquals("b", result.get(1));
        assertEquals("c", result.get(2));
    }
}
