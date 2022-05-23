package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution716Test {

    private Solution716 stack;

    @Before
    public void setUp() {
        stack = new Solution716();
    }

    @Test
    public void test1() {
        stack.push(5);
        stack.push(1);
        stack.push(5);

        assertEquals(5, stack.top());
        assertEquals(5, stack.popMax());
        assertEquals(1, stack.top());
        assertEquals(5, stack.peekMax());
        assertEquals(1, stack.pop());
        assertEquals(5, stack.top());
    }
}
