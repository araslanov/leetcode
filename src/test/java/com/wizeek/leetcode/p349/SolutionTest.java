package com.wizeek.leetcode.p349;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2}, solution.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        Set<Integer> result = Arrays.stream(
                solution.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})).boxed().collect(
                Collectors.toSet());
        assertEquals(2, result.size());
        assertTrue(result.contains(4));
        assertTrue(result.contains(9));
    }
}
