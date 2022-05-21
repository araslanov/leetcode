package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution278Test {

    @Test
    public void test1() {
        assertEquals(4, new Solution278(4).firstBadVersion(5));
    }

    @Test
    public void test2() {
        assertEquals(1, new Solution278(1).firstBadVersion(1));
    }
}
