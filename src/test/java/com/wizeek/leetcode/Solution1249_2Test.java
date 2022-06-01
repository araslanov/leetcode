package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1249_2Test {

    private Solution1249_2 solution;

    @Before
    public void setUp() {
        solution = new Solution1249_2();
    }

    @Test
    public void test1() {
        assertEquals("lee(t(c)o)de", solution.minRemoveToMakeValid("lee(t(c)o)de)"));
    }

    @Test
    public void test2() {
        assertEquals("ab(c)d", solution.minRemoveToMakeValid("a)b(c)d"));
    }

    @Test
    public void test3() {
        assertEquals("", solution.minRemoveToMakeValid("))(("));
    }
}
