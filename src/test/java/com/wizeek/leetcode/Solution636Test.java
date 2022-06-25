package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class Solution636Test {

    private Solution636 solution;

    @Before
    public void setUp() {
        solution = new Solution636();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{3, 4},
                solution.exclusiveTime(2, List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6")));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{8}, solution.exclusiveTime(1,
                List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7")));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{7, 1}, solution.exclusiveTime(2,
                List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7")));
    }
}
