package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution876Test {

    private Solution876 solution;

    @Before
    public void setUp() {
        solution = new Solution876();
    }

    @Test
    public void test1() {
        Solution876.ListNode head = new Solution876.ListNode(1);
        head.next = new Solution876.ListNode(2);
        head.next.next = new Solution876.ListNode(3);
        head.next.next.next = new Solution876.ListNode(4);
        head.next.next.next.next = new Solution876.ListNode(5);

        assertEquals(3, solution.middleNode(head).val);
    }
}
