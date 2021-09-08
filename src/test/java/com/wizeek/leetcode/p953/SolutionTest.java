package com.wizeek.leetcode.p953;

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
        assertEquals(true, solution.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isAlienSorted(new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isAlienSorted(new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void test4() {
        assertEquals(true, solution.isAlienSorted(new String[]{"ubg", "kwh"}, "qcipyamwvdjtesbghlorufnkzx"));
    }
}
