package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution22Test {

    private Solution22 solution;

    @Before
    public void setUp() {
        solution = new Solution22();
    }

    @Test
    public void test1() {
        List<String> result = solution.generateParenthesis(1);

        assertEquals(1, result.size());
        assertEquals("()", result.get(0));
    }

    @Test
    public void test2() {
        List<String> result = solution.generateParenthesis(2);

        assertEquals(2, result.size());
        assertEquals("(())", result.get(0));
        assertEquals("()()", result.get(1));
    }

    @Test
    public void test3() {
        List<String> result = solution.generateParenthesis(3);

        assertEquals(5, result.size());
        assertEquals("((()))", result.get(0));
        assertEquals("(()())", result.get(1));
        assertEquals("(())()", result.get(2));
        assertEquals("()(())", result.get(3));
        assertEquals("()()()", result.get(4));
    }

    @Test
    public void test4() {
        List<String> result = solution.generateParenthesis(4);

        assertEquals(14, result.size());
        assertEquals(true, result.contains("(())(())"));
    }
}
