package com.wizeek.leetcode.p345;

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
        assertEquals("holle", solution.reverseVowels("hello"));
    }

    @Test
    public void test2() {
        assertEquals("leotcede", solution.reverseVowels("leetcode"));
    }

    @Test
    public void test3() {
        assertEquals("a", solution.reverseVowels("a"));
    }

    @Test
    public void test4() {
        assertEquals("aeiOa", solution.reverseVowels("aOiea"));
    }
}
