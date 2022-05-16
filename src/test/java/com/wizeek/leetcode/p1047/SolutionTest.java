package com.wizeek.leetcode.p1047;

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
        assertEquals("ca", solution.removeDuplicates("abbaca"));
    }

    @Test
    public void test2() {
        assertEquals("ay", solution.removeDuplicates("azxxzy"));
    }

    @Test
    public void test3() {
        assertEquals("", solution.removeDuplicates("abba"));
    }

    @Test
    public void test4() {
        assertEquals("a", solution.removeDuplicates("aaaaa"));
    }

    @Test
    public void test5() {
        assertEquals("ibfjcdidiaidchakchchcahabhibdcejkdkfbecdjhajbkfebebfea",
                solution.removeDuplicates("ibfjcaffccadidiaidchakchchcahabhibdcejkdkfbaeeaecdjhajbkfebebfea"));
    }

    @Test
    public void test6() {
        assertEquals("ba", solution.removeDuplicates("aababaab"));
    }
}
