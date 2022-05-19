package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1200Test {

    private Solution1200 solution;

    @Before
    public void setUp() {
        solution = new Solution1200();
    }

    @Test
    public void test1() {
        List<List<Integer>> result = solution.minimumAbsDifference(new int[]{4, 2, 1, 3});

        assertEquals(3, result.size());
        assertEquals(1, (int) result.get(0).get(0));
        assertEquals(2, (int) result.get(0).get(1));
    }
}
