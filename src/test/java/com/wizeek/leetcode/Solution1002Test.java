package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1002Test {

    private Solution1002 solution;

    @Before
    public void setUp() {
        solution = new Solution1002();
    }

    @Test
    public void test1() {
        List<String> result = solution.commonChars(new String[]{"bella", "label", "roller"});

        assertEquals(3, result.size());
        assertEquals("e", result.get(0));
        assertEquals("l", result.get(1));
        assertEquals("l", result.get(2));
    }

    @Test
    public void test2() {
        List<String> result = solution.commonChars(new String[]{"cool", "lock", "cook"});

        assertEquals(2, result.size());
        assertEquals("c", result.get(0));
        assertEquals("o", result.get(1));
    }
}
