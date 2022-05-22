package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution206Test {

    private Solution206 solution;

    @Before
    public void setUp() {
        solution = new Solution206();
    }

    @Test
    public void test1() {
        Solution206.ListNode head = new Solution206.ListNode(1);
        head.next = new Solution206.ListNode(2);
        head.next.next = new Solution206.ListNode(3);
        head.next.next.next = new Solution206.ListNode(4);
        head.next.next.next.next = new Solution206.ListNode(5);

        Solution206.ListNode result = solution.reverseList(head);

        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);
    }

    @Test
    public void test2() {
        Solution206.ListNode head = new Solution206.ListNode(1);
        head.next = new Solution206.ListNode(2);

        Solution206.ListNode result = solution.reverseList(head);

        assertEquals(2, result.val);
        assertEquals(1, result.next.val);
    }
}
