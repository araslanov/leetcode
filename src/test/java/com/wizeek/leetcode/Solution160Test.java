package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution160Test {

    private Solution160 solution;

    @Before
    public void setUp() {
        solution = new Solution160();
    }

    @Test
    public void test1() {
        Solution160.ListNode a = new Solution160.ListNode(1);
        a.next = new Solution160.ListNode(9);
        a.next.next = new Solution160.ListNode(1);
        a.next.next.next = new Solution160.ListNode(2);
        a.next.next.next.next = new Solution160.ListNode(4);
        Solution160.ListNode b = new Solution160.ListNode(3);
        b.next = a.next.next.next;

        assertEquals(b.next, solution.getIntersectionNode(a, b));
    }

    @Test
    public void test2() {
        Solution160.ListNode a = new Solution160.ListNode(2);
        a.next = new Solution160.ListNode(6);
        a.next.next = new Solution160.ListNode(4);
        Solution160.ListNode b = new Solution160.ListNode(1);
        b.next = new Solution160.ListNode(5);

        assertEquals(null, solution.getIntersectionNode(a, b));
    }
}
