package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution227_3Test {

    private Solution227_3 solution;

    @Before
    public void setUp() {
        solution = new Solution227_3();
    }

    @Test
    public void test1() {
        assertEquals(7, solution.calculate("3+2*2"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.calculate(" 3/2 "));
    }

    @Test
    public void test3() {
        assertEquals(5, solution.calculate(" 3+5 / 2 "));
    }

    @Test
    public void test4() {
        assertEquals(-2, solution.calculate("0-2"));
    }

    @Test
    public void test5() {
        assertEquals(8, solution.calculate("2*2*2"));
    }

    @Test
    public void test6() {
        assertEquals(3, solution.calculate("3/2*3"));
    }
}
