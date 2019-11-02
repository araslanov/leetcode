package com.wizeek.leetcode.p2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2019Test {

    private Solution2019 solution;

    @Before
    public void setUp() {
        solution = new Solution2019();
    }

    @Test
    public void test1() {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);

        ListNode expected = new ListNode(7);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(8);

        ListNode result = solution.addTwoNumbers(listNode1, listNode2);

        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = new ListNode(9);
        listNode2.next = new ListNode(9);
        listNode2.next.next = new ListNode(9);

        ListNode expected = new ListNode(0);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(0);
        expected.next.next.next = new ListNode(1);

        ListNode result = solution.addTwoNumbers(listNode1, listNode2);

        assertEquals(expected, result);
    }
}
