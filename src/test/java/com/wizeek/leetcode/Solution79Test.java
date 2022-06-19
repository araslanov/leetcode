package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution79Test {

    private Solution79 solution;

    @Before
    public void setUp() {
        solution = new Solution79();
    }

    @Test
    public void test1() {
        assertEquals(true,
                solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}},
                        "ABCCED"));
    }

    @Test
    public void test2() {
        assertEquals(true,
                solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "SEE"));
    }

    @Test
    public void test3() {
        assertEquals(false,
                solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB"));
    }
}
