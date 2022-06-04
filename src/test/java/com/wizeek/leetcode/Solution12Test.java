package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Solution12Test {

    private Solution12 solution;

    @Before
    public void setUp() {
        solution = new Solution12();
    }

    @Test
    public void test1() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    public void test2() {
        assertEquals("VI", solution.intToRoman(6));
    }

    @Test
    public void test3() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    public void test4() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    public void test5() {
        assertEquals("MCMLXXXIX", solution.intToRoman(1989));
    }
}
