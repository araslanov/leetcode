package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1570Test {

    @Test
    public void test1() {
        assertEquals(8,
                new Solution1570(new int[]{1, 0, 0, 2, 3}).dotProduct(new Solution1570(new int[]{0, 3, 0, 4, 0})));
    }

    @Test
    public void test2() {
        assertEquals(0,
                new Solution1570(new int[]{0, 1, 0, 0, 0}).dotProduct(new Solution1570(new int[]{0, 0, 0, 0, 2})));
    }

    @Test
    public void test3() {
        assertEquals(6,
                new Solution1570(new int[]{0, 1, 0, 0, 2, 0, 0}).dotProduct(
                        new Solution1570(new int[]{1, 0, 0, 0, 3, 0, 4})));
    }
}
