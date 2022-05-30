package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution844_2Test {

    private Solution844_2 solution;

    @Before
    public void setUp() {
        solution = new Solution844_2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.backspaceCompare("ab#c", "ad#c"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.backspaceCompare("ab##", "c#d#"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.backspaceCompare("a#c", "b"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution.backspaceCompare("bxj##tw", "bxo#j##tw"));
    }
}
