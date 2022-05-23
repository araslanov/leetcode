package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution716_2Test {

    private Solution716_2 stack;

    @Before
    public void setUp() {
        stack = new Solution716_2();
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

    @Test
    public void test2() {
        stack.push(5);

        assertEquals(5, stack.pop());
    }

    @Test
    public void test3() {
        stack.push(5);

        assertEquals(5, stack.peekMax());
        assertEquals(5, stack.popMax());
    }

    @Test
    public void test4() {
        stack.push(-2);
        assertEquals(-2, stack.popMax());
        stack.push(-45);
        stack.push(-82);
        stack.push(29);
        assertEquals(29, stack.pop());
        assertEquals(-45, stack.peekMax());
        stack.push(40);
        assertEquals(40, stack.pop());
        assertEquals(-82, stack.pop());
        stack.push(66);
        assertEquals(66, stack.peekMax());
        assertEquals(66, stack.peekMax());
        stack.push(-61);
        assertEquals(66, stack.peekMax());
        stack.push(98);
        assertEquals(98, stack.peekMax());
    }
}
