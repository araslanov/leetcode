package com.wizeek.leetcode.p1507;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals("2052-10-20", solution.reformatDate("20th Oct 2052"));
    }

    @Test
    public void test2() {
        assertEquals("1933-06-06", solution.reformatDate("6th Jun 1933"));
    }

    @Test
    public void test3() {
        assertEquals("1960-05-26", solution.reformatDate("26th May 1960"));
    }
}
