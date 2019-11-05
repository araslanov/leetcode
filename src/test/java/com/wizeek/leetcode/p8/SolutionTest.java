package com.wizeek.leetcode.p8;

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
        assertEquals(42, solution.myAtoi("42"));
    }

    @Test
    public void test2() {
        assertEquals(-42, solution.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        assertEquals(4193, solution.myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.myAtoi("words and 987"));
    }

    @Test
    public void test5() {
        assertEquals(-2147483648, solution.myAtoi("-91283472332"));
    }

    @Test
    public void test6() {
        assertEquals(2, solution.myAtoi("+2"));
    }

    @Test
    public void test7() {
        assertEquals(0, solution.myAtoi(""));
    }

    @Test
    public void test8() {
        assertEquals(0, solution.myAtoi("    "));
    }

    @Test
    public void test9() {
        assertEquals(-123, solution.myAtoi("   -0123"));
    }

    @Test
    public void test10() {
        assertEquals(0, solution.myAtoi(" + 2"));
    }

    @Test
    public void test11() {
        assertEquals(0, solution.myAtoi("+-2"));
    }

    @Test
    public void test12() {
        assertEquals(-1324000, solution.myAtoi("-01324000"));
    }

    @Test
    public void test13() {
        assertEquals(-2147483647, solution.myAtoi("-2147483647"));
    }

    @Test
    public void test14() {
        assertEquals(0, solution.myAtoi("0-1"));
    }

    @Test
    public void test15() {
        assertEquals(0, solution.myAtoi("0  123"));
    }
}
