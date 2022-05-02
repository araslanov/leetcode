package com.wizeek.leetcode.p408;

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
        assertEquals(true, solution.validWordAbbreviation("internationalization", "i12iz4n"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.validWordAbbreviation("apple", "a2e"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.validWordAbbreviation("substitution", "s10n"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution.validWordAbbreviation("substitution", "sub4u4"));
    }

    @Test
    public void test5() {
        assertEquals(true, solution.validWordAbbreviation("substitution", "12"));
    }

    @Test
    public void test6() {
        assertEquals(true, solution.validWordAbbreviation("substitution", "su3i1u2on"));
    }

    @Test
    public void test7() {
        assertEquals(true, solution.validWordAbbreviation("substitution", "substitution"));
    }

    @Test
    public void test8() {
        assertEquals(true, solution.validWordAbbreviation("ad", "1d"));
    }

    @Test
    public void test9() {
        assertEquals(false, solution.validWordAbbreviation("a", "01"));
    }

    @Test
    public void test10() {
        assertEquals(false, solution.validWordAbbreviation("hi", "1"));
    }
}
