package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution423Test {

    private Solution423 solution;

    @Before
    public void setUp() {
        solution = new Solution423();
    }

    @Test
    public void test1() {
        assertEquals("012", solution.originalDigits("owoztneoer"));
    }

    @Test
    public void test2() {
        assertEquals("45", solution.originalDigits("fviefuro"));
    }
}
