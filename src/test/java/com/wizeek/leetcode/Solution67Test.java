package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution67Test {

    private Solution67 solution;

    @Before
    public void setUp() {
        solution = new Solution67();
    }

    @Test
    public void test1() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

    @Test
    public void test3() {
        assertEquals(
                "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",
                solution.addBinary(
                        "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                        "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
