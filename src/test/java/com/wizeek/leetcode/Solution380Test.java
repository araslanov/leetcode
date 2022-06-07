package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Solution380Test {

    private Solution380 solution;

    @Before
    public void setUp() {
        solution = new Solution380();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.insert(1));
        assertEquals(false, solution.remove(2));
        assertEquals(true, solution.insert(2));
        int random = solution.getRandom();
        assertTrue(random >= 1);
        assertTrue(random <= 2);
        assertEquals(true, solution.remove(1));
        assertEquals(false, solution.insert(2));
        assertEquals(2, solution.getRandom());
    }

    @Test
    public void test2() {
        assertEquals(false, solution.remove(0));
        assertEquals(false, solution.remove(0));
        assertEquals(true, solution.insert(0));
        assertEquals(0, solution.getRandom());
        assertEquals(true, solution.remove(0));
        assertEquals(true, solution.insert(0));
    }
}
