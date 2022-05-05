package com.wizeek.leetcode.p412;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(List.of("1"), solution.fizzBuzz(1));
    }

    @Test
    public void test2() {
        assertEquals(List.of("1", "2", "Fizz"), solution.fizzBuzz(3));
    }

    @Test
    public void test3() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), solution.fizzBuzz(5));
    }

    @Test
    public void test4() {
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14",
                "FizzBuzz"), solution.fizzBuzz(15));
    }
}
