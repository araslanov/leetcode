package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution253_2Test {

    private Solution253_2 solution;

    @Before
    public void setUp() {
        solution = new Solution253_2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.minMeetingRooms(new int[][]{{0, 30}, {5, 10}, {15, 20}}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.minMeetingRooms(new int[][]{{7, 10}, {2, 4}}));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.minMeetingRooms(new int[][]{{9, 10}, {4, 9}, {4, 17}}));
    }
}
