package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution244Test {

    private Solution244 solution;

    @Test
    public void test1() {
        solution = new Solution244(new String[]{"practice", "makes", "perfect", "coding", "makes"});

        assertEquals(3, solution.shortest("coding", "practice"));
        assertEquals(1, solution.shortest("makes", "coding"));
    }
}
