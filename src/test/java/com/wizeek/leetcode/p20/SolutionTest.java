package com.wizeek.leetcode.p20;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isValid("()"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isValid("(]"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution.isValid("([)]"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution.isValid("{[]}"));
    }

    @Test
    public void test6() {
        assertEquals(false, solution.isValid(")"));
    }
}
