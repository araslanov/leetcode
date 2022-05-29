package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution141Test {

    private Solution141 solution;

    @Before
    public void setUp() {
        solution = new Solution141();
    }

    @Test
    public void test1() {
        Solution141.ListNode head = new Solution141.ListNode(3);
        head.next = new Solution141.ListNode(2);
        head.next.next = new Solution141.ListNode(0);
        head.next.next.next = new Solution141.ListNode(-4);
        head.next.next.next.next = head.next;

        assertEquals(true, solution.hasCycle(head));
    }

    @Test
    public void test2() {
        Solution141.ListNode head = new Solution141.ListNode(1);
        head.next = new Solution141.ListNode(2);
        head.next.next = head;

        assertEquals(true, solution.hasCycle(head));
    }

    @Test
    public void test3() {
        Solution141.ListNode head = new Solution141.ListNode(1);

        assertEquals(false, solution.hasCycle(head));
    }
}
