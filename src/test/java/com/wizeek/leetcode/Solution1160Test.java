package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1160Test {

    private Solution1160 solution;

    @Before
    public void setUp() {
        solution = new Solution1160();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }

    @Test
    public void test2() {
        assertEquals(10, solution.countCharacters(new String[]{"hello", "world", "leetcode"}, "welldonehoneyr"));
    }
}
