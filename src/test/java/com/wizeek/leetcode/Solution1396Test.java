package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1396Test {

    private Solution1396 solution;

    @Before
    public void setUp() {
        solution = new Solution1396();
    }

    @Test
    public void test1() {
        solution.checkIn(45, "Leyton", 3);
        solution.checkIn(32, "Paradise", 8);
        solution.checkIn(27, "Leyton", 10);
        solution.checkOut(45, "Waterloo", 15);
        solution.checkOut(27, "Waterloo", 20);
        solution.checkOut(32, "Cambridge", 22);
        assertEquals(14, solution.getAverageTime("Paradise", "Cambridge"), 0.00001);
        assertEquals(11, solution.getAverageTime("Leyton", "Waterloo"), 0.00001);
        solution.checkIn(10, "Leyton", 24);
        assertEquals(11, solution.getAverageTime("Leyton", "Waterloo"), 0.00001);
        solution.checkOut(10, "Waterloo", 38);
        assertEquals(12, solution.getAverageTime("Leyton", "Waterloo"), 0.00001);
    }
}
