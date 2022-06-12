package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution160_2Test {

    private Solution160_2 solution;

    @Before
    public void setUp() {
        solution = new Solution160_2();
    }

    @Test
    public void test1() {
        Solution160_2.ListNode a = new Solution160_2.ListNode(1);
        a.next = new Solution160_2.ListNode(9);
        a.next.next = new Solution160_2.ListNode(1);
        a.next.next.next = new Solution160_2.ListNode(2);
        a.next.next.next.next = new Solution160_2.ListNode(4);
        Solution160_2.ListNode b = new Solution160_2.ListNode(3);
        b.next = a.next.next.next;

        assertEquals(b.next, solution.getIntersectionNode(a, b));
    }

    @Test
    public void test2() {
        Solution160_2.ListNode a = new Solution160_2.ListNode(2);
        a.next = new Solution160_2.ListNode(6);
        a.next.next = new Solution160_2.ListNode(4);
        Solution160_2.ListNode b = new Solution160_2.ListNode(1);
        b.next = new Solution160_2.ListNode(5);

        assertEquals(null, solution.getIntersectionNode(a, b));
    }
}
