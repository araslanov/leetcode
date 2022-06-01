package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution246Test {

    private Solution246 solution;

    @Before
    public void setUp() {
        solution = new Solution246();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isStrobogrammatic("69"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.isStrobogrammatic("88"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.isStrobogrammatic("1"));
    }

    @Test
    public void test4() {
        assertEquals(false, solution.isStrobogrammatic("962"));
    }
}
