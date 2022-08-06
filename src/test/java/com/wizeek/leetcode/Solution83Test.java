package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution83Test {

    private Solution83 solution;

    @Before
    public void setUp() {
        solution = new Solution83();
    }

    @Test
    public void test1() {
        Solution83.ListNode head = new Solution83.ListNode(1);
        head.next = new Solution83.ListNode(1);
        head.next.next = new Solution83.ListNode(2);

        Solution83.ListNode result = solution.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
    }

    @Test
    public void test2() {
        Solution83.ListNode head = new Solution83.ListNode(1);
        head.next = new Solution83.ListNode(1);
        head.next.next = new Solution83.ListNode(1);
        head.next.next.next = new Solution83.ListNode(2);
        head.next.next.next.next = new Solution83.ListNode(3);
        head.next.next.next.next.next = new Solution83.ListNode(3);

        Solution83.ListNode result = solution.deleteDuplicates(head);

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }
}
