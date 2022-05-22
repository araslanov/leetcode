package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution234_3Test {

    private Solution234_3 solution;

    @Before
    public void setUp() {
        solution = new Solution234_3();
    }

    @Test
    public void test1() {
        Solution234_3.ListNode head = new Solution234_3.ListNode(1);
        head.next = new Solution234_3.ListNode(2);
        head.next.next = new Solution234_3.ListNode(2);
        head.next.next.next = new Solution234_3.ListNode(1);

        assertEquals(true, solution.isPalindrome(head));
    }

    @Test
    public void test2() {
        Solution234_3.ListNode head = new Solution234_3.ListNode(1);
        head.next = new Solution234_3.ListNode(2);

        assertEquals(false, solution.isPalindrome(head));
    }
}
