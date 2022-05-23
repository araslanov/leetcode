package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution344Test {

    private Solution344 solution;

    @Before
    public void setUp() {
        solution = new Solution344();
    }

    @Test
    public void test1() {
        char[] string = new char[]{'h', 'e', 'l', 'l', 'o'};

        solution.reverseString(string);

        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, string);
    }

    @Test
    public void test2() {
        char[] string = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};

        solution.reverseString(string);

        assertArrayEquals(new char[]{'h', 'a', 'n', 'n', 'a', 'H'}, string);
    }
}
