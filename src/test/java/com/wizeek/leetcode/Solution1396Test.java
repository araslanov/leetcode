package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

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
        solution.getAverageTime("Paradise", "Cambridge");
        solution.getAverageTime("Leyton", "Waterloo");
        solution.checkIn(10, "Leyton", 24);
        solution.getAverageTime("Leyton", "Waterloo");
        solution.checkOut(10, "Waterloo", 38);
        solution.getAverageTime("Leyton", "Waterloo");
    }
}
