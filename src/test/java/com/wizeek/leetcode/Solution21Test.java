package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution21Test {

    private Solution21 solution;

    @Before
    public void setUp() {
        solution = new Solution21();
    }

    @Test
    public void test1() {
        Solution21.ListNode list1 = new Solution21.ListNode(1);
        list1.next = new Solution21.ListNode(2);
        list1.next.next = new Solution21.ListNode(4);
        Solution21.ListNode list2 = new Solution21.ListNode(1);
        list2.next = new Solution21.ListNode(3);
        list2.next.next = new Solution21.ListNode(4);

        Solution21.ListNode merged = solution.mergeTwoLists(list1, list2);

        assertEquals(1, merged.val);
        assertEquals(1, merged.next.val);
        assertEquals(2, merged.next.next.val);
        assertEquals(3, merged.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.val);
        assertEquals(4, merged.next.next.next.next.next.val);
    }
}
