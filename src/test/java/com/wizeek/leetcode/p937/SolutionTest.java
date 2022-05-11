package com.wizeek.leetcode.p937;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertArrayEquals(new String[]{"let1 art can", "let3 art zero", "let2 own kit dig", "dig1 8 1 5 1", "dig2 3 6"},
                solution.reorderLogFiles(
                        new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new String[]{"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"},
                solution.reorderLogFiles(
                        new String[]{"a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo"}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new String[]{"a a", "b a"},
                solution.reorderLogFiles(
                        new String[]{"b a", "a a"}));
    }
}
