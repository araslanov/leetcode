package com.wizeek.leetcode.p6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    //    @Ignore
    @Test
    public void test1() {
        assertEquals("PAYP", solution.convert("PAYP", 4));
    }

    //    @Ignore
    @Test
    public void test2() {
        assertEquals("PAYAP", solution.convert("PAYPA", 4));
    }

    //    @Ignore
    @Test
    public void test3() {
        assertEquals("PIALSYAP", solution.convert("PAYPALIS", 4));
    }

    //    @Ignore
    @Test
    public void test4() {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
    }

    //    @Ignore
    @Test
    public void test5() {
        assertEquals("PINALSIGYAHRPI", solution.convert("PAYPALISHIRING", 4));
    }

    //    @Ignore
    @Test
    public void test6() {
        assertEquals("", solution.convert("", 1));
    }

    //    @Ignore
    @Test
    public void test7() {
        assertEquals("A", solution.convert("A", 1));
    }

    //    @Ignore
    @Test
    public void test8() {
        assertEquals("AB", solution.convert("AB", 1));
    }

    @Test
    public void test9() {
        assertEquals("A", solution.convert("A", 2));
    }
}
