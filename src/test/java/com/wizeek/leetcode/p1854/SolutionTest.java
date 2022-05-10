package com.wizeek.leetcode.p1854;

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
        assertEquals(1993, solution.maximumPopulation(new int[][]{{1993, 1999}, {2000, 2010}}));
    }

    @Test
    public void test2() {
        assertEquals(1960, solution.maximumPopulation(new int[][]{{1950, 1961}, {1960, 1971}, {1970, 1981}}));
    }

    @Test
    public void test3() {
        assertEquals(2005, solution.maximumPopulation(
                new int[][]{{2033, 2034}, {2039, 2047}, {1998, 2042}, {2047, 2048}, {2025, 2029}, {2005, 2044}, {1990, 1992}, {1952, 1956}, {1984, 2014}}));
    }
}
